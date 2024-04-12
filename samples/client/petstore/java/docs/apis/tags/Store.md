# Store

public class Store extends extends ApiClient implements
[StoreinventoryGet.GetInventoryOperation](../../paths/storeinventory/StoreinventoryGet.md#getinventoryoperation),
[StoreorderorderidDelete.DeleteOrderOperation](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleteorderoperation),
[StoreorderorderidGet.GetOrderByIdOperation](../../paths/storeorderorderid/StoreorderorderidGet.md#getorderbyidoperation),
[StoreorderPost.PlaceOrderOperation](../../paths/storeorder/StoreorderPost.md#placeorderoperation)

an api client class which contains all the routes for tag="store"
Access to Petstore orders

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreinventoryGetResponses.EndpointResponse](../../paths/storeinventory/get/StoreinventoryGetResponses.md#endpointresponse) | [getInventory](#getinventory)([StoreinventoryGet.GetRequest](../../paths/storeinventory/StoreinventoryGet.md#getrequest) request)<br>Returns a map of status codes to quantities |
| Void | [deleteOrder](#deleteorder)([StoreorderorderidDelete.DeleteRequest](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleterequest) request)<br>For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors |
| [StoreorderorderidGetResponses.EndpointResponse](../../paths/storeorderorderid/get/StoreorderorderidGetResponses.md#endpointresponse) | [getOrderById](#getorderbyid)([StoreorderorderidGet.GetRequest](../../paths/storeorderorderid/StoreorderorderidGet.md#getrequest) request)<br>For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions |
| [StoreorderPostResponses.EndpointResponse](../../paths/storeorder/post/StoreorderPostResponses.md#endpointresponse) | [placeOrder](#placeorder)([StoreorderPost.PostRequest](../../paths/storeorder/StoreorderPost.md#postrequest) request)<br> |

## Method Detail

### getInventory
public [StoreinventoryGetResponses.EndpointResponse](../../paths/storeinventory/get/StoreinventoryGetResponses.md#endpointresponse) getInventory([StoreinventoryGet.GetRequest](../../paths/storeinventory/StoreinventoryGet.md#getrequest) request)

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
import org.openapijsonschematools.client.apis.tags.Store;
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
Store apiClient = new Store(apiConfiguration, schemaConfiguration);


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
### deleteOrder
public Void deleteOrder([StoreorderorderidDelete.DeleteRequest](../../paths/storeorderorderid/StoreorderorderidDelete.md#deleterequest) request)

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.responses.StoreorderorderidDeleteCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Store;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.StoreorderorderidDeleteResponses;

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
Store apiClient = new Store(apiConfiguration, schemaConfiguration);


// Map validation
StoreorderorderidDeletePathParameters.PathParametersMap pathParameters =
    StoreorderorderidDeletePathParameters.StoreorderorderidDeletePathParameters1.validate(
    new StoreorderorderidDeletePathParameters.PathParametersMapBuilder()
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
### getOrderById
public [StoreorderorderidGetResponses.EndpointResponse](../../paths/storeorderorderid/get/StoreorderorderidGetResponses.md#endpointresponse) getOrderById([StoreorderorderidGet.GetRequest](../../paths/storeorderorderid/StoreorderorderidGet.md#getrequest) request)

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode200Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode400Response;
import org.openapijsonschematools.client.paths.storeorderorderid.get.responses.StoreorderorderidGetCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Store;
import org.openapijsonschematools.client.paths.storeorderorderid.get.StoreorderorderidGetResponses;

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
Store apiClient = new Store(apiConfiguration, schemaConfiguration);


// Map validation
StoreorderorderidGetPathParameters.PathParametersMap pathParameters =
    StoreorderorderidGetPathParameters.StoreorderorderidGetPathParameters1.validate(
    new StoreorderorderidGetPathParameters.PathParametersMapBuilder()
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
### placeOrder
public [StoreorderPostResponses.EndpointResponse](../../paths/storeorder/post/StoreorderPostResponses.md#endpointresponse) placeOrder([StoreorderPost.PostRequest](../../paths/storeorder/StoreorderPost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.storeorder.post.StoreorderPostRequestBody;
import org.openapijsonschematools.client.components.schemas.Order;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode200Response;
import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode400Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Store;
import org.openapijsonschematools.client.paths.storeorder.post.StoreorderPostResponses;

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
Store apiClient = new Store(apiConfiguration, schemaConfiguration);


Order1BoxedMap requestBodyPayload =
    Order.Order1.validateAndBox(
    new Order.OrderMapBuilder()
        .id(1L)

        .petId(1L)

        .quantity(1)

        .shipDate("1970-01-01T00:00:00.00Z")

        .status("placed")

        .complete(true)

    .build(),
    schemaConfiguration
);
StoreorderPost.SealedRequestBody requestBody = new StoreorderPost.ApplicationjsonRequestBody(requestBodyPayload);

var request = new StoreorderPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

StoreorderPostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (StoreorderPostCode400Response.ResponseApiException e) {
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
StoreorderPostResponses.EndpointStoreorderPostCode200Response castResponse = (StoreorderPostResponses.EndpointStoreorderPostCode200Response) response;
if (castResponse.body instanceof StoreorderPostCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    StoreorderPostCode200Response.ApplicationjsonResponseBody deserializedBody = (StoreorderPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
