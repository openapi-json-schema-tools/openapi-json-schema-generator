# Userusername

public class Userusername extends extends ApiClient implements
[UserusernameDelete.DeleteOperation](../../paths/userusername/UserusernameDelete.md#deleteoperation),
[UserusernameGet.GetOperation](../../paths/userusername/UserusernameGet.md#getoperation),
[UserusernamePut.PutOperation](../../paths/userusername/UserusernamePut.md#putoperation)

an api client class which contains all the routes for path="/user/{username}"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserusernameDeleteResponses.EndpointResponse](../../paths/userusername/delete/UserusernameDeleteResponses.md#endpointresponse) | [delete](#delete)([UserusernameDelete.DeleteRequest](../../paths/userusername/UserusernameDelete.md#deleterequest) request)<br>This can only be done by the logged in user. |
| [UserusernameGetResponses.EndpointResponse](../../paths/userusername/get/UserusernameGetResponses.md#endpointresponse) | [get](#get)([UserusernameGet.GetRequest](../../paths/userusername/UserusernameGet.md#getrequest) request)<br> |
| Void | [put](#put)([UserusernamePut.PutRequest](../../paths/userusername/UserusernamePut.md#putrequest) request)<br>This can only be done by the logged in user. |

## Method Detail

### delete
public [UserusernameDeleteResponses.EndpointResponse](../../paths/userusername/delete/UserusernameDeleteResponses.md#endpointresponse) delete([UserusernameDelete.DeleteRequest](../../paths/userusername/UserusernameDelete.md#deleterequest) request)

This can only be done by the logged in user.

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
import org.openapijsonschematools.client.paths.userusername.delete.UserusernameDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.userusername.delete.responses.UserusernameDeleteCode200Response;
import org.openapijsonschematools.client.paths.userusername.delete.responses.UserusernameDeleteCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Userusername;
import org.openapijsonschematools.client.paths.userusername.delete.UserusernameDeleteResponses;

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
Userusername apiClient = new Userusername(apiConfiguration, schemaConfiguration);


// Map validation
UserusernameDeletePathParameters.UserusernameDeletePathParametersMap pathParameters =
    UserusernameDeletePathParameters.UserusernameDeletePathParameters1.validate(
    new UserusernameDeletePathParameters.UserusernameDeletePathParametersMapBuilder()
        .username("a")

    .build(),
    schemaConfiguration
);

var request = new UserusernameDelete.DeleteRequestBuilder()
    .pathParameters(pathParameters)
    .build();

UserusernameDeleteResponses.EndpointResponse response;
try {
    response = apiClient.delete(request);
} catch (UserusernameDeleteCode404Response.ResponseApiException e) {
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
UserusernameDeleteResponses.EndpointUserusernameDeleteCode200Response castResponse = (UserusernameDeleteResponses.EndpointUserusernameDeleteCode200Response) response;
```
### get
public [UserusernameGetResponses.EndpointResponse](../../paths/userusername/get/UserusernameGetResponses.md#endpointresponse) get([UserusernameGet.GetRequest](../../paths/userusername/UserusernameGet.md#getrequest) request)



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
import org.openapijsonschematools.client.paths.userusername.get.UserusernameGetPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode200Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode400Response;
import org.openapijsonschematools.client.paths.userusername.get.responses.UserusernameGetCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Userusername;
import org.openapijsonschematools.client.paths.userusername.get.UserusernameGetResponses;

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
Userusername apiClient = new Userusername(apiConfiguration, schemaConfiguration);


// Map validation
UserusernameGetPathParameters.UserusernameGetPathParametersMap pathParameters =
    UserusernameGetPathParameters.UserusernameGetPathParameters1.validate(
    new UserusernameGetPathParameters.UserusernameGetPathParametersMapBuilder()
        .username("a")

    .build(),
    schemaConfiguration
);

var request = new UserusernameGet.GetRequestBuilder()
    .pathParameters(pathParameters)
    .build();

UserusernameGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (UserusernameGetCode400Response.ResponseApiException | UserusernameGetCode404Response.ResponseApiException e) {
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
UserusernameGetResponses.EndpointUserusernameGetCode200Response castResponse = (UserusernameGetResponses.EndpointUserusernameGetCode200Response) response;
if (castResponse.body instanceof UserusernameGetCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    UserusernameGetCode200Response.ApplicationjsonResponseBody deserializedBody = (UserusernameGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
### put
public Void put([UserusernamePut.PutRequest](../../paths/userusername/UserusernamePut.md#putrequest) request)

This can only be done by the logged in user.

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
import org.openapijsonschematools.client.paths.userusername.put.UserusernamePutRequestBody;
import org.openapijsonschematools.client.components.schemas.User;
import org.openapijsonschematools.client.paths.userusername.put.UserusernamePutPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.userusername.put.responses.UserusernamePutCode400Response;
import org.openapijsonschematools.client.paths.userusername.put.responses.UserusernamePutCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.paths.Userusername;
import org.openapijsonschematools.client.paths.userusername.put.UserusernamePutResponses;

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
Userusername apiClient = new Userusername(apiConfiguration, schemaConfiguration);


User1BoxedMap requestBodyPayload =
    User.User1.validateAndBox(
    new User.UserMapBuilder()
        .id(1L)

        .username("a")

        .firstName("a")

        .lastName("a")

        .email("a")

        .password("a")

        .phone("a")

        .userStatus(1)

        .objectWithNoDeclaredPropsNullable(null)

    .build(),
    schemaConfiguration
);
UserusernamePut.SealedRequestBody requestBody = new UserusernamePut.ApplicationjsonRequestBody(requestBodyPayload);

// Map validation
UserusernamePutPathParameters.UserusernamePutPathParametersMap pathParameters =
    UserusernamePutPathParameters.UserusernamePutPathParameters1.validate(
    new UserusernamePutPathParameters.UserusernamePutPathParametersMapBuilder()
        .username("a")

    .build(),
    schemaConfiguration
);

var request = new UserusernamePut.PutRequestBuilder()
    .requestBody(requestBody)
    .pathParameters(pathParameters)
    .build();

Void response;
try {
    response = apiClient.put(request);
} catch (UserusernamePutCode400Response.ResponseApiException | UserusernamePutCode404Response.ResponseApiException e) {
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
[[Back to top]](#top) [[Back to README]](../../../README.md)
