# Fakerefsenum

public class Fakerefsenum extends extends ApiClient implements
[FakerefsenumPost.PostOperation](../../paths/fakerefsenum/FakerefsenumPost.md#postoperation)

an api client class which contains all the routes for path="/fake/refs/enum"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefsenumPostResponses.EndpointResponse](../../paths/fakerefsenum/post/FakerefsenumPostResponses.md#endpointresponse) | [post](#post)([FakerefsenumPost.PostRequest](../../paths/fakerefsenum/FakerefsenumPost.md#postrequest) request)<br>Test serialization of outer enum |

## Method Detail

### post
public [FakerefsenumPostResponses.EndpointResponse](../../paths/fakerefsenum/post/FakerefsenumPostResponses.md#endpointresponse) post([FakerefsenumPost.PostRequest](../../paths/fakerefsenum/FakerefsenumPost.md#postrequest) request)

Test serialization of outer enum

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
import org.openapijsonschematools.client.paths.fakerefsenum.post.FakerefsenumPostRequestBody;
import org.openapijsonschematools.client.components.schemas.StringEnum;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakerefsenum.post.responses.FakerefsenumPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakerefsenum;
import org.openapijsonschematools.client.paths.fakerefsenum.post.FakerefsenumPostResponses;

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
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fakerefsenum apiClient = new Fakerefsenum(apiConfiguration, schemaConfiguration);


var request = new FakerefsenumPost.PostRequestBuilder().build();

FakerefsenumPostResponses.EndpointResponse response;
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
FakerefsenumPostResponses.EndpointFakerefsenumPostCode200Response castResponse = (FakerefsenumPostResponses.EndpointFakerefsenumPostCode200Response) response;
FakerefsenumPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakerefsenumPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
