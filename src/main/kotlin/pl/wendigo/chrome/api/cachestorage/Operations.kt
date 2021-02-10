package pl.wendigo.chrome.api.cachestorage

/**
 * CacheStorageOperations represents CacheStorage protocol domain request/response operations and events that can be captured.
 *
 * This API is marked as experimental in protocol definition and can change in the future.
 * @link Protocol [CacheStorage](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage) domain documentation.
 */
@pl.wendigo.chrome.protocol.Experimental
class CacheStorageOperations internal constructor(private val connection: pl.wendigo.chrome.protocol.ChromeDebuggerConnection) {
    /**
     * Deletes a cache.
     *
     * @link Protocol [CacheStorage#deleteCache](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteCache) method documentation.
     */
    fun deleteCache(input: DeleteCacheRequest) = connection.request("CacheStorage.deleteCache", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Deletes a cache entry.
     *
     * @link Protocol [CacheStorage#deleteEntry](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteEntry) method documentation.
     */
    fun deleteEntry(input: DeleteEntryRequest) = connection.request("CacheStorage.deleteEntry", input, pl.wendigo.chrome.protocol.ResponseFrame::class.java)

    /**
     * Requests cache names.
     *
     * @link Protocol [CacheStorage#requestCacheNames](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCacheNames) method documentation.
     */
    fun requestCacheNames(input: RequestCacheNamesRequest) = connection.request("CacheStorage.requestCacheNames", input, RequestCacheNamesResponse::class.java)

    /**
     * Fetches cache entry.
     *
     * @link Protocol [CacheStorage#requestCachedResponse](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCachedResponse) method documentation.
     */
    fun requestCachedResponse(input: RequestCachedResponseRequest) = connection.request("CacheStorage.requestCachedResponse", input, RequestCachedResponseResponse::class.java)

    /**
     * Requests data from cache.
     *
     * @link Protocol [CacheStorage#requestEntries](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestEntries) method documentation.
     */
    fun requestEntries(input: RequestEntriesRequest) = connection.request("CacheStorage.requestEntries", input, RequestEntriesResponse::class.java)

    /**
     * Returns flowable capturing all CacheStorage domains events.
     */
    fun events(): io.reactivex.Flowable<pl.wendigo.chrome.protocol.Event> {
        return connection.allEvents().filter {
            it.protocolDomain() == "CacheStorage"
        }
    }
}

/**
 * Represents request frame that can be used with [CacheStorage#deleteCache](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteCache) operation call.
 *
 * Deletes a cache.
 * @link [CacheStorage#deleteCache](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteCache) method documentation.
 * @see [CacheStorageOperations.deleteCache]
 */
data class DeleteCacheRequest(
    /**
     * Id of cache for deletion.
     */
    val cacheId: CacheId

)

/**
 * Represents request frame that can be used with [CacheStorage#deleteEntry](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteEntry) operation call.
 *
 * Deletes a cache entry.
 * @link [CacheStorage#deleteEntry](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-deleteEntry) method documentation.
 * @see [CacheStorageOperations.deleteEntry]
 */
data class DeleteEntryRequest(
    /**
     * Id of cache where the entry will be deleted.
     */
    val cacheId: CacheId,

    /**
     * URL spec of the request.
     */
    val request: String

)

/**
 * Represents request frame that can be used with [CacheStorage#requestCacheNames](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCacheNames) operation call.
 *
 * Requests cache names.
 * @link [CacheStorage#requestCacheNames](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCacheNames) method documentation.
 * @see [CacheStorageOperations.requestCacheNames]
 */
data class RequestCacheNamesRequest(
    /**
     * Security origin.
     */
    val securityOrigin: String

)

/**
 * Represents response frame that is returned from [CacheStorage#requestCacheNames](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCacheNames) operation call.
 * Requests cache names.
 *
  
 * @link [CacheStorage#requestCacheNames](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCacheNames) method documentation.
 * @see [CacheStorageOperations.requestCacheNames]
 */
data class RequestCacheNamesResponse(
    /**  
     * Caches for the security origin.  
     */  
    val caches: List<Cache>

)

/**
 * Represents request frame that can be used with [CacheStorage#requestCachedResponse](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCachedResponse) operation call.
 *
 * Fetches cache entry.
 * @link [CacheStorage#requestCachedResponse](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCachedResponse) method documentation.
 * @see [CacheStorageOperations.requestCachedResponse]
 */
data class RequestCachedResponseRequest(
    /**
     * Id of cache that contains the entry.
     */
    val cacheId: CacheId,

    /**
     * URL spec of the request.
     */
    val requestURL: String,

    /**
     * headers of the request.
     */
    val requestHeaders: List<Header>

)

/**
 * Represents response frame that is returned from [CacheStorage#requestCachedResponse](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCachedResponse) operation call.
 * Fetches cache entry.
 *
  
 * @link [CacheStorage#requestCachedResponse](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestCachedResponse) method documentation.
 * @see [CacheStorageOperations.requestCachedResponse]
 */
data class RequestCachedResponseResponse(
    /**  
     * Response read from the cache.  
     */  
    val response: CachedResponse

)

/**
 * Represents request frame that can be used with [CacheStorage#requestEntries](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestEntries) operation call.
 *
 * Requests data from cache.
 * @link [CacheStorage#requestEntries](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestEntries) method documentation.
 * @see [CacheStorageOperations.requestEntries]
 */
data class RequestEntriesRequest(
    /**
     * ID of cache to get entries from.
     */
    val cacheId: CacheId,

    /**
     * Number of records to skip.
     */
    val skipCount: Int? = null,

    /**
     * Number of records to fetch.
     */
    val pageSize: Int? = null,

    /**
     * If present, only return the entries containing this substring in the path
     */
    val pathFilter: String? = null

)

/**
 * Represents response frame that is returned from [CacheStorage#requestEntries](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestEntries) operation call.
 * Requests data from cache.
 *
  
 * @link [CacheStorage#requestEntries](https://chromedevtools.github.io/devtools-protocol/tot/CacheStorage#method-requestEntries) method documentation.
 * @see [CacheStorageOperations.requestEntries]
 */
data class RequestEntriesResponse(
    /**  
     * Array of object store data entries.  
     */  
    val cacheDataEntries: List<DataEntry>,

    /**  
     * Count of returned entries from this storage. If pathFilter is empty, it  
     is the count of all entries from this storage.  
     */  
    val returnCount: Double

)
