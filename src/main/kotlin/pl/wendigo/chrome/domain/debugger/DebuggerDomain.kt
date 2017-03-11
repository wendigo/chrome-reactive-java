package pl.wendigo.chrome.domain.debugger

/**
 * Debugger domain exposes JavaScript debugging capabilities. It allows setting and removing breakpoints, stepping through execution, exploring stack traces, etc.
 *
 * This class was autogenerated by main.go. Do not edit :)
 */
class DebuggerDomain internal constructor(private val connection : pl.wendigo.chrome.DebuggerConnection) {

	/**
	 * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
	 */
	  fun enable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.enable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Disables debugger for given page.
	 */
	  fun disable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.disable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Activates / deactivates all breakpoints on the page.
	 */
	  fun setBreakpointsActive(input : SetBreakpointsActiveRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setBreakpointsActive", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
	 */
	  fun setSkipAllPauses(input : SetSkipAllPausesRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setSkipAllPauses", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
	 */
	  fun setBreakpointByUrl(input : SetBreakpointByUrlRequest) : io.reactivex.Flowable<SetBreakpointByUrlResponse> {
        return connection.runAndCaptureResponse("Debugger.setBreakpointByUrl", input, SetBreakpointByUrlResponse::class.java)
	}

	/**
	 * Sets JavaScript breakpoint at a given location.
	 */
	  fun setBreakpoint(input : SetBreakpointRequest) : io.reactivex.Flowable<SetBreakpointResponse> {
        return connection.runAndCaptureResponse("Debugger.setBreakpoint", input, SetBreakpointResponse::class.java)
	}

	/**
	 * Removes JavaScript breakpoint.
	 */
	  fun removeBreakpoint(input : RemoveBreakpointRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.removeBreakpoint", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun getPossibleBreakpoints(input : GetPossibleBreakpointsRequest) : io.reactivex.Flowable<GetPossibleBreakpointsResponse> {
        return connection.runAndCaptureResponse("Debugger.getPossibleBreakpoints", input, GetPossibleBreakpointsResponse::class.java)
	}

	/**
	 * Continues execution until specific location is reached.
	 */
	  fun continueToLocation(input : ContinueToLocationRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.continueToLocation", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Steps over the statement.
	 */
	  fun stepOver() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.stepOver", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Steps into the function call.
	 */
	  fun stepInto() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.stepInto", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Steps out of the function call.
	 */
	  fun stepOut() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.stepOut", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Stops on the next JavaScript statement.
	 */
	  fun pause() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.pause", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Resumes JavaScript execution.
	 */
	  fun resume() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.resume", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Searches for given string in script content.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun searchInContent(input : SearchInContentRequest) : io.reactivex.Flowable<SearchInContentResponse> {
        return connection.runAndCaptureResponse("Debugger.searchInContent", input, SearchInContentResponse::class.java)
	}

	/**
	 * Edits JavaScript source live.
	 */
	  fun setScriptSource(input : SetScriptSourceRequest) : io.reactivex.Flowable<SetScriptSourceResponse> {
        return connection.runAndCaptureResponse("Debugger.setScriptSource", input, SetScriptSourceResponse::class.java)
	}

	/**
	 * Restarts particular call frame from the beginning.
	 */
	  fun restartFrame(input : RestartFrameRequest) : io.reactivex.Flowable<RestartFrameResponse> {
        return connection.runAndCaptureResponse("Debugger.restartFrame", input, RestartFrameResponse::class.java)
	}

	/**
	 * Returns source for the script with given id.
	 */
	  fun getScriptSource(input : GetScriptSourceRequest) : io.reactivex.Flowable<GetScriptSourceResponse> {
        return connection.runAndCaptureResponse("Debugger.getScriptSource", input, GetScriptSourceResponse::class.java)
	}

	/**
	 * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
	 */
	  fun setPauseOnExceptions(input : SetPauseOnExceptionsRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setPauseOnExceptions", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Evaluates expression on a given call frame.
	 */
	  fun evaluateOnCallFrame(input : EvaluateOnCallFrameRequest) : io.reactivex.Flowable<EvaluateOnCallFrameResponse> {
        return connection.runAndCaptureResponse("Debugger.evaluateOnCallFrame", input, EvaluateOnCallFrameResponse::class.java)
	}

	/**
	 * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
	 */
	  fun setVariableValue(input : SetVariableValueRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setVariableValue", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Enables or disables async call stacks tracking.
	 */
	  fun setAsyncCallStackDepth(input : SetAsyncCallStackDepthRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setAsyncCallStackDepth", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setBlackboxPatterns(input : SetBlackboxPatternsRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setBlackboxPatterns", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
	 */
	@pl.wendigo.chrome.ProtocolExperimental
    fun setBlackboxedRanges(input : SetBlackboxedRangesRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("Debugger.setBlackboxedRanges", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

  
  /**
   * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
   */
   fun onScriptParsed() : io.reactivex.Flowable<ScriptParsedEvent> {
      return connection.captureEvents("Debugger.scriptParsed", ScriptParsedEvent::class.java)
   }

  /**
   * Fired when virtual machine fails to parse the script.
   */
   fun onScriptFailedToParse() : io.reactivex.Flowable<ScriptFailedToParseEvent> {
      return connection.captureEvents("Debugger.scriptFailedToParse", ScriptFailedToParseEvent::class.java)
   }

  /**
   * Fired when breakpoint is resolved to an actual script and location.
   */
   fun onBreakpointResolved() : io.reactivex.Flowable<BreakpointResolvedEvent> {
      return connection.captureEvents("Debugger.breakpointResolved", BreakpointResolvedEvent::class.java)
   }

  /**
   * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
   */
   fun onPaused() : io.reactivex.Flowable<PausedEvent> {
      return connection.captureEvents("Debugger.paused", PausedEvent::class.java)
   }

  /**
   * Fired when the virtual machine resumed execution.
   */
   fun onResumed() : io.reactivex.Flowable<pl.wendigo.chrome.DebuggerEvent> {
      return connection.captureEvents("Debugger.resumed", pl.wendigo.chrome.DebuggerEvent::class.java)
   }
}





/**
 * Represents requestFrame parameters that can be used with Debugger.setBreakpointsActive method call.
 *
 * Activates / deactivates all breakpoints on the page.
 */
data class SetBreakpointsActiveRequest (
    /**
     * New value for breakpoints active state.
     */
    val active : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Debugger.setSkipAllPauses method call.
 *
 * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
 */
data class SetSkipAllPausesRequest (
    /**
     * New value for skip pauses state.
     */
    val skip : Boolean

)


/**
 * Represents requestFrame parameters that can be used with Debugger.setBreakpointByUrl method call.
 *
 * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
data class SetBreakpointByUrlRequest (
    /**
     * Line number to set breakpoint at.
     */
    val lineNumber : Int,

    /**
     * URL of the resources to set breakpoint on.
     */
    val url : String? = null,

    /**
     * Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
     */
    val urlRegex : String? = null,

    /**
     * Offset in the line to set breakpoint at.
     */
    val columnNumber : Int? = null,

    /**
     * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
     */
    val condition : String? = null

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
data class SetBreakpointByUrlResponse(
  /**
   * Id of the created breakpoint for further reference.
   */
  val breakpointId : BreakpointId,

  /**
   * List of the locations this breakpoint resolved into upon addition.
   */
  val locations : Array<Location>

)

/**
 * Represents requestFrame parameters that can be used with Debugger.setBreakpoint method call.
 *
 * Sets JavaScript breakpoint at a given location.
 */
data class SetBreakpointRequest (
    /**
     * Location to set breakpoint in.
     */
    val location : Location,

    /**
     * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
     */
    val condition : String? = null

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Sets JavaScript breakpoint at a given location.
 */
data class SetBreakpointResponse(
  /**
   * Id of the created breakpoint for further reference.
   */
  val breakpointId : BreakpointId,

  /**
   * Location this breakpoint resolved into.
   */
  val actualLocation : Location

)

/**
 * Represents requestFrame parameters that can be used with Debugger.removeBreakpoint method call.
 *
 * Removes JavaScript breakpoint.
 */
data class RemoveBreakpointRequest (
    /**
     * 
     */
    val breakpointId : BreakpointId

)


/**
 * Represents requestFrame parameters that can be used with Debugger.getPossibleBreakpoints method call.
 *
 * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
 */
data class GetPossibleBreakpointsRequest (
    /**
     * Start of range to search possible breakpoint locations in.
     */
    val start : Location,

    /**
     * End of range to search possible breakpoint locations in (excluding). When not specifed, end of scripts is used as end of range.
     */
    val end : Location? = null

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
 */
data class GetPossibleBreakpointsResponse(
  /**
   * List of the possible breakpoint locations.
   */
  val locations : Array<Location>

)

/**
 * Represents requestFrame parameters that can be used with Debugger.continueToLocation method call.
 *
 * Continues execution until specific location is reached.
 */
data class ContinueToLocationRequest (
    /**
     * Location to continue to.
     */
    val location : Location

)












/**
 * Represents requestFrame parameters that can be used with Debugger.searchInContent method call.
 *
 * Searches for given string in script content.
 */
data class SearchInContentRequest (
    /**
     * Id of the script to search in.
     */
    val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId,

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
 * Represents responseFrame from Debugger. method call.
 *
 * Searches for given string in script content.
 */
data class SearchInContentResponse(
  /**
   * List of search matches.
   */
  val result : Array<SearchMatch>

)

/**
 * Represents requestFrame parameters that can be used with Debugger.setScriptSource method call.
 *
 * Edits JavaScript source live.
 */
data class SetScriptSourceRequest (
    /**
     * Id of the script to edit.
     */
    val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId,

    /**
     * New content of the script.
     */
    val scriptSource : String,

    /**
     *  If true the change will not actually be applied. Dry run may be used to get result description without actually modifying the code.
     */
    val dryRun : Boolean? = null

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Edits JavaScript source live.
 */
data class SetScriptSourceResponse(
  /**
   * New stack trace in case editing has happened while VM was stopped.
   */
  val callFrames : Array<CallFrame>? = null,

  /**
   * Whether current call stack  was modified after applying the changes.
   */
  val stackChanged : Boolean? = null,

  /**
   * Async stack trace, if any.
   */
  val asyncStackTrace : pl.wendigo.chrome.domain.runtime.StackTrace? = null,

  /**
   * Exception details if any.
   */
  val exceptionDetails : pl.wendigo.chrome.domain.runtime.ExceptionDetails? = null

)

/**
 * Represents requestFrame parameters that can be used with Debugger.restartFrame method call.
 *
 * Restarts particular call frame from the beginning.
 */
data class RestartFrameRequest (
    /**
     * Call frame identifier to evaluate on.
     */
    val callFrameId : CallFrameId

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Restarts particular call frame from the beginning.
 */
data class RestartFrameResponse(
  /**
   * New stack trace.
   */
  val callFrames : Array<CallFrame>,

  /**
   * Async stack trace, if any.
   */
  val asyncStackTrace : pl.wendigo.chrome.domain.runtime.StackTrace? = null

)

/**
 * Represents requestFrame parameters that can be used with Debugger.getScriptSource method call.
 *
 * Returns source for the script with given id.
 */
data class GetScriptSourceRequest (
    /**
     * Id of the script to get source for.
     */
    val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Returns source for the script with given id.
 */
data class GetScriptSourceResponse(
  /**
   * Script source.
   */
  val scriptSource : String

)

/**
 * Represents requestFrame parameters that can be used with Debugger.setPauseOnExceptions method call.
 *
 * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
 */
data class SetPauseOnExceptionsRequest (
    /**
     * Pause on exceptions mode.
     */
    val state : String

)


/**
 * Represents requestFrame parameters that can be used with Debugger.evaluateOnCallFrame method call.
 *
 * Evaluates expression on a given call frame.
 */
data class EvaluateOnCallFrameRequest (
    /**
     * Call frame identifier to evaluate on.
     */
    val callFrameId : CallFrameId,

    /**
     * Expression to evaluate.
     */
    val expression : String,

    /**
     * String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
     */
    val objectGroup : String? = null,

    /**
     * Specifies whether command line API should be available to the evaluated expression, defaults to false.
     */
    val includeCommandLineAPI : Boolean? = null,

    /**
     * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
     */
    val silent : Boolean? = null,

    /**
     * Whether the result is expected to be a JSON object that should be sent by value.
     */
    val returnByValue : Boolean? = null,

    /**
     * Whether preview should be generated for the result.
     */
    @pl.wendigo.chrome.ProtocolExperimental val generatePreview : Boolean? = null

)

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Evaluates expression on a given call frame.
 */
data class EvaluateOnCallFrameResponse(
  /**
   * Object wrapper for the evaluation result.
   */
  val result : pl.wendigo.chrome.domain.runtime.RemoteObject,

  /**
   * Exception details.
   */
  val exceptionDetails : pl.wendigo.chrome.domain.runtime.ExceptionDetails? = null

)

/**
 * Represents requestFrame parameters that can be used with Debugger.setVariableValue method call.
 *
 * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
 */
data class SetVariableValueRequest (
    /**
     * 0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch' scope types are allowed. Other scopes could be manipulated manually.
     */
    val scopeNumber : Int,

    /**
     * Variable name.
     */
    val variableName : String,

    /**
     * New variable value.
     */
    val newValue : pl.wendigo.chrome.domain.runtime.CallArgument,

    /**
     * Id of callframe that holds variable.
     */
    val callFrameId : CallFrameId

)


/**
 * Represents requestFrame parameters that can be used with Debugger.setAsyncCallStackDepth method call.
 *
 * Enables or disables async call stacks tracking.
 */
data class SetAsyncCallStackDepthRequest (
    /**
     * Maximum depth of async call stacks. Setting to <code>0</code> will effectively disable collecting async call stacks (default).
     */
    val maxDepth : Int

)


/**
 * Represents requestFrame parameters that can be used with Debugger.setBlackboxPatterns method call.
 *
 * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
 */
data class SetBlackboxPatternsRequest (
    /**
     * Array of regexps that will be used to check script url for blackbox state.
     */
    val patterns : Array<String>

)


/**
 * Represents requestFrame parameters that can be used with Debugger.setBlackboxedRanges method call.
 *
 * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
 */
data class SetBlackboxedRangesRequest (
    /**
     * Id of the script.
     */
    val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId,

    /**
     * 
     */
    val positions : Array<ScriptPosition>

)



/**
 * Represents responseFrame from Debugger. method call.
 *
 * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
 */
data class ScriptParsedEvent(
  /**
   * Identifier of the script parsed.
   */
  val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId,

  /**
   * URL or name of the script parsed (if any).
   */
  val url : String,

  /**
   * Line offset of the script within the resource with given URL (for script tags).
   */
  val startLine : Int,

  /**
   * Column offset of the script within the resource with given URL.
   */
  val startColumn : Int,

  /**
   * Last line of the script.
   */
  val endLine : Int,

  /**
   * Length of the last line of the script.
   */
  val endColumn : Int,

  /**
   * Specifies script creation context.
   */
  val executionContextId : pl.wendigo.chrome.domain.runtime.ExecutionContextId,

  /**
   * Content hash of the script.
   */
  val hash : String,

  /**
   * Embedder-specific auxiliary data.
   */
  val executionContextAuxData : String? = null,

  /**
   * True, if this script is generated as a result of the live edit operation.
   */
  @pl.wendigo.chrome.ProtocolExperimental val isLiveEdit : Boolean? = null,

  /**
   * URL of source map associated with script (if any).
   */
  val sourceMapURL : String? = null,

  /**
   * True, if this script has sourceURL.
   */
  @pl.wendigo.chrome.ProtocolExperimental val hasSourceURL : Boolean? = null

) : pl.wendigo.chrome.DebuggerEvent(domain = "Debugger", name = "scriptParsed")

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Fired when virtual machine fails to parse the script.
 */
data class ScriptFailedToParseEvent(
  /**
   * Identifier of the script parsed.
   */
  val scriptId : pl.wendigo.chrome.domain.runtime.ScriptId,

  /**
   * URL or name of the script parsed (if any).
   */
  val url : String,

  /**
   * Line offset of the script within the resource with given URL (for script tags).
   */
  val startLine : Int,

  /**
   * Column offset of the script within the resource with given URL.
   */
  val startColumn : Int,

  /**
   * Last line of the script.
   */
  val endLine : Int,

  /**
   * Length of the last line of the script.
   */
  val endColumn : Int,

  /**
   * Specifies script creation context.
   */
  val executionContextId : pl.wendigo.chrome.domain.runtime.ExecutionContextId,

  /**
   * Content hash of the script.
   */
  val hash : String,

  /**
   * Embedder-specific auxiliary data.
   */
  val executionContextAuxData : String? = null,

  /**
   * URL of source map associated with script (if any).
   */
  val sourceMapURL : String? = null,

  /**
   * True, if this script has sourceURL.
   */
  @pl.wendigo.chrome.ProtocolExperimental val hasSourceURL : Boolean? = null

) : pl.wendigo.chrome.DebuggerEvent(domain = "Debugger", name = "scriptFailedToParse")

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Fired when breakpoint is resolved to an actual script and location.
 */
data class BreakpointResolvedEvent(
  /**
   * Breakpoint unique identifier.
   */
  val breakpointId : BreakpointId,

  /**
   * Actual breakpoint location.
   */
  val location : Location

) : pl.wendigo.chrome.DebuggerEvent(domain = "Debugger", name = "breakpointResolved")

/**
 * Represents responseFrame from Debugger. method call.
 *
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
 */
data class PausedEvent(
  /**
   * Call stack the virtual machine stopped on.
   */
  val callFrames : Array<CallFrame>,

  /**
   * Pause reason.
   */
  val reason : String,

  /**
   * Object containing break-specific auxiliary properties.
   */
  val data : String? = null,

  /**
   * Hit breakpoints IDs
   */
  val hitBreakpoints : Array<String>? = null,

  /**
   * Async stack trace, if any.
   */
  val asyncStackTrace : pl.wendigo.chrome.domain.runtime.StackTrace? = null

) : pl.wendigo.chrome.DebuggerEvent(domain = "Debugger", name = "paused")


