# Fake

public class Fake extends extends ApiClient implements
[FakeDelete.DeleteOperation](../../paths/fake/FakeDelete.md#deleteoperation),
[FakeGet.GetOperation](../../paths/fake/FakeGet.md#getoperation),
[FakePatch.PatchOperation](../../paths/fake/FakePatch.md#patchoperation),
[FakePost.PostOperation](../../paths/fake/FakePost.md#postoperation)

an api client class which contains all the routes for path=""

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakeDeleteResponses.EndpointResponse](../../paths/fake/delete/FakeDeleteResponses.md#endpointresponse) | [delete](#delete)([FakeDelete.DeleteRequest](../../paths/fake/FakeDelete.md#deleterequest) request)<br>Fake endpoint to test group parameters (optional) |
| [FakeGetResponses.EndpointResponse](../../paths/fake/get/FakeGetResponses.md#endpointresponse) | [get](#get)([FakeGet.GetRequest](../../paths/fake/FakeGet.md#getrequest) request)<br>To test enum parameters |
| [FakePatchResponses.EndpointResponse](../../paths/fake/patch/FakePatchResponses.md#endpointresponse) | [patch](#patch)([FakePatch.PatchRequest](../../paths/fake/FakePatch.md#patchrequest) request)<br>To test &quot;client&quot; model |
| [FakePostResponses.EndpointResponse](../../paths/fake/post/FakePostResponses.md#endpointresponse) | [post](#post)([FakePost.PostRequest](../../paths/fake/FakePost.md#postrequest) request)<br>Fake endpoint for testing various parameters<br>假端點<br>偽のエンドポイント<br>가짜 엔드 포인트<br> |

## Method Detail

### delete
public [FakeDeleteResponses.EndpointResponse](../../paths/fake/delete/FakeDeleteResponses.md#endpointresponse) delete([FakeDelete.DeleteRequest](../../paths/fake/FakeDelete.md#deleterequest) request)

Fake endpoint to test group parameters (optional)

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
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteHeaderParameters;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.BearerTest;
import org.openapijsonschematools.client.paths.fake.delete.responses.FakeDeleteCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fake;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new BearerTest("someAccessToken");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .fakeDeleteSecurityRequirementObject0SecurityIndex(FakeDeleteSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fake apiClient = new Fake(apiConfiguration, schemaConfiguration);


// Map validation
FakeDeleteHeaderParameters.FakeDeleteHeaderParametersMap headerParameters =
    FakeDeleteHeaderParameters.FakeDeleteHeaderParameters1.validate(
    new FakeDeleteHeaderParameters.FakeDeleteHeaderParametersMapBuilder()
        .required_boolean_group("true")

        .boolean_group("true")

    .build(),
    schemaConfiguration
);

// Map validation
FakeDeleteQueryParameters.FakeDeleteQueryParametersMap queryParameters =
    FakeDeleteQueryParameters.FakeDeleteQueryParameters1.validate(
    new FakeDeleteQueryParameters.FakeDeleteQueryParametersMapBuilder()
        .required_int64_group(1L)

        .required_string_group("a")

        .int64_group(1L)

        .string_group("a")

    .build(),
    schemaConfiguration
);

var request = new FakeDelete.DeleteRequestBuilder()
    .headerParameters(headerParameters)
    .queryParameters(queryParameters)
    .build();

FakeDeleteResponses.EndpointResponse response;
try {
    response = apiClient.delete(request);
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
FakeDeleteResponses.EndpointFakeDeleteCode200Response castResponse = (FakeDeleteResponses.EndpointFakeDeleteCode200Response) response;
```
### get
public [FakeGetResponses.EndpointResponse](../../paths/fake/get/FakeGetResponses.md#endpointresponse) get([FakeGet.GetRequest](../../paths/fake/FakeGet.md#getrequest) request)

To test enum parameters

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
import org.openapijsonschematools.client.paths.fake.get.FakeGetRequestBody;
import org.openapijsonschematools.client.paths.fake.get.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;
import org.openapijsonschematools.client.paths.fake.get.FakeGetHeaderParameters;
import org.openapijsonschematools.client.paths.fake.get.FakeGetQueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fake.get.responses.FakeGetCode200Response;
import org.openapijsonschematools.client.paths.fake.get.responses.FakeGetCode404Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fake;
import org.openapijsonschematools.client.paths.fake.get.FakeGetResponses;

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
Fake apiClient = new Fake(apiConfiguration, schemaConfiguration);


var request = new FakeGet.GetRequestBuilder().build();

FakeGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (FakeGetCode404Response.ResponseApiException e) {
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
FakeGetResponses.EndpointFakeGetCode200Response castResponse = (FakeGetResponses.EndpointFakeGetCode200Response) response;
```
### patch
public [FakePatchResponses.EndpointResponse](../../paths/fake/patch/FakePatchResponses.md#endpointresponse) patch([FakePatch.PatchRequest](../../paths/fake/FakePatch.md#patchrequest) request)

To test &quot;client&quot; model

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
import org.openapijsonschematools.client.paths.fake.patch.FakePatchRequestBody;
import org.openapijsonschematools.client.components.schemas.Client;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fake.patch.responses.FakePatchCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fake;
import org.openapijsonschematools.client.paths.fake.patch.FakePatchResponses;

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
Fake apiClient = new Fake(apiConfiguration, schemaConfiguration);


Client1BoxedMap requestBodyPayload =
    Client.Client1.validateAndBox(
    new Client.ClientMapBuilder1()
        .client("a")

    .build(),
    schemaConfiguration
);
FakePatchRequestBody.SealedRequestBody requestBody = new FakePatchRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new FakePatch.PatchRequestBuilder()
    .requestBody(requestBody)
    .build();

FakePatchResponses.EndpointResponse response;
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
FakePatchResponses.EndpointFakePatchCode200Response castResponse = (FakePatchResponses.EndpointFakePatchCode200Response) response;
FakePatchCode200Response.ApplicationjsonResponseBody deserializedBody = (FakePatchCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### post
public [FakePostResponses.EndpointResponse](../../paths/fake/post/FakePostResponses.md#endpointresponse) post([FakePost.PostRequest](../../paths/fake/FakePost.md#postrequest) request)

Fake endpoint for testing various parameters<br>假端點<br>偽のエンドポイント<br>가짜 엔드 포인트<br>

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
import org.openapijsonschematools.client.paths.fake.post.FakePostRequestBody;
import org.openapijsonschematools.client.paths.fake.post.requestbody.content.applicationxwwwformurlencoded.ApplicationxwwwformurlencodedSchema;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.post.FakePostSecurityInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpBasicTest;
import org.openapijsonschematools.client.paths.fake.post.responses.FakePostCode200Response;
import org.openapijsonschematools.client.paths.fake.post.responses.FakePostCode404Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fake;
import org.openapijsonschematools.client.paths.fake.post.FakePostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new HttpBasicTest("someUserId", "somePassword");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .fakePostSecurityRequirementObject0SecurityIndex(FakePostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fake apiClient = new Fake(apiConfiguration, schemaConfiguration);


var request = new FakePost.PostRequestBuilder().build();

FakePostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (FakePostCode404Response.ResponseApiException e) {
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
FakePostResponses.EndpointFakePostCode200Response castResponse = (FakePostResponses.EndpointFakePostCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
