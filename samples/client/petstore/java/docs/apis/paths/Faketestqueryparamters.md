# Faketestqueryparamters

public class Faketestqueryparamters extends extends ApiClient implements
[FaketestqueryparamtersPut.PutOperation](../../paths/faketestqueryparamters/FaketestqueryparamtersPut.md#putoperation)

an api client class which contains all the routes for path="/fake/test-query-paramters"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FaketestqueryparamtersPutResponses.EndpointResponse](../../paths/faketestqueryparamters/put/FaketestqueryparamtersPutResponses.md#endpointresponse) | [put](#put)([FaketestqueryparamtersPut.PutRequest](../../paths/faketestqueryparamters/FaketestqueryparamtersPut.md#putrequest) request)<br>To test the collection format in query parameters |

## Method Detail

### put
public [FaketestqueryparamtersPutResponses.EndpointResponse](../../paths/faketestqueryparamters/put/FaketestqueryparamtersPutResponses.md#endpointresponse) put([FaketestqueryparamtersPut.PutRequest](../../paths/faketestqueryparamters/FaketestqueryparamtersPut.md#putrequest) request)

To test the collection format in query parameters

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
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.FaketestqueryparamtersPutQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.responses.FaketestqueryparamtersPutCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Faketestqueryparamters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.FaketestqueryparamtersPutResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Faketestqueryparamters apiClient = new Faketestqueryparamters(apiConfiguration, schemaConfiguration);


// Map validation
FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMap queryParameters =
    FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParameters1.validate(
    new FaketestqueryparamtersPutQueryParameters.FaketestqueryparamtersPutQueryParametersMapBuilder()
        .context(
            Arrays.asList(
                "a"
            )
        )
        .http(
            Arrays.asList(
                "a"
            )
        )
        .ioutil(
            Arrays.asList(
                "a"
            )
        )
        .pipe(
            Arrays.asList(
                "a"
            )
        )
        .refParam("a")

        .url(
            Arrays.asList(
                "a"
            )
        )
    .build(),
    schemaConfiguration
);

var request = new FaketestqueryparamtersPut.PutRequestBuilder()
    .queryParameters(queryParameters)
    .build();

FaketestqueryparamtersPutResponses.EndpointResponse response;
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
FaketestqueryparamtersPutResponses.EndpointFaketestqueryparamtersPutCode200Response castResponse = (FaketestqueryparamtersPutResponses.EndpointFaketestqueryparamtersPutCode200Response) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
