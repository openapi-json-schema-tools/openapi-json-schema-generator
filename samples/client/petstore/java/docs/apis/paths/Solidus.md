# Solidus

public class Solidus extends extends ApiClient implements
[SolidusGet.GetOperation](../../paths/solidus/SolidusGet.md#getoperation)

an api client class which contains all the routes for path="/"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [SolidusGetResponses.EndpointResponse](../../paths/solidus/get/SolidusGetResponses.md#endpointresponse) | [get](#get)([SolidusGet.GetRequest](../../paths/solidus/SolidusGet.md#getrequest) request) |

## Method Detail

### get
public [SolidusGetResponses.EndpointResponse](../../paths/solidus/get/SolidusGetResponses.md#endpointresponse) get([SolidusGet.GetRequest](../../paths/solidus/SolidusGet.md#getrequest) request)

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.solidus.get.responses.SolidusGetCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Solidus;
import org.openapijsonschematools.client.paths.solidus.get.SolidusGetResponses;

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
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Solidus apiClient = new Solidus(apiConfiguration, schemaConfiguration);


var request = new SolidusGet.GetRequestBuilder().build();

SolidusGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
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
SolidusGetResponses.EndpointSolidusGetCode200Response castResponse = (SolidusGetResponses.EndpointSolidusGetCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
