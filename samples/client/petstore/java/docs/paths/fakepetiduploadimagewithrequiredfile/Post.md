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
| Responses.EndpointResponse | post([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.PathParametersMap | pathParameters |
| RequestBody.@Nullable SealedRequestBody | requestBody |
| RootServerInfo.@Nullable ServerIndex | serverIndex |
| FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex | securityIndex |

## PostNullableRequest
public static class PostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.@Nullable PathParametersMap | pathParameters |
| RequestBody.@Nullable SealedRequestBody | requestBody |
| RootServerInfo.@Nullable ServerIndex | serverIndex |
| FakepetiduploadimagewithrequiredfilePostSecurityInfo.@Nullable SecurityIndex | securityIndex |

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
| [Post0RequestBuilder](#post0requestbuilder) | requestBody(RequestBody.SealedRequestBody requestBody)<br>sets the property |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex(RootServerInfo.ServerIndex serverIndex)<br>sets the property |
| [Post0RequestBuilder](#post0requestbuilder) | securityIndex(FakepetiduploadimagewithrequiredfilePostSecurityInfo.SecurityIndex securityIndex)<br>sets the property |

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
| [Post0RequestBuilder](#post0requestbuilder) | pathParameters(PathParameters.PathParametersMap pathParameters)<br>sets the property |
