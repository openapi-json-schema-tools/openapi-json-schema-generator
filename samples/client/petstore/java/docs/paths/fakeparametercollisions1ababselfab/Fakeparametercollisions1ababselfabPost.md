# Fakeparametercollisions1ababselfabPost

public class Fakeparametercollisions1ababselfabPost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Post](#post)<br>The class that has a post method to call the endpoint |
| interface | [ParameterCollisionsOperation](#parametercollisionsoperation)<br>The interface that has a parameterCollisions method to call the endpoint |
| static class | [PostRequest](#postrequest)<br>The final request inputs class |
| static class | [PostNullableRequest](#postnullablerequest)<br>The initial request inputs class |
| static class | [Post0RequestBuilder](#post0requestbuilder)<br>A builder for the request input class |
| static class | [PostRequestBuilder](#postrequestbuilder)<br>A builder for the request input class |

## Post
public static class Post extends ApiClient.ApiClient1 implements PostOperation<br>

a class that allows one to call the endpoint using a method named post

### Code Sample
```
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostRequestBody;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostHeaderParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostQueryParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostCookieParameters;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.responses.Fakeparametercollisions1ababselfabPostCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.Fakeparametercollisions1ababselfabPost;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .serverInfo(
        new ServerInfo.ServerInfoBuilder()
            .server0(new Server0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .serverInfoServerIndex(ServerInfo.ServerIndex.SERVER_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fakeparametercollisions1ababselfabPost.Post apiClient = new Fakeparametercollisions1ababselfabPost.Post(apiConfiguration, schemaConfiguration);


// Map validation
Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMap pathParameters =
    Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1.validate(
    new Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMapBuilder()
        .positive1("a")

        .aHyphenMinusB("a")

        .Ab("a")

        .aB("a")

        .self("a")

    .build(),
    schemaConfiguration
);

var request = new Fakeparametercollisions1ababselfabPost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Fakeparametercollisions1ababselfabPostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (ApiException e) {
    // server returned a response/contentType not defined in the openapi document
    throw e;
} catch (ValidationException e) {
    // the returned response body or header values do not conform the the schema validation requirements
    throw e;
} catch (IOException | InterruptedException e) {
    // an exception happened when making the request
    throw e;
} catch (NotImplementedException e) {
    // the request body serialization or deserialization has not yet been implemented
    // or the header content type deserialization has not yet been implemented for this contentType
    throw e;
}
Fakeparametercollisions1ababselfabPostResponses.EndpointFakeparametercollisions1ababselfabPostCode200Response castResponse = (Fakeparametercollisions1ababselfabPostResponses.EndpointFakeparametercollisions1ababselfabPostCode200Response) response;
Fakeparametercollisions1ababselfabPostCode200Response.ApplicationjsonResponseBody deserializedBody = (Fakeparametercollisions1ababselfabPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostResponses.EndpointResponse](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostResponses.md#endpointresponse) | post([PostRequest](#postrequest) request) |

## ParameterCollisionsOperation
public interface ParameterCollisionsOperation<br>

an interface that allows one to call the endpoint using a method named parameterCollisions by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostResponses.EndpointResponse](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostResponses.md#endpointresponse) | parameterCollisions([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostPathParameters.md#fakeparametercollisions1ababselfabpostpathparametersmap) | pathParameters |
| [Fakeparametercollisions1ababselfabPostRequestBody.@Nullable SealedRequestBody](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostRequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [Fakeparametercollisions1ababselfabPostHeaderParameters.@Nullable Fakeparametercollisions1ababselfabPostHeaderParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostHeaderParameters.md#fakeparametercollisions1ababselfabpostheaderparametersmap) | headerParameters<br>optional |
| [Fakeparametercollisions1ababselfabPostQueryParameters.@Nullable Fakeparametercollisions1ababselfabPostQueryParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostQueryParameters.md#fakeparametercollisions1ababselfabpostqueryparametersmap) | queryParameters<br>optional |
| [Fakeparametercollisions1ababselfabPostCookieParameters.@Nullable Fakeparametercollisions1ababselfabPostCookieParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostCookieParameters.md#fakeparametercollisions1ababselfabpostcookieparametersmap) | cookieParameters<br>optional |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PostNullableRequest
public static class PostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [Fakeparametercollisions1ababselfabPostPathParameters.@Nullable Fakeparametercollisions1ababselfabPostPathParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostPathParameters.md#fakeparametercollisions1ababselfabpostpathparametersmap) | pathParameters |
| [Fakeparametercollisions1ababselfabPostRequestBody.@Nullable SealedRequestBody](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostRequestBody.md#sealedrequestbody) | requestBody |
| [Fakeparametercollisions1ababselfabPostHeaderParameters.@Nullable Fakeparametercollisions1ababselfabPostHeaderParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostHeaderParameters.md#fakeparametercollisions1ababselfabpostheaderparametersmap) | headerParameters |
| [Fakeparametercollisions1ababselfabPostQueryParameters.@Nullable Fakeparametercollisions1ababselfabPostQueryParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostQueryParameters.md#fakeparametercollisions1ababselfabpostqueryparametersmap) | queryParameters |
| [Fakeparametercollisions1ababselfabPostCookieParameters.@Nullable Fakeparametercollisions1ababselfabPostCookieParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostCookieParameters.md#fakeparametercollisions1ababselfabpostcookieparametersmap) | cookieParameters |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex |
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
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([Fakeparametercollisions1ababselfabPostRequestBody.SealedRequestBody](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostRequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | headerParameters([Fakeparametercollisions1ababselfabPostHeaderParametersFakeparametercollisions1ababselfabPostHeaderParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostHeaderParameters.md#fakeparametercollisions1ababselfabpostheaderparametersmap) headerParameters)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | queryParameters([Fakeparametercollisions1ababselfabPostQueryParametersFakeparametercollisions1ababselfabPostQueryParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostQueryParameters.md#fakeparametercollisions1ababselfabpostqueryparametersmap) queryParameters)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | cookieParameters([Fakeparametercollisions1ababselfabPostCookieParametersFakeparametercollisions1ababselfabPostCookieParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostCookieParameters.md#fakeparametercollisions1ababselfabpostcookieparametersmap) cookieParameters)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([ServerInfo.ServerIndex](../../ServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
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
| [Post0RequestBuilder](#post0requestbuilder) | pathParameters([Fakeparametercollisions1ababselfabPostPathParametersFakeparametercollisions1ababselfabPostPathParametersMap](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostPathParameters.md#fakeparametercollisions1ababselfabpostpathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
