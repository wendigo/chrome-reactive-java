package pl.wendigo.chrome.api.deviceorientation

import kotlinx.serialization.json.Json

/**
 * DeviceOrientationDomain represents DeviceOrientation protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [DeviceOrientation](https://chromedevtools.github.io/devtools-protocol/tot/DeviceOrientation) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class DeviceOrientationDomain internal constructor(connection: pl.wendigo.chrome.protocol.ProtocolConnection) :
    pl.wendigo.chrome.protocol.Domain("DeviceOrientation", """""", connection) {
    /**
     * Clears the overridden Device Orientation.
     *
     * @link Protocol [DeviceOrientation#clearDeviceOrientationOverride](https://chromedevtools.github.io/devtools-protocol/tot/DeviceOrientation#method-clearDeviceOrientationOverride) method documentation.
     */
    
    fun clearDeviceOrientationOverride(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DeviceOrientation.clearDeviceOrientationOverride", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Overrides the Device Orientation.
     *
     * @link Protocol [DeviceOrientation#setDeviceOrientationOverride](https://chromedevtools.github.io/devtools-protocol/tot/DeviceOrientation#method-setDeviceOrientationOverride) method documentation.
     */
    
    fun setDeviceOrientationOverride(input: SetDeviceOrientationOverrideRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DeviceOrientation.setDeviceOrientationOverride", Json.encodeToJsonElement(SetDeviceOrientationOverrideRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())
}

/**
 * Represents request frame that can be used with [DeviceOrientation#setDeviceOrientationOverride](https://chromedevtools.github.io/devtools-protocol/tot/DeviceOrientation#method-setDeviceOrientationOverride) operation call.
 *
 * Overrides the Device Orientation.
 * @link [DeviceOrientation#setDeviceOrientationOverride](https://chromedevtools.github.io/devtools-protocol/tot/DeviceOrientation#method-setDeviceOrientationOverride) method documentation.
 * @see [DeviceOrientationDomain.setDeviceOrientationOverride]
 */
@kotlinx.serialization.Serializable
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
