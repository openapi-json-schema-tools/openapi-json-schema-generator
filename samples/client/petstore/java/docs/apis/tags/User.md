# User

public class User extends extends ApiClient implements
[UserlogoutGet.LogoutUserOperation](../../paths/userlogout/UserlogoutGet.md#logoutuseroperation),
[UsercreatewitharrayPost.CreateUsersWithArrayInputOperation](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#createuserswitharrayinputoperation),
[UserPost.CreateUserOperation](../../paths/user/UserPost.md#createuseroperation),
[UserloginGet.LoginUserOperation](../../paths/userlogin/UserloginGet.md#loginuseroperation),
[UserusernameDelete.DeleteUserOperation](../../paths/userusername/UserusernameDelete.md#deleteuseroperation),
[UserusernameGet.GetUserByNameOperation](../../paths/userusername/UserusernameGet.md#getuserbynameoperation),
[UserusernamePut.UpdateUserOperation](../../paths/userusername/UserusernamePut.md#updateuseroperation),
[UsercreatewithlistPost.CreateUsersWithListInputOperation](../../paths/usercreatewithlist/UsercreatewithlistPost.md#createuserswithlistinputoperation)

an api client class which contains all the routes for tag="user"
Operations about user

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserlogoutGetResponses.EndpointResponse](../../paths/userlogout/get/UserlogoutGetResponses.md#endpointresponse) | [logoutUser](#logoutuser)([UserlogoutGet.GetRequest](../../paths/userlogout/UserlogoutGet.md#getrequest) request)<br> |
| [UsercreatewitharrayPostResponses.EndpointResponse](../../paths/usercreatewitharray/post/UsercreatewitharrayPostResponses.md#endpointresponse) | [createUsersWithArrayInput](#createuserswitharrayinput)([UsercreatewitharrayPost.PostRequest](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#postrequest) request)<br> |
| [UserPostResponses.EndpointResponse](../../paths/user/post/UserPostResponses.md#endpointresponse) | [createUser](#createuser)([UserPost.PostRequest](../../paths/user/UserPost.md#postrequest) request)<br>This can only be done by the logged in user. |
| [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) | [loginUser](#loginuser)([UserloginGet.GetRequest](../../paths/userlogin/UserloginGet.md#getrequest) request)<br> |
| [UserusernameDeleteResponses.EndpointResponse](../../paths/userusername/delete/UserusernameDeleteResponses.md#endpointresponse) | [deleteUser](#deleteuser)([UserusernameDelete.DeleteRequest](../../paths/userusername/UserusernameDelete.md#deleterequest) request)<br>This can only be done by the logged in user. |
| [UserusernameGetResponses.EndpointResponse](../../paths/userusername/get/UserusernameGetResponses.md#endpointresponse) | [getUserByName](#getuserbyname)([UserusernameGet.GetRequest](../../paths/userusername/UserusernameGet.md#getrequest) request)<br> |
| Void | [updateUser](#updateuser)([UserusernamePut.PutRequest](../../paths/userusername/UserusernamePut.md#putrequest) request)<br>This can only be done by the logged in user. |
| [UsercreatewithlistPostResponses.EndpointResponse](../../paths/usercreatewithlist/post/UsercreatewithlistPostResponses.md#endpointresponse) | [createUsersWithListInput](#createuserswithlistinput)([UsercreatewithlistPost.PostRequest](../../paths/usercreatewithlist/UsercreatewithlistPost.md#postrequest) request)<br> |

## Method Detail

### logoutUser
public [UserlogoutGetResponses.EndpointResponse](../../paths/userlogout/get/UserlogoutGetResponses.md#endpointresponse) logoutUser([UserlogoutGet.GetRequest](../../paths/userlogout/UserlogoutGet.md#getrequest) request)



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
import org.openapijsonschematools.client.paths.userlogout.get.responses.UserlogoutGetCodedefaultResponse;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.User;
import org.openapijsonschematools.client.paths.userlogout.get.UserlogoutGetResponses;

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
User apiClient = new User(apiConfiguration, schemaConfiguration);


var request = new UserlogoutGet.GetRequestBuilder().build();

UserlogoutGetResponses.EndpointResponse response;
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
UserlogoutGetResponses.EndpointUserlogoutGetCodedefaultResponse castResponse = (UserlogoutGetResponses.EndpointUserlogoutGetCodedefaultResponse) response;
```
### createUsersWithArrayInput
public [UsercreatewitharrayPostResponses.EndpointResponse](../../paths/usercreatewitharray/post/UsercreatewitharrayPostResponses.md#endpointresponse) createUsersWithArrayInput([UsercreatewitharrayPost.PostRequest](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.usercreatewitharray.post.UsercreatewitharrayPostRequestBody;
import org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.responses.UsercreatewitharrayPostCodedefaultResponse;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.User;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.UsercreatewitharrayPostResponses;

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
User apiClient = new User(apiConfiguration, schemaConfiguration);


ApplicationjsonSchema1BoxedList requestBodyPayload =
    ApplicationjsonSchema.ApplicationjsonSchema1.validateAndBox(
    new ApplicationjsonSchema.ApplicationjsonSchemaListBuilder()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "id",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "username",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "firstName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "lastName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "email",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "password",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "phone",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "userStatus",
                    1
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "objectWithNoDeclaredPropsNullable",
                    null
                )
            )
        )
    .build(),
    schemaConfiguration
);
UsercreatewitharrayPostRequestBody.SealedRequestBody requestBody = new UsercreatewitharrayPostRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new UsercreatewitharrayPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

UsercreatewitharrayPostResponses.EndpointResponse response;
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
UsercreatewitharrayPostResponses.EndpointUsercreatewitharrayPostCodedefaultResponse castResponse = (UsercreatewitharrayPostResponses.EndpointUsercreatewitharrayPostCodedefaultResponse) response;
```
### createUser
public [UserPostResponses.EndpointResponse](../../paths/user/post/UserPostResponses.md#endpointresponse) createUser([UserPost.PostRequest](../../paths/user/UserPost.md#postrequest) request)

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
import org.openapijsonschematools.client.paths.user.post.UserPostRequestBody;
import org.openapijsonschematools.client.components.schemas.User;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.user.post.responses.UserPostCodedefaultResponse;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.User;
import org.openapijsonschematools.client.paths.user.post.UserPostResponses;

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
User apiClient = new User(apiConfiguration, schemaConfiguration);


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
UserPost.SealedRequestBody requestBody = new UserPost.ApplicationjsonRequestBody(requestBodyPayload);

var request = new UserPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

UserPostResponses.EndpointResponse response;
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
UserPostResponses.EndpointUserPostCodedefaultResponse castResponse = (UserPostResponses.EndpointUserPostCodedefaultResponse) response;
```
### loginUser
public [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) loginUser([UserloginGet.GetRequest](../../paths/userlogin/UserloginGet.md#getrequest) request)



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
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode200Response;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.UserloginGetCode200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode400Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.User;
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetResponses;

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
User apiClient = new User(apiConfiguration, schemaConfiguration);


// Map validation
UserloginGetQueryParameters.UserloginGetQueryParameters10 queryParameters =
    UserloginGetQueryParameters.UserloginGetQueryParameters1.validate(
    new UserloginGetQueryParameters.UserloginGetQueryParameters9()
        .password("a")

        .username("a")

    .build(),
    schemaConfiguration
);

var request = new UserloginGet.GetRequestBuilder()
    .queryParameters(queryParameters)
    .build();

UserloginGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (UserloginGetCode400Response.ResponseApiException e) {
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
UserloginGetResponses.EndpointUserloginGetCode200Response castResponse = (UserloginGetResponses.EndpointUserloginGetCode200Response) response;
if (castResponse.body instanceof UserloginGetCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    UserloginGetCode200Response.ApplicationjsonResponseBody deserializedBody = (UserloginGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
### deleteUser
public [UserusernameDeleteResponses.EndpointResponse](../../paths/userusername/delete/UserusernameDeleteResponses.md#endpointresponse) deleteUser([UserusernameDelete.DeleteRequest](../../paths/userusername/UserusernameDelete.md#deleterequest) request)

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
import org.openapijsonschematools.client.apis.tags.User;
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
User apiClient = new User(apiConfiguration, schemaConfiguration);


// Map validation
UserusernameDeletePathParameters.UserusernameDeletePathParameters9 pathParameters =
    UserusernameDeletePathParameters.UserusernameDeletePathParameters1.validate(
    new UserusernameDeletePathParameters.UserusernameDeletePathParameters8()
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
### getUserByName
public [UserusernameGetResponses.EndpointResponse](../../paths/userusername/get/UserusernameGetResponses.md#endpointresponse) getUserByName([UserusernameGet.GetRequest](../../paths/userusername/UserusernameGet.md#getrequest) request)



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
import org.openapijsonschematools.client.apis.tags.User;
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
User apiClient = new User(apiConfiguration, schemaConfiguration);


// Map validation
UserusernameGetPathParameters.UserusernameGetPathParameters9 pathParameters =
    UserusernameGetPathParameters.UserusernameGetPathParameters1.validate(
    new UserusernameGetPathParameters.UserusernameGetPathParameters8()
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
### updateUser
public Void updateUser([UserusernamePut.PutRequest](../../paths/userusername/UserusernamePut.md#putrequest) request)

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
import org.openapijsonschematools.client.apis.tags.User;
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
User apiClient = new User(apiConfiguration, schemaConfiguration);


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
UserusernamePutPathParameters.UserusernamePutPathParameters9 pathParameters =
    UserusernamePutPathParameters.UserusernamePutPathParameters1.validate(
    new UserusernamePutPathParameters.UserusernamePutPathParameters8()
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
### createUsersWithListInput
public [UsercreatewithlistPostResponses.EndpointResponse](../../paths/usercreatewithlist/post/UsercreatewithlistPostResponses.md#endpointresponse) createUsersWithListInput([UsercreatewithlistPost.PostRequest](../../paths/usercreatewithlist/UsercreatewithlistPost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.usercreatewithlist.post.UsercreatewithlistPostRequestBody;
import org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.usercreatewithlist.post.responses.UsercreatewithlistPostCodedefaultResponse;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.User;
import org.openapijsonschematools.client.paths.usercreatewithlist.post.UsercreatewithlistPostResponses;

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
User apiClient = new User(apiConfiguration, schemaConfiguration);


ApplicationjsonSchema1BoxedList requestBodyPayload =
    ApplicationjsonSchema.ApplicationjsonSchema1.validateAndBox(
    new ApplicationjsonSchema.ApplicationjsonSchemaListBuilder()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "id",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "username",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "firstName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "lastName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "email",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "password",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "phone",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "userStatus",
                    1
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "objectWithNoDeclaredPropsNullable",
                    null
                )
            )
        )
    .build(),
    schemaConfiguration
);
UsercreatewithlistPostRequestBody.SealedRequestBody requestBody = new UsercreatewithlistPostRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new UsercreatewithlistPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

UsercreatewithlistPostResponses.EndpointResponse response;
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
UsercreatewithlistPostResponses.EndpointUsercreatewithlistPostCodedefaultResponse castResponse = (UsercreatewithlistPostResponses.EndpointUsercreatewithlistPostCodedefaultResponse) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
