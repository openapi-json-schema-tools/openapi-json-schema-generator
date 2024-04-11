# Userlogin

public class Userlogin extends extends ApiClient implements
[UserloginGet.GetOperation](../../paths/userlogin/UserloginGet.md#getoperation)

an api client class which contains all the routes for path="/user/login"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) | [get](#get)([UserloginGet.GetRequest](../../paths/userlogin/UserloginGet#getrequest) request)<br> |

## Method Detail

### get
public [UserloginGetResponses.EndpointResponse](../../paths/userlogin/get/UserloginGetResponses.md#endpointresponse) get([UserloginGet.GetRequest](../../paths/userlogin/UserloginGet#getrequest) request)



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
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode200Response;
import org.openapijsonschematools.client.paths.userlogin.get.responses.code200response.UserloginGetCode200ResponseHeadersSchema;
import org.openapijsonschematools.client.paths.userlogin.get.responses.UserloginGetCode400Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Userlogin;
import org.openapijsonschematools.client.paths.userlogin.get.UserloginGetResponses;

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
Userlogin apiClient = new Userlogin(apiConfiguration, schemaConfiguration);


// Map validation
UserloginGetQueryParameters.UserloginGetQueryParametersMap queryParameters =
    UserloginGetQueryParameters.UserloginGetQueryParameters1.validate(
    new UserloginGetQueryParameters.UserloginGetQueryParametersMapBuilder()
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
[[Back to top]](#top) [[Back to README]](../../../README.md)
