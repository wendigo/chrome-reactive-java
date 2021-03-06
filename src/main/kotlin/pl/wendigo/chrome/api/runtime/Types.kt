package pl.wendigo.chrome.api.runtime

/**
 * Unique script identifier.
 *
 * @link [Runtime#ScriptId](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-ScriptId) type documentation.
 */

typealias ScriptId = String

/**
 * Unique object identifier.
 *
 * @link [Runtime#RemoteObjectId](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-RemoteObjectId) type documentation.
 */

typealias RemoteObjectId = String

/**
 * Primitive value which cannot be JSON-stringified. Includes values `-0`, `NaN`, `Infinity`,
`-Infinity`, and bigint literals.
 *
 * @link [Runtime#UnserializableValue](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-UnserializableValue) type documentation.
 */

typealias UnserializableValue = String

/**
 * Mirror object referencing original JavaScript object.
 *
 * @link [Runtime#RemoteObject](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-RemoteObject) type documentation.
 */

@kotlinx.serialization.Serializable
data class RemoteObject(
    /**  
     * Object type.  
     */  
    val type: String,

    /**  
     * Object subtype hint. Specified for `object` type values only.  
     NOTE: If you change anything here, make sure to also update  
     `subtype` in `ObjectPreview` and `PropertyPreview` below.  
     */  
    val subtype: String? = null,

    /**  
     * Object class (constructor) name. Specified for `object` type values only.  
     */  
    val className: String? = null,

    /**  
     * Remote object value in case of primitive values or JSON values (if it was requested).  
     */  
    val value: kotlinx.serialization.json.JsonElement? = null,

    /**  
     * Primitive value which can not be JSON-stringified does not have `value`, but gets this  
     property.  
     */  
    val unserializableValue: UnserializableValue? = null,

    /**  
     * String representation of the object.  
     */  
    val description: String? = null,

    /**  
     * Unique object identifier (for non-primitive values).  
     */  
    val objectId: RemoteObjectId? = null,

    /**  
     * Preview containing abbreviated property values. Specified for `object` type values only.  
     */  
    @pl.wendigo.chrome.protocol.Experimental val preview: ObjectPreview? = null,

    /**  
     *  
     */  
    @pl.wendigo.chrome.protocol.Experimental val customPreview: CustomPreview? = null
)

/**
 *
 *
 * @link [Runtime#CustomPreview](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-CustomPreview) type documentation.
 */

@kotlinx.serialization.Serializable
data class CustomPreview(
    /**  
     * The JSON-stringified result of formatter.header(object, config) call.  
     It contains json ML array that represents RemoteObject.  
     */  
    val header: String,

    /**  
     * If formatter returns true as a result of formatter.hasBody call then bodyGetterId will  
     contain RemoteObjectId for the function that returns result of formatter.body(object, config) call.  
     The result value is json ML array.  
     */  
    val bodyGetterId: RemoteObjectId? = null
)

/**
 * Object containing abbreviated remote object value.
 *
 * @link [Runtime#ObjectPreview](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-ObjectPreview) type documentation.
 */

@kotlinx.serialization.Serializable
data class ObjectPreview(
    /**  
     * Object type.  
     */  
    val type: String,

    /**  
     * Object subtype hint. Specified for `object` type values only.  
     */  
    val subtype: String? = null,

    /**  
     * String representation of the object.  
     */  
    val description: String? = null,

    /**  
     * True iff some of the properties or entries of the original object did not fit.  
     */  
    val overflow: Boolean,

    /**  
     * List of the properties.  
     */  
    val properties: List<PropertyPreview>,

    /**  
     * List of the entries. Specified for `map` and `set` subtype values only.  
     */  
    val entries: List<EntryPreview>? = null
)

/**
 *
 *
 * @link [Runtime#PropertyPreview](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-PropertyPreview) type documentation.
 */

@kotlinx.serialization.Serializable
data class PropertyPreview(
    /**  
     * Property name.  
     */  
    val name: String,

    /**  
     * Object type. Accessor means that the property itself is an accessor property.  
     */  
    val type: String,

    /**  
     * User-friendly property value string.  
     */  
    val value: String? = null,

    /**  
     * Nested value preview.  
     */  
    val valuePreview: ObjectPreview? = null,

    /**  
     * Object subtype hint. Specified for `object` type values only.  
     */  
    val subtype: String? = null
)

/**
 *
 *
 * @link [Runtime#EntryPreview](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-EntryPreview) type documentation.
 */

@kotlinx.serialization.Serializable
data class EntryPreview(
    /**  
     * Preview of the key. Specified for map-like collection entries.  
     */  
    val key: ObjectPreview? = null,

    /**  
     * Preview of the value.  
     */  
    val value: ObjectPreview
)

/**
 * Object property descriptor.
 *
 * @link [Runtime#PropertyDescriptor](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-PropertyDescriptor) type documentation.
 */

@kotlinx.serialization.Serializable
data class PropertyDescriptor(
    /**  
     * Property name or symbol description.  
     */  
    val name: String,

    /**  
     * The value associated with the property.  
     */  
    val value: RemoteObject? = null,

    /**  
     * True if the value associated with the property may be changed (data descriptors only).  
     */  
    val writable: Boolean? = null,

    /**  
     * A function which serves as a getter for the property, or `undefined` if there is no getter  
     (accessor descriptors only).  
     */  
    val get: RemoteObject? = null,

    /**  
     * A function which serves as a setter for the property, or `undefined` if there is no setter  
     (accessor descriptors only).  
     */  
    val set: RemoteObject? = null,

    /**  
     * True if the type of this property descriptor may be changed and if the property may be  
     deleted from the corresponding object.  
     */  
    val configurable: Boolean,

    /**  
     * True if this property shows up during enumeration of the properties on the corresponding  
     object.  
     */  
    val enumerable: Boolean,

    /**  
     * True if the result was thrown during the evaluation.  
     */  
    val wasThrown: Boolean? = null,

    /**  
     * True if the property is owned for the object.  
     */  
    val isOwn: Boolean? = null,

    /**  
     * Property symbol object, if the property is of the `symbol` type.  
     */  
    val symbol: RemoteObject? = null
)

/**
 * Object internal property descriptor. This property isn&apos;t normally visible in JavaScript code.
 *
 * @link [Runtime#InternalPropertyDescriptor](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-InternalPropertyDescriptor) type documentation.
 */

@kotlinx.serialization.Serializable
data class InternalPropertyDescriptor(
    /**  
     * Conventional property name.  
     */  
    val name: String,

    /**  
     * The value associated with the property.  
     */  
    val value: RemoteObject? = null
)

/**
 * Object private field descriptor.
 *
 * @link [Runtime#PrivatePropertyDescriptor](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-PrivatePropertyDescriptor) type documentation.
 */

@kotlinx.serialization.Serializable
data class PrivatePropertyDescriptor(
    /**  
     * Private property name.  
     */  
    val name: String,

    /**  
     * The value associated with the private property.  
     */  
    val value: RemoteObject? = null,

    /**  
     * A function which serves as a getter for the private property,  
     or `undefined` if there is no getter (accessor descriptors only).  
     */  
    val get: RemoteObject? = null,

    /**  
     * A function which serves as a setter for the private property,  
     or `undefined` if there is no setter (accessor descriptors only).  
     */  
    val set: RemoteObject? = null
)

/**
 * Represents function call argument. Either remote object id `objectId`, primitive `value`,
unserializable primitive value or neither of (for undefined) them should be specified.
 *
 * @link [Runtime#CallArgument](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-CallArgument) type documentation.
 */

@kotlinx.serialization.Serializable
data class CallArgument(
    /**  
     * Primitive value or serializable javascript object.  
     */  
    val value: kotlinx.serialization.json.JsonElement? = null,

    /**  
     * Primitive value which can not be JSON-stringified.  
     */  
    val unserializableValue: UnserializableValue? = null,

    /**  
     * Remote object handle.  
     */  
    val objectId: RemoteObjectId? = null
)

/**
 * Id of an execution context.
 *
 * @link [Runtime#ExecutionContextId](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-ExecutionContextId) type documentation.
 */

typealias ExecutionContextId = Int

/**
 * Description of an isolated world.
 *
 * @link [Runtime#ExecutionContextDescription](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-ExecutionContextDescription) type documentation.
 */

@kotlinx.serialization.Serializable
data class ExecutionContextDescription(
    /**  
     * Unique id of the execution context. It can be used to specify in which execution context  
     script evaluation should be performed.  
     */  
    val id: ExecutionContextId,

    /**  
     * Execution context origin.  
     */  
    val origin: String,

    /**  
     * Human readable name describing given context.  
     */  
    val name: String,

    /**  
     * A system-unique execution context identifier. Unlike the id, this is unique accross  
     multiple processes, so can be reliably used to identify specific context while backend  
     performs a cross-process navigation.  
     */  
    @pl.wendigo.chrome.protocol.Experimental val uniqueId: String,

    /**  
     * Embedder-specific auxiliary data.  
     */  
    val auxData: kotlinx.serialization.json.JsonElement? = null
)

/**
 * Detailed information about exception (or error) that was thrown during script compilation or
execution.
 *
 * @link [Runtime#ExceptionDetails](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-ExceptionDetails) type documentation.
 */

@kotlinx.serialization.Serializable
data class ExceptionDetails(
    /**  
     * Exception id.  
     */  
    val exceptionId: Int,

    /**  
     * Exception text, which should be used together with exception object when available.  
     */  
    val text: String,

    /**  
     * Line number of the exception location (0-based).  
     */  
    val lineNumber: Int,

    /**  
     * Column number of the exception location (0-based).  
     */  
    val columnNumber: Int,

    /**  
     * Script ID of the exception location.  
     */  
    val scriptId: ScriptId? = null,

    /**  
     * URL of the exception location, to be used when the script was not reported.  
     */  
    val url: String? = null,

    /**  
     * JavaScript stack trace if available.  
     */  
    val stackTrace: StackTrace? = null,

    /**  
     * Exception object if available.  
     */  
    val exception: RemoteObject? = null,

    /**  
     * Identifier of the context where exception happened.  
     */  
    val executionContextId: ExecutionContextId? = null
)

/**
 * Number of milliseconds since epoch.
 *
 * @link [Runtime#Timestamp](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-Timestamp) type documentation.
 */

typealias Timestamp = Double

/**
 * Number of milliseconds.
 *
 * @link [Runtime#TimeDelta](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-TimeDelta) type documentation.
 */

typealias TimeDelta = Double

/**
 * Stack entry for runtime errors and assertions.
 *
 * @link [Runtime#CallFrame](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-CallFrame) type documentation.
 */

@kotlinx.serialization.Serializable
data class CallFrame(
    /**  
     * JavaScript function name.  
     */  
    val functionName: String,

    /**  
     * JavaScript script id.  
     */  
    val scriptId: ScriptId,

    /**  
     * JavaScript script name or url.  
     */  
    val url: String,

    /**  
     * JavaScript script line number (0-based).  
     */  
    val lineNumber: Int,

    /**  
     * JavaScript script column number (0-based).  
     */  
    val columnNumber: Int
)

/**
 * Call frames for assertions or error messages.
 *
 * @link [Runtime#StackTrace](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-StackTrace) type documentation.
 */

@kotlinx.serialization.Serializable
data class StackTrace(
    /**  
     * String label of this stack trace. For async traces this may be a name of the function that  
     initiated the async call.  
     */  
    val description: String? = null,

    /**  
     * JavaScript function name.  
     */  
    val callFrames: List<CallFrame>,

    /**  
     * Asynchronous JavaScript stack trace that preceded this stack, if available.  
     */  
    val parent: StackTrace? = null,

    /**  
     * Asynchronous JavaScript stack trace that preceded this stack, if available.  
     */  
    @pl.wendigo.chrome.protocol.Experimental val parentId: StackTraceId? = null
)

/**
 * Unique identifier of current debugger.
 *
 * @link [Runtime#UniqueDebuggerId](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-UniqueDebuggerId) type documentation.
 */

typealias UniqueDebuggerId = String

/**
 * If `debuggerId` is set stack trace comes from another debugger and can be resolved there. This
allows to track cross-debugger calls. See `Runtime.StackTrace` and `Debugger.paused` for usages.
 *
 * @link [Runtime#StackTraceId](https://chromedevtools.github.io/devtools-protocol/tot/Runtime#type-StackTraceId) type documentation.
 */

@kotlinx.serialization.Serializable
data class StackTraceId(
    /**  
     *  
     */  
    val id: String,

    /**  
     *  
     */  
    val debuggerId: UniqueDebuggerId? = null
)
