package pl.wendigo.chrome.api.dom

import kotlinx.serialization.json.Json

/**
 * This domain exposes DOM read/write operations. Each DOM Node is represented with its mirror object
that has an `id`. This `id` can be used to get additional information on the Node, resolve it into
the JavaScript object wrapper, etc. It is important that client receives DOM events only for the
nodes that are known to the client. Backend keeps track of the nodes that were sent to the client
and never sends the same node twice. It is client's responsibility to collect information about
the nodes that were sent to the client.<p>Note that `iframe` owner elements will return
corresponding document elements as their child nodes.</p>
 *
 * @link Protocol [DOM](https://chromedevtools.github.io/devtools-protocol/tot/DOM) domain documentation.
 */

class DOMDomain internal constructor(connection: pl.wendigo.chrome.protocol.ProtocolConnection) :
    pl.wendigo.chrome.protocol.Domain(
        "DOM",
        """This domain exposes DOM read/write operations. Each DOM Node is represented with its mirror object
that has an `id`. This `id` can be used to get additional information on the Node, resolve it into
the JavaScript object wrapper, etc. It is important that client receives DOM events only for the
nodes that are known to the client. Backend keeps track of the nodes that were sent to the client
and never sends the same node twice. It is client's responsibility to collect information about
the nodes that were sent to the client.<p>Note that `iframe` owner elements will return
corresponding document elements as their child nodes.</p>""",
        connection
    ) {
    /**
     * Collects class names for the node with given id and all of it's child nodes.
     *
     * @link Protocol [DOM#collectClassNamesFromSubtree](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-collectClassNamesFromSubtree) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun collectClassNamesFromSubtree(input: CollectClassNamesFromSubtreeRequest): io.reactivex.rxjava3.core.Single<CollectClassNamesFromSubtreeResponse> = connection.request("DOM.collectClassNamesFromSubtree", Json.encodeToJsonElement(CollectClassNamesFromSubtreeRequest.serializer(), input), CollectClassNamesFromSubtreeResponse.serializer())

    /**
     * Creates a deep copy of the specified node and places it into the target container before the
given anchor.
     *
     * @link Protocol [DOM#copyTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-copyTo) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun copyTo(input: CopyToRequest): io.reactivex.rxjava3.core.Single<CopyToResponse> = connection.request("DOM.copyTo", Json.encodeToJsonElement(CopyToRequest.serializer(), input), CopyToResponse.serializer())

    /**
     * Describes node given its id, does not require domain to be enabled. Does not start tracking any
objects, can be used for automation.
     *
     * @link Protocol [DOM#describeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-describeNode) method documentation.
     */
    
    fun describeNode(input: DescribeNodeRequest): io.reactivex.rxjava3.core.Single<DescribeNodeResponse> = connection.request("DOM.describeNode", Json.encodeToJsonElement(DescribeNodeRequest.serializer(), input), DescribeNodeResponse.serializer())

    /**
     * Scrolls the specified rect of the given node into view if not already visible.
Note: exactly one between nodeId, backendNodeId and objectId should be passed
to identify the node.
     *
     * @link Protocol [DOM#scrollIntoViewIfNeeded](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-scrollIntoViewIfNeeded) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun scrollIntoViewIfNeeded(input: ScrollIntoViewIfNeededRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.scrollIntoViewIfNeeded", Json.encodeToJsonElement(ScrollIntoViewIfNeededRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Disables DOM agent for the given page.
     *
     * @link Protocol [DOM#disable](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-disable) method documentation.
     */
    
    fun disable(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.disable", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Discards search results from the session with the given id. `getSearchResults` should no longer
be called for that search.
     *
     * @link Protocol [DOM#discardSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-discardSearchResults) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun discardSearchResults(input: DiscardSearchResultsRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.discardSearchResults", Json.encodeToJsonElement(DiscardSearchResultsRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Enables DOM agent for the given page.
     *
     * @link Protocol [DOM#enable](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-enable) method documentation.
     */
    
    fun enable(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.enable", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Focuses the given element.
     *
     * @link Protocol [DOM#focus](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-focus) method documentation.
     */
    
    fun focus(input: FocusRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.focus", Json.encodeToJsonElement(FocusRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Returns attributes for the specified node.
     *
     * @link Protocol [DOM#getAttributes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getAttributes) method documentation.
     */
    
    fun getAttributes(input: GetAttributesRequest): io.reactivex.rxjava3.core.Single<GetAttributesResponse> = connection.request("DOM.getAttributes", Json.encodeToJsonElement(GetAttributesRequest.serializer(), input), GetAttributesResponse.serializer())

    /**
     * Returns boxes for the given node.
     *
     * @link Protocol [DOM#getBoxModel](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getBoxModel) method documentation.
     */
    
    fun getBoxModel(input: GetBoxModelRequest): io.reactivex.rxjava3.core.Single<GetBoxModelResponse> = connection.request("DOM.getBoxModel", Json.encodeToJsonElement(GetBoxModelRequest.serializer(), input), GetBoxModelResponse.serializer())

    /**
     * Returns quads that describe node position on the page. This method
might return multiple quads for inline nodes.
     *
     * @link Protocol [DOM#getContentQuads](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getContentQuads) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getContentQuads(input: GetContentQuadsRequest): io.reactivex.rxjava3.core.Single<GetContentQuadsResponse> = connection.request("DOM.getContentQuads", Json.encodeToJsonElement(GetContentQuadsRequest.serializer(), input), GetContentQuadsResponse.serializer())

    /**
     * Returns the root DOM node (and optionally the subtree) to the caller.
     *
     * @link Protocol [DOM#getDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getDocument) method documentation.
     */
    
    fun getDocument(input: GetDocumentRequest): io.reactivex.rxjava3.core.Single<GetDocumentResponse> = connection.request("DOM.getDocument", Json.encodeToJsonElement(GetDocumentRequest.serializer(), input), GetDocumentResponse.serializer())

    /**
     * Returns the root DOM node (and optionally the subtree) to the caller.
Deprecated, as it is not designed to work well with the rest of the DOM agent.
Use DOMSnapshot.captureSnapshot instead.
     *
     * @link Protocol [DOM#getFlattenedDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFlattenedDocument) method documentation.
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "getFlattenedDocument is deprecated.")
    fun getFlattenedDocument(input: GetFlattenedDocumentRequest): io.reactivex.rxjava3.core.Single<GetFlattenedDocumentResponse> = connection.request("DOM.getFlattenedDocument", Json.encodeToJsonElement(GetFlattenedDocumentRequest.serializer(), input), GetFlattenedDocumentResponse.serializer())

    /**
     * Finds nodes with a given computed style in a subtree.
     *
     * @link Protocol [DOM#getNodesForSubtreeByStyle](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodesForSubtreeByStyle) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getNodesForSubtreeByStyle(input: GetNodesForSubtreeByStyleRequest): io.reactivex.rxjava3.core.Single<GetNodesForSubtreeByStyleResponse> = connection.request("DOM.getNodesForSubtreeByStyle", Json.encodeToJsonElement(GetNodesForSubtreeByStyleRequest.serializer(), input), GetNodesForSubtreeByStyleResponse.serializer())

    /**
     * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
either returned or not.
     *
     * @link Protocol [DOM#getNodeForLocation](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeForLocation) method documentation.
     */
    
    fun getNodeForLocation(input: GetNodeForLocationRequest): io.reactivex.rxjava3.core.Single<GetNodeForLocationResponse> = connection.request("DOM.getNodeForLocation", Json.encodeToJsonElement(GetNodeForLocationRequest.serializer(), input), GetNodeForLocationResponse.serializer())

    /**
     * Returns node's HTML markup.
     *
     * @link Protocol [DOM#getOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getOuterHTML) method documentation.
     */
    
    fun getOuterHTML(input: GetOuterHTMLRequest): io.reactivex.rxjava3.core.Single<GetOuterHTMLResponse> = connection.request("DOM.getOuterHTML", Json.encodeToJsonElement(GetOuterHTMLRequest.serializer(), input), GetOuterHTMLResponse.serializer())

    /**
     * Returns the id of the nearest ancestor that is a relayout boundary.
     *
     * @link Protocol [DOM#getRelayoutBoundary](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getRelayoutBoundary) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getRelayoutBoundary(input: GetRelayoutBoundaryRequest): io.reactivex.rxjava3.core.Single<GetRelayoutBoundaryResponse> = connection.request("DOM.getRelayoutBoundary", Json.encodeToJsonElement(GetRelayoutBoundaryRequest.serializer(), input), GetRelayoutBoundaryResponse.serializer())

    /**
     * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
identifier.
     *
     * @link Protocol [DOM#getSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getSearchResults) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getSearchResults(input: GetSearchResultsRequest): io.reactivex.rxjava3.core.Single<GetSearchResultsResponse> = connection.request("DOM.getSearchResults", Json.encodeToJsonElement(GetSearchResultsRequest.serializer(), input), GetSearchResultsResponse.serializer())

    /**
     * Hides any highlight.
     *
     * @link Protocol [DOM#hideHighlight](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-hideHighlight) method documentation.
     */
    
    fun hideHighlight(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.hideHighlight", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Highlights DOM node.
     *
     * @link Protocol [DOM#highlightNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-highlightNode) method documentation.
     */
    
    fun highlightNode(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.highlightNode", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Highlights given rectangle.
     *
     * @link Protocol [DOM#highlightRect](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-highlightRect) method documentation.
     */
    
    fun highlightRect(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.highlightRect", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Marks last undoable state.
     *
     * @link Protocol [DOM#markUndoableState](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-markUndoableState) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun markUndoableState(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.markUndoableState", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Moves node into the new container, places it before the given anchor.
     *
     * @link Protocol [DOM#moveTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-moveTo) method documentation.
     */
    
    fun moveTo(input: MoveToRequest): io.reactivex.rxjava3.core.Single<MoveToResponse> = connection.request("DOM.moveTo", Json.encodeToJsonElement(MoveToRequest.serializer(), input), MoveToResponse.serializer())

    /**
     * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
`cancelSearch` to end this search session.
     *
     * @link Protocol [DOM#performSearch](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-performSearch) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun performSearch(input: PerformSearchRequest): io.reactivex.rxjava3.core.Single<PerformSearchResponse> = connection.request("DOM.performSearch", Json.encodeToJsonElement(PerformSearchRequest.serializer(), input), PerformSearchResponse.serializer())

    /**
     * Requests that the node is sent to the caller given its path. // FIXME, use XPath
     *
     * @link Protocol [DOM#pushNodeByPathToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodeByPathToFrontend) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun pushNodeByPathToFrontend(input: PushNodeByPathToFrontendRequest): io.reactivex.rxjava3.core.Single<PushNodeByPathToFrontendResponse> = connection.request("DOM.pushNodeByPathToFrontend", Json.encodeToJsonElement(PushNodeByPathToFrontendRequest.serializer(), input), PushNodeByPathToFrontendResponse.serializer())

    /**
     * Requests that a batch of nodes is sent to the caller given their backend node ids.
     *
     * @link Protocol [DOM#pushNodesByBackendIdsToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodesByBackendIdsToFrontend) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun pushNodesByBackendIdsToFrontend(input: PushNodesByBackendIdsToFrontendRequest): io.reactivex.rxjava3.core.Single<PushNodesByBackendIdsToFrontendResponse> = connection.request("DOM.pushNodesByBackendIdsToFrontend", Json.encodeToJsonElement(PushNodesByBackendIdsToFrontendRequest.serializer(), input), PushNodesByBackendIdsToFrontendResponse.serializer())

    /**
     * Executes `querySelector` on a given node.
     *
     * @link Protocol [DOM#querySelector](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelector) method documentation.
     */
    
    fun querySelector(input: QuerySelectorRequest): io.reactivex.rxjava3.core.Single<QuerySelectorResponse> = connection.request("DOM.querySelector", Json.encodeToJsonElement(QuerySelectorRequest.serializer(), input), QuerySelectorResponse.serializer())

    /**
     * Executes `querySelectorAll` on a given node.
     *
     * @link Protocol [DOM#querySelectorAll](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelectorAll) method documentation.
     */
    
    fun querySelectorAll(input: QuerySelectorAllRequest): io.reactivex.rxjava3.core.Single<QuerySelectorAllResponse> = connection.request("DOM.querySelectorAll", Json.encodeToJsonElement(QuerySelectorAllRequest.serializer(), input), QuerySelectorAllResponse.serializer())

    /**
     * Re-does the last undone action.
     *
     * @link Protocol [DOM#redo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-redo) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun redo(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.redo", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Removes attribute with given name from an element with given id.
     *
     * @link Protocol [DOM#removeAttribute](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeAttribute) method documentation.
     */
    
    fun removeAttribute(input: RemoveAttributeRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.removeAttribute", Json.encodeToJsonElement(RemoveAttributeRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Removes node with given id.
     *
     * @link Protocol [DOM#removeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeNode) method documentation.
     */
    
    fun removeNode(input: RemoveNodeRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.removeNode", Json.encodeToJsonElement(RemoveNodeRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Requests that children of the node with given id are returned to the caller in form of
`setChildNodes` events where not only immediate children are retrieved, but all children down to
the specified depth.
     *
     * @link Protocol [DOM#requestChildNodes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestChildNodes) method documentation.
     */
    
    fun requestChildNodes(input: RequestChildNodesRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.requestChildNodes", Json.encodeToJsonElement(RequestChildNodesRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Requests that the node is sent to the caller given the JavaScript node object reference. All
nodes that form the path from the node to the root are also sent to the client as a series of
`setChildNodes` notifications.
     *
     * @link Protocol [DOM#requestNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestNode) method documentation.
     */
    
    fun requestNode(input: RequestNodeRequest): io.reactivex.rxjava3.core.Single<RequestNodeResponse> = connection.request("DOM.requestNode", Json.encodeToJsonElement(RequestNodeRequest.serializer(), input), RequestNodeResponse.serializer())

    /**
     * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
     *
     * @link Protocol [DOM#resolveNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-resolveNode) method documentation.
     */
    
    fun resolveNode(input: ResolveNodeRequest): io.reactivex.rxjava3.core.Single<ResolveNodeResponse> = connection.request("DOM.resolveNode", Json.encodeToJsonElement(ResolveNodeRequest.serializer(), input), ResolveNodeResponse.serializer())

    /**
     * Sets attribute for an element with given id.
     *
     * @link Protocol [DOM#setAttributeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributeValue) method documentation.
     */
    
    fun setAttributeValue(input: SetAttributeValueRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setAttributeValue", Json.encodeToJsonElement(SetAttributeValueRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Sets attributes on element with given id. This method is useful when user edits some existing
attribute value and types in several attribute name/value pairs.
     *
     * @link Protocol [DOM#setAttributesAsText](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributesAsText) method documentation.
     */
    
    fun setAttributesAsText(input: SetAttributesAsTextRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setAttributesAsText", Json.encodeToJsonElement(SetAttributesAsTextRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Sets files for the given file input element.
     *
     * @link Protocol [DOM#setFileInputFiles](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setFileInputFiles) method documentation.
     */
    
    fun setFileInputFiles(input: SetFileInputFilesRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setFileInputFiles", Json.encodeToJsonElement(SetFileInputFilesRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
     *
     * @link Protocol [DOM#setNodeStackTracesEnabled](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeStackTracesEnabled) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun setNodeStackTracesEnabled(input: SetNodeStackTracesEnabledRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setNodeStackTracesEnabled", Json.encodeToJsonElement(SetNodeStackTracesEnabledRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
     *
     * @link Protocol [DOM#getNodeStackTraces](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeStackTraces) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getNodeStackTraces(input: GetNodeStackTracesRequest): io.reactivex.rxjava3.core.Single<GetNodeStackTracesResponse> = connection.request("DOM.getNodeStackTraces", Json.encodeToJsonElement(GetNodeStackTracesRequest.serializer(), input), GetNodeStackTracesResponse.serializer())

    /**
     * Returns file information for the given
File wrapper.
     *
     * @link Protocol [DOM#getFileInfo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFileInfo) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getFileInfo(input: GetFileInfoRequest): io.reactivex.rxjava3.core.Single<GetFileInfoResponse> = connection.request("DOM.getFileInfo", Json.encodeToJsonElement(GetFileInfoRequest.serializer(), input), GetFileInfoResponse.serializer())

    /**
     * Enables console to refer to the node with given id via $x (see Command Line API for more details
$x functions).
     *
     * @link Protocol [DOM#setInspectedNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setInspectedNode) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun setInspectedNode(input: SetInspectedNodeRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setInspectedNode", Json.encodeToJsonElement(SetInspectedNodeRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Sets node name for a node with given id.
     *
     * @link Protocol [DOM#setNodeName](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeName) method documentation.
     */
    
    fun setNodeName(input: SetNodeNameRequest): io.reactivex.rxjava3.core.Single<SetNodeNameResponse> = connection.request("DOM.setNodeName", Json.encodeToJsonElement(SetNodeNameRequest.serializer(), input), SetNodeNameResponse.serializer())

    /**
     * Sets node value for a node with given id.
     *
     * @link Protocol [DOM#setNodeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeValue) method documentation.
     */
    
    fun setNodeValue(input: SetNodeValueRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setNodeValue", Json.encodeToJsonElement(SetNodeValueRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Sets node HTML markup, returns new node id.
     *
     * @link Protocol [DOM#setOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setOuterHTML) method documentation.
     */
    
    fun setOuterHTML(input: SetOuterHTMLRequest): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.setOuterHTML", Json.encodeToJsonElement(SetOuterHTMLRequest.serializer(), input), pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Undoes the last performed action.
     *
     * @link Protocol [DOM#undo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-undo) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun undo(): io.reactivex.rxjava3.core.Single<pl.wendigo.chrome.protocol.websocket.RequestResponseFrame> = connection.request("DOM.undo", null, pl.wendigo.chrome.protocol.websocket.RequestResponseFrame.serializer())

    /**
     * Returns iframe node that owns iframe with the given domain.
     *
     * @link Protocol [DOM#getFrameOwner](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFrameOwner) method documentation.
     */
    @pl.wendigo.chrome.protocol.Experimental
    fun getFrameOwner(input: GetFrameOwnerRequest): io.reactivex.rxjava3.core.Single<GetFrameOwnerResponse> = connection.request("DOM.getFrameOwner", Json.encodeToJsonElement(GetFrameOwnerRequest.serializer(), input), GetFrameOwnerResponse.serializer())

    /**
     *  Fired when `Element`'s attribute is modified.
     */
    fun attributeModified(): io.reactivex.rxjava3.core.Flowable<AttributeModifiedEvent> = connection.events("DOM.attributeModified", AttributeModifiedEvent.serializer())

    /**
     *  Fired when `Element`'s attribute is removed.
     */
    fun attributeRemoved(): io.reactivex.rxjava3.core.Flowable<AttributeRemovedEvent> = connection.events("DOM.attributeRemoved", AttributeRemovedEvent.serializer())

    /**
     *  Mirrors `DOMCharacterDataModified` event.
     */
    fun characterDataModified(): io.reactivex.rxjava3.core.Flowable<CharacterDataModifiedEvent> = connection.events("DOM.characterDataModified", CharacterDataModifiedEvent.serializer())

    /**
     *  Fired when `Container`'s child node count has changed.
     */
    fun childNodeCountUpdated(): io.reactivex.rxjava3.core.Flowable<ChildNodeCountUpdatedEvent> = connection.events("DOM.childNodeCountUpdated", ChildNodeCountUpdatedEvent.serializer())

    /**
     *  Mirrors `DOMNodeInserted` event.
     */
    fun childNodeInserted(): io.reactivex.rxjava3.core.Flowable<ChildNodeInsertedEvent> = connection.events("DOM.childNodeInserted", ChildNodeInsertedEvent.serializer())

    /**
     *  Mirrors `DOMNodeRemoved` event.
     */
    fun childNodeRemoved(): io.reactivex.rxjava3.core.Flowable<ChildNodeRemovedEvent> = connection.events("DOM.childNodeRemoved", ChildNodeRemovedEvent.serializer())

    /**
     *  Called when distrubution is changed.
     */
    fun distributedNodesUpdated(): io.reactivex.rxjava3.core.Flowable<DistributedNodesUpdatedEvent> = connection.events("DOM.distributedNodesUpdated", DistributedNodesUpdatedEvent.serializer())

    /**
     *  Fired when `Document` has been totally updated. Node ids are no longer valid.
     */
    fun documentUpdated(): io.reactivex.rxjava3.core.Flowable<pl.wendigo.chrome.protocol.RawEvent> = connection.events("DOM.documentUpdated", pl.wendigo.chrome.protocol.RawEvent.serializer())

    /**
     *  Fired when `Element`'s inline style is modified via a CSS property modification.
     */
    fun inlineStyleInvalidated(): io.reactivex.rxjava3.core.Flowable<InlineStyleInvalidatedEvent> = connection.events("DOM.inlineStyleInvalidated", InlineStyleInvalidatedEvent.serializer())

    /**
     *  Called when a pseudo element is added to an element.
     */
    fun pseudoElementAdded(): io.reactivex.rxjava3.core.Flowable<PseudoElementAddedEvent> = connection.events("DOM.pseudoElementAdded", PseudoElementAddedEvent.serializer())

    /**
     *  Called when a pseudo element is removed from an element.
     */
    fun pseudoElementRemoved(): io.reactivex.rxjava3.core.Flowable<PseudoElementRemovedEvent> = connection.events("DOM.pseudoElementRemoved", PseudoElementRemovedEvent.serializer())

    /**
     *  Fired when backend wants to provide client with the missing DOM structure. This happens upon
most of the calls requesting node ids.
     */
    fun setChildNodes(): io.reactivex.rxjava3.core.Flowable<SetChildNodesEvent> = connection.events("DOM.setChildNodes", SetChildNodesEvent.serializer())

    /**
     *  Called when shadow root is popped from the element.
     */
    fun shadowRootPopped(): io.reactivex.rxjava3.core.Flowable<ShadowRootPoppedEvent> = connection.events("DOM.shadowRootPopped", ShadowRootPoppedEvent.serializer())

    /**
     *  Called when shadow root is pushed into the element.
     */
    fun shadowRootPushed(): io.reactivex.rxjava3.core.Flowable<ShadowRootPushedEvent> = connection.events("DOM.shadowRootPushed", ShadowRootPushedEvent.serializer())

    /**
     * Returns list of dependant domains that should be enabled prior to enabling this domain.
     */
    override fun getDependencies(): List<pl.wendigo.chrome.protocol.Domain> {
        return arrayListOf(
            pl.wendigo.chrome.api.runtime.RuntimeDomain(connection),
        )
    }
}

/**
 * Represents request frame that can be used with [DOM#collectClassNamesFromSubtree](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-collectClassNamesFromSubtree) operation call.
 *
 * Collects class names for the node with given id and all of it's child nodes.
 * @link [DOM#collectClassNamesFromSubtree](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-collectClassNamesFromSubtree) method documentation.
 * @see [DOMDomain.collectClassNamesFromSubtree]
 */
@kotlinx.serialization.Serializable
data class CollectClassNamesFromSubtreeRequest(
    /**
     * Id of the node to collect class names.
     */
    val nodeId: NodeId

)

/**
 * Represents response frame that is returned from [DOM#collectClassNamesFromSubtree](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-collectClassNamesFromSubtree) operation call.
 * Collects class names for the node with given id and all of it's child nodes.
 *
  
 * @link [DOM#collectClassNamesFromSubtree](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-collectClassNamesFromSubtree) method documentation.
 * @see [DOMDomain.collectClassNamesFromSubtree]
 */
@kotlinx.serialization.Serializable
data class CollectClassNamesFromSubtreeResponse(
    /**  
     * Class name list.  
     */  
    val classNames: List<String>

)

/**
 * Represents request frame that can be used with [DOM#copyTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-copyTo) operation call.
 *
 * Creates a deep copy of the specified node and places it into the target container before the
given anchor.
 * @link [DOM#copyTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-copyTo) method documentation.
 * @see [DOMDomain.copyTo]
 */
@kotlinx.serialization.Serializable
data class CopyToRequest(
    /**
     * Id of the node to copy.
     */
    val nodeId: NodeId,

    /**
     * Id of the element to drop the copy into.
     */
    val targetNodeId: NodeId,

    /**
     * Drop the copy before this node (if absent, the copy becomes the last child of
`targetNodeId`).
     */
    val insertBeforeNodeId: NodeId? = null

)

/**
 * Represents response frame that is returned from [DOM#copyTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-copyTo) operation call.
 * Creates a deep copy of the specified node and places it into the target container before the
given anchor.
 *
  
 * @link [DOM#copyTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-copyTo) method documentation.
 * @see [DOMDomain.copyTo]
 */
@kotlinx.serialization.Serializable
data class CopyToResponse(
    /**  
     * Id of the node clone.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#describeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-describeNode) operation call.
 *
 * Describes node given its id, does not require domain to be enabled. Does not start tracking any
objects, can be used for automation.
 * @link [DOM#describeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-describeNode) method documentation.
 * @see [DOMDomain.describeNode]
 */
@kotlinx.serialization.Serializable
data class DescribeNodeRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null,

    /**
     * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
entire subtree or provide an integer larger than 0.
     */
    val depth: Int? = null,

    /**
     * Whether or not iframes and shadow roots should be traversed when returning the subtree
(default is false).
     */
    val pierce: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#describeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-describeNode) operation call.
 * Describes node given its id, does not require domain to be enabled. Does not start tracking any
objects, can be used for automation.
 *
  
 * @link [DOM#describeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-describeNode) method documentation.
 * @see [DOMDomain.describeNode]
 */
@kotlinx.serialization.Serializable
data class DescribeNodeResponse(
    /**  
     * Node description.  
     */  
    val node: Node

)

/**
 * Represents request frame that can be used with [DOM#scrollIntoViewIfNeeded](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-scrollIntoViewIfNeeded) operation call.
 *
 * Scrolls the specified rect of the given node into view if not already visible.
Note: exactly one between nodeId, backendNodeId and objectId should be passed
to identify the node.
 * @link [DOM#scrollIntoViewIfNeeded](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-scrollIntoViewIfNeeded) method documentation.
 * @see [DOMDomain.scrollIntoViewIfNeeded]
 */
@kotlinx.serialization.Serializable
data class ScrollIntoViewIfNeededRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null,

    /**
     * The rect to be scrolled into view, relative to the node's border box, in CSS pixels.
When omitted, center of the node will be used, similar to Element.scrollIntoView.
     */
    val rect: Rect? = null

)

/**
 * Represents request frame that can be used with [DOM#discardSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-discardSearchResults) operation call.
 *
 * Discards search results from the session with the given id. `getSearchResults` should no longer
be called for that search.
 * @link [DOM#discardSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-discardSearchResults) method documentation.
 * @see [DOMDomain.discardSearchResults]
 */
@kotlinx.serialization.Serializable
data class DiscardSearchResultsRequest(
    /**
     * Unique search session identifier.
     */
    val searchId: String

)

/**
 * Represents request frame that can be used with [DOM#focus](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-focus) operation call.
 *
 * Focuses the given element.
 * @link [DOM#focus](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-focus) method documentation.
 * @see [DOMDomain.focus]
 */
@kotlinx.serialization.Serializable
data class FocusRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null

)

/**
 * Represents request frame that can be used with [DOM#getAttributes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getAttributes) operation call.
 *
 * Returns attributes for the specified node.
 * @link [DOM#getAttributes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getAttributes) method documentation.
 * @see [DOMDomain.getAttributes]
 */
@kotlinx.serialization.Serializable
data class GetAttributesRequest(
    /**
     * Id of the node to retrieve attibutes for.
     */
    val nodeId: NodeId

)

/**
 * Represents response frame that is returned from [DOM#getAttributes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getAttributes) operation call.
 * Returns attributes for the specified node.
 *
  
 * @link [DOM#getAttributes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getAttributes) method documentation.
 * @see [DOMDomain.getAttributes]
 */
@kotlinx.serialization.Serializable
data class GetAttributesResponse(
    /**  
     * An interleaved array of node attribute names and values.  
     */  
    val attributes: List<String>

)

/**
 * Represents request frame that can be used with [DOM#getBoxModel](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getBoxModel) operation call.
 *
 * Returns boxes for the given node.
 * @link [DOM#getBoxModel](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getBoxModel) method documentation.
 * @see [DOMDomain.getBoxModel]
 */
@kotlinx.serialization.Serializable
data class GetBoxModelRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null

)

/**
 * Represents response frame that is returned from [DOM#getBoxModel](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getBoxModel) operation call.
 * Returns boxes for the given node.
 *
  
 * @link [DOM#getBoxModel](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getBoxModel) method documentation.
 * @see [DOMDomain.getBoxModel]
 */
@kotlinx.serialization.Serializable
data class GetBoxModelResponse(
    /**  
     * Box model for the node.  
     */  
    val model: BoxModel

)

/**
 * Represents request frame that can be used with [DOM#getContentQuads](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getContentQuads) operation call.
 *
 * Returns quads that describe node position on the page. This method
might return multiple quads for inline nodes.
 * @link [DOM#getContentQuads](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getContentQuads) method documentation.
 * @see [DOMDomain.getContentQuads]
 */
@kotlinx.serialization.Serializable
data class GetContentQuadsRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null

)

/**
 * Represents response frame that is returned from [DOM#getContentQuads](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getContentQuads) operation call.
 * Returns quads that describe node position on the page. This method
might return multiple quads for inline nodes.
 *
  
 * @link [DOM#getContentQuads](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getContentQuads) method documentation.
 * @see [DOMDomain.getContentQuads]
 */
@kotlinx.serialization.Serializable
data class GetContentQuadsResponse(
    /**  
     * Quads that describe node layout relative to viewport.  
     */  
    val quads: List<Quad>

)

/**
 * Represents request frame that can be used with [DOM#getDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getDocument) operation call.
 *
 * Returns the root DOM node (and optionally the subtree) to the caller.
 * @link [DOM#getDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getDocument) method documentation.
 * @see [DOMDomain.getDocument]
 */
@kotlinx.serialization.Serializable
data class GetDocumentRequest(
    /**
     * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
entire subtree or provide an integer larger than 0.
     */
    val depth: Int? = null,

    /**
     * Whether or not iframes and shadow roots should be traversed when returning the subtree
(default is false).
     */
    val pierce: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#getDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getDocument) operation call.
 * Returns the root DOM node (and optionally the subtree) to the caller.
 *
  
 * @link [DOM#getDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getDocument) method documentation.
 * @see [DOMDomain.getDocument]
 */
@kotlinx.serialization.Serializable
data class GetDocumentResponse(
    /**  
     * Resulting node.  
     */  
    val root: Node

)

/**
 * Represents request frame that can be used with [DOM#getFlattenedDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFlattenedDocument) operation call.
 *
 * Returns the root DOM node (and optionally the subtree) to the caller.
Deprecated, as it is not designed to work well with the rest of the DOM agent.
Use DOMSnapshot.captureSnapshot instead.
 * @link [DOM#getFlattenedDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFlattenedDocument) method documentation.
 * @see [DOMDomain.getFlattenedDocument]
 */
@kotlinx.serialization.Serializable
data class GetFlattenedDocumentRequest(
    /**
     * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
entire subtree or provide an integer larger than 0.
     */
    val depth: Int? = null,

    /**
     * Whether or not iframes and shadow roots should be traversed when returning the subtree
(default is false).
     */
    val pierce: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#getFlattenedDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFlattenedDocument) operation call.
 * Returns the root DOM node (and optionally the subtree) to the caller.
Deprecated, as it is not designed to work well with the rest of the DOM agent.
Use DOMSnapshot.captureSnapshot instead.
 *
  
 * @link [DOM#getFlattenedDocument](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFlattenedDocument) method documentation.
 * @see [DOMDomain.getFlattenedDocument]
 */
@kotlinx.serialization.Serializable
data class GetFlattenedDocumentResponse(
    /**  
     * Resulting node.  
     */  
    val nodes: List<Node>

)

/**
 * Represents request frame that can be used with [DOM#getNodesForSubtreeByStyle](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodesForSubtreeByStyle) operation call.
 *
 * Finds nodes with a given computed style in a subtree.
 * @link [DOM#getNodesForSubtreeByStyle](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodesForSubtreeByStyle) method documentation.
 * @see [DOMDomain.getNodesForSubtreeByStyle]
 */
@kotlinx.serialization.Serializable
data class GetNodesForSubtreeByStyleRequest(
    /**
     * Node ID pointing to the root of a subtree.
     */
    val nodeId: NodeId,

    /**
     * The style to filter nodes by (includes nodes if any of properties matches).
     */
    val computedStyles: List<CSSComputedStyleProperty>,

    /**
     * Whether or not iframes and shadow roots in the same target should be traversed when returning the
results (default is false).
     */
    val pierce: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#getNodesForSubtreeByStyle](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodesForSubtreeByStyle) operation call.
 * Finds nodes with a given computed style in a subtree.
 *
  
 * @link [DOM#getNodesForSubtreeByStyle](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodesForSubtreeByStyle) method documentation.
 * @see [DOMDomain.getNodesForSubtreeByStyle]
 */
@kotlinx.serialization.Serializable
data class GetNodesForSubtreeByStyleResponse(
    /**  
     * Resulting nodes.  
     */  
    val nodeIds: List<NodeId>

)

/**
 * Represents request frame that can be used with [DOM#getNodeForLocation](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeForLocation) operation call.
 *
 * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
either returned or not.
 * @link [DOM#getNodeForLocation](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeForLocation) method documentation.
 * @see [DOMDomain.getNodeForLocation]
 */
@kotlinx.serialization.Serializable
data class GetNodeForLocationRequest(
    /**
     * X coordinate.
     */
    val x: Int,

    /**
     * Y coordinate.
     */
    val y: Int,

    /**
     * False to skip to the nearest non-UA shadow root ancestor (default: false).
     */
    val includeUserAgentShadowDOM: Boolean? = null,

    /**
     * Whether to ignore pointer-events: none on elements and hit test them.
     */
    val ignorePointerEventsNone: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#getNodeForLocation](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeForLocation) operation call.
 * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
either returned or not.
 *
  
 * @link [DOM#getNodeForLocation](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeForLocation) method documentation.
 * @see [DOMDomain.getNodeForLocation]
 */
@kotlinx.serialization.Serializable
data class GetNodeForLocationResponse(
    /**  
     * Resulting node.  
     */  
    val backendNodeId: BackendNodeId,

    /**  
     * Frame this node belongs to.  
     */  
    val frameId: pl.wendigo.chrome.api.page.FrameId,

    /**  
     * Id of the node at given coordinates, only when enabled and requested document.  
     */  
    val nodeId: NodeId? = null

)

/**
 * Represents request frame that can be used with [DOM#getOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getOuterHTML) operation call.
 *
 * Returns node's HTML markup.
 * @link [DOM#getOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getOuterHTML) method documentation.
 * @see [DOMDomain.getOuterHTML]
 */
@kotlinx.serialization.Serializable
data class GetOuterHTMLRequest(
    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null

)

/**
 * Represents response frame that is returned from [DOM#getOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getOuterHTML) operation call.
 * Returns node's HTML markup.
 *
  
 * @link [DOM#getOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getOuterHTML) method documentation.
 * @see [DOMDomain.getOuterHTML]
 */
@kotlinx.serialization.Serializable
data class GetOuterHTMLResponse(
    /**  
     * Outer HTML markup.  
     */  
    val outerHTML: String

)

/**
 * Represents request frame that can be used with [DOM#getRelayoutBoundary](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getRelayoutBoundary) operation call.
 *
 * Returns the id of the nearest ancestor that is a relayout boundary.
 * @link [DOM#getRelayoutBoundary](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getRelayoutBoundary) method documentation.
 * @see [DOMDomain.getRelayoutBoundary]
 */
@kotlinx.serialization.Serializable
data class GetRelayoutBoundaryRequest(
    /**
     * Id of the node.
     */
    val nodeId: NodeId

)

/**
 * Represents response frame that is returned from [DOM#getRelayoutBoundary](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getRelayoutBoundary) operation call.
 * Returns the id of the nearest ancestor that is a relayout boundary.
 *
  
 * @link [DOM#getRelayoutBoundary](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getRelayoutBoundary) method documentation.
 * @see [DOMDomain.getRelayoutBoundary]
 */
@kotlinx.serialization.Serializable
data class GetRelayoutBoundaryResponse(
    /**  
     * Relayout boundary node id for the given node.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#getSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getSearchResults) operation call.
 *
 * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
identifier.
 * @link [DOM#getSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getSearchResults) method documentation.
 * @see [DOMDomain.getSearchResults]
 */
@kotlinx.serialization.Serializable
data class GetSearchResultsRequest(
    /**
     * Unique search session identifier.
     */
    val searchId: String,

    /**
     * Start index of the search result to be returned.
     */
    val fromIndex: Int,

    /**
     * End index of the search result to be returned.
     */
    val toIndex: Int

)

/**
 * Represents response frame that is returned from [DOM#getSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getSearchResults) operation call.
 * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
identifier.
 *
  
 * @link [DOM#getSearchResults](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getSearchResults) method documentation.
 * @see [DOMDomain.getSearchResults]
 */
@kotlinx.serialization.Serializable
data class GetSearchResultsResponse(
    /**  
     * Ids of the search result nodes.  
     */  
    val nodeIds: List<NodeId>

)

/**
 * Represents request frame that can be used with [DOM#moveTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-moveTo) operation call.
 *
 * Moves node into the new container, places it before the given anchor.
 * @link [DOM#moveTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-moveTo) method documentation.
 * @see [DOMDomain.moveTo]
 */
@kotlinx.serialization.Serializable
data class MoveToRequest(
    /**
     * Id of the node to move.
     */
    val nodeId: NodeId,

    /**
     * Id of the element to drop the moved node into.
     */
    val targetNodeId: NodeId,

    /**
     * Drop node before this one (if absent, the moved node becomes the last child of
`targetNodeId`).
     */
    val insertBeforeNodeId: NodeId? = null

)

/**
 * Represents response frame that is returned from [DOM#moveTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-moveTo) operation call.
 * Moves node into the new container, places it before the given anchor.
 *
  
 * @link [DOM#moveTo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-moveTo) method documentation.
 * @see [DOMDomain.moveTo]
 */
@kotlinx.serialization.Serializable
data class MoveToResponse(
    /**  
     * New id of the moved node.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#performSearch](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-performSearch) operation call.
 *
 * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
`cancelSearch` to end this search session.
 * @link [DOM#performSearch](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-performSearch) method documentation.
 * @see [DOMDomain.performSearch]
 */
@kotlinx.serialization.Serializable
data class PerformSearchRequest(
    /**
     * Plain text or query selector or XPath search query.
     */
    val query: String,

    /**
     * True to search in user agent shadow DOM.
     */
    val includeUserAgentShadowDOM: Boolean? = null

)

/**
 * Represents response frame that is returned from [DOM#performSearch](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-performSearch) operation call.
 * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
`cancelSearch` to end this search session.
 *
  
 * @link [DOM#performSearch](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-performSearch) method documentation.
 * @see [DOMDomain.performSearch]
 */
@kotlinx.serialization.Serializable
data class PerformSearchResponse(
    /**  
     * Unique search session identifier.  
     */  
    val searchId: String,

    /**  
     * Number of search results.  
     */  
    val resultCount: Int

)

/**
 * Represents request frame that can be used with [DOM#pushNodeByPathToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodeByPathToFrontend) operation call.
 *
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 * @link [DOM#pushNodeByPathToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodeByPathToFrontend) method documentation.
 * @see [DOMDomain.pushNodeByPathToFrontend]
 */
@kotlinx.serialization.Serializable
data class PushNodeByPathToFrontendRequest(
    /**
     * Path to node in the proprietary format.
     */
    val path: String

)

/**
 * Represents response frame that is returned from [DOM#pushNodeByPathToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodeByPathToFrontend) operation call.
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 *
  
 * @link [DOM#pushNodeByPathToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodeByPathToFrontend) method documentation.
 * @see [DOMDomain.pushNodeByPathToFrontend]
 */
@kotlinx.serialization.Serializable
data class PushNodeByPathToFrontendResponse(
    /**  
     * Id of the node for given path.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#pushNodesByBackendIdsToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodesByBackendIdsToFrontend) operation call.
 *
 * Requests that a batch of nodes is sent to the caller given their backend node ids.
 * @link [DOM#pushNodesByBackendIdsToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodesByBackendIdsToFrontend) method documentation.
 * @see [DOMDomain.pushNodesByBackendIdsToFrontend]
 */
@kotlinx.serialization.Serializable
data class PushNodesByBackendIdsToFrontendRequest(
    /**
     * The array of backend node ids.
     */
    val backendNodeIds: List<BackendNodeId>

)

/**
 * Represents response frame that is returned from [DOM#pushNodesByBackendIdsToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodesByBackendIdsToFrontend) operation call.
 * Requests that a batch of nodes is sent to the caller given their backend node ids.
 *
  
 * @link [DOM#pushNodesByBackendIdsToFrontend](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-pushNodesByBackendIdsToFrontend) method documentation.
 * @see [DOMDomain.pushNodesByBackendIdsToFrontend]
 */
@kotlinx.serialization.Serializable
data class PushNodesByBackendIdsToFrontendResponse(
    /**  
     * The array of ids of pushed nodes that correspond to the backend ids specified in  
     backendNodeIds.  
     */  
    val nodeIds: List<NodeId>

)

/**
 * Represents request frame that can be used with [DOM#querySelector](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelector) operation call.
 *
 * Executes `querySelector` on a given node.
 * @link [DOM#querySelector](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelector) method documentation.
 * @see [DOMDomain.querySelector]
 */
@kotlinx.serialization.Serializable
data class QuerySelectorRequest(
    /**
     * Id of the node to query upon.
     */
    val nodeId: NodeId,

    /**
     * Selector string.
     */
    val selector: String

)

/**
 * Represents response frame that is returned from [DOM#querySelector](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelector) operation call.
 * Executes `querySelector` on a given node.
 *
  
 * @link [DOM#querySelector](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelector) method documentation.
 * @see [DOMDomain.querySelector]
 */
@kotlinx.serialization.Serializable
data class QuerySelectorResponse(
    /**  
     * Query selector result.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#querySelectorAll](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelectorAll) operation call.
 *
 * Executes `querySelectorAll` on a given node.
 * @link [DOM#querySelectorAll](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelectorAll) method documentation.
 * @see [DOMDomain.querySelectorAll]
 */
@kotlinx.serialization.Serializable
data class QuerySelectorAllRequest(
    /**
     * Id of the node to query upon.
     */
    val nodeId: NodeId,

    /**
     * Selector string.
     */
    val selector: String

)

/**
 * Represents response frame that is returned from [DOM#querySelectorAll](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelectorAll) operation call.
 * Executes `querySelectorAll` on a given node.
 *
  
 * @link [DOM#querySelectorAll](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-querySelectorAll) method documentation.
 * @see [DOMDomain.querySelectorAll]
 */
@kotlinx.serialization.Serializable
data class QuerySelectorAllResponse(
    /**  
     * Query selector result.  
     */  
    val nodeIds: List<NodeId>

)

/**
 * Represents request frame that can be used with [DOM#removeAttribute](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeAttribute) operation call.
 *
 * Removes attribute with given name from an element with given id.
 * @link [DOM#removeAttribute](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeAttribute) method documentation.
 * @see [DOMDomain.removeAttribute]
 */
@kotlinx.serialization.Serializable
data class RemoveAttributeRequest(
    /**
     * Id of the element to remove attribute from.
     */
    val nodeId: NodeId,

    /**
     * Name of the attribute to remove.
     */
    val name: String

)

/**
 * Represents request frame that can be used with [DOM#removeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeNode) operation call.
 *
 * Removes node with given id.
 * @link [DOM#removeNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-removeNode) method documentation.
 * @see [DOMDomain.removeNode]
 */
@kotlinx.serialization.Serializable
data class RemoveNodeRequest(
    /**
     * Id of the node to remove.
     */
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#requestChildNodes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestChildNodes) operation call.
 *
 * Requests that children of the node with given id are returned to the caller in form of
`setChildNodes` events where not only immediate children are retrieved, but all children down to
the specified depth.
 * @link [DOM#requestChildNodes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestChildNodes) method documentation.
 * @see [DOMDomain.requestChildNodes]
 */
@kotlinx.serialization.Serializable
data class RequestChildNodesRequest(
    /**
     * Id of the node to get children for.
     */
    val nodeId: NodeId,

    /**
     * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
entire subtree or provide an integer larger than 0.
     */
    val depth: Int? = null,

    /**
     * Whether or not iframes and shadow roots should be traversed when returning the sub-tree
(default is false).
     */
    val pierce: Boolean? = null

)

/**
 * Represents request frame that can be used with [DOM#requestNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestNode) operation call.
 *
 * Requests that the node is sent to the caller given the JavaScript node object reference. All
nodes that form the path from the node to the root are also sent to the client as a series of
`setChildNodes` notifications.
 * @link [DOM#requestNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestNode) method documentation.
 * @see [DOMDomain.requestNode]
 */
@kotlinx.serialization.Serializable
data class RequestNodeRequest(
    /**
     * JavaScript object id to convert into node.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId

)

/**
 * Represents response frame that is returned from [DOM#requestNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestNode) operation call.
 * Requests that the node is sent to the caller given the JavaScript node object reference. All
nodes that form the path from the node to the root are also sent to the client as a series of
`setChildNodes` notifications.
 *
  
 * @link [DOM#requestNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-requestNode) method documentation.
 * @see [DOMDomain.requestNode]
 */
@kotlinx.serialization.Serializable
data class RequestNodeResponse(
    /**  
     * Node id for given object.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#resolveNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-resolveNode) operation call.
 *
 * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
 * @link [DOM#resolveNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-resolveNode) method documentation.
 * @see [DOMDomain.resolveNode]
 */
@kotlinx.serialization.Serializable
data class ResolveNodeRequest(
    /**
     * Id of the node to resolve.
     */
    val nodeId: NodeId? = null,

    /**
     * Backend identifier of the node to resolve.
     */
    val backendNodeId: pl.wendigo.chrome.api.dom.BackendNodeId? = null,

    /**
     * Symbolic group name that can be used to release multiple objects.
     */
    val objectGroup: String? = null,

    /**
     * Execution context in which to resolve the node.
     */
    val executionContextId: pl.wendigo.chrome.api.runtime.ExecutionContextId? = null

)

/**
 * Represents response frame that is returned from [DOM#resolveNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-resolveNode) operation call.
 * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
 *
  
 * @link [DOM#resolveNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-resolveNode) method documentation.
 * @see [DOMDomain.resolveNode]
 */
@kotlinx.serialization.Serializable
data class ResolveNodeResponse(
    /**  
     * JavaScript object wrapper for given node.  
     */  
    @kotlinx.serialization.SerialName("object") val _object: pl.wendigo.chrome.api.runtime.RemoteObject

)

/**
 * Represents request frame that can be used with [DOM#setAttributeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributeValue) operation call.
 *
 * Sets attribute for an element with given id.
 * @link [DOM#setAttributeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributeValue) method documentation.
 * @see [DOMDomain.setAttributeValue]
 */
@kotlinx.serialization.Serializable
data class SetAttributeValueRequest(
    /**
     * Id of the element to set attribute for.
     */
    val nodeId: NodeId,

    /**
     * Attribute name.
     */
    val name: String,

    /**
     * Attribute value.
     */
    val value: String

)

/**
 * Represents request frame that can be used with [DOM#setAttributesAsText](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributesAsText) operation call.
 *
 * Sets attributes on element with given id. This method is useful when user edits some existing
attribute value and types in several attribute name/value pairs.
 * @link [DOM#setAttributesAsText](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setAttributesAsText) method documentation.
 * @see [DOMDomain.setAttributesAsText]
 */
@kotlinx.serialization.Serializable
data class SetAttributesAsTextRequest(
    /**
     * Id of the element to set attributes for.
     */
    val nodeId: NodeId,

    /**
     * Text with a number of attributes. Will parse this text using HTML parser.
     */
    val text: String,

    /**
     * Attribute name to replace with new attributes derived from text in case text parsed
successfully.
     */
    val name: String? = null

)

/**
 * Represents request frame that can be used with [DOM#setFileInputFiles](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setFileInputFiles) operation call.
 *
 * Sets files for the given file input element.
 * @link [DOM#setFileInputFiles](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setFileInputFiles) method documentation.
 * @see [DOMDomain.setFileInputFiles]
 */
@kotlinx.serialization.Serializable
data class SetFileInputFilesRequest(
    /**
     * Array of file paths to set.
     */
    val files: List<String>,

    /**
     * Identifier of the node.
     */
    val nodeId: NodeId? = null,

    /**
     * Identifier of the backend node.
     */
    val backendNodeId: BackendNodeId? = null,

    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId? = null

)

/**
 * Represents request frame that can be used with [DOM#setNodeStackTracesEnabled](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeStackTracesEnabled) operation call.
 *
 * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
 * @link [DOM#setNodeStackTracesEnabled](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeStackTracesEnabled) method documentation.
 * @see [DOMDomain.setNodeStackTracesEnabled]
 */
@kotlinx.serialization.Serializable
data class SetNodeStackTracesEnabledRequest(
    /**
     * Enable or disable.
     */
    val enable: Boolean

)

/**
 * Represents request frame that can be used with [DOM#getNodeStackTraces](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeStackTraces) operation call.
 *
 * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
 * @link [DOM#getNodeStackTraces](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeStackTraces) method documentation.
 * @see [DOMDomain.getNodeStackTraces]
 */
@kotlinx.serialization.Serializable
data class GetNodeStackTracesRequest(
    /**
     * Id of the node to get stack traces for.
     */
    val nodeId: NodeId

)

/**
 * Represents response frame that is returned from [DOM#getNodeStackTraces](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeStackTraces) operation call.
 * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
 *
  
 * @link [DOM#getNodeStackTraces](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getNodeStackTraces) method documentation.
 * @see [DOMDomain.getNodeStackTraces]
 */
@kotlinx.serialization.Serializable
data class GetNodeStackTracesResponse(
    /**  
     * Creation stack trace, if available.  
     */  
    val creation: pl.wendigo.chrome.api.runtime.StackTrace? = null

)

/**
 * Represents request frame that can be used with [DOM#getFileInfo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFileInfo) operation call.
 *
 * Returns file information for the given
File wrapper.
 * @link [DOM#getFileInfo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFileInfo) method documentation.
 * @see [DOMDomain.getFileInfo]
 */
@kotlinx.serialization.Serializable
data class GetFileInfoRequest(
    /**
     * JavaScript object id of the node wrapper.
     */
    val objectId: pl.wendigo.chrome.api.runtime.RemoteObjectId

)

/**
 * Represents response frame that is returned from [DOM#getFileInfo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFileInfo) operation call.
 * Returns file information for the given
File wrapper.
 *
  
 * @link [DOM#getFileInfo](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFileInfo) method documentation.
 * @see [DOMDomain.getFileInfo]
 */
@kotlinx.serialization.Serializable
data class GetFileInfoResponse(
    /**  
     *  
     */  
    val path: String

)

/**
 * Represents request frame that can be used with [DOM#setInspectedNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setInspectedNode) operation call.
 *
 * Enables console to refer to the node with given id via $x (see Command Line API for more details
$x functions).
 * @link [DOM#setInspectedNode](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setInspectedNode) method documentation.
 * @see [DOMDomain.setInspectedNode]
 */
@kotlinx.serialization.Serializable
data class SetInspectedNodeRequest(
    /**
     * DOM node id to be accessible by means of $x command line API.
     */
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#setNodeName](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeName) operation call.
 *
 * Sets node name for a node with given id.
 * @link [DOM#setNodeName](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeName) method documentation.
 * @see [DOMDomain.setNodeName]
 */
@kotlinx.serialization.Serializable
data class SetNodeNameRequest(
    /**
     * Id of the node to set name for.
     */
    val nodeId: NodeId,

    /**
     * New node's name.
     */
    val name: String

)

/**
 * Represents response frame that is returned from [DOM#setNodeName](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeName) operation call.
 * Sets node name for a node with given id.
 *
  
 * @link [DOM#setNodeName](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeName) method documentation.
 * @see [DOMDomain.setNodeName]
 */
@kotlinx.serialization.Serializable
data class SetNodeNameResponse(
    /**  
     * New node's id.  
     */  
    val nodeId: NodeId

)

/**
 * Represents request frame that can be used with [DOM#setNodeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeValue) operation call.
 *
 * Sets node value for a node with given id.
 * @link [DOM#setNodeValue](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setNodeValue) method documentation.
 * @see [DOMDomain.setNodeValue]
 */
@kotlinx.serialization.Serializable
data class SetNodeValueRequest(
    /**
     * Id of the node to set value for.
     */
    val nodeId: NodeId,

    /**
     * New node's value.
     */
    val value: String

)

/**
 * Represents request frame that can be used with [DOM#setOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setOuterHTML) operation call.
 *
 * Sets node HTML markup, returns new node id.
 * @link [DOM#setOuterHTML](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-setOuterHTML) method documentation.
 * @see [DOMDomain.setOuterHTML]
 */
@kotlinx.serialization.Serializable
data class SetOuterHTMLRequest(
    /**
     * Id of the node to set markup for.
     */
    val nodeId: NodeId,

    /**
     * Outer HTML markup to set.
     */
    val outerHTML: String

)

/**
 * Represents request frame that can be used with [DOM#getFrameOwner](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFrameOwner) operation call.
 *
 * Returns iframe node that owns iframe with the given domain.
 * @link [DOM#getFrameOwner](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFrameOwner) method documentation.
 * @see [DOMDomain.getFrameOwner]
 */
@kotlinx.serialization.Serializable
data class GetFrameOwnerRequest(
    /**
     *
     */
    val frameId: pl.wendigo.chrome.api.page.FrameId

)

/**
 * Represents response frame that is returned from [DOM#getFrameOwner](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFrameOwner) operation call.
 * Returns iframe node that owns iframe with the given domain.
 *
  
 * @link [DOM#getFrameOwner](https://chromedevtools.github.io/devtools-protocol/tot/DOM#method-getFrameOwner) method documentation.
 * @see [DOMDomain.getFrameOwner]
 */
@kotlinx.serialization.Serializable
data class GetFrameOwnerResponse(
    /**  
     * Resulting node.  
     */  
    val backendNodeId: BackendNodeId,

    /**  
     * Id of the node at given coordinates, only when enabled and requested document.  
     */  
    val nodeId: NodeId? = null

)

/**
 * Fired when `Element`'s attribute is modified.
 *
 * @link [DOM#attributeModified](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-attributeModified) event documentation.
 */
@kotlinx.serialization.Serializable
data class AttributeModifiedEvent(
    /**  
     * Id of the node that has changed.  
     */  
    val nodeId: NodeId,

    /**  
     * Attribute name.  
     */  
    val name: String,

    /**  
     * Attribute value.  
     */  
    val value: String

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "attributeModified"
} 

/**
 * Fired when `Element`'s attribute is removed.
 *
 * @link [DOM#attributeRemoved](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-attributeRemoved) event documentation.
 */
@kotlinx.serialization.Serializable
data class AttributeRemovedEvent(
    /**  
     * Id of the node that has changed.  
     */  
    val nodeId: NodeId,

    /**  
     * A ttribute name.  
     */  
    val name: String

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "attributeRemoved"
} 

/**
 * Mirrors `DOMCharacterDataModified` event.
 *
 * @link [DOM#characterDataModified](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-characterDataModified) event documentation.
 */
@kotlinx.serialization.Serializable
data class CharacterDataModifiedEvent(
    /**  
     * Id of the node that has changed.  
     */  
    val nodeId: NodeId,

    /**  
     * New text value.  
     */  
    val characterData: String

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "characterDataModified"
} 

/**
 * Fired when `Container`'s child node count has changed.
 *
 * @link [DOM#childNodeCountUpdated](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-childNodeCountUpdated) event documentation.
 */
@kotlinx.serialization.Serializable
data class ChildNodeCountUpdatedEvent(
    /**  
     * Id of the node that has changed.  
     */  
    val nodeId: NodeId,

    /**  
     * New node count.  
     */  
    val childNodeCount: Int

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "childNodeCountUpdated"
} 

/**
 * Mirrors `DOMNodeInserted` event.
 *
 * @link [DOM#childNodeInserted](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-childNodeInserted) event documentation.
 */
@kotlinx.serialization.Serializable
data class ChildNodeInsertedEvent(
    /**  
     * Id of the node that has changed.  
     */  
    val parentNodeId: NodeId,

    /**  
     * If of the previous siblint.  
     */  
    val previousNodeId: NodeId,

    /**  
     * Inserted node data.  
     */  
    val node: Node

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "childNodeInserted"
} 

/**
 * Mirrors `DOMNodeRemoved` event.
 *
 * @link [DOM#childNodeRemoved](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-childNodeRemoved) event documentation.
 */
@kotlinx.serialization.Serializable
data class ChildNodeRemovedEvent(
    /**  
     * Parent id.  
     */  
    val parentNodeId: NodeId,

    /**  
     * Id of the node that has been removed.  
     */  
    val nodeId: NodeId

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "childNodeRemoved"
} 

/**
 * Called when distrubution is changed.
 *
 * @link [DOM#distributedNodesUpdated](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-distributedNodesUpdated) event documentation.
 */
@kotlinx.serialization.Serializable
data class DistributedNodesUpdatedEvent(
    /**  
     * Insertion point where distrubuted nodes were updated.  
     */  
    val insertionPointId: NodeId,

    /**  
     * Distributed nodes for given insertion point.  
     */  
    val distributedNodes: List<BackendNode>

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "distributedNodesUpdated"
} 

/**
 * Fired when `Element`'s inline style is modified via a CSS property modification.
 *
 * @link [DOM#inlineStyleInvalidated](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-inlineStyleInvalidated) event documentation.
 */
@kotlinx.serialization.Serializable
data class InlineStyleInvalidatedEvent(
    /**  
     * Ids of the nodes for which the inline styles have been invalidated.  
     */  
    val nodeIds: List<NodeId>

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "inlineStyleInvalidated"
} 

/**
 * Called when a pseudo element is added to an element.
 *
 * @link [DOM#pseudoElementAdded](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-pseudoElementAdded) event documentation.
 */
@kotlinx.serialization.Serializable
data class PseudoElementAddedEvent(
    /**  
     * Pseudo element's parent element id.  
     */  
    val parentId: NodeId,

    /**  
     * The added pseudo element.  
     */  
    val pseudoElement: Node

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "pseudoElementAdded"
} 

/**
 * Called when a pseudo element is removed from an element.
 *
 * @link [DOM#pseudoElementRemoved](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-pseudoElementRemoved) event documentation.
 */
@kotlinx.serialization.Serializable
data class PseudoElementRemovedEvent(
    /**  
     * Pseudo element's parent element id.  
     */  
    val parentId: NodeId,

    /**  
     * The removed pseudo element id.  
     */  
    val pseudoElementId: NodeId

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "pseudoElementRemoved"
} 

/**
 * Fired when backend wants to provide client with the missing DOM structure. This happens upon
most of the calls requesting node ids.
 *
 * @link [DOM#setChildNodes](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-setChildNodes) event documentation.
 */
@kotlinx.serialization.Serializable
data class SetChildNodesEvent(
    /**  
     * Parent node id to populate with children.  
     */  
    val parentId: NodeId,

    /**  
     * Child nodes array.  
     */  
    val nodes: List<Node>

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "setChildNodes"
} 

/**
 * Called when shadow root is popped from the element.
 *
 * @link [DOM#shadowRootPopped](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-shadowRootPopped) event documentation.
 */
@kotlinx.serialization.Serializable
data class ShadowRootPoppedEvent(
    /**  
     * Host element id.  
     */  
    val hostId: NodeId,

    /**  
     * Shadow root id.  
     */  
    val rootId: NodeId

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "shadowRootPopped"
} 

/**
 * Called when shadow root is pushed into the element.
 *
 * @link [DOM#shadowRootPushed](https://chromedevtools.github.io/devtools-protocol/tot/DOM#event-shadowRootPushed) event documentation.
 */
@kotlinx.serialization.Serializable
data class ShadowRootPushedEvent(
    /**  
     * Host element id.  
     */  
    val hostId: NodeId,

    /**  
     * Shadow root.  
     */  
    val root: Node

) : pl.wendigo.chrome.protocol.Event {
    override fun domain() = "DOM" 
    override fun eventName() = "shadowRootPushed"
} 
