# FakemultiplerequestbodycontenttypesPost

public class FakemultiplerequestbodycontenttypesPost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Post](#post)<br>The class that has a post method to call the endpoint |
| interface | [MultipleRequestBodyContentTypesOperation](#multiplerequestbodycontenttypesoperation)<br>The interface that has a multipleRequestBodyContentTypes method to call the endpoint |
| static class | [PostRequest](#postrequest)<br>The request inputs class |
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
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.FakemultiplerequestbodycontenttypesPostRequestBody;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.requestbody.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.responses.FakemultiplerequestbodycontenttypesPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.FakemultiplerequestbodycontenttypesPost;
import org.openapijsonschematools.client.paths.fakemultiplerequestbodycontenttypes.post.FakemultiplerequestbodycontenttypesPostResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .rootServerInfo(
        new RootServerInfo.RootServerInfoBuilder()
            .server0(new Server0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0)
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
FakemultiplerequestbodycontenttypesPost.Post apiClient = new FakemultiplerequestbodycontenttypesPost.Post(apiConfiguration, schemaConfiguration);


var request = new FakemultiplerequestbodycontenttypesPost.PostRequestBuilder().build();

FakemultiplerequestbodycontenttypesPostResponses.EndpointResponse response;
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
FakemultiplerequestbodycontenttypesPostResponses.EndpointFakemultiplerequestbodycontenttypesPostCode200Response castResponse = (FakemultiplerequestbodycontenttypesPostResponses.EndpointFakemultiplerequestbodycontenttypesPostCode200Response) response;
FakemultiplerequestbodycontenttypesPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakemultiplerequestbodycontenttypesPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakemultiplerequestbodycontenttypesPostResponses.EndpointResponse](../../paths/fakemultiplerequestbodycontenttypes/post/FakemultiplerequestbodycontenttypesPostResponses.md#endpointresponse) | post([PostRequest](#postrequest) request) |

## MultipleRequestBodyContentTypesOperation
public interface MultipleRequestBodyContentTypesOperation<br>

an interface that allows one to call the endpoint using a method named multipleRequestBodyContentTypes by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakemultiplerequestbodycontenttypesPostResponses.EndpointResponse](../../paths/fakemultiplerequestbodycontenttypes/post/FakemultiplerequestbodycontenttypesPostResponses.md#endpointresponse) | multipleRequestBodyContentTypes([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakemultiplerequestbodycontenttypesPostRequestBody.@Nullable SealedRequestBody](../../paths/fakemultiplerequestbodycontenttypes/post/FakemultiplerequestbodycontenttypesPostRequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

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
| [PostRequest](#postrequest) | build()<br>Returns the request input used to call an endpoint method |
| [PostRequestBuilder](#postrequestbuilder) | requestBody([FakemultiplerequestbodycontenttypesPostRequestBody.SealedRequestBody](../../paths/fakemultiplerequestbodycontenttypes/post/FakemultiplerequestbodycontenttypesPostRequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [PostRequestBuilder](#postrequestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [PostRequestBuilder](#postrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
