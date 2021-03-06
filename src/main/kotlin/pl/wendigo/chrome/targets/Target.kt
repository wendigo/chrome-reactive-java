package pl.wendigo.chrome.targets

import pl.wendigo.chrome.api.ProtocolDomains
import pl.wendigo.chrome.api.target.GetTargetInfoRequest
import pl.wendigo.chrome.api.target.TargetID
import pl.wendigo.chrome.api.target.TargetInfo
import pl.wendigo.chrome.protocol.ProtocolConnection
import pl.wendigo.chrome.sync
import java.io.Closeable

/**
 * Represents browser [Target] that can be controlled via DevTools Protocol API
 */
class Target(
    private val manager: Manager,
    private val session: SessionTarget,
    connection: ProtocolConnection
) : ProtocolDomains(connection), AutoCloseable, Closeable {
    /**
     * Retrieves [TargetInfo] for current target directly from debugger protocol.
     */
    fun info(): TargetInfo {
        return sync(Target.getTargetInfo(GetTargetInfoRequest(session.targetId))).targetInfo
    }

    /**
     * Closes target releasing all resources on the debugger side.
     */
    override fun close() {
        return manager.close(this)
    }

    /**
     * Returns target id.
     */
    fun targetId(): TargetID = session.targetId

    /**
     * Returns target session information.
     */
    fun session(): SessionTarget = session

    /**
     * Releases underlying connection.
     */
    internal fun closeConnection() {
        return connection.close()
    }

    override fun toString(): String {
        return "Target(id='${session.targetId}', sessionId='${session.sessionId}, browserContextId='${session.browserContextID}')"
    }
}
