package pl.wendigo.chrome.api.applicationcache

import kotlinx.serialization.json.Json

/**
 * ApplicationCacheOperations represents ApplicationCache protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [ApplicationCache](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class ApplicationCacheOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Enables application cache domain notifications.
     *
     * @link Protocol [ApplicationCache#enable](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-enable) method documentation.
     */
    fun enable() = connection.request("ApplicationCache.enable", null, pl.wendigo.chrome.protocol.RequestResponseFrame.serializer())

    /**
     * Returns relevant application cache data for the document in given frame.
     *
     * @link Protocol [ApplicationCache#getApplicationCacheForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getApplicationCacheForFrame) method documentation.
     */
    fun getApplicationCacheForFrame(input: GetApplicationCacheForFrameRequest) = connection.request("ApplicationCache.getApplicationCacheForFrame", Json.encodeToJsonElement(GetApplicationCacheForFrameRequest.serializer(), input), GetApplicationCacheForFrameResponse.serializer())

    /**
     * Returns array of frame identifiers with manifest urls for each frame containing a document
associated with some application cache.
     *
     * @link Protocol [ApplicationCache#getFramesWithManifests](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getFramesWithManifests) method documentation.
     */
    fun getFramesWithManifests() = connection.request("ApplicationCache.getFramesWithManifests", null, GetFramesWithManifestsResponse.serializer())

    /**
     * Returns manifest URL for document in the given frame.
     *
     * @link Protocol [ApplicationCache#getManifestForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getManifestForFrame) method documentation.
     */
    fun getManifestForFrame(input: GetManifestForFrameRequest) = connection.request("ApplicationCache.getManifestForFrame", Json.encodeToJsonElement(GetManifestForFrameRequest.serializer(), input), GetManifestForFrameResponse.serializer())

    /**
     *  Returns observable capturing all ApplicationCache.applicationCacheStatusUpdated events.
     */
    fun applicationCacheStatusUpdated(): io.reactivex.rxjava3.core.Flowable<ApplicationCacheStatusUpdatedEvent> = connection.events("ApplicationCache.applicationCacheStatusUpdated", ApplicationCacheStatusUpdatedEvent.serializer())

    /**
     *  Returns observable capturing all ApplicationCache.networkStateUpdated events.
     */
    fun networkStateUpdated(): io.reactivex.rxjava3.core.Flowable<NetworkStateUpdatedEvent> = connection.events("ApplicationCache.networkStateUpdated", NetworkStateUpdatedEvent.serializer())

    /**
     * Returns flowable capturing all ApplicationCache domains events.
     */
    fun events(): io.reactivex.rxjava3.core.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.allEvents().filter {
            it.domain() == "ApplicationCache"
        }
    }
}

/**
 * Represents request frame that can be used with [ApplicationCache#getApplicationCacheForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getApplicationCacheForFrame) operation call.
 *
 * Returns relevant application cache data for the document in given frame.
 * @link [ApplicationCache#getApplicationCacheForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getApplicationCacheForFrame) method documentation.
 * @see [ApplicationCacheOperations.getApplicationCacheForFrame]
 */
@kotlinx.serialization.Serializable
data class GetApplicationCacheForFrameRequest(
    /**
     * Identifier of the frame containing document whose application cache is retrieved.
     */
    val frameId: pl.wendigo.chrome.api.page.FrameId

)

/**
 * Represents response frame that is returned from [ApplicationCache#getApplicationCacheForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getApplicationCacheForFrame) operation call.
 * Returns relevant application cache data for the document in given frame.
 *
  
 * @link [ApplicationCache#getApplicationCacheForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getApplicationCacheForFrame) method documentation.
 * @see [ApplicationCacheOperations.getApplicationCacheForFrame]
 */
@kotlinx.serialization.Serializable
data class GetApplicationCacheForFrameResponse(
    /**  
     * Relevant application cache data for the document in given frame.  
     */  
    val applicationCache: ApplicationCache

)

/**
 * Represents response frame that is returned from [ApplicationCache#getFramesWithManifests](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getFramesWithManifests) operation call.
 * Returns array of frame identifiers with manifest urls for each frame containing a document
associated with some application cache.
 *
  
 * @link [ApplicationCache#getFramesWithManifests](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getFramesWithManifests) method documentation.
 * @see [ApplicationCacheOperations.getFramesWithManifests]
 */
@kotlinx.serialization.Serializable
data class GetFramesWithManifestsResponse(
    /**  
     * Array of frame identifiers with manifest urls for each frame containing a document  
     associated with some application cache.  
     */  
    val frameIds: List<FrameWithManifest>

)

/**
 * Represents request frame that can be used with [ApplicationCache#getManifestForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getManifestForFrame) operation call.
 *
 * Returns manifest URL for document in the given frame.
 * @link [ApplicationCache#getManifestForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getManifestForFrame) method documentation.
 * @see [ApplicationCacheOperations.getManifestForFrame]
 */
@kotlinx.serialization.Serializable
data class GetManifestForFrameRequest(
    /**
     * Identifier of the frame containing document whose manifest is retrieved.
     */
    val frameId: pl.wendigo.chrome.api.page.FrameId

)

/**
 * Represents response frame that is returned from [ApplicationCache#getManifestForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getManifestForFrame) operation call.
 * Returns manifest URL for document in the given frame.
 *
  
 * @link [ApplicationCache#getManifestForFrame](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#method-getManifestForFrame) method documentation.
 * @see [ApplicationCacheOperations.getManifestForFrame]
 */
@kotlinx.serialization.Serializable
data class GetManifestForFrameResponse(
    /**  
     * Manifest URL for document in the given frame.  
     */  
    val manifestURL: String

)

/**
 *
 *
 * @link [ApplicationCache#applicationCacheStatusUpdated](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#event-applicationCacheStatusUpdated) event documentation.
 */
@kotlinx.serialization.Serializable
data class ApplicationCacheStatusUpdatedEvent(
    /**  
     * Identifier of the frame containing document whose application cache updated status.  
     */  
    val frameId: pl.wendigo.chrome.api.page.FrameId,

    /**  
     * Manifest URL.  
     */  
    val manifestURL: String,

    /**  
     * Updated application cache status.  
     */  
    val status: Int

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "ApplicationCache" 
    override fun eventName() = "applicationCacheStatusUpdated"
} 

/**
 *
 *
 * @link [ApplicationCache#networkStateUpdated](https://chromedevtools.github.io/devtools-protocol/tot/ApplicationCache#event-networkStateUpdated) event documentation.
 */
@kotlinx.serialization.Serializable
data class NetworkStateUpdatedEvent(
    /**  
     *  
     */  
    val isNowOnline: Boolean

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "ApplicationCache" 
    override fun eventName() = "networkStateUpdated"
} 
