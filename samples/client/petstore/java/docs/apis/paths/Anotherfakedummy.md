# Anotherfakedummy

public class Anotherfakedummy extends extends ApiClient implements
[AnotherfakedummyPatch.PatchOperation](../../paths/anotherfakedummy/AnotherfakedummyPatch.md#patchoperation)

an api client class which contains all the routes for path="/another-fake/dummy"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AnotherfakedummyPatchResponses.EndpointResponse](../../paths/anotherfakedummy/patch/AnotherfakedummyPatchResponses.md#endpointresponse) | [patch](#patch)([AnotherfakedummyPatch.PatchRequest](../../paths/anotherfakedummy/AnotherfakedummyPatch.md#patchrequest) request)<br>To test special tags and operation ID starting with number |

## Method Detail

### patch
public [AnotherfakedummyPatchResponses.EndpointResponse](../../paths/anotherfakedummy/patch/AnotherfakedummyPatchResponses.md#endpointresponse) patch([AnotherfakedummyPatch.PatchRequest](../../paths/anotherfakedummy/AnotherfakedummyPatch.md#patchrequest) request)

To test special tags and operation ID starting with number

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
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.AnotherfakedummyPatchRequestBody;
import org.openapijsonschematools.client.components.schemas.Client;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.responses.AnotherfakedummyPatchCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Anotherfakedummy;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.AnotherfakedummyPatchResponses;

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
Anotherfakedummy apiClient = new Anotherfakedummy(apiConfiguration, schemaConfiguration);


Client1BoxedMap requestBodyPayload =
    Client.Client1.validateAndBox(
    new Client.ClientMapBuilder1()
        .client("a")

    .build(),
    schemaConfiguration
);
AnotherfakedummyPatchRequestBody.SealedRequestBody requestBody = new AnotherfakedummyPatchRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new AnotherfakedummyPatch.PatchRequestBuilder()
    .requestBody(requestBody)
    .build();

AnotherfakedummyPatchResponses.EndpointResponse response;
try {
    response = apiClient.patch(request);
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
AnotherfakedummyPatchResponses.EndpointAnotherfakedummyPatchCode200Response castResponse = (AnotherfakedummyPatchResponses.EndpointAnotherfakedummyPatchCode200Response) response;
AnotherfakedummyPatchCode200Response.ApplicationjsonResponseBody deserializedBody = (AnotherfakedummyPatchCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
