# Fakeuploadfiles

public class Fakeuploadfiles extends extends ApiClient implements
[FakeuploadfilesPost.PostOperation](../../paths/fakeuploadfiles/FakeuploadfilesPost.md#postoperation)

an api client class which contains all the routes for path="/fake/uploadFiles"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeuploadfilesPostResponses.EndpointResponse](../../paths/fakeuploadfiles/post/FakeuploadfilesPostResponses.md#endpointresponse) | [post](#post)([FakeuploadfilesPost.PostRequest](../../paths/fakeuploadfiles/FakeuploadfilesPost#postrequest) request)<br> |

## Method Detail

### post
public [FakeuploadfilesPostResponses.EndpointResponse](../../paths/fakeuploadfiles/post/FakeuploadfilesPostResponses.md#endpointresponse) post([FakeuploadfilesPost.PostRequest](../../paths/fakeuploadfiles/FakeuploadfilesPost#postrequest) request)



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
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.FakeuploadfilesPostRequestBody;
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.requestbody.content.multipartformdata.MultipartformdataSchema;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.responses.FakeuploadfilesPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakeuploadfiles;
import org.openapijsonschematools.client.paths.fakeuploadfiles.post.FakeuploadfilesPostResponses;

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
Fakeuploadfiles apiClient = new Fakeuploadfiles(apiConfiguration, schemaConfiguration);


var request = new FakeuploadfilesPost.PostRequestBuilder().build();

FakeuploadfilesPostResponses.EndpointResponse response;
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
FakeuploadfilesPostResponses.EndpointFakeuploadfilesPostCode200Response castResponse = (FakeuploadfilesPostResponses.EndpointFakeuploadfilesPostCode200Response) response;
FakeuploadfilesPostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakeuploadfilesPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
