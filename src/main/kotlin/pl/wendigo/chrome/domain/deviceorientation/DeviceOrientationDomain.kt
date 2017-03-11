package pl.wendigo.chrome.domain.deviceorientation

/**
 * DeviceOrientationDomain represents remote debugger protocol domain.
 */
@pl.wendigo.chrome.ProtocolExperimental class DeviceOrientationDomain internal constructor(private val connection : pl.wendigo.chrome.DebuggerConnection) {

	/**
	 * Overrides the Device Orientation.
	 */
	  fun setDeviceOrientationOverride(input : SetDeviceOrientationOverrideRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("DeviceOrientation.setDeviceOrientationOverride", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Clears the overridden Device Orientation.
	 */
	  fun clearDeviceOrientationOverride() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("DeviceOrientation.clearDeviceOrientationOverride", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

  }

/**
 * Represents requestFrame parameters that can be used with DeviceOrientation.setDeviceOrientationOverride method call.
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





