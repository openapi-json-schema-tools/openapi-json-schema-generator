# Fakebodywithqueryparams

public class Fakebodywithqueryparams extends extends ApiClient implements
[FakebodywithqueryparamsPut.PutOperation](../../paths/fakebodywithqueryparams/FakebodywithqueryparamsPut.md#putoperation)

an api client class which contains all the routes for path="/fake/body-with-query-params"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutResponses.EndpointResponse](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutResponses.md#endpointresponse) | [put](#put)([FakebodywithqueryparamsPut.PutRequest](../../paths/fakebodywithqueryparams/FakebodywithqueryparamsPut.md#putrequest) request) |

## Method Detail

### put
public [FakebodywithqueryparamsPutResponses.EndpointResponse](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutResponses.md#endpointresponse) put([FakebodywithqueryparamsPut.PutRequest](../../paths/fakebodywithqueryparams/FakebodywithqueryparamsPut.md#putrequest) request)

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
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutRequestBody;
import org.openapijsonschematools.client.components.schemas.User;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.responses.FakebodywithqueryparamsPutCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakebodywithqueryparams;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutResponses;

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
Fakebodywithqueryparams apiClient = new Fakebodywithqueryparams(apiConfiguration, schemaConfiguration);


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
FakebodywithqueryparamsPut.SealedRequestBody requestBody = new FakebodywithqueryparamsPut.ApplicationjsonRequestBody(requestBodyPayload);

// Map validation
FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMap queryParameters =
    FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParameters1.validate(
    new FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMapBuilder()
        .query("a")

    .build(),
    schemaConfiguration
);

var request = new FakebodywithqueryparamsPut.PutRequestBuilder()
    .requestBody(requestBody)
    .queryParameters(queryParameters)
    .build();

FakebodywithqueryparamsPutResponses.EndpointResponse response;
try {
    response = apiClient.put(request);
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
FakebodywithqueryparamsPutResponses.EndpointFakebodywithqueryparamsPutCode200Response castResponse = (FakebodywithqueryparamsPutResponses.EndpointFakebodywithqueryparamsPutCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
