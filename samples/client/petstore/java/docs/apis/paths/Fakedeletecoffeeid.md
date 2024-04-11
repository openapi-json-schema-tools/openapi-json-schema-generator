# Fakedeletecoffeeid

public class Fakedeletecoffeeid extends extends ApiClient implements
[FakedeletecoffeeidDelete.DeleteOperation](../../paths/fakedeletecoffeeid/FakedeletecoffeeidDelete.md#deleteoperation)

an api client class which contains all the routes for path="/fake/deleteCoffee/{id}"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakedeletecoffeeidDeleteResponses.EndpointResponse](../../paths/fakedeletecoffeeid/delete/FakedeletecoffeeidDeleteResponses.md#endpointresponse) | [delete](#delete)([FakedeletecoffeeidDelete.DeleteRequest](../../paths/fakedeletecoffeeid/FakedeletecoffeeidDelete#deleterequest) request)<br>Delete the coffee identified by the given id, (delete without request body) |

## Method Detail

### delete
public [FakedeletecoffeeidDeleteResponses.EndpointResponse](../../paths/fakedeletecoffeeid/delete/FakedeletecoffeeidDeleteResponses.md#endpointresponse) delete([FakedeletecoffeeidDelete.DeleteRequest](../../paths/fakedeletecoffeeid/FakedeletecoffeeidDelete#deleterequest) request)

Delete the coffee identified by the given id, (delete without request body)

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
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.FakedeletecoffeeidDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.FakedeletecoffeeidDeleteCode200Response;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.responses.FakedeletecoffeeidDeleteCodedefaultResponse;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakedeletecoffeeid;
import org.openapijsonschematools.client.paths.fakedeletecoffeeid.delete.FakedeletecoffeeidDeleteResponses;

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
Fakedeletecoffeeid apiClient = new Fakedeletecoffeeid(apiConfiguration, schemaConfiguration);


// Map validation
FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMap pathParameters =
    FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParameters1.validate(
    new FakedeletecoffeeidDeletePathParameters.FakedeletecoffeeidDeletePathParametersMapBuilder()
        .id("a")

    .build(),
    schemaConfiguration
);

var request = new FakedeletecoffeeidDelete.DeleteRequestBuilder()
    .pathParameters(pathParameters)
    .build();

FakedeletecoffeeidDeleteResponses.EndpointResponse response;
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
if (response instanceof FakedeletecoffeeidDeleteResponses.EndpointFakedeletecoffeeidDeleteCode200Response castResponse) {
} else {
    FakedeletecoffeeidDeleteResponses.EndpointFakedeletecoffeeidDeleteCodedefaultResponse castResponse = (FakedeletecoffeeidDeleteResponses.EndpointFakedeletecoffeeidDeleteCodedefaultResponse) response;
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
