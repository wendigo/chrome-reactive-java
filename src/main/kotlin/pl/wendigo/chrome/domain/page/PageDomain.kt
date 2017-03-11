package pl.wendigo.chrome.domain.page

/**
 * Actions and events related to the inspected page belong to the page domain.
 */
class PageDomain internal constructor(private val connection : pl.wendigo.chrome.DebuggerConnection) {

	/**
	 * Enables page domain notifications.
	 */
	  fun enable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.enable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Disables page domain notifications.
	 */
	  fun disable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.disable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * 
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun addScriptToEvaluateOnLoad(input : AddScriptToEvaluateOnLoadRequest) : io.reactivex.Flowable<AddScriptToEvaluateOnLoadResponse> {
        return connection.runAndCaptureResponse("Page.addScriptToEvaluateOnLoad", input, AddScriptToEvaluateOnLoadResponse::class.java)
	}

	/**
	 * 
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun removeScriptToEvaluateOnLoad(input : RemoveScriptToEvaluateOnLoadRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.removeScriptToEvaluateOnLoad", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Controls whether browser will open a new inspector window for connected pages.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setAutoAttachToCreatedPages(input : SetAutoAttachToCreatedPagesRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setAutoAttachToCreatedPages", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Reloads given page optionally ignoring the cache.
	 */
	  fun reload(input : ReloadRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.reload", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Navigates current page to the given URL.
	 */
	  fun navigate(input : NavigateRequest) : io.reactivex.Flowable<NavigateResponse> {
        return connection.runAndCaptureResponse("Page.navigate", input, NavigateResponse::class.java)
	}

	/**
	 * Force the page stop all navigations and pending resource fetches.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun stopLoading() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.stopLoading", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns navigation history for the current page.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getNavigationHistory() : io.reactivex.Flowable<GetNavigationHistoryResponse> {
        return connection.runAndCaptureResponse("Page.getNavigationHistory", null, GetNavigationHistoryResponse::class.java)
	}

	/**
	 * Navigates current page to the given history entry.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun navigateToHistoryEntry(input : NavigateToHistoryEntryRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.navigateToHistoryEntry", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getCookies() : io.reactivex.Flowable<GetCookiesResponse> {
        return connection.runAndCaptureResponse("Page.getCookies", null, GetCookiesResponse::class.java)
	}

	/**
	 * Deletes browser cookie with given name, domain and path.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun deleteCookie(input : DeleteCookieRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.deleteCookie", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns present frame / resource tree structure.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getResourceTree() : io.reactivex.Flowable<GetResourceTreeResponse> {
        return connection.runAndCaptureResponse("Page.getResourceTree", null, GetResourceTreeResponse::class.java)
	}

	/**
	 * Returns content of the given resource.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getResourceContent(input : GetResourceContentRequest) : io.reactivex.Flowable<GetResourceContentResponse> {
        return connection.runAndCaptureResponse("Page.getResourceContent", input, GetResourceContentResponse::class.java)
	}

	/**
	 * Searches for given string in resource content.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun searchInResource(input : SearchInResourceRequest) : io.reactivex.Flowable<SearchInResourceResponse> {
        return connection.runAndCaptureResponse("Page.searchInResource", input, SearchInResourceResponse::class.java)
	}

	/**
	 * Sets given markup as the document's HTML.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setDocumentContent(input : SetDocumentContentRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setDocumentContent", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results).
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setDeviceMetricsOverride(input : SetDeviceMetricsOverrideRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setDeviceMetricsOverride", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Clears the overriden device metrics.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun clearDeviceMetricsOverride() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.clearDeviceMetricsOverride", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position unavailable.
	 */
	  fun setGeolocationOverride(input : SetGeolocationOverrideRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setGeolocationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Clears the overriden Geolocation Position and Error.
	 */
	  fun clearGeolocationOverride() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.clearGeolocationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Overrides the Device Orientation.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setDeviceOrientationOverride(input : SetDeviceOrientationOverrideRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setDeviceOrientationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Clears the overridden Device Orientation.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun clearDeviceOrientationOverride() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.clearDeviceOrientationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Toggles mouse event-based touch event emulation.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setTouchEmulationEnabled(input : SetTouchEmulationEnabledRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setTouchEmulationEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Capture page screenshot.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun captureScreenshot(input : CaptureScreenshotRequest) : io.reactivex.Flowable<CaptureScreenshotResponse> {
        return connection.runAndCaptureResponse("Page.captureScreenshot", input, CaptureScreenshotResponse::class.java)
	}

	/**
	 * Print page as pdf.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun printToPDF() : io.reactivex.Flowable<PrintToPDFResponse> {
        return connection.runAndCaptureResponse("Page.printToPDF", null, PrintToPDFResponse::class.java)
	}

	/**
	 * Starts sending each frame using the <code>screencastFrame</code> event.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun startScreencast(input : StartScreencastRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.startScreencast", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Stops sending each frame in the <code>screencastFrame</code>.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun stopScreencast() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.stopScreencast", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Acknowledges that a screencast frame has been received by the frontend.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun screencastFrameAck(input : ScreencastFrameAckRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.screencastFrameAck", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
	 */
	  fun handleJavaScriptDialog(input : HandleJavaScriptDialogRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.handleJavaScriptDialog", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Shows / hides color picker
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setColorPickerEnabled(input : SetColorPickerEnabledRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setColorPickerEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Configures overlay.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun configureOverlay(input : ConfigureOverlayRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.configureOverlay", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * 
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getAppManifest() : io.reactivex.Flowable<GetAppManifestResponse> {
        return connection.runAndCaptureResponse("Page.getAppManifest", null, GetAppManifestResponse::class.java)
	}

	/**
	 * 
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun requestAppBanner() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.requestAppBanner", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Toggles navigation throttling which allows programatic control over navigation and redirect response.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setControlNavigations(input : SetControlNavigationsRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.setControlNavigations", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Should be sent in response to a navigationRequested or a redirectRequested event, telling the browser how to handle the navigation.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun processNavigation(input : ProcessNavigationRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Page.processNavigation", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getLayoutMetrics() : io.reactivex.Flowable<GetLayoutMetricsResponse> {
        return connection.runAndCaptureResponse("Page.getLayoutMetrics", null, GetLayoutMetricsResponse::class.java)
	}

  
  /**
   * 
   */
   fun onDomContentEventFired() : io.reactivex.Flowable<DomContentEventFiredEvent> {
      return connection.captureEvents("Page.domContentEventFired", DomContentEventFiredEvent::class.java)
   }

  /**
   * 
   */
   fun onLoadEventFired() : io.reactivex.Flowable<LoadEventFiredEvent> {
      return connection.captureEvents("Page.loadEventFired", LoadEventFiredEvent::class.java)
   }

  /**
   * Fired when frame has been attached to its parent.
   */
   fun onFrameAttached() : io.reactivex.Flowable<FrameAttachedEvent> {
      return connection.captureEvents("Page.frameAttached", FrameAttachedEvent::class.java)
   }

  /**
   * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
   */
   fun onFrameNavigated() : io.reactivex.Flowable<FrameNavigatedEvent> {
      return connection.captureEvents("Page.frameNavigated", FrameNavigatedEvent::class.java)
   }

  /**
   * Fired when frame has been detached from its parent.
   */
   fun onFrameDetached() : io.reactivex.Flowable<FrameDetachedEvent> {
      return connection.captureEvents("Page.frameDetached", FrameDetachedEvent::class.java)
   }

  /**
   * Fired when frame has started loading.
   */
   fun onFrameStartedLoading() : io.reactivex.Flowable<FrameStartedLoadingEvent> {
      return connection.captureEvents("Page.frameStartedLoading", FrameStartedLoadingEvent::class.java)
   }

  /**
   * Fired when frame has stopped loading.
   */
   fun onFrameStoppedLoading() : io.reactivex.Flowable<FrameStoppedLoadingEvent> {
      return connection.captureEvents("Page.frameStoppedLoading", FrameStoppedLoadingEvent::class.java)
   }

  /**
   * Fired when frame schedules a potential navigation.
   */
   fun onFrameScheduledNavigation() : io.reactivex.Flowable<FrameScheduledNavigationEvent> {
      return connection.captureEvents("Page.frameScheduledNavigation", FrameScheduledNavigationEvent::class.java)
   }

  /**
   * Fired when frame no longer has a scheduled navigation.
   */
   fun onFrameClearedScheduledNavigation() : io.reactivex.Flowable<FrameClearedScheduledNavigationEvent> {
      return connection.captureEvents("Page.frameClearedScheduledNavigation", FrameClearedScheduledNavigationEvent::class.java)
   }

  /**
   * 
   */
   fun onFrameResized() : io.reactivex.Flowable<pl.wendigo.chrome.DebuggerEvent> {
      return connection.captureEvents("Page.frameResized", pl.wendigo.chrome.DebuggerEvent::class.java)
   }

  /**
   * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
   */
   fun onJavascriptDialogOpening() : io.reactivex.Flowable<JavascriptDialogOpeningEvent> {
      return connection.captureEvents("Page.javascriptDialogOpening", JavascriptDialogOpeningEvent::class.java)
   }

  /**
   * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
   */
   fun onJavascriptDialogClosed() : io.reactivex.Flowable<JavascriptDialogClosedEvent> {
      return connection.captureEvents("Page.javascriptDialogClosed", JavascriptDialogClosedEvent::class.java)
   }

  /**
   * Compressed image data requested by the <code>startScreencast</code>.
   */
   fun onScreencastFrame() : io.reactivex.Flowable<ScreencastFrameEvent> {
      return connection.captureEvents("Page.screencastFrame", ScreencastFrameEvent::class.java)
   }

  /**
   * Fired when the page with currently enabled screencast was shown or hidden </code>.
   */
   fun onScreencastVisibilityChanged() : io.reactivex.Flowable<ScreencastVisibilityChangedEvent> {
      return connection.captureEvents("Page.screencastVisibilityChanged", ScreencastVisibilityChangedEvent::class.java)
   }

  /**
   * Fired when a color has been picked.
   */
   fun onColorPicked() : io.reactivex.Flowable<ColorPickedEvent> {
      return connection.captureEvents("Page.colorPicked", ColorPickedEvent::class.java)
   }

  /**
   * Fired when interstitial page was shown
   */
   fun onInterstitialShown() : io.reactivex.Flowable<pl.wendigo.chrome.DebuggerEvent> {
      return connection.captureEvents("Page.interstitialShown", pl.wendigo.chrome.DebuggerEvent::class.java)
   }

  /**
   * Fired when interstitial page was hidden
   */
   fun onInterstitialHidden() : io.reactivex.Flowable<pl.wendigo.chrome.DebuggerEvent> {
      return connection.captureEvents("Page.interstitialHidden", pl.wendigo.chrome.DebuggerEvent::class.java)
   }

  /**
   * Fired when a navigation is started if navigation throttles are enabled.  The navigation will be deferred until processNavigation is called.
   */
   fun onNavigationRequested() : io.reactivex.Flowable<NavigationRequestedEvent> {
      return connection.captureEvents("Page.navigationRequested", NavigationRequestedEvent::class.java)
   }
}





/**
 * Represents requestFrame parameters that can be used with Page.addScriptToEvaluateOnLoad method call.
 *
 * 
 */
data class AddScriptToEvaluateOnLoadRequest (
    /**
     * 
     */
    val scriptSource : String

)

/**
 * Represents responseFrame from Page. method call.
 *
 * 
 */
data class AddScriptToEvaluateOnLoadResponse(
  /**
   * Identifier of the added script.
   */
  val identifier : ScriptIdentifier

)

/**
 * Represents requestFrame parameters that can be used with Page.removeScriptToEvaluateOnLoad method call.
 *
 * 
 */
data class RemoveScriptToEvaluateOnLoadRequest (
    /**
     * 
     */
    val identifier : ScriptIdentifier

)


/**
 * Represents requestFrame parameters that can be used with Page.setAutoAttachToCreatedPages method call.
 *
 * Controls whether browser will open a new inspector window for connected pages.
 */
data class SetAutoAttachToCreatedPagesRequest (
    /**
     * If true, browser will open a new inspector window for every page created from this one.
     */
    val autoAttach : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Page.reload method call.
 *
 * Reloads given page optionally ignoring the cache.
 */
data class ReloadRequest (
    /**
     * If true, browser cache is ignored (as if the user pressed Shift+refresh).
     */
    val ignoreCache : Boolean? = null,

    /**
     * If set, the script will be injected into all frames of the inspected page after reload.
     */
    val scriptToEvaluateOnLoad : String? = null

)


/**
 * Represents requestFrame parameters that can be used with Page.navigate method call.
 *
 * Navigates current page to the given URL.
 */
data class NavigateRequest (
    /**
     * URL to navigate the page to.
     */
    val url : String,

    /**
     * Referrer URL.
     */
    @pl.wendigo.chrome.ProtocolExperimental val referrer : String? = null

)

/**
 * Represents responseFrame from Page. method call.
 *
 * Navigates current page to the given URL.
 */
data class NavigateResponse(
  /**
   * Frame id that will be navigated.
   */
  @pl.wendigo.chrome.ProtocolExperimental val frameId : FrameId

)




/**
 * Represents responseFrame from Page. method call.
 *
 * Returns navigation history for the current page.
 */
data class GetNavigationHistoryResponse(
  /**
   * Index of the current navigation history entry.
   */
  val currentIndex : Int,

  /**
   * Array of navigation history entries.
   */
  val entries : Array<NavigationEntry>

)

/**
 * Represents requestFrame parameters that can be used with Page.navigateToHistoryEntry method call.
 *
 * Navigates current page to the given history entry.
 */
data class NavigateToHistoryEntryRequest (
    /**
     * Unique id of the entry to navigate to.
     */
    val entryId : Int

)



/**
 * Represents responseFrame from Page. method call.
 *
 * Returns all browser cookies. Depending on the backend support, will return detailed cookie information in the <code>cookies</code> field.
 */
data class GetCookiesResponse(
  /**
   * Array of cookie objects.
   */
  val cookies : Array<pl.wendigo.chrome.domain.network.Cookie>

)

/**
 * Represents requestFrame parameters that can be used with Page.deleteCookie method call.
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
 * Represents responseFrame from Page. method call.
 *
 * Returns present frame / resource tree structure.
 */
data class GetResourceTreeResponse(
  /**
   * Present frame / resource tree structure.
   */
  val frameTree : FrameResourceTree

)

/**
 * Represents requestFrame parameters that can be used with Page.getResourceContent method call.
 *
 * Returns content of the given resource.
 */
data class GetResourceContentRequest (
    /**
     * Frame id to get resource for.
     */
    val frameId : FrameId,

    /**
     * URL of the resource to get content for.
     */
    val url : String

)

/**
 * Represents responseFrame from Page. method call.
 *
 * Returns content of the given resource.
 */
data class GetResourceContentResponse(
  /**
   * Resource content.
   */
  val content : String,

  /**
   * True, if content was served as base64.
   */
  val base64Encoded : Boolean

)

/**
 * Represents requestFrame parameters that can be used with Page.searchInResource method call.
 *
 * Searches for given string in resource content.
 */
data class SearchInResourceRequest (
    /**
     * Frame id for resource to search in.
     */
    val frameId : FrameId,

    /**
     * URL of the resource to search in.
     */
    val url : String,

    /**
     * String to search for.
     */
    val query : String,

    /**
     * If true, search is case sensitive.
     */
    val caseSensitive : Boolean? = null,

    /**
     * If true, treats string parameter as regex.
     */
    val isRegex : Boolean? = null

)

/**
 * Represents responseFrame from Page. method call.
 *
 * Searches for given string in resource content.
 */
data class SearchInResourceResponse(
  /**
   * List of search matches.
   */
  val result : Array<pl.wendigo.chrome.domain.debugger.SearchMatch>

)

/**
 * Represents requestFrame parameters that can be used with Page.setDocumentContent method call.
 *
 * Sets given markup as the document's HTML.
 */
data class SetDocumentContentRequest (
    /**
     * Frame id to set HTML for.
     */
    val frameId : FrameId,

    /**
     * HTML content to set.
     */
    val html : String

)


/**
 * Represents requestFrame parameters that can be used with Page.setDeviceMetricsOverride method call.
 *
 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height, window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media query results).
 */
data class SetDeviceMetricsOverrideRequest (
    /**
     * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val width : Int,

    /**
     * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val height : Int,

    /**
     * Overriding device scale factor value. 0 disables the override.
     */
    val deviceScaleFactor : Double,

    /**
     * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text autosizing and more.
     */
    val mobile : Boolean,

    /**
     * Whether a view that exceeds the available browser window area should be scaled down to fit.
     */
    val fitWindow : Boolean,

    /**
     * Scale to apply to resulting view image. Ignored in |fitWindow| mode.
     */
    val scale : Double? = null,

    /**
     * X offset to shift resulting view image by. Ignored in |fitWindow| mode.
     */
    val offsetX : Double? = null,

    /**
     * Y offset to shift resulting view image by. Ignored in |fitWindow| mode.
     */
    val offsetY : Double? = null,

    /**
     * Overriding screen width value in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    val screenWidth : Int? = null,

    /**
     * Overriding screen height value in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    val screenHeight : Int? = null,

    /**
     * Overriding view X position on screen in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    val positionX : Int? = null,

    /**
     * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000). Only used for |mobile==true|.
     */
    val positionY : Int? = null,

    /**
     * Screen orientation override.
     */
    val screenOrientation : pl.wendigo.chrome.domain.emulation.ScreenOrientation? = null

)




/**
 * Represents requestFrame parameters that can be used with Page.setGeolocationOverride method call.
 *
 * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position unavailable.
 */
data class SetGeolocationOverrideRequest (
    /**
     * Mock latitude
     */
    val latitude : Double? = null,

    /**
     * Mock longitude
     */
    val longitude : Double? = null,

    /**
     * Mock accuracy
     */
    val accuracy : Double? = null

)




/**
 * Represents requestFrame parameters that can be used with Page.setDeviceOrientationOverride method call.
 *
 * Overrides the Device Orientation.
 */
data class SetDeviceOrientationOverrideRequest (
    /**
     * Mock alpha
     */
    val alpha : Double,

    /**
     * Mock beta
     */
    val beta : Double,

    /**
     * Mock gamma
     */
    val gamma : Double

)




/**
 * Represents requestFrame parameters that can be used with Page.setTouchEmulationEnabled method call.
 *
 * Toggles mouse event-based touch event emulation.
 */
data class SetTouchEmulationEnabledRequest (
    /**
     * Whether the touch event emulation should be enabled.
     */
    val enabled : Boolean,

    /**
     * Touch/gesture events configuration. Default: current platform.
     */
    val configuration : String? = null

)


/**
 * Represents requestFrame parameters that can be used with Page.captureScreenshot method call.
 *
 * Capture page screenshot.
 */
data class CaptureScreenshotRequest (
    /**
     * Image compression format (defaults to png).
     */
    val format : String? = null,

    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    val quality : Int? = null

)

/**
 * Represents responseFrame from Page. method call.
 *
 * Capture page screenshot.
 */
data class CaptureScreenshotResponse(
  /**
   * Base64-encoded image data.
   */
  val data : String

)


/**
 * Represents responseFrame from Page. method call.
 *
 * Print page as pdf.
 */
data class PrintToPDFResponse(
  /**
   * Base64-encoded pdf data.
   */
  val data : String

)

/**
 * Represents requestFrame parameters that can be used with Page.startScreencast method call.
 *
 * Starts sending each frame using the <code>screencastFrame</code> event.
 */
data class StartScreencastRequest (
    /**
     * Image compression format.
     */
    val format : String? = null,

    /**
     * Compression quality from range [0..100].
     */
    val quality : Int? = null,

    /**
     * Maximum screenshot width.
     */
    val maxWidth : Int? = null,

    /**
     * Maximum screenshot height.
     */
    val maxHeight : Int? = null,

    /**
     * Send every n-th frame.
     */
    val everyNthFrame : Int? = null

)




/**
 * Represents requestFrame parameters that can be used with Page.screencastFrameAck method call.
 *
 * Acknowledges that a screencast frame has been received by the frontend.
 */
data class ScreencastFrameAckRequest (
    /**
     * Frame number.
     */
    val sessionId : Int

)


/**
 * Represents requestFrame parameters that can be used with Page.handleJavaScriptDialog method call.
 *
 * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
 */
data class HandleJavaScriptDialogRequest (
    /**
     * Whether to accept or dismiss the dialog.
     */
    val accept : Boolean,

    /**
     * The text to enter into the dialog prompt before accepting. Used only if this is a prompt dialog.
     */
    val promptText : String? = null

)


/**
 * Represents requestFrame parameters that can be used with Page.setColorPickerEnabled method call.
 *
 * Shows / hides color picker
 */
data class SetColorPickerEnabledRequest (
    /**
     * Shows / hides color picker
     */
    val enabled : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Page.configureOverlay method call.
 *
 * Configures overlay.
 */
data class ConfigureOverlayRequest (
    /**
     * Whether overlay should be suspended and not consume any resources.
     */
    val suspended : Boolean? = null,

    /**
     * Overlay message to display.
     */
    val message : String? = null

)



/**
 * Represents responseFrame from Page. method call.
 *
 * 
 */
data class GetAppManifestResponse(
  /**
   * Manifest location.
   */
  val url : String,

  /**
   * 
   */
  val errors : Array<AppManifestError>,

  /**
   * Manifest content.
   */
  val data : String? = null

)



/**
 * Represents requestFrame parameters that can be used with Page.setControlNavigations method call.
 *
 * Toggles navigation throttling which allows programatic control over navigation and redirect response.
 */
data class SetControlNavigationsRequest (
    /**
     * 
     */
    val enabled : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Page.processNavigation method call.
 *
 * Should be sent in response to a navigationRequested or a redirectRequested event, telling the browser how to handle the navigation.
 */
data class ProcessNavigationRequest (
    /**
     * 
     */
    val response : NavigationResponse,

    /**
     * 
     */
    val navigationId : Int

)



/**
 * Represents responseFrame from Page. method call.
 *
 * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
 */
data class GetLayoutMetricsResponse(
  /**
   * Metrics relating to the layout viewport.
   */
  val layoutViewport : LayoutViewport,

  /**
   * Metrics relating to the visual viewport.
   */
  val visualViewport : VisualViewport,

  /**
   * Size of scrollable area.
   */
  val contentSize : pl.wendigo.chrome.domain.dom.Rect

)


/**
 * Represents responseFrame from Page. method call.
 *
 * 
 */
data class DomContentEventFiredEvent(
  /**
   * 
   */
  val timestamp : Double

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "domContentEventFired")

/**
 * Represents responseFrame from Page. method call.
 *
 * 
 */
data class LoadEventFiredEvent(
  /**
   * 
   */
  val timestamp : Double

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "loadEventFired")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame has been attached to its parent.
 */
data class FrameAttachedEvent(
  /**
   * Id of the frame that has been attached.
   */
  val frameId : FrameId,

  /**
   * Parent frame identifier.
   */
  val parentFrameId : FrameId

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameAttached")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
data class FrameNavigatedEvent(
  /**
   * Frame object.
   */
  val frame : Frame

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameNavigated")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame has been detached from its parent.
 */
data class FrameDetachedEvent(
  /**
   * Id of the frame that has been detached.
   */
  val frameId : FrameId

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameDetached")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame has started loading.
 */
data class FrameStartedLoadingEvent(
  /**
   * Id of the frame that has started loading.
   */
  val frameId : FrameId

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameStartedLoading")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame has stopped loading.
 */
data class FrameStoppedLoadingEvent(
  /**
   * Id of the frame that has stopped loading.
   */
  val frameId : FrameId

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameStoppedLoading")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame schedules a potential navigation.
 */
data class FrameScheduledNavigationEvent(
  /**
   * Id of the frame that has scheduled a navigation.
   */
  val frameId : FrameId,

  /**
   * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed to start.
   */
  val delay : Double

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameScheduledNavigation")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when frame no longer has a scheduled navigation.
 */
data class FrameClearedScheduledNavigationEvent(
  /**
   * Id of the frame that has cleared its scheduled navigation.
   */
  val frameId : FrameId

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "frameClearedScheduledNavigation")


/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
data class JavascriptDialogOpeningEvent(
  /**
   * Message that will be displayed by the dialog.
   */
  val message : String,

  /**
   * Dialog type.
   */
  val type : DialogType

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "javascriptDialogOpening")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
data class JavascriptDialogClosedEvent(
  /**
   * Whether dialog was confirmed.
   */
  val result : Boolean

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "javascriptDialogClosed")

/**
 * Represents responseFrame from Page. method call.
 *
 * Compressed image data requested by the <code>startScreencast</code>.
 */
data class ScreencastFrameEvent(
  /**
   * Base64-encoded compressed image.
   */
  val data : String,

  /**
   * Screencast frame metadata.
   */
  val metadata : ScreencastFrameMetadata,

  /**
   * Frame number.
   */
  val sessionId : Int

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "screencastFrame")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when the page with currently enabled screencast was shown or hidden </code>.
 */
data class ScreencastVisibilityChangedEvent(
  /**
   * True if the page is visible.
   */
  val visible : Boolean

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "screencastVisibilityChanged")

/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when a color has been picked.
 */
data class ColorPickedEvent(
  /**
   * RGBA of the picked color.
   */
  val color : pl.wendigo.chrome.domain.dom.RGBA

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "colorPicked")



/**
 * Represents responseFrame from Page. method call.
 *
 * Fired when a navigation is started if navigation throttles are enabled.  The navigation will be deferred until processNavigation is called.
 */
data class NavigationRequestedEvent(
  /**
   * Whether the navigation is taking place in the main frame or in a subframe.
   */
  val isInMainFrame : Boolean,

  /**
   * Whether the navigation has encountered a server redirect or not.
   */
  val isRedirect : Boolean,

  /**
   * 
   */
  val navigationId : Int,

  /**
   * URL of requested navigation.
   */
  val url : String

) : pl.wendigo.chrome.DebuggerEvent(domain = "Page", name = "navigationRequested")

