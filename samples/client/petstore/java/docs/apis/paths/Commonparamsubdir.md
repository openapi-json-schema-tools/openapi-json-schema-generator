# Commonparamsubdir

public class Commonparamsubdir extends extends ApiClient implements
[CommonparamsubdirDelete.DeleteOperation](../../paths/commonparamsubdir/CommonparamsubdirDelete.md#deleteoperation),
[CommonparamsubdirGet.GetOperation](../../paths/commonparamsubdir/CommonparamsubdirGet.md#getoperation),
[CommonparamsubdirPost.PostOperation](../../paths/commonparamsubdir/CommonparamsubdirPost.md#postoperation)

an api client class which contains all the routes for path="/commonParam/{subDir}/"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [CommonparamsubdirDeleteResponses.EndpointResponse](../../paths/commonparamsubdir/delete/CommonparamsubdirDeleteResponses.md#endpointresponse) | [delete](#delete)([CommonparamsubdirDelete.DeleteRequest](../../paths/commonparamsubdir/CommonparamsubdirDelete.md#deleterequest) request)<br>common param is overwritten |
| [CommonparamsubdirGetResponses.EndpointResponse](../../paths/commonparamsubdir/get/CommonparamsubdirGetResponses.md#endpointresponse) | [get](#get)([CommonparamsubdirGet.GetRequest](../../paths/commonparamsubdir/CommonparamsubdirGet.md#getrequest) request) |
| [CommonparamsubdirPostResponses.EndpointResponse](../../paths/commonparamsubdir/post/CommonparamsubdirPostResponses.md#endpointresponse) | [post](#post)([CommonparamsubdirPost.PostRequest](../../paths/commonparamsubdir/CommonparamsubdirPost.md#postrequest) request) |

## Method Detail

### delete
public [CommonparamsubdirDeleteResponses.EndpointResponse](../../paths/commonparamsubdir/delete/CommonparamsubdirDeleteResponses.md#endpointresponse) delete([CommonparamsubdirDelete.DeleteRequest](../../paths/commonparamsubdir/CommonparamsubdirDelete.md#deleterequest) request)

common param is overwritten

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
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeleteHeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.responses.CommonparamsubdirDeleteCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Commonparamsubdir;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.CommonparamsubdirDeleteResponses;

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
Commonparamsubdir apiClient = new Commonparamsubdir(apiConfiguration, schemaConfiguration);


// Map validation
CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParametersMap pathParameters =
    CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParameters1.validate(
    new CommonparamsubdirDeletePathParameters.CommonparamsubdirDeletePathParametersMapBuilder()
        .subDir("c")

    .build(),
    schemaConfiguration
);

var request = new CommonparamsubdirDelete.DeleteRequestBuilder()
    .pathParameters(pathParameters)
    .build();

CommonparamsubdirDeleteResponses.EndpointResponse response;
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
CommonparamsubdirDeleteResponses.EndpointCommonparamsubdirDeleteCode200Response castResponse = (CommonparamsubdirDeleteResponses.EndpointCommonparamsubdirDeleteCode200Response) response;
```
### get
public [CommonparamsubdirGetResponses.EndpointResponse](../../paths/commonparamsubdir/get/CommonparamsubdirGetResponses.md#endpointresponse) get([CommonparamsubdirGet.GetRequest](../../paths/commonparamsubdir/CommonparamsubdirGet.md#getrequest) request)

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
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetQueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.responses.CommonparamsubdirGetCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Commonparamsubdir;
import org.openapijsonschematools.client.paths.commonparamsubdir.get.CommonparamsubdirGetResponses;

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
Commonparamsubdir apiClient = new Commonparamsubdir(apiConfiguration, schemaConfiguration);


// Map validation
CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMap pathParameters =
    CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParameters1.validate(
    new CommonparamsubdirGetPathParameters.CommonparamsubdirGetPathParametersMapBuilder()
        .subDir("a")

    .build(),
    schemaConfiguration
);

var request = new CommonparamsubdirGet.GetRequestBuilder()
    .pathParameters(pathParameters)
    .build();

CommonparamsubdirGetResponses.EndpointResponse response;
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
CommonparamsubdirGetResponses.EndpointCommonparamsubdirGetCode200Response castResponse = (CommonparamsubdirGetResponses.EndpointCommonparamsubdirGetCode200Response) response;
```
### post
public [CommonparamsubdirPostResponses.EndpointResponse](../../paths/commonparamsubdir/post/CommonparamsubdirPostResponses.md#endpointresponse) post([CommonparamsubdirPost.PostRequest](../../paths/commonparamsubdir/CommonparamsubdirPost.md#postrequest) request)

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
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostHeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.responses.CommonparamsubdirPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Commonparamsubdir;
import org.openapijsonschematools.client.paths.commonparamsubdir.post.CommonparamsubdirPostResponses;

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
Commonparamsubdir apiClient = new Commonparamsubdir(apiConfiguration, schemaConfiguration);


// Map validation
CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMap pathParameters =
    CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParameters1.validate(
    new CommonparamsubdirPostPathParameters.CommonparamsubdirPostPathParametersMapBuilder()
        .subDir("a")

    .build(),
    schemaConfiguration
);

var request = new CommonparamsubdirPost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

CommonparamsubdirPostResponses.EndpointResponse response;
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
CommonparamsubdirPostResponses.EndpointCommonparamsubdirPostCode200Response castResponse = (CommonparamsubdirPostResponses.EndpointCommonparamsubdirPostCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
