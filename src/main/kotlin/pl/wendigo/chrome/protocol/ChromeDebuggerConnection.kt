package pl.wendigo.chrome.protocol

import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.atomic.AtomicLong
import okhttp3.OkHttpClient
import pl.wendigo.chrome.api.target.SessionID

/**
 * ChromeDebuggerConnection represents connection to chrome's debugger via [DevTools Protocol](https://chromedevtools.github.io/devtools-protocol/).
 *
 * It depends on [FramesStream] which is responsible for providing stream of protocol frames (both events and responses) and allows for sending requests.
 *
 * [FrameMapper] is responsible for decoding/encoding objects to/from JSON frames which DevTools Protocol can understand.
 *
 * @see FramesStream
 * @see FrameMapper
 */
class ChromeDebuggerConnection constructor(
    private val frames: FramesStream,
    private val eventMapper: EventMapper = EventMapper(),
    private val sessionId: SessionID? = null
) {
    private val nextRequestId = AtomicLong(0)

    /**
     * Registers event name to class mappings.
     */
    fun addEventMapping(name: String, clazz: Class<out Event>) {
        eventMapper.addMapping(name, clazz)
    }

    /**
     * Closes connection to remote debugger.
     */
    fun close() {
        frames.close()
    }

    /**
     * Sends request and captures response from the stream.
     */
    fun <T> request(methodName: String, request: Any?, responseClazz: Class<T>): Single<T> {
        val request = RequestFrame(
            id = nextRequestId.incrementAndGet(),
            method = methodName,
            params = request,
            sessionId = sessionId
        )

        return frames.send(request).flatMap { sent ->
            if (sent) {
                frames.getResponse(request, responseClazz)
            } else {
                Single.error(RequestFailed(request, "Could not enqueue message $request"))
            }
        }
    }

    /**
     * Captures events by given name and casts received messages to specified class.
     */
    fun <T> events(eventName: String, outClazz: Class<T>): Flowable<T> where T : Event {
        return frames.eventFrames()
            .filter { frame -> frame.matchesSessionId(sessionId) }
            .filter { frame -> frame.matchesMethod(eventName) }
            .map { frame -> eventMapper.deserialize(frame, outClazz) }
            .subscribeOn(Schedulers.io())
    }

    /**
     * Captures all events as generated by remote debugger
     */
    fun allEvents(): Flowable<Event> {
        return frames.eventFrames()
            .filter { frame -> frame.matchesSessionId(sessionId) }
            .map { frame -> eventMapper.deserializeEvent(frame) }
            .subscribeOn(Schedulers.io())
    }

    fun cloneForSessionId(sessionID: SessionID) = ChromeDebuggerConnection(
        frames,
        eventMapper,
        sessionID
    )

    companion object Factory {
        /**
         * Creates new ChromeDebuggerConnection session for given websocket uri.
         */
        @JvmStatic
        fun open(websocketUri: String, framesBufferSize: Int = 128): ChromeDebuggerConnection {
            return ChromeDebuggerConnection(
                FramesStream(websocketUri, framesBufferSize, frameMapper, client),
                eventMapper
            )
        }

        private val client by lazy {
            OkHttpClient()
        }

        private val frameMapper by lazy {
            FrameMapper()
        }

        private val eventMapper by lazy {
            EventMapper()
        }

        internal fun close() {
            client.connectionPool.evictAll()
            client.dispatcher.executorService.shutdown()
        }
    }
}
