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

### Code Sample
```
import org.openapijsonschematools.client.paths.petpetid.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PathParameters;
// ServerIndex.SERVER_0 Server
import org.openapijsonschematools.client.servers.Server0;
// ServerIndex.SERVER_1 Server
import org.openapijsonschematools.client.servers.Server1;
// ServerIndex.SERVER_2 Server
import org.openapijsonschematools.client.servers.Server2;
// SecurityIndex.SECURITY_INDEX_0 SecurityScheme
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
// SecurityIndex.SECURITY_INDEX_1 SecurityScheme
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.petpetid.Post;


```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | post([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PathParameters.PathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) | pathParameters |
| [RequestBody.@Nullable SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetpetidPostSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PostNullableRequest
public static class PostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PathParameters.@Nullable PathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) | pathParameters |
| [RequestBody.@Nullable SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [PetpetidPostSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

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
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | securityIndex([PetpetidPostSecurityInfo.SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

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
| [Post0RequestBuilder](#post0requestbuilder) | pathParameters([PathParametersPathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
