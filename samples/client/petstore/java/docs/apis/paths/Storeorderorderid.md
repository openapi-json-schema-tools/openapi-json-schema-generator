# Storeorderorderid

public class Storeorderorderid extends extends ApiClient implements
[StoreorderorderidDelete.DeleteOperation](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleteoperation),
[StoreorderorderidGet.GetOperation](../../paths/storeorderorderid/StoreorderorderidGet.md#getoperation)

an api client class which contains all the routes for path="/store/order/{order_id}"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | [delete](#delete)([StoreorderorderidDelete.DeleteRequest](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleterequest) request)<br>For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors |
| [StoreorderorderidGetResponses.EndpointResponse](../../paths/storeorderorderid/get/StoreorderorderidGetResponses.md#endpointresponse) | [get](#get)([StoreorderorderidGet.GetRequest](../../paths/storeorderorderid/StoreorderorderidGet.md#getrequest) request)<br>For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions |

## Method Detail

### delete
public Void delete([StoreorderorderidDelete.DeleteRequest](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleterequest) request)

For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors

**Parameters:**<br>
request - the input request

**Returns:**<br>
nothing (Void)

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
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode404Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Storeorderorderid;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeleteResponses;

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
Storeorderorderid apiClient = new Storeorderorderid(apiConfiguration, schemaConfiguration);


// Map validation
StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMap pathParameters =
    StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1.validate(
    new StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParametersMapBuilder()
        .order_id("a")

    .build(),
    schemaConfiguration
);

var request = new StoreorderorderidDelete.DeleteRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Void response;
try {
    response = apiClient.delete(request);
} catch (StoreorderorderidDeleteCode400Response.ResponseApiException | StoreorderorderidDeleteCode404Response.ResponseApiException e) {
    // server returned an error response defined in the openapi document
    throw e;
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
```
### get
public [StoreorderorderidGetResponses.EndpointResponse](../../paths/storeorderorderid/get/StoreorderorderidGetResponses.md#endpointresponse) get([StoreorderorderidGet.GetRequest](../../paths/storeorderorderid/StoreorderorderidGet.md#getrequest) request)

For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions

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
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode200Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode404Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Storeorderorderid;
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetResponses;

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
Storeorderorderid apiClient = new Storeorderorderid(apiConfiguration, schemaConfiguration);


// Map validation
StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMap pathParameters =
    StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1.validate(
    new StoreorderorderidGetPathParameters.StoreorderorderidGetPathParametersMapBuilder()
        .order_id(1L)

    .build(),
    schemaConfiguration
);

var request = new StoreorderorderidGet.GetRequestBuilder()
    .pathParameters(pathParameters)
    .build();

StoreorderorderidGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (StoreorderorderidGetCode400Response.ResponseApiException | StoreorderorderidGetCode404Response.ResponseApiException e) {
    // server returned an error response defined in the openapi document
    throw e;
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
StoreorderorderidGetResponses.EndpointStoreorderorderidGetCode200Response castResponse = (StoreorderorderidGetResponses.EndpointStoreorderorderidGetCode200Response) response;
if (castResponse.body instanceof StoreorderorderidGetCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    StoreorderorderidGetCode200Response.ApplicationjsonResponseBody deserializedBody = (StoreorderorderidGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
