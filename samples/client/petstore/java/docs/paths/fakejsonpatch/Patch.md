# Patch

public class Patch

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Patch1](#patch1)<br>The class that has a patch method to call the endpoint |
| static class | [PatchRequest](#patchrequest)<br>The request inputs class |
| static class | [PatchRequestBuilder](#patchrequestbuilder)<br>A builder for the request input class |

## Patch1
public static class Patch1 extends ApiClient.ApiClient1 implements PatchOperation<br>

a class that allows one to call the endpoint using a method named patch

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Patch1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/fakejsonpatch/patch/Responses.md#endpointresponse) | patch([PatchRequest](#patchrequest) request) |

## PatchRequest
public static class PatchRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/fakejsonpatch/patch/RequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PatchRequestBuilder
public static class PatchRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatchRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PatchRequest](#patchrequest) | build()<br>Returns the request input used to call an endpoint method |
| [PatchRequestBuilder](#patchrequestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/fakejsonpatch/patch/RequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [PatchRequestBuilder](#patchrequestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [PatchRequestBuilder](#patchrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
