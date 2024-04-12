# Fakeobjinquery

public class Fakeobjinquery extends extends ApiClient implements
[FakeobjinqueryGet.GetOperation](../../paths/fakeobjinquery/FakeobjinqueryGet.md#getoperation)

an api client class which contains all the routes for path="/fake/objInQuery"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeobjinqueryGetResponses.EndpointResponse](../../paths/fakeobjinquery/get/FakeobjinqueryGetResponses.md#endpointresponse) | [get](#get)([FakeobjinqueryGet.GetRequest](../../paths/fakeobjinquery/FakeobjinqueryGet.md#getrequest) request) |

## Method Detail

### get
public [FakeobjinqueryGetResponses.EndpointResponse](../../paths/fakeobjinquery/get/FakeobjinqueryGetResponses.md#endpointresponse) get([FakeobjinqueryGet.GetRequest](../../paths/fakeobjinquery/FakeobjinqueryGet.md#getrequest) request)

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
import org.openapijsonschematools.client.paths.fakeobjinquery.get.FakeobjinqueryGetQueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.RootServer0;
import org.openapijsonschematools.client.servers.RootServer1;
import org.openapijsonschematools.client.servers.RootServer2;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.responses.FakeobjinqueryGetCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakeobjinquery;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.FakeobjinqueryGetResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .rootServerInfo(
        new RootServerInfo.RootServerInfoBuilder()
            .rootServer0(new RootServer0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0)
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
Fakeobjinquery apiClient = new Fakeobjinquery(apiConfiguration, schemaConfiguration);


var request = new FakeobjinqueryGet.GetRequestBuilder().build();

FakeobjinqueryGetResponses.EndpointResponse response;
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
FakeobjinqueryGetResponses.EndpointFakeobjinqueryGetCode200Response castResponse = (FakeobjinqueryGetResponses.EndpointFakeobjinqueryGetCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
