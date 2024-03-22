# Post

public class Post

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Post1](#post1)<br>The class that has a post method to call the endpoint |
| static class | [PostRequest](#postrequest)<br>The final request inputs class |
| static class | [PostNullableRequest](#postnullablerequest)<br>The initial request inputs class |
| static class | [Post0RequestBuilder](#post0requestbuilder)<br>A builder for the request input class |
| static class | [PostRequestBuilder](#postrequestbuilder)<br>A builder for the request input class |

## Post1
public static class Post1 extends ApiClient.ApiClient1 implements PostOperation<br>

a class that allows one to call the endpoint using a method named post

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/user/post/Responses.md#endpointresponse) | post([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.SealedRequestBody](../../paths/user/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional |

## PostNullableRequest
public static class PostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/user/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |

## Post0RequestBuilder
public static class Post0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post0RequestBuilder(Post0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PostRequest](#postrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property |

## PostRequestBuilder
public static class PostRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PostRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/user/post/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
