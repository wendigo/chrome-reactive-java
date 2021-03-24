package pl.wendigo.chrome.protocol

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonElement
import okhttp3.OkHttpClient
import pl.wendigo.chrome.api.target.SessionID
import pl.wendigo.chrome.protocol.websocket.FrameMapper
import pl.wendigo.chrome.protocol.websocket.RequestFrame
import pl.wendigo.chrome.protocol.websocket.WebSocketFramesStream
import java.io.Closeable
import java.util.concurrent.atomic.AtomicLong

/**
 * ProtocolConnection represents connection to chrome's debugger via [DevTools Protocol](https://chromedevtools.github.io/devtools-protocol/).
 *
 * It depends on [WebSocketFramesStream] which is responsible for providing stream of WebSocket frames (both events and responses) and allows for sending request frames.
 *
 * [EventMapper] is responsible for mapping [pl.wendigo.chrome.protocol.websocket.EventResponseFrame]s to concrete [Event] representations.
 *
 * @see WebSocketFramesStream
 * @see FrameMapper
 * @see EventMapper
 */
class ProtocolConnection constructor(
    private val frames: WebSocketFramesStream,
    private val eventMapper: EventMapper = ProtocolConnection.eventMapper,
    private val sessionId: SessionID? = null
) : Closeable, AutoCloseable {
    private val nextRequestId = AtomicLong(0)

    /**
     * Closes connection to remote debugger.
     */
    override fun close() {
        frames.close()
    }

    /**
     * Sends request and captures response from the stream.
     */
    fun <T> request(methodName: String, request: JsonElement?, responseSerializer: KSerializer<T>): Single<T> {
        val requestFrame = RequestFrame(
            id = nextRequestId.incrementAndGet(),
            method = methodName,
            params = request,
            sessionId = sessionId
        )

        return frames.send(requestFrame).flatMap { sent ->
            if (sent) {
                frames.getResponse(requestFrame, responseSerializer)
            } else {
                Single.error(RequestFailed(requestFrame, "Could not enqueue message $request"))
            }
        }
    }

    /**
     * Captures events by given name and casts received messages to specified class.
     */
    fun <T> events(eventName: String, serializer: KSerializer<T>): Flowable<T> where T : Event {
        return frames.eventFrames()
            .filter { frame -> frame.matches(eventName, sessionId) }
            .map { frame -> eventMapper.deserialize(frame, serializer) }
            .subscribeOn(Schedulers.io())
    }

    /**
     * Captures all events as generated by remote debugger
     */
    fun events(): Flowable<Event> {
        return frames.eventFrames()
            .filter { frame -> frame.matches(sessionId) }
            .map { frame -> eventMapper.deserialize(frame) }
            .subscribeOn(Schedulers.io())
    }

    /**
     * Reuse existing debugger connection but for new sessionID sharing underlying WebSocket connection.
     */
    internal fun cloneForSessionId(sessionID: SessionID): ProtocolConnection = ProtocolConnection(
        frames,
        eventMapper,
        sessionID
    )

    /**
     * Factory is responsible for opening debugger WebSocket connections to a given debugger uri.
     */
    companion object Factory {
        /**
         * Creates new ChromeDebuggerConnection session for given WebSocket uri and frames buffer size.
         */
        @JvmStatic
        fun open(webSocketUri: String, framesBufferSize: Int = 128): ProtocolConnection {
            return ProtocolConnection(
                WebSocketFramesStream(webSocketUri, framesBufferSize, frameMapper, OkHttpClient()),
                eventMapper
            )
        }

        private val frameMapper by lazy {
            FrameMapper()
        }

        private val eventMapper by lazy {
            EventMapper()
        }
    }
}
