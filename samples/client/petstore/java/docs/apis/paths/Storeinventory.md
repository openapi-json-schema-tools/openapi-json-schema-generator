# Storeinventory

public class Storeinventory extends extends ApiClient implements
[StoreinventoryGet.GetOperation](../../paths/storeinventory/StoreinventoryGet.md#getoperation)

an api client class which contains all the routes for path="/store/inventory"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreinventoryGetResponses.EndpointResponse](../../paths/storeinventory/get/StoreinventoryGetResponses.md#endpointresponse) | [get](#get)([StoreinventoryGet.GetRequest](../../paths/storeinventory/StoreinventoryGet.md#getrequest) request)<br>Returns a map of status codes to quantities |

## Method Detail

### get
public [StoreinventoryGetResponses.EndpointResponse](../../paths/storeinventory/get/StoreinventoryGetResponses.md#endpointresponse) get([StoreinventoryGet.GetRequest](../../paths/storeinventory/StoreinventoryGet.md#getrequest) request)

Returns a map of status codes to quantities

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
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetSecurityInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.paths.storeinventory.get.responses.StoreinventoryGetCode200Response;
import org.openapijsonschematools.client.components.responses.successinlinecontentandheader.SuccessInlineContentAndHeaderHeadersSchema;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Storeinventory;
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .storeinventoryGetSecurityRequirementObject0SecurityIndex(StoreinventoryGetSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Storeinventory apiClient = new Storeinventory(apiConfiguration, schemaConfiguration);


var request = new StoreinventoryGet.GetRequestBuilder().build();

StoreinventoryGetResponses.EndpointResponse response;
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
StoreinventoryGetResponses.EndpointStoreinventoryGetCode200Response castResponse = (StoreinventoryGetResponses.EndpointStoreinventoryGetCode200Response) response;
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
