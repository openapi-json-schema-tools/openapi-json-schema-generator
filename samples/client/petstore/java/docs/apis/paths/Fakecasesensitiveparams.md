# Fakecasesensitiveparams

public class Fakecasesensitiveparams extends extends ApiClient implements
[FakecasesensitiveparamsPut.PutOperation](../../paths/fakecasesensitiveparams/FakecasesensitiveparamsPut.md#putoperation)

an api client class which contains all the routes for path="/fake/case-sensitive-params"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutResponses.EndpointResponse](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutResponses.md#endpointresponse) | [put](#put)([FakecasesensitiveparamsPut.PutRequest](../../paths/fakecasesensitiveparams/FakecasesensitiveparamsPut#putrequest) request)<br>Ensures that original naming is used in endpoint params, that way we don&#x27;t have collisions |

## Method Detail

### put
public [FakecasesensitiveparamsPutResponses.EndpointResponse](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutResponses.md#endpointresponse) put([FakecasesensitiveparamsPut.PutRequest](../../paths/fakecasesensitiveparams/FakecasesensitiveparamsPut#putrequest) request)

Ensures that original naming is used in endpoint params, that way we don&#x27;t have collisions

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
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.FakecasesensitiveparamsPutQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.responses.FakecasesensitiveparamsPutCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakecasesensitiveparams;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.FakecasesensitiveparamsPutResponses;

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
Fakecasesensitiveparams apiClient = new Fakecasesensitiveparams(apiConfiguration, schemaConfiguration);


// Map validation
FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMap queryParameters =
    FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1.validate(
    new FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParametersMapBuilder()
        .SomeVar("a")

        .someVar("a")

        .some_var("a")

    .build(),
    schemaConfiguration
);

var request = new FakecasesensitiveparamsPut.PutRequestBuilder()
    .queryParameters(queryParameters)
    .build();

FakecasesensitiveparamsPutResponses.EndpointResponse response;
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
FakecasesensitiveparamsPutResponses.EndpointFakecasesensitiveparamsPutCode200Response castResponse = (FakecasesensitiveparamsPutResponses.EndpointFakecasesensitiveparamsPutCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
