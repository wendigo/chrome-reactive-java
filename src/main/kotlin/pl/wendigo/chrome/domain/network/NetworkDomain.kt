package pl.wendigo.chrome.domain.network

/**
 * Network domain allows tracking network activities of the page. It exposes information about http, file, data and other requests and responses, their headers, bodies, timing, etc.
 */
class NetworkDomain internal constructor(private val connectionRemote : pl.wendigo.chrome.RemoteDebuggerConnection) {

	/**
	 * Enables network tracking, network events will now be delivered to the client.
	 */
	  fun enable(input : EnableRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.enable", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Disables network tracking, prevents network events from being sent to the client.
	 */
	  fun disable() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.disable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Allows overriding user agent with the given string.
	 */
	  fun setUserAgentOverride(input : SetUserAgentOverrideRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setUserAgentOverride", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Specifies whether to always send extra HTTP headers with the requests from this page.
	 */
	  fun setExtraHTTPHeaders(input : SetExtraHTTPHeadersRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setExtraHTTPHeaders", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns content served for the given request.
	 */
	  fun getResponseBody(input : GetResponseBodyRequest) : io.reactivex.Single<GetResponseBodyResponse> {
        return connectionRemote.runAndCaptureResponse("Network.getResponseBody", input, GetResponseBodyResponse::class.java)
	}

	/**
	 * Blocks specific URL from loading.
	 */
	@pl.wendigo.chrome.Experimental
    fun setBlockedURLs(input : SetBlockedURLsRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setBlockedURLs", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * This method sends a new XMLHttpRequest which is identical to the original one. The following parameters should be identical: method, url, async, request body, extra headers, withCredentials attribute, user, password.
	 */
	@pl.wendigo.chrome.Experimental
    fun replayXHR(input : ReplayXHRRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.replayXHR", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Toggles monitoring of XMLHttpRequest. If <code>true</code>, console will receive messages upon each XHR issued.
	 */
	@pl.wendigo.chrome.Experimental
    fun setMonitoringXHREnabled(input : SetMonitoringXHREnabledRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setMonitoringXHREnabled", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Tells whether clearing browser cache is supported.
	 */
	  fun canClearBrowserCache() : io.reactivex.Single<CanClearBrowserCacheResponse> {
        return connectionRemote.runAndCaptureResponse("Network.canClearBrowserCache", null, CanClearBrowserCacheResponse::class.java)
	}

	/**
	 * Clears browser cache.
	 */
	  fun clearBrowserCache() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.clearBrowserCache", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Tells whether clearing browser cookies is supported.
	 */
	  fun canClearBrowserCookies() : io.reactivex.Single<CanClearBrowserCookiesResponse> {
        return connectionRemote.runAndCaptureResponse("Network.canClearBrowserCookies", null, CanClearBrowserCookiesResponse::class.java)
	}

	/**
	 * Clears browser cookies.
	 */
	  fun clearBrowserCookies() : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.clearBrowserCookies", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns all browser cookies for the current URL. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
	 */
	@pl.wendigo.chrome.Experimental
    fun getCookies(input : GetCookiesRequest) : io.reactivex.Single<GetCookiesResponse> {
        return connectionRemote.runAndCaptureResponse("Network.getCookies", input, GetCookiesResponse::class.java)
	}

	/**
	 * Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
	 */
	@pl.wendigo.chrome.Experimental
    fun getAllCookies() : io.reactivex.Single<GetAllCookiesResponse> {
        return connectionRemote.runAndCaptureResponse("Network.getAllCookies", null, GetAllCookiesResponse::class.java)
	}

	/**
	 * Deletes browser cookie with given name, domain and path.
	 */
	@pl.wendigo.chrome.Experimental
    fun deleteCookie(input : DeleteCookieRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.deleteCookie", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
	 */
	@pl.wendigo.chrome.Experimental
    fun setCookie(input : SetCookieRequest) : io.reactivex.Single<SetCookieResponse> {
        return connectionRemote.runAndCaptureResponse("Network.setCookie", input, SetCookieResponse::class.java)
	}

	/**
	 * Tells whether emulation of network conditions is supported.
	 */
	@pl.wendigo.chrome.Experimental
    fun canEmulateNetworkConditions() : io.reactivex.Single<CanEmulateNetworkConditionsResponse> {
        return connectionRemote.runAndCaptureResponse("Network.canEmulateNetworkConditions", null, CanEmulateNetworkConditionsResponse::class.java)
	}

	/**
	 * Activates emulation of network conditions.
	 */
	  fun emulateNetworkConditions(input : EmulateNetworkConditionsRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.emulateNetworkConditions", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
	 */
	  fun setCacheDisabled(input : SetCacheDisabledRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setCacheDisabled", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Toggles ignoring of service worker for each request.
	 */
	@pl.wendigo.chrome.Experimental
    fun setBypassServiceWorker(input : SetBypassServiceWorkerRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setBypassServiceWorker", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * For testing.
	 */
	@pl.wendigo.chrome.Experimental
    fun setDataSizeLimitsForTest(input : SetDataSizeLimitsForTestRequest) : io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Network.setDataSizeLimitsForTest", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns the DER-encoded certificate.
	 */
	@pl.wendigo.chrome.Experimental
    fun getCertificate(input : GetCertificateRequest) : io.reactivex.Single<GetCertificateResponse> {
        return connectionRemote.runAndCaptureResponse("Network.getCertificate", input, GetCertificateResponse::class.java)
	}

  
    /**
     * Fired when resource loading priority is changed
     */
    fun resourceChangedPriority() : io.reactivex.Flowable<ResourceChangedPriorityEvent> {
        return connectionRemote.captureEvents("Network.resourceChangedPriority", ResourceChangedPriorityEvent::class.java)
    }

    /**
     * Fired when page is about to send HTTP request.
     */
    fun requestWillBeSent() : io.reactivex.Flowable<RequestWillBeSentEvent> {
        return connectionRemote.captureEvents("Network.requestWillBeSent", RequestWillBeSentEvent::class.java)
    }

    /**
     * Fired if request ended up loading from cache.
     */
    fun requestServedFromCache() : io.reactivex.Flowable<RequestServedFromCacheEvent> {
        return connectionRemote.captureEvents("Network.requestServedFromCache", RequestServedFromCacheEvent::class.java)
    }

    /**
     * Fired when HTTP response is available.
     */
    fun responseReceived() : io.reactivex.Flowable<ResponseReceivedEvent> {
        return connectionRemote.captureEvents("Network.responseReceived", ResponseReceivedEvent::class.java)
    }

    /**
     * Fired when data chunk was received over the network.
     */
    fun dataReceived() : io.reactivex.Flowable<DataReceivedEvent> {
        return connectionRemote.captureEvents("Network.dataReceived", DataReceivedEvent::class.java)
    }

    /**
     * Fired when HTTP request has finished loading.
     */
    fun loadingFinished() : io.reactivex.Flowable<LoadingFinishedEvent> {
        return connectionRemote.captureEvents("Network.loadingFinished", LoadingFinishedEvent::class.java)
    }

    /**
     * Fired when HTTP request has failed to load.
     */
    fun loadingFailed() : io.reactivex.Flowable<LoadingFailedEvent> {
        return connectionRemote.captureEvents("Network.loadingFailed", LoadingFailedEvent::class.java)
    }

    /**
     * Fired when WebSocket is about to initiate handshake.
     */
    fun webSocketWillSendHandshakeRequest() : io.reactivex.Flowable<WebSocketWillSendHandshakeRequestEvent> {
        return connectionRemote.captureEvents("Network.webSocketWillSendHandshakeRequest", WebSocketWillSendHandshakeRequestEvent::class.java)
    }

    /**
     * Fired when WebSocket handshake response becomes available.
     */
    fun webSocketHandshakeResponseReceived() : io.reactivex.Flowable<WebSocketHandshakeResponseReceivedEvent> {
        return connectionRemote.captureEvents("Network.webSocketHandshakeResponseReceived", WebSocketHandshakeResponseReceivedEvent::class.java)
    }

    /**
     * Fired upon WebSocket creation.
     */
    fun webSocketCreated() : io.reactivex.Flowable<WebSocketCreatedEvent> {
        return connectionRemote.captureEvents("Network.webSocketCreated", WebSocketCreatedEvent::class.java)
    }

    /**
     * Fired when WebSocket is closed.
     */
    fun webSocketClosed() : io.reactivex.Flowable<WebSocketClosedEvent> {
        return connectionRemote.captureEvents("Network.webSocketClosed", WebSocketClosedEvent::class.java)
    }

    /**
     * Fired when WebSocket frame is received.
     */
    fun webSocketFrameReceived() : io.reactivex.Flowable<WebSocketFrameReceivedEvent> {
        return connectionRemote.captureEvents("Network.webSocketFrameReceived", WebSocketFrameReceivedEvent::class.java)
    }

    /**
     * Fired when WebSocket frame error occurs.
     */
    fun webSocketFrameError() : io.reactivex.Flowable<WebSocketFrameErrorEvent> {
        return connectionRemote.captureEvents("Network.webSocketFrameError", WebSocketFrameErrorEvent::class.java)
    }

    /**
     * Fired when WebSocket frame is sent.
     */
    fun webSocketFrameSent() : io.reactivex.Flowable<WebSocketFrameSentEvent> {
        return connectionRemote.captureEvents("Network.webSocketFrameSent", WebSocketFrameSentEvent::class.java)
    }

    /**
     * Fired when EventSource message is received.
     */
    fun eventSourceMessageReceived() : io.reactivex.Flowable<EventSourceMessageReceivedEvent> {
        return connectionRemote.captureEvents("Network.eventSourceMessageReceived", EventSourceMessageReceivedEvent::class.java)
    }

    /**
     * Returns flowable capturing all Network domains events.
     */
    fun events() : io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().filter {
            it.protocolDomain() == "Network"
        }
    }
}
/**
 * Represents requestFrame parameters that can be used with Network.enable method call.
 *
 * Enables network tracking, network events will now be delivered to the client.
 */
data class EnableRequest (
    /**
     * Buffer size in bytes to use when preserving network payloads (XHRs, etc).
     */
    @pl.wendigo.chrome.Experimental val maxTotalBufferSize : Int? = null,

    /**
     * Per-resource buffer size in bytes to use when preserving network payloads (XHRs, etc).
     */
    @pl.wendigo.chrome.Experimental val maxResourceBufferSize : Int? = null

)




/**
 * Represents requestFrame parameters that can be used with Network.setUserAgentOverride method call.
 *
 * Allows overriding user agent with the given string.
 */
data class SetUserAgentOverrideRequest (
    /**
     * User agent to use.
     */
    val userAgent : String

)


/**
 * Represents requestFrame parameters that can be used with Network.setExtraHTTPHeaders method call.
 *
 * Specifies whether to always send extra HTTP headers with the requests from this page.
 */
data class SetExtraHTTPHeadersRequest (
    /**
     * Map with extra HTTP headers.
     */
    val headers : Headers

)


/**
 * Represents requestFrame parameters that can be used with Network.getResponseBody method call.
 *
 * Returns content served for the given request.
 */
data class GetResponseBodyRequest (
    /**
     * Identifier of the network request to get content for.
     */
    val requestId : RequestId

)

/**
 * Represents responseFrame from Network. method call.
 *
 * Returns content served for the given request.
 */
data class GetResponseBodyResponse(
  /**
   * Response body.
   */
  val body : String,

  /**
   * True, if content was sent as base64.
   */
  val base64Encoded : Boolean

)

/**
 * Represents requestFrame parameters that can be used with Network.setBlockedURLs method call.
 *
 * Blocks specific URL from loading.
 */
data class SetBlockedURLsRequest (
    /**
     * URLs to block.
     */
    val urls : Array<String>

)


/**
 * Represents requestFrame parameters that can be used with Network.replayXHR method call.
 *
 * This method sends a new XMLHttpRequest which is identical to the original one. The following parameters should be identical: method, url, async, request body, extra headers, withCredentials attribute, user, password.
 */
data class ReplayXHRRequest (
    /**
     * Identifier of XHR to replay.
     */
    val requestId : RequestId

)


/**
 * Represents requestFrame parameters that can be used with Network.setMonitoringXHREnabled method call.
 *
 * Toggles monitoring of XMLHttpRequest. If <code>true</code>, console will receive messages upon each XHR issued.
 */
data class SetMonitoringXHREnabledRequest (
    /**
     * Monitoring enabled state.
     */
    val enabled : Boolean

)



/**
 * Represents responseFrame from Network. method call.
 *
 * Tells whether clearing browser cache is supported.
 */
data class CanClearBrowserCacheResponse(
  /**
   * True if browser cache can be cleared.
   */
  val result : Boolean

)




/**
 * Represents responseFrame from Network. method call.
 *
 * Tells whether clearing browser cookies is supported.
 */
data class CanClearBrowserCookiesResponse(
  /**
   * True if browser cookies can be cleared.
   */
  val result : Boolean

)



/**
 * Represents requestFrame parameters that can be used with Network.getCookies method call.
 *
 * Returns all browser cookies for the current URL. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
data class GetCookiesRequest (
    /**
     * The list of URLs for which applicable cookies will be fetched
     */
    val urls : Array<String>? = null

)

/**
 * Represents responseFrame from Network. method call.
 *
 * Returns all browser cookies for the current URL. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
data class GetCookiesResponse(
  /**
   * Array of cookie objects.
   */
  val cookies : Array<Cookie>

)


/**
 * Represents responseFrame from Network. method call.
 *
 * Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
data class GetAllCookiesResponse(
  /**
   * Array of cookie objects.
   */
  val cookies : Array<Cookie>

)

/**
 * Represents requestFrame parameters that can be used with Network.deleteCookie method call.
 *
 * Deletes browser cookie with given name, domain and path.
 */
data class DeleteCookieRequest (
    /**
     * Name of the cookie to remove.
     */
    val cookieName : String,

    /**
     * URL to match cooke domain and path.
     */
    val url : String

)


/**
 * Represents requestFrame parameters that can be used with Network.setCookie method call.
 *
 * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
 */
data class SetCookieRequest (
    /**
     * The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie.
     */
    val url : String,

    /**
     * The name of the cookie.
     */
    val name : String,

    /**
     * The value of the cookie.
     */
    val value : String,

    /**
     * If omitted, the cookie becomes a host-only cookie.
     */
    val domain : String? = null,

    /**
     * Defaults to the path portion of the url parameter.
     */
    val path : String? = null,

    /**
     * Defaults ot false.
     */
    val secure : Boolean? = null,

    /**
     * Defaults to false.
     */
    val httpOnly : Boolean? = null,

    /**
     * Defaults to browser default behavior.
     */
    val sameSite : CookieSameSite? = null,

    /**
     * If omitted, the cookie becomes a session cookie.
     */
    val expirationDate : Timestamp? = null

)

/**
 * Represents responseFrame from Network. method call.
 *
 * Sets a cookie with the given cookie data; may overwrite equivalent cookies if they exist.
 */
data class SetCookieResponse(
  /**
   * True if successfully set cookie.
   */
  val success : Boolean

)


/**
 * Represents responseFrame from Network. method call.
 *
 * Tells whether emulation of network conditions is supported.
 */
data class CanEmulateNetworkConditionsResponse(
  /**
   * True if emulation of network conditions is supported.
   */
  val result : Boolean

)

/**
 * Represents requestFrame parameters that can be used with Network.emulateNetworkConditions method call.
 *
 * Activates emulation of network conditions.
 */
data class EmulateNetworkConditionsRequest (
    /**
     * True to emulate internet disconnection.
     */
    val offline : Boolean,

    /**
     * Additional latency (ms).
     */
    val latency : Double,

    /**
     * Maximal aggregated download throughput.
     */
    val downloadThroughput : Double,

    /**
     * Maximal aggregated upload throughput.
     */
    val uploadThroughput : Double,

    /**
     * Connection type if known.
     */
    val connectionType : ConnectionType? = null

)


/**
 * Represents requestFrame parameters that can be used with Network.setCacheDisabled method call.
 *
 * Toggles ignoring cache for each request. If <code>true</code>, cache will not be used.
 */
data class SetCacheDisabledRequest (
    /**
     * Cache disabled state.
     */
    val cacheDisabled : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Network.setBypassServiceWorker method call.
 *
 * Toggles ignoring of service worker for each request.
 */
data class SetBypassServiceWorkerRequest (
    /**
     * Bypass service worker and load from network.
     */
    val bypass : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Network.setDataSizeLimitsForTest method call.
 *
 * For testing.
 */
data class SetDataSizeLimitsForTestRequest (
    /**
     * Maximum total buffer size.
     */
    val maxTotalSize : Int,

    /**
     * Maximum per-resource size.
     */
    val maxResourceSize : Int

)


/**
 * Represents requestFrame parameters that can be used with Network.getCertificate method call.
 *
 * Returns the DER-encoded certificate.
 */
data class GetCertificateRequest (
    /**
     * Origin to get certificate for.
     */
    val origin : String

)

/**
 * Represents responseFrame from Network. method call.
 *
 * Returns the DER-encoded certificate.
 */
data class GetCertificateResponse(
  /**
   * 
   */
  val tableNames : Array<String>

)

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when resource loading priority is changed
 */
data class ResourceChangedPriorityEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * New priority
   */
  val newPriority : ResourcePriority,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "resourceChangedPriority")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when page is about to send HTTP request.
 */
data class RequestWillBeSentEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Frame identifier.
   */
  @pl.wendigo.chrome.Experimental val frameId : pl.wendigo.chrome.domain.page.FrameId,

  /**
   * Loader identifier.
   */
  val loaderId : LoaderId,

  /**
   * URL of the document this request is loaded for.
   */
  val documentURL : String,

  /**
   * Request data.
   */
  val request : Request,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * UTC Timestamp.
   */
  @pl.wendigo.chrome.Experimental val wallTime : Timestamp,

  /**
   * Request initiator.
   */
  val initiator : Initiator,

  /**
   * Redirect response data.
   */
  val redirectResponse : Response? = null,

  /**
   * Type of this resource.
   */
  @pl.wendigo.chrome.Experimental val type : pl.wendigo.chrome.domain.page.ResourceType? = null

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "requestWillBeSent")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired if request ended up loading from cache.
 */
data class RequestServedFromCacheEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "requestServedFromCache")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when HTTP response is available.
 */
data class ResponseReceivedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Frame identifier.
   */
  @pl.wendigo.chrome.Experimental val frameId : pl.wendigo.chrome.domain.page.FrameId,

  /**
   * Loader identifier.
   */
  val loaderId : LoaderId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * Resource type.
   */
  val type : pl.wendigo.chrome.domain.page.ResourceType,

  /**
   * Response data.
   */
  val response : Response

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "responseReceived")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when data chunk was received over the network.
 */
data class DataReceivedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * Data chunk length.
   */
  val dataLength : Int,

  /**
   * Actual bytes received (might be less than dataLength for compressed encodings).
   */
  val encodedDataLength : Int

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "dataReceived")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when HTTP request has finished loading.
 */
data class LoadingFinishedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * Total number of bytes received for this request.
   */
  val encodedDataLength : Double

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "loadingFinished")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when HTTP request has failed to load.
 */
data class LoadingFailedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * Resource type.
   */
  val type : pl.wendigo.chrome.domain.page.ResourceType,

  /**
   * User friendly error message.
   */
  val errorText : String,

  /**
   * True if loading was canceled.
   */
  val canceled : Boolean? = null,

  /**
   * The reason why loading was blocked, if any.
   */
  @pl.wendigo.chrome.Experimental val blockedReason : BlockedReason? = null

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "loadingFailed")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket is about to initiate handshake.
 */
data class WebSocketWillSendHandshakeRequestEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * UTC Timestamp.
   */
  @pl.wendigo.chrome.Experimental val wallTime : Timestamp,

  /**
   * WebSocket request data.
   */
  val request : WebSocketRequest

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketWillSendHandshakeRequest")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket handshake response becomes available.
 */
data class WebSocketHandshakeResponseReceivedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * WebSocket response data.
   */
  val response : WebSocketResponse

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketHandshakeResponseReceived")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired upon WebSocket creation.
 */
data class WebSocketCreatedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * WebSocket request URL.
   */
  val url : String,

  /**
   * Request initiator.
   */
  val initiator : Initiator? = null

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketCreated")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket is closed.
 */
data class WebSocketClosedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketClosed")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket frame is received.
 */
data class WebSocketFrameReceivedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * WebSocket response data.
   */
  val response : WebSocketFrame

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketFrameReceived")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket frame error occurs.
 */
data class WebSocketFrameErrorEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * WebSocket frame error message.
   */
  val errorMessage : String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketFrameError")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when WebSocket frame is sent.
 */
data class WebSocketFrameSentEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * WebSocket response data.
   */
  val response : WebSocketFrame

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "webSocketFrameSent")

/**
 * Represents responseFrame from Network. method call.
 *
 * Fired when EventSource message is received.
 */
data class EventSourceMessageReceivedEvent(
  /**
   * Request identifier.
   */
  val requestId : RequestId,

  /**
   * Timestamp.
   */
  val timestamp : Timestamp,

  /**
   * Message type.
   */
  val eventName : String,

  /**
   * Message identifier.
   */
  val eventId : String,

  /**
   * Message content.
   */
  val data : String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Network", name = "eventSourceMessageReceived")

