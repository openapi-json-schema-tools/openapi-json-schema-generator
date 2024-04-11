# Fakerefsstring

public class  extends extends ApiClient implements
[FakerefsstringPost.PostOperation](../../paths/fakerefsstring/FakerefsstringPost.md#postoperation)

an api client class which contains all the routes for path="/fake/refs/string"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefsstringPostResponses.EndpointResponse](../../paths/fakerefsstring/post/FakerefsstringPostResponses.md#endpointresponse) | [post](#post)([FakerefsstringPost.PostRequest](../../paths/fakerefsstring/FakerefsstringPost#postrequest) request)<br>Test serialization of outer string types |

## Method Detail

### post
public [FakerefsstringPostResponses.EndpointResponse](../../paths/fakerefsstring/post/FakerefsstringPostResponses.md#endpointresponse) post([FakerefsstringPost.PostRequest](../../paths/fakerefsstring/FakerefsstringPost#postrequest) request)

Test serialization of outer string types

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
import org.openapijsonschematools.client.paths.fakerefsstring.post.FakerefsstringPostRequestBody;
import org.openapijsonschematools.client.components.schemas.StringSchema;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakerefsstring.post.responses.FakerefsstringPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakerefsstring.FakerefsstringPost;
import org.openapijsonschematools.client.paths.fakerefsstring.post.FakerefsstringPostResponses;

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
FakerefsstringPost.Post apiClient = new FakerefsstringPost.Post(apiConfiguration, schemaConfiguration);


var request = new FakerefsstringPost.PostRequestBuilder().build();

FakerefsstringPostResponses.EndpointResponse response;
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
FakerefsstringPostResponses.EndpointFakerefsstringPostCode200Response castResponse = (FakerefsstringPostResponses.EndpointFakerefsstringPostCode200Response) response;
FakerefsstringPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakerefsstringPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```