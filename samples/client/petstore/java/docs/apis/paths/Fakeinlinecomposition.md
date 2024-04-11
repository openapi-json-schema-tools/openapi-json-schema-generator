# Fakeinlinecomposition

public class Fakeinlinecomposition extends extends ApiClient implements
[FakeinlinecompositionPost.PostOperation](../../paths/fakeinlinecomposition/FakeinlinecompositionPost.md#postoperation)

an api client class which contains all the routes for path="/fake/inlineComposition/"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeinlinecompositionPostResponses.EndpointResponse](../../paths/fakeinlinecomposition/post/FakeinlinecompositionPostResponses.md#endpointresponse) | [post](#post)([FakeinlinecompositionPost.PostRequest](../../paths/fakeinlinecomposition/FakeinlinecompositionPost.md#postrequest) request)<br>composed schemas at inline locations + multiple requestBody content types |

## Method Detail

### post
public [FakeinlinecompositionPostResponses.EndpointResponse](../../paths/fakeinlinecomposition/post/FakeinlinecompositionPostResponses.md#endpointresponse) post([FakeinlinecompositionPost.PostRequest](../../paths/fakeinlinecomposition/FakeinlinecompositionPost.md#postrequest) request)

composed schemas at inline locations + multiple requestBody content types

**Parameters:**<br>
request - the input request

**Returns:**<br>
the deserialized response

**Throws:**<br>
IOException, InterruptedException - an exception happened when making the request<br>
ValidationException - the returned response body or header values do not conform the the schema validation requirements<br>
NotImplementedException - the request body serialization or deserialization has not yet been implemented<br>
                          or the header content type deserialization has not yet been implemented for this contentType<br>
ApiException - server returned a response/contentType not defined in the openapi document<br>

#### Code Sample
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
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.FakeinlinecompositionPostRequestBody;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.requestbody.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.FakeinlinecompositionPostQueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.responses.FakeinlinecompositionPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakeinlinecomposition;
import org.openapijsonschematools.client.paths.fakeinlinecomposition.post.FakeinlinecompositionPostResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
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
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fakeinlinecomposition apiClient = new Fakeinlinecomposition(apiConfiguration, schemaConfiguration);


var request = new FakeinlinecompositionPost.PostRequestBuilder().build();

FakeinlinecompositionPostResponses.EndpointResponse response;
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
FakeinlinecompositionPostResponses.EndpointFakeinlinecompositionPostCode200Response castResponse = (FakeinlinecompositionPostResponses.EndpointFakeinlinecompositionPostCode200Response) response;
if (castResponse.body instanceof FakeinlinecompositionPostCode200Response.ApplicationjsonResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    FakeinlinecompositionPostCode200Response.MultipartformdataResponseBody deserializedBody = (FakeinlinecompositionPostCode200Response.MultipartformdataResponseBody) castResponse.body;
    // handle deserialized body here
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
