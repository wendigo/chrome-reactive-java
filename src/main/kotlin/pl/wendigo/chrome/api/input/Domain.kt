package pl.wendigo.chrome.api.input

import kotlinx.serialization.json.Json

/**
 * InputDomain represents Input protocol domain request/response operations and events that can be captured.
 *
 * @link Protocol [Input](https://chromedevtools.github.io/devtools-protocol/tot/Input) domain documentation.
 */

class InputDomain internal constructor(connection: pl.wendigo.chrome.protocol.ProtocolConnection) :
    pl.wendigo.chrome.protocol.Domain("Input", """""", connection) {
    /**
     * Dispatches a key event to the page.
     *
     * @link Protocol [Input#dispatchKeyEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchKeyEvent) method documentation.
     */
    
    fun dispatchKeyEvent(input: DispatchKeyEventRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.dispatchKeyEvent", Json.encodeToJsonElement(DispatchKeyEventRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * This method emulates inserting text that doesn't come from a key press,
for example an emoji keyboard or an IME.
     *
     * @link Protocol [Input#insertText](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-insertText) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun insertText(input: InsertTextRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.insertText", Json.encodeToJsonElement(InsertTextRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Dispatches a mouse event to the page.
     *
     * @link Protocol [Input#dispatchMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchMouseEvent) method documentation.
     */
    
    fun dispatchMouseEvent(input: DispatchMouseEventRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.dispatchMouseEvent", Json.encodeToJsonElement(DispatchMouseEventRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Dispatches a touch event to the page.
     *
     * @link Protocol [Input#dispatchTouchEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchTouchEvent) method documentation.
     */
    
    fun dispatchTouchEvent(input: DispatchTouchEventRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.dispatchTouchEvent", Json.encodeToJsonElement(DispatchTouchEventRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Emulates touch event from the mouse event parameters.
     *
     * @link Protocol [Input#emulateTouchFromMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-emulateTouchFromMouseEvent) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun emulateTouchFromMouseEvent(input: EmulateTouchFromMouseEventRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.emulateTouchFromMouseEvent", Json.encodeToJsonElement(EmulateTouchFromMouseEventRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Ignores input events (useful while auditing page).
     *
     * @link Protocol [Input#setIgnoreInputEvents](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-setIgnoreInputEvents) method documentation.
     */
    
    fun setIgnoreInputEvents(input: SetIgnoreInputEventsRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.setIgnoreInputEvents", Json.encodeToJsonElement(SetIgnoreInputEventsRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
     *
     * @link Protocol [Input#synthesizePinchGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizePinchGesture) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun synthesizePinchGesture(input: SynthesizePinchGestureRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.synthesizePinchGesture", Json.encodeToJsonElement(SynthesizePinchGestureRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
     *
     * @link Protocol [Input#synthesizeScrollGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeScrollGesture) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun synthesizeScrollGesture(input: SynthesizeScrollGestureRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.synthesizeScrollGesture", Json.encodeToJsonElement(SynthesizeScrollGestureRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
     *
     * @link Protocol [Input#synthesizeTapGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeTapGesture) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun synthesizeTapGesture(input: SynthesizeTapGestureRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("Input.synthesizeTapGesture", Json.encodeToJsonElement(SynthesizeTapGestureRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())
}

/**
 * Represents request frame that can be used with [Input#dispatchKeyEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchKeyEvent) operation call.
 *
 * Dispatches a key event to the page.
 * @link [Input#dispatchKeyEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchKeyEvent) method documentation.
 * @see [InputDomain.dispatchKeyEvent]
 */
@kotlinx.serialization.Serializable
data class DispatchKeyEventRequest(
    /**
     * Type of the key event.
     */
    val type: String,

    /**
     * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
(default: 0).
     */
    val modifiers: Int? = null,

    /**
     * Time at which the event occurred.
     */
    val timestamp: TimeSinceEpoch? = null,

    /**
     * Text as generated by processing a virtual key code with a keyboard layout. Not needed for
for `keyUp` and `rawKeyDown` events (default: "")
     */
    val text: String? = null,

    /**
     * Text that would have been generated by the keyboard if no modifiers were pressed (except for
shift). Useful for shortcut (accelerator) key handling (default: "").
     */
    val unmodifiedText: String? = null,

    /**
     * Unique key identifier (e.g., 'U+0041') (default: "").
     */
    val keyIdentifier: String? = null,

    /**
     * Unique DOM defined string value for each physical key (e.g., 'KeyA') (default: "").
     */
    val code: String? = null,

    /**
     * Unique DOM defined string value describing the meaning of the key in the context of active
modifiers, keyboard layout, etc (e.g., 'AltGr') (default: "").
     */
    val key: String? = null,

    /**
     * Windows virtual key code (default: 0).
     */
    val windowsVirtualKeyCode: Int? = null,

    /**
     * Native virtual key code (default: 0).
     */
    val nativeVirtualKeyCode: Int? = null,

    /**
     * Whether the event was generated from auto repeat (default: false).
     */
    val autoRepeat: Boolean? = null,

    /**
     * Whether the event was generated from the keypad (default: false).
     */
    val isKeypad: Boolean? = null,

    /**
     * Whether the event was a system key event (default: false).
     */
    val isSystemKey: Boolean? = null,

    /**
     * Whether the event was from the left or right side of the keyboard. 1=Left, 2=Right (default:
0).
     */
    val location: Int? = null,

    /**
     * Editing commands to send with the key event (e.g., 'selectAll') (default: []).
These are related to but not equal the command names used in `document.execCommand` and NSStandardKeyBindingResponding.
See https://source.chromium.org/chromium/chromium/src/+/master:third_party/blink/renderer/core/editing/commands/editor_command_names.h for valid command names.
     */
    @pl.wendigo.chrome.protocol.Experimental val commands: List<String>? = null

)

/**
 * Represents request frame that can be used with [Input#insertText](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-insertText) operation call.
 *
 * This method emulates inserting text that doesn't come from a key press,
for example an emoji keyboard or an IME.
 * @link [Input#insertText](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-insertText) method documentation.
 * @see [InputDomain.insertText]
 */
@kotlinx.serialization.Serializable
data class InsertTextRequest(
    /**
     * The text to insert.
     */
    val text: String

)

/**
 * Represents request frame that can be used with [Input#dispatchMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchMouseEvent) operation call.
 *
 * Dispatches a mouse event to the page.
 * @link [Input#dispatchMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchMouseEvent) method documentation.
 * @see [InputDomain.dispatchMouseEvent]
 */
@kotlinx.serialization.Serializable
data class DispatchMouseEventRequest(
    /**
     * Type of the mouse event.
     */
    val type: String,

    /**
     * X coordinate of the event relative to the main frame's viewport in CSS pixels.
     */
    val x: Double,

    /**
     * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
     */
    val y: Double,

    /**
     * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
(default: 0).
     */
    val modifiers: Int? = null,

    /**
     * Time at which the event occurred.
     */
    val timestamp: TimeSinceEpoch? = null,

    /**
     * Mouse button (default: "none").
     */
    val button: MouseButton? = null,

    /**
     * A number indicating which buttons are pressed on the mouse when a mouse event is triggered.
Left=1, Right=2, Middle=4, Back=8, Forward=16, None=0.
     */
    val buttons: Int? = null,

    /**
     * Number of times the mouse button was clicked (default: 0).
     */
    val clickCount: Int? = null,

    /**
     * The normalized pressure, which has a range of [0,1] (default: 0).
     */
    @pl.wendigo.chrome.protocol.Experimental val force: Double? = null,

    /**
     * The normalized tangential pressure, which has a range of [-1,1] (default: 0).
     */
    @pl.wendigo.chrome.protocol.Experimental val tangentialPressure: Double? = null,

    /**
     * The plane angle between the Y-Z plane and the plane containing both the stylus axis and the Y axis, in degrees of the range [-90,90], a positive tiltX is to the right (default: 0).
     */
    @pl.wendigo.chrome.protocol.Experimental val tiltX: Int? = null,

    /**
     * The plane angle between the X-Z plane and the plane containing both the stylus axis and the X axis, in degrees of the range [-90,90], a positive tiltY is towards the user (default: 0).
     */
    @pl.wendigo.chrome.protocol.Experimental val tiltY: Int? = null,

    /**
     * The clockwise rotation of a pen stylus around its own major axis, in degrees in the range [0,359] (default: 0).
     */
    @pl.wendigo.chrome.protocol.Experimental val twist: Int? = null,

    /**
     * X delta in CSS pixels for mouse wheel event (default: 0).
     */
    val deltaX: Double? = null,

    /**
     * Y delta in CSS pixels for mouse wheel event (default: 0).
     */
    val deltaY: Double? = null,

    /**
     * Pointer type (default: "mouse").
     */
    val pointerType: String? = null

)

/**
 * Represents request frame that can be used with [Input#dispatchTouchEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchTouchEvent) operation call.
 *
 * Dispatches a touch event to the page.
 * @link [Input#dispatchTouchEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-dispatchTouchEvent) method documentation.
 * @see [InputDomain.dispatchTouchEvent]
 */
@kotlinx.serialization.Serializable
data class DispatchTouchEventRequest(
    /**
     * Type of the touch event. TouchEnd and TouchCancel must not contain any touch points, while
TouchStart and TouchMove must contains at least one.
     */
    val type: String,

    /**
     * Active touch points on the touch device. One event per any changed point (compared to
previous touch event in a sequence) is generated, emulating pressing/moving/releasing points
one by one.
     */
    val touchPoints: List<TouchPoint>,

    /**
     * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
(default: 0).
     */
    val modifiers: Int? = null,

    /**
     * Time at which the event occurred.
     */
    val timestamp: TimeSinceEpoch? = null

)

/**
 * Represents request frame that can be used with [Input#emulateTouchFromMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-emulateTouchFromMouseEvent) operation call.
 *
 * Emulates touch event from the mouse event parameters.
 * @link [Input#emulateTouchFromMouseEvent](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-emulateTouchFromMouseEvent) method documentation.
 * @see [InputDomain.emulateTouchFromMouseEvent]
 */
@kotlinx.serialization.Serializable
data class EmulateTouchFromMouseEventRequest(
    /**
     * Type of the mouse event.
     */
    val type: String,

    /**
     * X coordinate of the mouse pointer in DIP.
     */
    val x: Int,

    /**
     * Y coordinate of the mouse pointer in DIP.
     */
    val y: Int,

    /**
     * Mouse button. Only "none", "left", "right" are supported.
     */
    val button: MouseButton,

    /**
     * Time at which the event occurred (default: current time).
     */
    val timestamp: TimeSinceEpoch? = null,

    /**
     * X delta in DIP for mouse wheel event (default: 0).
     */
    val deltaX: Double? = null,

    /**
     * Y delta in DIP for mouse wheel event (default: 0).
     */
    val deltaY: Double? = null,

    /**
     * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
(default: 0).
     */
    val modifiers: Int? = null,

    /**
     * Number of times the mouse button was clicked (default: 0).
     */
    val clickCount: Int? = null

)

/**
 * Represents request frame that can be used with [Input#setIgnoreInputEvents](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-setIgnoreInputEvents) operation call.
 *
 * Ignores input events (useful while auditing page).
 * @link [Input#setIgnoreInputEvents](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-setIgnoreInputEvents) method documentation.
 * @see [InputDomain.setIgnoreInputEvents]
 */
@kotlinx.serialization.Serializable
data class SetIgnoreInputEventsRequest(
    /**
     * Ignores input events processing when set to true.
     */
    val ignore: Boolean

)

/**
 * Represents request frame that can be used with [Input#synthesizePinchGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizePinchGesture) operation call.
 *
 * Synthesizes a pinch gesture over a time period by issuing appropriate touch events.
 * @link [Input#synthesizePinchGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizePinchGesture) method documentation.
 * @see [InputDomain.synthesizePinchGesture]
 */
@kotlinx.serialization.Serializable
data class SynthesizePinchGestureRequest(
    /**
     * X coordinate of the start of the gesture in CSS pixels.
     */
    val x: Double,

    /**
     * Y coordinate of the start of the gesture in CSS pixels.
     */
    val y: Double,

    /**
     * Relative scale factor after zooming (>1.0 zooms in, <1.0 zooms out).
     */
    val scaleFactor: Double,

    /**
     * Relative pointer speed in pixels per second (default: 800).
     */
    val relativeSpeed: Int? = null,

    /**
     * Which type of input events to be generated (default: 'default', which queries the platform
for the preferred input type).
     */
    val gestureSourceType: GestureSourceType? = null

)

/**
 * Represents request frame that can be used with [Input#synthesizeScrollGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeScrollGesture) operation call.
 *
 * Synthesizes a scroll gesture over a time period by issuing appropriate touch events.
 * @link [Input#synthesizeScrollGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeScrollGesture) method documentation.
 * @see [InputDomain.synthesizeScrollGesture]
 */
@kotlinx.serialization.Serializable
data class SynthesizeScrollGestureRequest(
    /**
     * X coordinate of the start of the gesture in CSS pixels.
     */
    val x: Double,

    /**
     * Y coordinate of the start of the gesture in CSS pixels.
     */
    val y: Double,

    /**
     * The distance to scroll along the X axis (positive to scroll left).
     */
    val xDistance: Double? = null,

    /**
     * The distance to scroll along the Y axis (positive to scroll up).
     */
    val yDistance: Double? = null,

    /**
     * The number of additional pixels to scroll back along the X axis, in addition to the given
distance.
     */
    val xOverscroll: Double? = null,

    /**
     * The number of additional pixels to scroll back along the Y axis, in addition to the given
distance.
     */
    val yOverscroll: Double? = null,

    /**
     * Prevent fling (default: true).
     */
    val preventFling: Boolean? = null,

    /**
     * Swipe speed in pixels per second (default: 800).
     */
    val speed: Int? = null,

    /**
     * Which type of input events to be generated (default: 'default', which queries the platform
for the preferred input type).
     */
    val gestureSourceType: GestureSourceType? = null,

    /**
     * The number of times to repeat the gesture (default: 0).
     */
    val repeatCount: Int? = null,

    /**
     * The number of milliseconds delay between each repeat. (default: 250).
     */
    val repeatDelayMs: Int? = null,

    /**
     * The name of the interaction markers to generate, if not empty (default: "").
     */
    val interactionMarkerName: String? = null

)

/**
 * Represents request frame that can be used with [Input#synthesizeTapGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeTapGesture) operation call.
 *
 * Synthesizes a tap gesture over a time period by issuing appropriate touch events.
 * @link [Input#synthesizeTapGesture](https://chromedevtools.github.io/devtools-protocol/tot/Input#method-synthesizeTapGesture) method documentation.
 * @see [InputDomain.synthesizeTapGesture]
 */
@kotlinx.serialization.Serializable
data class SynthesizeTapGestureRequest(
    /**
     * X coordinate of the start of the gesture in CSS pixels.
     */
    val x: Double,

    /**
     * Y coordinate of the start of the gesture in CSS pixels.
     */
    val y: Double,

    /**
     * Duration between touchdown and touchup events in ms (default: 50).
     */
    val duration: Int? = null,

    /**
     * Number of times to perform the tap (e.g. 2 for double tap, default: 1).
     */
    val tapCount: Int? = null,

    /**
     * Which type of input events to be generated (default: 'default', which queries the platform
for the preferred input type).
     */
    val gestureSourceType: GestureSourceType? = null

)
