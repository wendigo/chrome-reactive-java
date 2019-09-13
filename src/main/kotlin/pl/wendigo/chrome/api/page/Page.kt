package pl.wendigo.chrome.domain.page

/**
 * Actions and events related to the inspected page belong to the page domain.
 *
 * @link [https://chromedevtools.github.io/devtools-protocol/tot/Page](https://chromedevtools.github.io/devtools-protocol/tot/Page)
 */
class Page internal constructor(private val connectionRemote: pl.wendigo.chrome.DebuggerProtocol) {
    /**
     * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
     */
    fun addScriptToEvaluateOnLoad(input: AddScriptToEvaluateOnLoadRequest): io.reactivex.Single<AddScriptToEvaluateOnLoadResponse> {
        return connectionRemote.runAndCaptureResponse("Page.addScriptToEvaluateOnLoad", input, AddScriptToEvaluateOnLoadResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Evaluates given script in every frame upon creation (before loading frame's scripts).
     */
    fun addScriptToEvaluateOnNewDocument(input: AddScriptToEvaluateOnNewDocumentRequest): io.reactivex.Single<AddScriptToEvaluateOnNewDocumentResponse> {
        return connectionRemote.runAndCaptureResponse("Page.addScriptToEvaluateOnNewDocument", input, AddScriptToEvaluateOnNewDocumentResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Brings page to front (activates tab).
     */
    fun bringToFront(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.bringToFront", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Capture page screenshot.
     */
    fun captureScreenshot(input: CaptureScreenshotRequest): io.reactivex.Single<CaptureScreenshotResponse> {
        return connectionRemote.runAndCaptureResponse("Page.captureScreenshot", input, CaptureScreenshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
iframes, shadow DOM, external resources, and element-inline styles.
     */
    fun captureSnapshot(input: CaptureSnapshotRequest): io.reactivex.Single<CaptureSnapshotResponse> {
        return connectionRemote.runAndCaptureResponse("Page.captureSnapshot", input, CaptureSnapshotResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden device metrics.
     */
    fun clearDeviceMetricsOverride(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.clearDeviceMetricsOverride", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overridden Device Orientation.
     */
    fun clearDeviceOrientationOverride(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.clearDeviceOrientationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears the overriden Geolocation Position and Error.
     */
    fun clearGeolocationOverride(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.clearGeolocationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Creates an isolated world for the given frame.
     */
    fun createIsolatedWorld(input: CreateIsolatedWorldRequest): io.reactivex.Single<CreateIsolatedWorldResponse> {
        return connectionRemote.runAndCaptureResponse("Page.createIsolatedWorld", input, CreateIsolatedWorldResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Deletes browser cookie with given name, domain and path.
     */
    fun deleteCookie(input: DeleteCookieRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.deleteCookie", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Disables page domain notifications.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.disable", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables page domain notifications.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.enable", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     */
    fun getAppManifest(): io.reactivex.Single<GetAppManifestResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getAppManifest", null, GetAppManifestResponse::class.java).map {
            it.value()
        }
    }

    /**
     *
     */
    fun getInstallabilityErrors(): io.reactivex.Single<GetInstallabilityErrorsResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getInstallabilityErrors", null, GetInstallabilityErrorsResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns all browser cookies. Depending on the backend support, will return detailed cookie
information in the `cookies` field.
     */
    fun getCookies(): io.reactivex.Single<GetCookiesResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getCookies", null, GetCookiesResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns present frame tree structure.
     */
    fun getFrameTree(): io.reactivex.Single<GetFrameTreeResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getFrameTree", null, GetFrameTreeResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
     */
    fun getLayoutMetrics(): io.reactivex.Single<GetLayoutMetricsResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getLayoutMetrics", null, GetLayoutMetricsResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns navigation history for the current page.
     */
    fun getNavigationHistory(): io.reactivex.Single<GetNavigationHistoryResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getNavigationHistory", null, GetNavigationHistoryResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Resets navigation history for the current page.
     */
    fun resetNavigationHistory(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.resetNavigationHistory", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns content of the given resource.
     */
    fun getResourceContent(input: GetResourceContentRequest): io.reactivex.Single<GetResourceContentResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getResourceContent", input, GetResourceContentResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Returns present frame / resource tree structure.
     */
    fun getResourceTree(): io.reactivex.Single<GetResourceTreeResponse> {
        return connectionRemote.runAndCaptureResponse("Page.getResourceTree", null, GetResourceTreeResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
     */
    fun handleJavaScriptDialog(input: HandleJavaScriptDialogRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.handleJavaScriptDialog", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Navigates current page to the given URL.
     */
    fun navigate(input: NavigateRequest): io.reactivex.Single<NavigateResponse> {
        return connectionRemote.runAndCaptureResponse("Page.navigate", input, NavigateResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Navigates current page to the given history entry.
     */
    fun navigateToHistoryEntry(input: NavigateToHistoryEntryRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.navigateToHistoryEntry", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Print page as PDF.
     */
    fun printToPDF(input: PrintToPDFRequest): io.reactivex.Single<PrintToPDFResponse> {
        return connectionRemote.runAndCaptureResponse("Page.printToPDF", input, PrintToPDFResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Reloads given page optionally ignoring the cache.
     */
    fun reload(input: ReloadRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.reload", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
     */
    fun removeScriptToEvaluateOnLoad(input: RemoveScriptToEvaluateOnLoadRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.removeScriptToEvaluateOnLoad", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Removes given script from the list.
     */
    fun removeScriptToEvaluateOnNewDocument(input: RemoveScriptToEvaluateOnNewDocumentRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.removeScriptToEvaluateOnNewDocument", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Acknowledges that a screencast frame has been received by the frontend.
     */
    fun screencastFrameAck(input: ScreencastFrameAckRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.screencastFrameAck", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Searches for given string in resource content.
     */
    fun searchInResource(input: SearchInResourceRequest): io.reactivex.Single<SearchInResourceResponse> {
        return connectionRemote.runAndCaptureResponse("Page.searchInResource", input, SearchInResourceResponse::class.java).map {
            it.value()
        }
    }

    /**
     * Enable Chrome's experimental ad filter on all sites.
     */
    fun setAdBlockingEnabled(input: SetAdBlockingEnabledRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setAdBlockingEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enable page Content Security Policy by-passing.
     */
    fun setBypassCSP(input: SetBypassCSPRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setBypassCSP", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
query results).
     */
    fun setDeviceMetricsOverride(input: SetDeviceMetricsOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setDeviceMetricsOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the Device Orientation.
     */
    fun setDeviceOrientationOverride(input: SetDeviceOrientationOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setDeviceOrientationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Set generic font families.
     */
    fun setFontFamilies(input: SetFontFamiliesRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setFontFamilies", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Set default font sizes.
     */
    fun setFontSizes(input: SetFontSizesRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setFontSizes", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Sets given markup as the document's HTML.
     */
    fun setDocumentContent(input: SetDocumentContentRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setDocumentContent", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Set the behavior when downloading a file.
     */
    fun setDownloadBehavior(input: SetDownloadBehaviorRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setDownloadBehavior", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
unavailable.
     */
    fun setGeolocationOverride(input: SetGeolocationOverrideRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setGeolocationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Controls whether page will emit lifecycle events.
     */
    fun setLifecycleEventsEnabled(input: SetLifecycleEventsEnabledRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setLifecycleEventsEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Toggles mouse event-based touch event emulation.
     */
    fun setTouchEmulationEnabled(input: SetTouchEmulationEnabledRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setTouchEmulationEnabled", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Starts sending each frame using the `screencastFrame` event.
     */
    fun startScreencast(input: StartScreencastRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.startScreencast", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Force the page stop all navigations and pending resource fetches.
     */
    fun stopLoading(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.stopLoading", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Crashes renderer on the IO thread, generates minidumps.
     */
    fun crash(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.crash", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Tries to close page, running its beforeunload hooks, if any.
     */
    fun close(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.close", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Tries to update the web lifecycle state of the page.
It will transition the page to the given state according to:
https://github.com/WICG/web-lifecycle/
     */
    fun setWebLifecycleState(input: SetWebLifecycleStateRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setWebLifecycleState", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Stops sending each frame in the `screencastFrame`.
     */
    fun stopScreencast(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.stopScreencast", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Forces compilation cache to be generated for every subresource script.
     */
    fun setProduceCompilationCache(input: SetProduceCompilationCacheRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setProduceCompilationCache", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Seeds compilation cache for given url. Compilation cache does not survive
cross-process navigation.
     */
    fun addCompilationCache(input: AddCompilationCacheRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.addCompilationCache", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Clears seeded compilation cache.
     */
    fun clearCompilationCache(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.clearCompilationCache", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Generates a report for testing.
     */
    fun generateTestReport(input: GenerateTestReportRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.generateTestReport", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
     */
    fun waitForDebugger(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.waitForDebugger", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Intercept file chooser requests and transfer control to protocol clients.
When file chooser interception is enabled, native file chooser dialog is not shown.
Instead, a protocol event `Page.fileChooserOpened` is emitted.
File chooser can be handled with `page.handleFileChooser` command.
     */
    fun setInterceptFileChooserDialog(input: SetInterceptFileChooserDialogRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.setInterceptFileChooserDialog", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Accepts or cancels an intercepted file chooser dialog.
     */
    fun handleFileChooser(input: HandleFileChooserRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("Page.handleFileChooser", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all Page.domContentEventFired events.
     */
    fun domContentEventFired(): io.reactivex.Flowable<DomContentEventFiredEvent> {
        return domContentEventFiredTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all Page.domContentEventFired events.
     */
    fun domContentEventFiredTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DomContentEventFiredEvent>> {
        return connectionRemote.captureEvents("Page.domContentEventFired", DomContentEventFiredEvent::class.java)
    }

    /**
     *  Emitted only when `page.interceptFileChooser` is enabled.
     */
    fun fileChooserOpened(): io.reactivex.Flowable<FileChooserOpenedEvent> {
        return fileChooserOpenedTimed().map {
            it.value()
        }
    }

    /**
     * Emitted only when `page.interceptFileChooser` is enabled.
     */
    fun fileChooserOpenedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FileChooserOpenedEvent>> {
        return connectionRemote.captureEvents("Page.fileChooserOpened", FileChooserOpenedEvent::class.java)
    }

    /**
     *  Fired when frame has been attached to its parent.
     */
    fun frameAttached(): io.reactivex.Flowable<FrameAttachedEvent> {
        return frameAttachedTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame has been attached to its parent.
     */
    fun frameAttachedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameAttachedEvent>> {
        return connectionRemote.captureEvents("Page.frameAttached", FrameAttachedEvent::class.java)
    }

    /**
     *  Fired when frame no longer has a scheduled navigation.
     */
    fun frameClearedScheduledNavigation(): io.reactivex.Flowable<FrameClearedScheduledNavigationEvent> {
        return frameClearedScheduledNavigationTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame no longer has a scheduled navigation.
     */
    fun frameClearedScheduledNavigationTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameClearedScheduledNavigationEvent>> {
        return connectionRemote.captureEvents("Page.frameClearedScheduledNavigation", FrameClearedScheduledNavigationEvent::class.java)
    }

    /**
     *  Fired when frame has been detached from its parent.
     */
    fun frameDetached(): io.reactivex.Flowable<FrameDetachedEvent> {
        return frameDetachedTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame has been detached from its parent.
     */
    fun frameDetachedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameDetachedEvent>> {
        return connectionRemote.captureEvents("Page.frameDetached", FrameDetachedEvent::class.java)
    }

    /**
     *  Fired once navigation of the frame has completed. Frame is now associated with the new loader.
     */
    fun frameNavigated(): io.reactivex.Flowable<FrameNavigatedEvent> {
        return frameNavigatedTimed().map {
            it.value()
        }
    }

    /**
     * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
     */
    fun frameNavigatedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameNavigatedEvent>> {
        return connectionRemote.captureEvents("Page.frameNavigated", FrameNavigatedEvent::class.java)
    }

    /**
     * Returns observable capturing all Page.frameResized events.
     */
    fun frameResized(): io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return frameResizedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all Page.frameResized events.
     */
    fun frameResizedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<pl.wendigo.chrome.ProtocolEvent>> {
        return connectionRemote.captureEvents("Page.frameResized", pl.wendigo.chrome.ProtocolEvent::class.java)
    }

    /**
     *  Fired when a renderer-initiated navigation is requested.
Navigation may still be cancelled after the event is issued.
     */
    fun frameRequestedNavigation(): io.reactivex.Flowable<FrameRequestedNavigationEvent> {
        return frameRequestedNavigationTimed().map {
            it.value()
        }
    }

    /**
     * Fired when a renderer-initiated navigation is requested.
Navigation may still be cancelled after the event is issued.
     */
    fun frameRequestedNavigationTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameRequestedNavigationEvent>> {
        return connectionRemote.captureEvents("Page.frameRequestedNavigation", FrameRequestedNavigationEvent::class.java)
    }

    /**
     *  Fired when frame schedules a potential navigation.
     */
    fun frameScheduledNavigation(): io.reactivex.Flowable<FrameScheduledNavigationEvent> {
        return frameScheduledNavigationTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame schedules a potential navigation.
     */
    fun frameScheduledNavigationTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameScheduledNavigationEvent>> {
        return connectionRemote.captureEvents("Page.frameScheduledNavigation", FrameScheduledNavigationEvent::class.java)
    }

    /**
     *  Fired when frame has started loading.
     */
    fun frameStartedLoading(): io.reactivex.Flowable<FrameStartedLoadingEvent> {
        return frameStartedLoadingTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame has started loading.
     */
    fun frameStartedLoadingTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameStartedLoadingEvent>> {
        return connectionRemote.captureEvents("Page.frameStartedLoading", FrameStartedLoadingEvent::class.java)
    }

    /**
     *  Fired when frame has stopped loading.
     */
    fun frameStoppedLoading(): io.reactivex.Flowable<FrameStoppedLoadingEvent> {
        return frameStoppedLoadingTimed().map {
            it.value()
        }
    }

    /**
     * Fired when frame has stopped loading.
     */
    fun frameStoppedLoadingTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<FrameStoppedLoadingEvent>> {
        return connectionRemote.captureEvents("Page.frameStoppedLoading", FrameStoppedLoadingEvent::class.java)
    }

    /**
     *  Fired when page is about to start a download.
     */
    fun downloadWillBegin(): io.reactivex.Flowable<DownloadWillBeginEvent> {
        return downloadWillBeginTimed().map {
            it.value()
        }
    }

    /**
     * Fired when page is about to start a download.
     */
    fun downloadWillBeginTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DownloadWillBeginEvent>> {
        return connectionRemote.captureEvents("Page.downloadWillBegin", DownloadWillBeginEvent::class.java)
    }

    /**
     *  Fired when interstitial page was hidden
     */
    fun interstitialHidden(): io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return interstitialHiddenTimed().map {
            it.value()
        }
    }

    /**
     * Fired when interstitial page was hidden
     */
    fun interstitialHiddenTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<pl.wendigo.chrome.ProtocolEvent>> {
        return connectionRemote.captureEvents("Page.interstitialHidden", pl.wendigo.chrome.ProtocolEvent::class.java)
    }

    /**
     *  Fired when interstitial page was shown
     */
    fun interstitialShown(): io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return interstitialShownTimed().map {
            it.value()
        }
    }

    /**
     * Fired when interstitial page was shown
     */
    fun interstitialShownTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<pl.wendigo.chrome.ProtocolEvent>> {
        return connectionRemote.captureEvents("Page.interstitialShown", pl.wendigo.chrome.ProtocolEvent::class.java)
    }

    /**
     *  Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
closed.
     */
    fun javascriptDialogClosed(): io.reactivex.Flowable<JavascriptDialogClosedEvent> {
        return javascriptDialogClosedTimed().map {
            it.value()
        }
    }

    /**
     * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
closed.
     */
    fun javascriptDialogClosedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<JavascriptDialogClosedEvent>> {
        return connectionRemote.captureEvents("Page.javascriptDialogClosed", JavascriptDialogClosedEvent::class.java)
    }

    /**
     *  Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
open.
     */
    fun javascriptDialogOpening(): io.reactivex.Flowable<JavascriptDialogOpeningEvent> {
        return javascriptDialogOpeningTimed().map {
            it.value()
        }
    }

    /**
     * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
open.
     */
    fun javascriptDialogOpeningTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<JavascriptDialogOpeningEvent>> {
        return connectionRemote.captureEvents("Page.javascriptDialogOpening", JavascriptDialogOpeningEvent::class.java)
    }

    /**
     *  Fired for top level page lifecycle events such as navigation, load, paint, etc.
     */
    fun lifecycleEvent(): io.reactivex.Flowable<LifecycleEventEvent> {
        return lifecycleEventTimed().map {
            it.value()
        }
    }

    /**
     * Fired for top level page lifecycle events such as navigation, load, paint, etc.
     */
    fun lifecycleEventTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<LifecycleEventEvent>> {
        return connectionRemote.captureEvents("Page.lifecycleEvent", LifecycleEventEvent::class.java)
    }

    /**
     * Returns observable capturing all Page.loadEventFired events.
     */
    fun loadEventFired(): io.reactivex.Flowable<LoadEventFiredEvent> {
        return loadEventFiredTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all Page.loadEventFired events.
     */
    fun loadEventFiredTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<LoadEventFiredEvent>> {
        return connectionRemote.captureEvents("Page.loadEventFired", LoadEventFiredEvent::class.java)
    }

    /**
     *  Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
     */
    fun navigatedWithinDocument(): io.reactivex.Flowable<NavigatedWithinDocumentEvent> {
        return navigatedWithinDocumentTimed().map {
            it.value()
        }
    }

    /**
     * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
     */
    fun navigatedWithinDocumentTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<NavigatedWithinDocumentEvent>> {
        return connectionRemote.captureEvents("Page.navigatedWithinDocument", NavigatedWithinDocumentEvent::class.java)
    }

    /**
     *  Compressed image data requested by the `startScreencast`.
     */
    fun screencastFrame(): io.reactivex.Flowable<ScreencastFrameEvent> {
        return screencastFrameTimed().map {
            it.value()
        }
    }

    /**
     * Compressed image data requested by the `startScreencast`.
     */
    fun screencastFrameTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<ScreencastFrameEvent>> {
        return connectionRemote.captureEvents("Page.screencastFrame", ScreencastFrameEvent::class.java)
    }

    /**
     *  Fired when the page with currently enabled screencast was shown or hidden `.
     */
    fun screencastVisibilityChanged(): io.reactivex.Flowable<ScreencastVisibilityChangedEvent> {
        return screencastVisibilityChangedTimed().map {
            it.value()
        }
    }

    /**
     * Fired when the page with currently enabled screencast was shown or hidden `.
     */
    fun screencastVisibilityChangedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<ScreencastVisibilityChangedEvent>> {
        return connectionRemote.captureEvents("Page.screencastVisibilityChanged", ScreencastVisibilityChangedEvent::class.java)
    }

    /**
     *  Fired when a new window is going to be opened, via window.open(), link click, form submission,
etc.
     */
    fun windowOpen(): io.reactivex.Flowable<WindowOpenEvent> {
        return windowOpenTimed().map {
            it.value()
        }
    }

    /**
     * Fired when a new window is going to be opened, via window.open(), link click, form submission,
etc.
     */
    fun windowOpenTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<WindowOpenEvent>> {
        return connectionRemote.captureEvents("Page.windowOpen", WindowOpenEvent::class.java)
    }

    /**
     *  Issued for every compilation cache generated. Is only available
if Page.setGenerateCompilationCache is enabled.
     */
    fun compilationCacheProduced(): io.reactivex.Flowable<CompilationCacheProducedEvent> {
        return compilationCacheProducedTimed().map {
            it.value()
        }
    }

    /**
     * Issued for every compilation cache generated. Is only available
if Page.setGenerateCompilationCache is enabled.
     */
    fun compilationCacheProducedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<CompilationCacheProducedEvent>> {
        return connectionRemote.captureEvents("Page.compilationCacheProduced", CompilationCacheProducedEvent::class.java)
    }

    /**
     * Returns flowable capturing all Page domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "Page"
        }
    }
}
/**
 * Represents request frame that can be used with Page.addScriptToEvaluateOnLoad method call.
 *
 * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
 */
data class AddScriptToEvaluateOnLoadRequest(
    /**
     *
     */
    val scriptSource: String

)

/**
 * Represents response frame for Page.addScriptToEvaluateOnLoad method call.
 *
 * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
 */
data class AddScriptToEvaluateOnLoadResponse(
    /**  
     * Identifier of the added script.  
     */  
    val identifier: ScriptIdentifier

)

/**
 * Represents request frame that can be used with Page.addScriptToEvaluateOnNewDocument method call.
 *
 * Evaluates given script in every frame upon creation (before loading frame's scripts).
 */
data class AddScriptToEvaluateOnNewDocumentRequest(
    /**
     *
     */
    val source: String,

    /**
     * If specified, creates an isolated world with the given name and evaluates given script in it.
This world name will be used as the ExecutionContextDescription::name when the corresponding
event is emitted.
     */
    @pl.wendigo.chrome.Experimental val worldName: String? = null

)

/**
 * Represents response frame for Page.addScriptToEvaluateOnNewDocument method call.
 *
 * Evaluates given script in every frame upon creation (before loading frame's scripts).
 */
data class AddScriptToEvaluateOnNewDocumentResponse(
    /**  
     * Identifier of the added script.  
     */  
    val identifier: ScriptIdentifier

)

/**
 * Represents request frame that can be used with Page.captureScreenshot method call.
 *
 * Capture page screenshot.
 */
data class CaptureScreenshotRequest(
    /**
     * Image compression format (defaults to png).
     */
    val format: String? = null,

    /**
     * Compression quality from range [0..100] (jpeg only).
     */
    val quality: Int? = null,

    /**
     * Capture the screenshot of a given region only.
     */
    val clip: Viewport? = null,

    /**
     * Capture the screenshot from the surface, rather than the view. Defaults to true.
     */
    @pl.wendigo.chrome.Experimental val fromSurface: Boolean? = null

)

/**
 * Represents response frame for Page.captureScreenshot method call.
 *
 * Capture page screenshot.
 */
data class CaptureScreenshotResponse(
    /**  
     * Base64-encoded image data.  
     */  
    val data: String

)

/**
 * Represents request frame that can be used with Page.captureSnapshot method call.
 *
 * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
iframes, shadow DOM, external resources, and element-inline styles.
 */
data class CaptureSnapshotRequest(
    /**
     * Format (defaults to mhtml).
     */
    val format: String? = null

)

/**
 * Represents response frame for Page.captureSnapshot method call.
 *
 * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
iframes, shadow DOM, external resources, and element-inline styles.
 */
data class CaptureSnapshotResponse(
    /**  
     * Serialized page data.  
     */  
    val data: String

)

/**
 * Represents request frame that can be used with Page.createIsolatedWorld method call.
 *
 * Creates an isolated world for the given frame.
 */
data class CreateIsolatedWorldRequest(
    /**
     * Id of the frame in which the isolated world should be created.
     */
    val frameId: FrameId,

    /**
     * An optional name which is reported in the Execution Context.
     */
    val worldName: String? = null,

    /**
     * Whether or not universal access should be granted to the isolated world. This is a powerful
option, use with caution.
     */
    val grantUniveralAccess: Boolean? = null

)

/**
 * Represents response frame for Page.createIsolatedWorld method call.
 *
 * Creates an isolated world for the given frame.
 */
data class CreateIsolatedWorldResponse(
    /**  
     * Execution context of the isolated world.  
     */  
    val executionContextId: pl.wendigo.chrome.domain.runtime.ExecutionContextId

)

/**
 * Represents request frame that can be used with Page.deleteCookie method call.
 *
 * Deletes browser cookie with given name, domain and path.
 */
data class DeleteCookieRequest(
    /**
     * Name of the cookie to remove.
     */
    val cookieName: String,

    /**
     * URL to match cooke domain and path.
     */
    val url: String

)

/**
 * Represents response frame for Page.getAppManifest method call.
 *
 *
 */
data class GetAppManifestResponse(
    /**  
     * Manifest location.  
     */  
    val url: String,

    /**  
     *  
     */  
    val errors: List<AppManifestError>,

    /**  
     * Manifest content.  
     */  
    val data: String? = null

)

/**
 * Represents response frame for Page.getInstallabilityErrors method call.
 *
 *
 */
data class GetInstallabilityErrorsResponse(
    /**  
     *  
     */  
    val errors: List<String>

)

/**
 * Represents response frame for Page.getCookies method call.
 *
 * Returns all browser cookies. Depending on the backend support, will return detailed cookie
information in the `cookies` field.
 */
data class GetCookiesResponse(
    /**  
     * Array of cookie objects.  
     */  
    val cookies: List<pl.wendigo.chrome.domain.network.Cookie>

)

/**
 * Represents response frame for Page.getFrameTree method call.
 *
 * Returns present frame tree structure.
 */
data class GetFrameTreeResponse(
    /**  
     * Present frame tree structure.  
     */  
    val frameTree: FrameTree

)

/**
 * Represents response frame for Page.getLayoutMetrics method call.
 *
 * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
 */
data class GetLayoutMetricsResponse(
    /**  
     * Metrics relating to the layout viewport.  
     */  
    val layoutViewport: LayoutViewport,

    /**  
     * Metrics relating to the visual viewport.  
     */  
    val visualViewport: VisualViewport,

    /**  
     * Size of scrollable area.  
     */  
    val contentSize: pl.wendigo.chrome.domain.dom.Rect

)

/**
 * Represents response frame for Page.getNavigationHistory method call.
 *
 * Returns navigation history for the current page.
 */
data class GetNavigationHistoryResponse(
    /**  
     * Index of the current navigation history entry.  
     */  
    val currentIndex: Int,

    /**  
     * Array of navigation history entries.  
     */  
    val entries: List<NavigationEntry>

)

/**
 * Represents request frame that can be used with Page.getResourceContent method call.
 *
 * Returns content of the given resource.
 */
data class GetResourceContentRequest(
    /**
     * Frame id to get resource for.
     */
    val frameId: FrameId,

    /**
     * URL of the resource to get content for.
     */
    val url: String

)

/**
 * Represents response frame for Page.getResourceContent method call.
 *
 * Returns content of the given resource.
 */
data class GetResourceContentResponse(
    /**  
     * Resource content.  
     */  
    val content: String,

    /**  
     * True, if content was served as base64.  
     */  
    val base64Encoded: Boolean

)

/**
 * Represents response frame for Page.getResourceTree method call.
 *
 * Returns present frame / resource tree structure.
 */
data class GetResourceTreeResponse(
    /**  
     * Present frame / resource tree structure.  
     */  
    val frameTree: FrameResourceTree

)

/**
 * Represents request frame that can be used with Page.handleJavaScriptDialog method call.
 *
 * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
 */
data class HandleJavaScriptDialogRequest(
    /**
     * Whether to accept or dismiss the dialog.
     */
    val accept: Boolean,

    /**
     * The text to enter into the dialog prompt before accepting. Used only if this is a prompt
dialog.
     */
    val promptText: String? = null

)

/**
 * Represents request frame that can be used with Page.navigate method call.
 *
 * Navigates current page to the given URL.
 */
data class NavigateRequest(
    /**
     * URL to navigate the page to.
     */
    val url: String,

    /**
     * Referrer URL.
     */
    val referrer: String? = null,

    /**
     * Intended transition type.
     */
    val transitionType: TransitionType? = null,

    /**
     * Frame id to navigate, if not specified navigates the top frame.
     */
    val frameId: FrameId? = null

)

/**
 * Represents response frame for Page.navigate method call.
 *
 * Navigates current page to the given URL.
 */
data class NavigateResponse(
    /**  
     * Frame id that has navigated (or failed to navigate)  
     */  
    val frameId: FrameId,

    /**  
     * Loader identifier.  
     */  
    val loaderId: pl.wendigo.chrome.domain.network.LoaderId? = null,

    /**  
     * User friendly error message, present if and only if navigation has failed.  
     */  
    val errorText: String? = null

)

/**
 * Represents request frame that can be used with Page.navigateToHistoryEntry method call.
 *
 * Navigates current page to the given history entry.
 */
data class NavigateToHistoryEntryRequest(
    /**
     * Unique id of the entry to navigate to.
     */
    val entryId: Int

)

/**
 * Represents request frame that can be used with Page.printToPDF method call.
 *
 * Print page as PDF.
 */
data class PrintToPDFRequest(
    /**
     * Paper orientation. Defaults to false.
     */
    val landscape: Boolean? = null,

    /**
     * Display header and footer. Defaults to false.
     */
    val displayHeaderFooter: Boolean? = null,

    /**
     * Print background graphics. Defaults to false.
     */
    val printBackground: Boolean? = null,

    /**
     * Scale of the webpage rendering. Defaults to 1.
     */
    val scale: Double? = null,

    /**
     * Paper width in inches. Defaults to 8.5 inches.
     */
    val paperWidth: Double? = null,

    /**
     * Paper height in inches. Defaults to 11 inches.
     */
    val paperHeight: Double? = null,

    /**
     * Top margin in inches. Defaults to 1cm (~0.4 inches).
     */
    val marginTop: Double? = null,

    /**
     * Bottom margin in inches. Defaults to 1cm (~0.4 inches).
     */
    val marginBottom: Double? = null,

    /**
     * Left margin in inches. Defaults to 1cm (~0.4 inches).
     */
    val marginLeft: Double? = null,

    /**
     * Right margin in inches. Defaults to 1cm (~0.4 inches).
     */
    val marginRight: Double? = null,

    /**
     * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty string, which means
print all pages.
     */
    val pageRanges: String? = null,

    /**
     * Whether to silently ignore invalid but successfully parsed page ranges, such as '3-2'.
Defaults to false.
     */
    val ignoreInvalidPageRanges: Boolean? = null,

    /**
     * HTML template for the print header. Should be valid HTML markup with following
classes used to inject printing values into them:
- `date`: formatted print date
- `title`: document title
- `url`: document location
- `pageNumber`: current page number
- `totalPages`: total pages in the document

For example, `<span class=title></span>` would generate span containing the title.
     */
    val headerTemplate: String? = null,

    /**
     * HTML template for the print footer. Should use the same format as the `headerTemplate`.
     */
    val footerTemplate: String? = null,

    /**
     * Whether or not to prefer page size as defined by css. Defaults to false,
in which case the content will be scaled to fit the paper size.
     */
    val preferCSSPageSize: Boolean? = null,

    /**
     * return as stream
     */
    @pl.wendigo.chrome.Experimental val transferMode: String? = null

)

/**
 * Represents response frame for Page.printToPDF method call.
 *
 * Print page as PDF.
 */
data class PrintToPDFResponse(
    /**  
     * Base64-encoded pdf data. Empty if |returnAsStream| is specified.  
     */  
    val data: String,

    /**  
     * A handle of the stream that holds resulting PDF data.  
     */  
    @pl.wendigo.chrome.Experimental val stream: pl.wendigo.chrome.domain.io.StreamHandle? = null

)

/**
 * Represents request frame that can be used with Page.reload method call.
 *
 * Reloads given page optionally ignoring the cache.
 */
data class ReloadRequest(
    /**
     * If true, browser cache is ignored (as if the user pressed Shift+refresh).
     */
    val ignoreCache: Boolean? = null,

    /**
     * If set, the script will be injected into all frames of the inspected page after reload.
Argument will be ignored if reloading dataURL origin.
     */
    val scriptToEvaluateOnLoad: String? = null

)

/**
 * Represents request frame that can be used with Page.removeScriptToEvaluateOnLoad method call.
 *
 * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
 */
data class RemoveScriptToEvaluateOnLoadRequest(
    /**
     *
     */
    val identifier: ScriptIdentifier

)

/**
 * Represents request frame that can be used with Page.removeScriptToEvaluateOnNewDocument method call.
 *
 * Removes given script from the list.
 */
data class RemoveScriptToEvaluateOnNewDocumentRequest(
    /**
     *
     */
    val identifier: ScriptIdentifier

)

/**
 * Represents request frame that can be used with Page.screencastFrameAck method call.
 *
 * Acknowledges that a screencast frame has been received by the frontend.
 */
data class ScreencastFrameAckRequest(
    /**
     * Frame number.
     */
    val sessionId: Int

)

/**
 * Represents request frame that can be used with Page.searchInResource method call.
 *
 * Searches for given string in resource content.
 */
data class SearchInResourceRequest(
    /**
     * Frame id for resource to search in.
     */
    val frameId: FrameId,

    /**
     * URL of the resource to search in.
     */
    val url: String,

    /**
     * String to search for.
     */
    val query: String,

    /**
     * If true, search is case sensitive.
     */
    val caseSensitive: Boolean? = null,

    /**
     * If true, treats string parameter as regex.
     */
    val isRegex: Boolean? = null

)

/**
 * Represents response frame for Page.searchInResource method call.
 *
 * Searches for given string in resource content.
 */
data class SearchInResourceResponse(
    /**  
     * List of search matches.  
     */  
    val result: List<pl.wendigo.chrome.domain.debugger.SearchMatch>

)

/**
 * Represents request frame that can be used with Page.setAdBlockingEnabled method call.
 *
 * Enable Chrome's experimental ad filter on all sites.
 */
data class SetAdBlockingEnabledRequest(
    /**
     * Whether to block ads.
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with Page.setBypassCSP method call.
 *
 * Enable page Content Security Policy by-passing.
 */
data class SetBypassCSPRequest(
    /**
     * Whether to bypass page CSP.
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with Page.setDeviceMetricsOverride method call.
 *
 * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
query results).
 */
data class SetDeviceMetricsOverrideRequest(
    /**
     * Overriding width value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val width: Int,

    /**
     * Overriding height value in pixels (minimum 0, maximum 10000000). 0 disables the override.
     */
    val height: Int,

    /**
     * Overriding device scale factor value. 0 disables the override.
     */
    val deviceScaleFactor: Double,

    /**
     * Whether to emulate mobile device. This includes viewport meta tag, overlay scrollbars, text
autosizing and more.
     */
    val mobile: Boolean,

    /**
     * Scale to apply to resulting view image.
     */
    val scale: Double? = null,

    /**
     * Overriding screen width value in pixels (minimum 0, maximum 10000000).
     */
    val screenWidth: Int? = null,

    /**
     * Overriding screen height value in pixels (minimum 0, maximum 10000000).
     */
    val screenHeight: Int? = null,

    /**
     * Overriding view X position on screen in pixels (minimum 0, maximum 10000000).
     */
    val positionX: Int? = null,

    /**
     * Overriding view Y position on screen in pixels (minimum 0, maximum 10000000).
     */
    val positionY: Int? = null,

    /**
     * Do not set visible view size, rely upon explicit setVisibleSize call.
     */
    val dontSetVisibleSize: Boolean? = null,

    /**
     * Screen orientation override.
     */
    val screenOrientation: pl.wendigo.chrome.domain.emulation.ScreenOrientation? = null,

    /**
     * The viewport dimensions and scale. If not set, the override is cleared.
     */
    val viewport: Viewport? = null

)

/**
 * Represents request frame that can be used with Page.setDeviceOrientationOverride method call.
 *
 * Overrides the Device Orientation.
 */
data class SetDeviceOrientationOverrideRequest(
    /**
     * Mock alpha
     */
    val alpha: Double,

    /**
     * Mock beta
     */
    val beta: Double,

    /**
     * Mock gamma
     */
    val gamma: Double

)

/**
 * Represents request frame that can be used with Page.setFontFamilies method call.
 *
 * Set generic font families.
 */
data class SetFontFamiliesRequest(
    /**
     * Specifies font families to set. If a font family is not specified, it won't be changed.
     */
    val fontFamilies: FontFamilies

)

/**
 * Represents request frame that can be used with Page.setFontSizes method call.
 *
 * Set default font sizes.
 */
data class SetFontSizesRequest(
    /**
     * Specifies font sizes to set. If a font size is not specified, it won't be changed.
     */
    val fontSizes: FontSizes

)

/**
 * Represents request frame that can be used with Page.setDocumentContent method call.
 *
 * Sets given markup as the document's HTML.
 */
data class SetDocumentContentRequest(
    /**
     * Frame id to set HTML for.
     */
    val frameId: FrameId,

    /**
     * HTML content to set.
     */
    val html: String

)

/**
 * Represents request frame that can be used with Page.setDownloadBehavior method call.
 *
 * Set the behavior when downloading a file.
 */
data class SetDownloadBehaviorRequest(
    /**
     * Whether to allow all or deny all download requests, or use default Chrome behavior if
available (otherwise deny).
     */
    val behavior: String,

    /**
     * The default path to save downloaded files to. This is requred if behavior is set to 'allow'
     */
    val downloadPath: String? = null

)

/**
 * Represents request frame that can be used with Page.setGeolocationOverride method call.
 *
 * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
unavailable.
 */
data class SetGeolocationOverrideRequest(
    /**
     * Mock latitude
     */
    val latitude: Double? = null,

    /**
     * Mock longitude
     */
    val longitude: Double? = null,

    /**
     * Mock accuracy
     */
    val accuracy: Double? = null

)

/**
 * Represents request frame that can be used with Page.setLifecycleEventsEnabled method call.
 *
 * Controls whether page will emit lifecycle events.
 */
data class SetLifecycleEventsEnabledRequest(
    /**
     * If true, starts emitting lifecycle events.
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with Page.setTouchEmulationEnabled method call.
 *
 * Toggles mouse event-based touch event emulation.
 */
data class SetTouchEmulationEnabledRequest(
    /**
     * Whether the touch event emulation should be enabled.
     */
    val enabled: Boolean,

    /**
     * Touch/gesture events configuration. Default: current platform.
     */
    val configuration: String? = null

)

/**
 * Represents request frame that can be used with Page.startScreencast method call.
 *
 * Starts sending each frame using the `screencastFrame` event.
 */
data class StartScreencastRequest(
    /**
     * Image compression format.
     */
    val format: String? = null,

    /**
     * Compression quality from range [0..100].
     */
    val quality: Int? = null,

    /**
     * Maximum screenshot width.
     */
    val maxWidth: Int? = null,

    /**
     * Maximum screenshot height.
     */
    val maxHeight: Int? = null,

    /**
     * Send every n-th frame.
     */
    val everyNthFrame: Int? = null

)

/**
 * Represents request frame that can be used with Page.setWebLifecycleState method call.
 *
 * Tries to update the web lifecycle state of the page.
It will transition the page to the given state according to:
https://github.com/WICG/web-lifecycle/
 */
data class SetWebLifecycleStateRequest(
    /**
     * Target lifecycle state
     */
    val state: String

)

/**
 * Represents request frame that can be used with Page.setProduceCompilationCache method call.
 *
 * Forces compilation cache to be generated for every subresource script.
 */
data class SetProduceCompilationCacheRequest(
    /**
     *
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with Page.addCompilationCache method call.
 *
 * Seeds compilation cache for given url. Compilation cache does not survive
cross-process navigation.
 */
data class AddCompilationCacheRequest(
    /**
     *
     */
    val url: String,

    /**
     * Base64-encoded data
     */
    val data: String

)

/**
 * Represents request frame that can be used with Page.generateTestReport method call.
 *
 * Generates a report for testing.
 */
data class GenerateTestReportRequest(
    /**
     * Message to be displayed in the report.
     */
    val message: String,

    /**
     * Specifies the endpoint group to deliver the report to.
     */
    val group: String? = null

)

/**
 * Represents request frame that can be used with Page.setInterceptFileChooserDialog method call.
 *
 * Intercept file chooser requests and transfer control to protocol clients.
When file chooser interception is enabled, native file chooser dialog is not shown.
Instead, a protocol event `Page.fileChooserOpened` is emitted.
File chooser can be handled with `page.handleFileChooser` command.
 */
data class SetInterceptFileChooserDialogRequest(
    /**
     *
     */
    val enabled: Boolean

)

/**
 * Represents request frame that can be used with Page.handleFileChooser method call.
 *
 * Accepts or cancels an intercepted file chooser dialog.
 */
data class HandleFileChooserRequest(
    /**
     *
     */
    val action: String,

    /**
     * Array of absolute file paths to set, only respected with `accept` action.
     */
    val files: List<String>? = null

)

/**
 * Represents event frames for Page.domContentEventFired
 *
 *
 */
data class DomContentEventFiredEvent(
    /**  
     *  
     */  
    val timestamp: pl.wendigo.chrome.domain.network.MonotonicTime

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "domContentEventFired")

/**
 * Represents event frames for Page.fileChooserOpened
 *
 * Emitted only when `page.interceptFileChooser` is enabled.
 */
data class FileChooserOpenedEvent(
    /**  
     *  
     */  
    val mode: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "fileChooserOpened")

/**
 * Represents event frames for Page.frameAttached
 *
 * Fired when frame has been attached to its parent.
 */
data class FrameAttachedEvent(
    /**  
     * Id of the frame that has been attached.  
     */  
    val frameId: FrameId,

    /**  
     * Parent frame identifier.  
     */  
    val parentFrameId: FrameId,

    /**  
     * JavaScript stack trace of when frame was attached, only set if frame initiated from script.  
     */  
    val stack: pl.wendigo.chrome.domain.runtime.StackTrace? = null

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameAttached")

/**
 * Represents event frames for Page.frameClearedScheduledNavigation
 *
 * Fired when frame no longer has a scheduled navigation.
 */
data class FrameClearedScheduledNavigationEvent(
    /**  
     * Id of the frame that has cleared its scheduled navigation.  
     */  
    val frameId: FrameId

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameClearedScheduledNavigation")

/**
 * Represents event frames for Page.frameDetached
 *
 * Fired when frame has been detached from its parent.
 */
data class FrameDetachedEvent(
    /**  
     * Id of the frame that has been detached.  
     */  
    val frameId: FrameId

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameDetached")

/**
 * Represents event frames for Page.frameNavigated
 *
 * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
 */
data class FrameNavigatedEvent(
    /**  
     * Frame object.  
     */  
    val frame: Frame

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameNavigated")

/**
 * Represents event frames for Page.frameRequestedNavigation
 *
 * Fired when a renderer-initiated navigation is requested.
Navigation may still be cancelled after the event is issued.
 */
data class FrameRequestedNavigationEvent(
    /**  
     * Id of the frame that is being navigated.  
     */  
    val frameId: FrameId,

    /**  
     * The reason for the navigation.  
     */  
    val reason: ClientNavigationReason,

    /**  
     * The destination URL for the requested navigation.  
     */  
    val url: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameRequestedNavigation")

/**
 * Represents event frames for Page.frameScheduledNavigation
 *
 * Fired when frame schedules a potential navigation.
 */
data class FrameScheduledNavigationEvent(
    /**  
     * Id of the frame that has scheduled a navigation.  
     */  
    val frameId: FrameId,

    /**  
     * Delay (in seconds) until the navigation is scheduled to begin. The navigation is not  
     guaranteed to start.  
     */  
    val delay: Double,

    /**  
     * The reason for the navigation.  
     */  
    val reason: String,

    /**  
     * The destination URL for the scheduled navigation.  
     */  
    val url: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameScheduledNavigation")

/**
 * Represents event frames for Page.frameStartedLoading
 *
 * Fired when frame has started loading.
 */
data class FrameStartedLoadingEvent(
    /**  
     * Id of the frame that has started loading.  
     */  
    val frameId: FrameId

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameStartedLoading")

/**
 * Represents event frames for Page.frameStoppedLoading
 *
 * Fired when frame has stopped loading.
 */
data class FrameStoppedLoadingEvent(
    /**  
     * Id of the frame that has stopped loading.  
     */  
    val frameId: FrameId

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "frameStoppedLoading")

/**
 * Represents event frames for Page.downloadWillBegin
 *
 * Fired when page is about to start a download.
 */
data class DownloadWillBeginEvent(
    /**  
     * Id of the frame that caused download to begin.  
     */  
    val frameId: FrameId,

    /**  
     * URL of the resource being downloaded.  
     */  
    val url: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "downloadWillBegin")

/**
 * Represents event frames for Page.javascriptDialogClosed
 *
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
closed.
 */
data class JavascriptDialogClosedEvent(
    /**  
     * Whether dialog was confirmed.  
     */  
    val result: Boolean,

    /**  
     * User input in case of prompt.  
     */  
    val userInput: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "javascriptDialogClosed")

/**
 * Represents event frames for Page.javascriptDialogOpening
 *
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
open.
 */
data class JavascriptDialogOpeningEvent(
    /**  
     * Frame url.  
     */  
    val url: String,

    /**  
     * Message that will be displayed by the dialog.  
     */  
    val message: String,

    /**  
     * Dialog type.  
     */  
    val type: DialogType,

    /**  
     * True iff browser is capable showing or acting on the given dialog. When browser has no  
     dialog handler for given target, calling alert while Page domain is engaged will stall  
     the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.  
     */  
    val hasBrowserHandler: Boolean,

    /**  
     * Default dialog prompt.  
     */  
    val defaultPrompt: String? = null

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "javascriptDialogOpening")

/**
 * Represents event frames for Page.lifecycleEvent
 *
 * Fired for top level page lifecycle events such as navigation, load, paint, etc.
 */
data class LifecycleEventEvent(
    /**  
     * Id of the frame.  
     */  
    val frameId: FrameId,

    /**  
     * Loader identifier. Empty string if the request is fetched from worker.  
     */  
    val loaderId: pl.wendigo.chrome.domain.network.LoaderId,

    /**  
     *  
     */  
    val name: String,

    /**  
     *  
     */  
    val timestamp: pl.wendigo.chrome.domain.network.MonotonicTime

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "lifecycleEvent")

/**
 * Represents event frames for Page.loadEventFired
 *
 *
 */
data class LoadEventFiredEvent(
    /**  
     *  
     */  
    val timestamp: pl.wendigo.chrome.domain.network.MonotonicTime

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "loadEventFired")

/**
 * Represents event frames for Page.navigatedWithinDocument
 *
 * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
 */
data class NavigatedWithinDocumentEvent(
    /**  
     * Id of the frame.  
     */  
    val frameId: FrameId,

    /**  
     * Frame's new url.  
     */  
    val url: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "navigatedWithinDocument")

/**
 * Represents event frames for Page.screencastFrame
 *
 * Compressed image data requested by the `startScreencast`.
 */
data class ScreencastFrameEvent(
    /**  
     * Base64-encoded compressed image.  
     */  
    val data: String,

    /**  
     * Screencast frame metadata.  
     */  
    val metadata: ScreencastFrameMetadata,

    /**  
     * Frame number.  
     */  
    val sessionId: Int

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "screencastFrame")

/**
 * Represents event frames for Page.screencastVisibilityChanged
 *
 * Fired when the page with currently enabled screencast was shown or hidden `.
 */
data class ScreencastVisibilityChangedEvent(
    /**  
     * True if the page is visible.  
     */  
    val visible: Boolean

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "screencastVisibilityChanged")

/**
 * Represents event frames for Page.windowOpen
 *
 * Fired when a new window is going to be opened, via window.open(), link click, form submission,
etc.
 */
data class WindowOpenEvent(
    /**  
     * The URL for the new window.  
     */  
    val url: String,

    /**  
     * Window name.  
     */  
    val windowName: String,

    /**  
     * An array of enabled window features.  
     */  
    val windowFeatures: List<String>,

    /**  
     * Whether or not it was triggered by user gesture.  
     */  
    val userGesture: Boolean

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "windowOpen")

/**
 * Represents event frames for Page.compilationCacheProduced
 *
 * Issued for every compilation cache generated. Is only available
if Page.setGenerateCompilationCache is enabled.
 */
data class CompilationCacheProducedEvent(
    /**  
     *  
     */  
    val url: String,

    /**  
     * Base64-encoded data  
     */  
    val data: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "Page", name = "compilationCacheProduced")
