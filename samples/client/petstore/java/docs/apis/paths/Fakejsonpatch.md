# Fakejsonpatch

public class Fakejsonpatch extends extends ApiClient implements
[FakejsonpatchPatch.PatchOperation](../../paths/fakejsonpatch/FakejsonpatchPatch.md#patchoperation)

an api client class which contains all the routes for path="/fake/jsonPatch"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakejsonpatchPatchResponses.EndpointResponse](../../paths/fakejsonpatch/patch/FakejsonpatchPatchResponses.md#endpointresponse) | [patch](#patch)([FakejsonpatchPatch.PatchRequest](../../paths/fakejsonpatch/FakejsonpatchPatch.md#patchrequest) request)<br>json patch route with a requestBody |

## Method Detail

### patch
public [FakejsonpatchPatchResponses.EndpointResponse](../../paths/fakejsonpatch/patch/FakejsonpatchPatchResponses.md#endpointresponse) patch([FakejsonpatchPatch.PatchRequest](../../paths/fakejsonpatch/FakejsonpatchPatch.md#patchrequest) request)

json patch route with a requestBody

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
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.FakejsonpatchPatchRequestBody;
import org.openapijsonschematools.client.components.schemas.JSONPatchRequest;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.responses.FakejsonpatchPatchCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakejsonpatch;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.FakejsonpatchPatchResponses;

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
Fakejsonpatch apiClient = new Fakejsonpatch(apiConfiguration, schemaConfiguration);


var request = new FakejsonpatchPatch.PatchRequestBuilder().build();

FakejsonpatchPatchResponses.EndpointResponse response;
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
FakejsonpatchPatchResponses.EndpointFakejsonpatchPatchCode200Response castResponse = (FakejsonpatchPatchResponses.EndpointFakejsonpatchPatchCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
