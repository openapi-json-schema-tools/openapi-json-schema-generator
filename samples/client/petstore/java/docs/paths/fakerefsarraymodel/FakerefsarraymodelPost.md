# FakerefsarraymodelPost

public class FakerefsarraymodelPost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Post](#post)<br>The class that has a post method to call the endpoint |
| interface | [ArrayModelOperation](#arraymodeloperation)<br>The interface that has a arrayModel method to call the endpoint |
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
import org.openapijsonschematools.client.paths.fakerefsarraymodel.post.FakerefsarraymodelPostRequestBody;
import org.openapijsonschematools.client.components.schemas.AnimalFarm;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.post.responses.FakerefsarraymodelPostCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.FakerefsarraymodelPost;
import org.openapijsonschematools.client.paths.fakerefsarraymodel.post.FakerefsarraymodelPostResponses;

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
FakerefsarraymodelPost.Post apiClient = new FakerefsarraymodelPost.Post(apiConfiguration, schemaConfiguration);


var request = new FakerefsarraymodelPost.PostRequestBuilder().build();

FakerefsarraymodelPostResponses.EndpointResponse response;
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
FakerefsarraymodelPostResponses.EndpointFakerefsarraymodelPostCode200Response castResponse = (FakerefsarraymodelPostResponses.EndpointFakerefsarraymodelPostCode200Response) response;
FakerefsarraymodelPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakerefsarraymodelPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefsarraymodelPostResponses.EndpointResponse](../../paths/fakerefsarraymodel/post/FakerefsarraymodelPostResponses.md#endpointresponse) | post([PostRequest](#postrequest) request) |

## ArrayModelOperation
public interface ArrayModelOperation<br>

an interface that allows one to call the endpoint using a method named arrayModel by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefsarraymodelPostResponses.EndpointResponse](../../paths/fakerefsarraymodel/post/FakerefsarraymodelPostResponses.md#endpointresponse) | arrayModel([PostRequest](#postrequest) request) |

## PostRequest
public static class PostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakerefsarraymodelPostRequestBody.@Nullable SealedRequestBody](../../paths/fakerefsarraymodel/post/FakerefsarraymodelPostRequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
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
| [PostRequestBuilder](#postrequestbuilder) | requestBody([FakerefsarraymodelPostRequestBody.SealedRequestBody](../../paths/fakerefsarraymodel/post/FakerefsarraymodelPostRequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [PostRequestBuilder](#postrequestbuilder) | serverIndex([ServerInfo.ServerIndex](../../ServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [PostRequestBuilder](#postrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
