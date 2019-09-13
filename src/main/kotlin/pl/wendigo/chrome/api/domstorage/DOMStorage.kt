package pl.wendigo.chrome.domain.domstorage

/**
 * Query and modify DOM storage.
 *
 * @link [https://chromedevtools.github.io/devtools-protocol/tot/DOMStorage](https://chromedevtools.github.io/devtools-protocol/tot/DOMStorage)
 */
class DOMStorage internal constructor(private val connectionRemote: pl.wendigo.chrome.DebuggerProtocol) {
    /**
     *
     */
    fun clear(input: ClearRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.clear", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Disables storage tracking, prevents storage events from being sent to the client.
     */
    fun disable(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.disable", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Enables storage tracking, storage events will now be delivered to the client.
     */
    fun enable(): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.enable", null, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     */
    fun getDOMStorageItems(input: GetDOMStorageItemsRequest): io.reactivex.Single<GetDOMStorageItemsResponse> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.getDOMStorageItems", input, GetDOMStorageItemsResponse::class.java).map {
            it.value()
        }
    }

    /**
     *
     */
    fun removeDOMStorageItem(input: RemoveDOMStorageItemRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.removeDOMStorageItem", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     *
     */
    fun setDOMStorageItem(input: SetDOMStorageItemRequest): io.reactivex.Single<pl.wendigo.chrome.ResponseFrame> {
        return connectionRemote.runAndCaptureResponse("DOMStorage.setDOMStorageItem", input, pl.wendigo.chrome.ResponseFrame::class.java).map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemAdded events.
     */
    fun domStorageItemAdded(): io.reactivex.Flowable<DomStorageItemAddedEvent> {
        return domStorageItemAddedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemAdded events.
     */
    fun domStorageItemAddedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DomStorageItemAddedEvent>> {
        return connectionRemote.captureEvents("DOMStorage.domStorageItemAdded", DomStorageItemAddedEvent::class.java)
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemRemoved events.
     */
    fun domStorageItemRemoved(): io.reactivex.Flowable<DomStorageItemRemovedEvent> {
        return domStorageItemRemovedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemRemoved events.
     */
    fun domStorageItemRemovedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DomStorageItemRemovedEvent>> {
        return connectionRemote.captureEvents("DOMStorage.domStorageItemRemoved", DomStorageItemRemovedEvent::class.java)
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemUpdated events.
     */
    fun domStorageItemUpdated(): io.reactivex.Flowable<DomStorageItemUpdatedEvent> {
        return domStorageItemUpdatedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemUpdated events.
     */
    fun domStorageItemUpdatedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DomStorageItemUpdatedEvent>> {
        return connectionRemote.captureEvents("DOMStorage.domStorageItemUpdated", DomStorageItemUpdatedEvent::class.java)
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemsCleared events.
     */
    fun domStorageItemsCleared(): io.reactivex.Flowable<DomStorageItemsClearedEvent> {
        return domStorageItemsClearedTimed().map {
            it.value()
        }
    }

    /**
     * Returns observable capturing all DOMStorage.domStorageItemsCleared events.
     */
    fun domStorageItemsClearedTimed(): io.reactivex.Flowable<io.reactivex.schedulers.Timed<DomStorageItemsClearedEvent>> {
        return connectionRemote.captureEvents("DOMStorage.domStorageItemsCleared", DomStorageItemsClearedEvent::class.java)
    }

    /**
     * Returns flowable capturing all DOMStorage domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.ProtocolEvent> {
        return connectionRemote.captureAllEvents().map { it.value() }.filter {
            it.protocolDomain() == "DOMStorage"
        }
    }
}
/**
 * Represents request frame that can be used with DOMStorage.clear method call.
 *
 *
 */
data class ClearRequest(
    /**
     *
     */
    val storageId: StorageId

)

/**
 * Represents request frame that can be used with DOMStorage.getDOMStorageItems method call.
 *
 *
 */
data class GetDOMStorageItemsRequest(
    /**
     *
     */
    val storageId: StorageId

)

/**
 * Represents response frame for DOMStorage.getDOMStorageItems method call.
 *
 *
 */
data class GetDOMStorageItemsResponse(
    /**  
     *  
     */  
    val entries: List<Item>

)

/**
 * Represents request frame that can be used with DOMStorage.removeDOMStorageItem method call.
 *
 *
 */
data class RemoveDOMStorageItemRequest(
    /**
     *
     */
    val storageId: StorageId,

    /**
     *
     */
    val key: String

)

/**
 * Represents request frame that can be used with DOMStorage.setDOMStorageItem method call.
 *
 *
 */
data class SetDOMStorageItemRequest(
    /**
     *
     */
    val storageId: StorageId,

    /**
     *
     */
    val key: String,

    /**
     *
     */
    val value: String

)

/**
 * Represents event frames for DOMStorage.domStorageItemAdded
 *
 *
 */
data class DomStorageItemAddedEvent(
    /**  
     *  
     */  
    val storageId: StorageId,

    /**  
     *  
     */  
    val key: String,

    /**  
     *  
     */  
    val newValue: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "DOMStorage", name = "domStorageItemAdded")

/**
 * Represents event frames for DOMStorage.domStorageItemRemoved
 *
 *
 */
data class DomStorageItemRemovedEvent(
    /**  
     *  
     */  
    val storageId: StorageId,

    /**  
     *  
     */  
    val key: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "DOMStorage", name = "domStorageItemRemoved")

/**
 * Represents event frames for DOMStorage.domStorageItemUpdated
 *
 *
 */
data class DomStorageItemUpdatedEvent(
    /**  
     *  
     */  
    val storageId: StorageId,

    /**  
     *  
     */  
    val key: String,

    /**  
     *  
     */  
    val oldValue: String,

    /**  
     *  
     */  
    val newValue: String

) : pl.wendigo.chrome.ProtocolEvent(domain = "DOMStorage", name = "domStorageItemUpdated")

/**
 * Represents event frames for DOMStorage.domStorageItemsCleared
 *
 *
 */
data class DomStorageItemsClearedEvent(
    /**  
     *  
     */  
    val storageId: StorageId

) : pl.wendigo.chrome.ProtocolEvent(domain = "DOMStorage", name = "domStorageItemsCleared")
