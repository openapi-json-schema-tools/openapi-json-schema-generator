# FakecasesensitiveparamsPut

public class FakecasesensitiveparamsPut

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Put](#put)<br>The class that has a put method to call the endpoint |
| interface | [CaseSensitiveParamsOperation](#casesensitiveparamsoperation)<br>The interface that has a caseSensitiveParams method to call the endpoint |
| static class | [PutRequest](#putrequest)<br>The final request inputs class |
| static class | [PutNullableRequest](#putnullablerequest)<br>The initial request inputs class |
| static class | [Put0RequestBuilder](#put0requestbuilder)<br>A builder for the request input class |
| static class | [PutRequestBuilder](#putrequestbuilder)<br>A builder for the request input class |

## Put
public static class Put extends ApiClient.ApiClient1 implements PutOperation<br>

a class that allows one to call the endpoint using a method named put

### Code Sample
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
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.FakecasesensitiveparamsPutQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.responses.FakecasesensitiveparamsPutCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.FakecasesensitiveparamsPut;
import org.openapijsonschematools.client.paths.fakecasesensitiveparams.put.FakecasesensitiveparamsPutResponses;

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
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
FakecasesensitiveparamsPut.Put apiClient = new FakecasesensitiveparamsPut.Put(apiConfiguration, schemaConfiguration);


// Map validation
FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters11 queryParameters =
    FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters1.validate(
    new FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters10()
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
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutResponses.EndpointResponse](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutResponses.md#endpointresponse) | put([PutRequest](#putrequest) request) |

## CaseSensitiveParamsOperation
public interface CaseSensitiveParamsOperation<br>

an interface that allows one to call the endpoint using a method named caseSensitiveParams by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakecasesensitiveparamsPutResponses.EndpointResponse](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutResponses.md#endpointresponse) | caseSensitiveParams([PutRequest](#putrequest) request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakecasesensitiveparamsPutQueryParameters.FakecasesensitiveparamsPutQueryParameters11](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutQueryParameters.md#fakecasesensitiveparamsputqueryparameters11) | queryParameters |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakecasesensitiveparamsPutQueryParameters.@Nullable FakecasesensitiveparamsPutQueryParameters11](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutQueryParameters.md#fakecasesensitiveparamsputqueryparameters11) | queryParameters |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex |
| @Nullable Duration | timeout |

## Put0RequestBuilder
public static class Put0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put0RequestBuilder(Put0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PutRequest](#putrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Put0RequestBuilder](#put0requestbuilder) | serverIndex([ServerInfo.ServerIndex](../../ServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Put0RequestBuilder](#put0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## PutRequestBuilder
public static class PutRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PutRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put0RequestBuilder](#put0requestbuilder) | queryParameters([FakecasesensitiveparamsPutQueryParametersFakecasesensitiveparamsPutQueryParameters11](../../paths/fakecasesensitiveparams/put/FakecasesensitiveparamsPutQueryParameters.md#fakecasesensitiveparamsputqueryparameters11) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
