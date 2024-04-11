# Fakerefsobjectmodelwithrefprops

public class Fakerefsobjectmodelwithrefprops extends extends ApiClient implements
[FakerefsobjectmodelwithrefpropsPost.PostOperation](../../paths/fakerefsobjectmodelwithrefprops/FakerefsobjectmodelwithrefpropsPost.md#postoperation)

an api client class which contains all the routes for path="/fake/refs/object_model_with_ref_props"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakerefsobjectmodelwithrefpropsPostResponses.EndpointResponse](../../paths/fakerefsobjectmodelwithrefprops/post/FakerefsobjectmodelwithrefpropsPostResponses.md#endpointresponse) | [post](#post)([FakerefsobjectmodelwithrefpropsPost.PostRequest](../../paths/fakerefsobjectmodelwithrefprops/FakerefsobjectmodelwithrefpropsPost#postrequest) request)<br>Test serialization of object with $refed properties |

## Method Detail

### post
public [FakerefsobjectmodelwithrefpropsPostResponses.EndpointResponse](../../paths/fakerefsobjectmodelwithrefprops/post/FakerefsobjectmodelwithrefpropsPostResponses.md#endpointresponse) post([FakerefsobjectmodelwithrefpropsPost.PostRequest](../../paths/fakerefsobjectmodelwithrefprops/FakerefsobjectmodelwithrefpropsPost#postrequest) request)

Test serialization of object with $refed properties

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
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.FakerefsobjectmodelwithrefpropsPostRequestBody;
import org.openapijsonschematools.client.components.schemas.ObjectModelWithRefProps;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.responses.FakerefsobjectmodelwithrefpropsPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakerefsobjectmodelwithrefprops;
import org.openapijsonschematools.client.paths.fakerefsobjectmodelwithrefprops.post.FakerefsobjectmodelwithrefpropsPostResponses;

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
Fakerefsobjectmodelwithrefprops apiClient = new Fakerefsobjectmodelwithrefprops(apiConfiguration, schemaConfiguration);


var request = new FakerefsobjectmodelwithrefpropsPost.PostRequestBuilder().build();

FakerefsobjectmodelwithrefpropsPostResponses.EndpointResponse response;
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
FakerefsobjectmodelwithrefpropsPostResponses.EndpointFakerefsobjectmodelwithrefpropsPostCode200Response castResponse = (FakerefsobjectmodelwithrefpropsPostResponses.EndpointFakerefsobjectmodelwithrefpropsPostCode200Response) response;
FakerefsobjectmodelwithrefpropsPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakerefsobjectmodelwithrefpropsPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
