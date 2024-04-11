# Fakejsonformdata

public class Fakejsonformdata extends extends ApiClient implements
[FakejsonformdataGet.GetOperation](../../paths/fakejsonformdata/FakejsonformdataGet.md#getoperation)

an api client class which contains all the routes for path="/fake/jsonFormData"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakejsonformdataGetResponses.EndpointResponse](../../paths/fakejsonformdata/get/FakejsonformdataGetResponses.md#endpointresponse) | [get](#get)([FakejsonformdataGet.GetRequest](../../paths/fakejsonformdata/FakejsonformdataGet.md#getrequest) request)<br> |

## Method Detail

### get
public [FakejsonformdataGetResponses.EndpointResponse](../../paths/fakejsonformdata/get/FakejsonformdataGetResponses.md#endpointresponse) get([FakejsonformdataGet.GetRequest](../../paths/fakejsonformdata/FakejsonformdataGet.md#getrequest) request)



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
import org.openapijsonschematools.client.paths.fakejsonformdata.get.FakejsonformdataGetRequestBody;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.responses.FakejsonformdataGetCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakejsonformdata;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.FakejsonformdataGetResponses;

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
Fakejsonformdata apiClient = new Fakejsonformdata(apiConfiguration, schemaConfiguration);


var request = new FakejsonformdataGet.GetRequestBuilder().build();

FakejsonformdataGetResponses.EndpointResponse response;
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
FakejsonformdataGetResponses.EndpointFakejsonformdataGetCode200Response castResponse = (FakejsonformdataGetResponses.EndpointFakejsonformdataGetCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
