package pl.wendigo.chrome.domain.indexeddb

/**
 * IndexedDBDomain represents remote debugger protocol domain.
 */
@pl.wendigo.chrome.ProtocolExperimental class IndexedDBDomain internal constructor(private val connection : pl.wendigo.chrome.DebuggerConnection) {

	/**
	 * Enables events from backend.
	 */
	  fun enable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("IndexedDB.enable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Disables events from backend.
	 */
	  fun disable() : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("IndexedDB.disable", null, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Requests database names for given security origin.
	 */
	  fun requestDatabaseNames(input : RequestDatabaseNamesRequest) : io.reactivex.Flowable<RequestDatabaseNamesResponse> {
        return connection.runAndCaptureResponse("IndexedDB.requestDatabaseNames", input, RequestDatabaseNamesResponse::class.java)
	}

	/**
	 * Requests database with given name in given frame.
	 */
	  fun requestDatabase(input : RequestDatabaseRequest) : io.reactivex.Flowable<RequestDatabaseResponse> {
        return connection.runAndCaptureResponse("IndexedDB.requestDatabase", input, RequestDatabaseResponse::class.java)
	}

	/**
	 * Requests data from object store or index.
	 */
	  fun requestData(input : RequestDataRequest) : io.reactivex.Flowable<RequestDataResponse> {
        return connection.runAndCaptureResponse("IndexedDB.requestData", input, RequestDataResponse::class.java)
	}

	/**
	 * Clears all entries from an object store.
	 */
	  fun clearObjectStore(input : ClearObjectStoreRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("IndexedDB.clearObjectStore", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

	/**
	 * Deletes a database.
	 */
	  fun deleteDatabase(input : DeleteDatabaseRequest) : io.reactivex.Flowable<pl.wendigo.chrome.ResponseFrame> {
        return connection.runAndCaptureResponse("IndexedDB.deleteDatabase", input, pl.wendigo.chrome.ResponseFrame::class.java)
	}

  }





/**
 * Represents requestFrame parameters that can be used with IndexedDB.requestDatabaseNames method call.
 *
 * Requests database names for given security origin.
 */
data class RequestDatabaseNamesRequest (
    /**
     * Security origin.
     */
    val securityOrigin : String

)

/**
 * Represents responseFrame from IndexedDB. method call.
 *
 * Requests database names for given security origin.
 */
data class RequestDatabaseNamesResponse(
  /**
   * Database names for origin.
   */
  val databaseNames : Array<String>

)

/**
 * Represents requestFrame parameters that can be used with IndexedDB.requestDatabase method call.
 *
 * Requests database with given name in given frame.
 */
data class RequestDatabaseRequest (
    /**
     * Security origin.
     */
    val securityOrigin : String,

    /**
     * Database name.
     */
    val databaseName : String

)

/**
 * Represents responseFrame from IndexedDB. method call.
 *
 * Requests database with given name in given frame.
 */
data class RequestDatabaseResponse(
  /**
   * Database with an array of object stores.
   */
  val databaseWithObjectStores : DatabaseWithObjectStores

)

/**
 * Represents requestFrame parameters that can be used with IndexedDB.requestData method call.
 *
 * Requests data from object store or index.
 */
data class RequestDataRequest (
    /**
     * Security origin.
     */
    val securityOrigin : String,

    /**
     * Database name.
     */
    val databaseName : String,

    /**
     * Object store name.
     */
    val objectStoreName : String,

    /**
     * Index name, empty string for object store data requests.
     */
    val indexName : String,

    /**
     * Number of records to skip.
     */
    val skipCount : Int,

    /**
     * Number of records to fetch.
     */
    val pageSize : Int,

    /**
     * Key range.
     */
    val keyRange : KeyRange? = null

)

/**
 * Represents responseFrame from IndexedDB. method call.
 *
 * Requests data from object store or index.
 */
data class RequestDataResponse(
  /**
   * Array of object store data entries.
   */
  val objectStoreDataEntries : Array<DataEntry>,

  /**
   * If true, there are more entries to fetch in the given range.
   */
  val hasMore : Boolean

)

/**
 * Represents requestFrame parameters that can be used with IndexedDB.clearObjectStore method call.
 *
 * Clears all entries from an object store.
 */
data class ClearObjectStoreRequest (
    /**
     * Security origin.
     */
    val securityOrigin : String,

    /**
     * Database name.
     */
    val databaseName : String,

    /**
     * Object store name.
     */
    val objectStoreName : String

)


/**
 * Represents requestFrame parameters that can be used with IndexedDB.deleteDatabase method call.
 *
 * Deletes a database.
 */
data class DeleteDatabaseRequest (
    /**
     * Security origin.
     */
    val securityOrigin : String,

    /**
     * Database name.
     */
    val databaseName : String

)



