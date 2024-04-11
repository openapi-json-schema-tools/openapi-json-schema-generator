# FakebodywithqueryparamsPut

public class FakebodywithqueryparamsPut

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Put](#put)<br>The class that has a put method to call the endpoint |
| interface | [BodyWithQueryParamsOperation](#bodywithqueryparamsoperation)<br>The interface that has a bodyWithQueryParams method to call the endpoint |
| static class | [PutRequest](#putrequest)<br>The final request inputs class |
| static class | [PutNullableRequest](#putnullablerequest)<br>The initial request inputs class |
| static class | [Put00RequestBuilder](#put00requestbuilder)<br>A builder for the request input class |
| static class | [Put01RequestBuilder](#put01requestbuilder)<br>A builder for the request input class |
| static class | [Put10RequestBuilder](#put10requestbuilder)<br>A builder for the request input class |
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
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutRequestBody;
import org.openapijsonschematools.client.components.schemas.User;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.FakebodywithqueryparamsPutQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.put.responses.FakebodywithqueryparamsPutCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithqueryparams.FakebodywithqueryparamsPut;
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
FakebodywithqueryparamsPut.Put apiClient = new FakebodywithqueryparamsPut.Put(apiConfiguration, schemaConfiguration);


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
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutResponses.EndpointResponse](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutResponses.md#endpointresponse) | put([PutRequest](#putrequest) request) |

## BodyWithQueryParamsOperation
public interface BodyWithQueryParamsOperation<br>

an interface that allows one to call the endpoint using a method named bodyWithQueryParams by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithqueryparamsPutResponses.EndpointResponse](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutResponses.md#endpointresponse) | bodyWithQueryParams([PutRequest](#putrequest) request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakebodywithqueryparamsPutRequestBody.SealedRequestBody](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutRequestBody.md#sealedrequestbody) | requestBody |
| [FakebodywithqueryparamsPutQueryParameters.FakebodywithqueryparamsPutQueryParametersMap](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutQueryParameters.md#fakebodywithqueryparamsputqueryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakebodywithqueryparamsPutRequestBody.@Nullable SealedRequestBody](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutRequestBody.md#sealedrequestbody) | requestBody |
| [FakebodywithqueryparamsPutQueryParameters.@Nullable FakebodywithqueryparamsPutQueryParametersMap](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutQueryParameters.md#fakebodywithqueryparamsputqueryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| @Nullable Duration | timeout |

## Put00RequestBuilder
public static class Put00RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put00RequestBuilder(Put00RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PutRequest](#putrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Put00RequestBuilder](#put00requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Put00RequestBuilder](#put00requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## Put01RequestBuilder
public static class Put01RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put01RequestBuilder(Put01RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put00RequestBuilder](#put00requestbuilder) | queryParameters([FakebodywithqueryparamsPutQueryParametersFakebodywithqueryparamsPutQueryParametersMap](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutQueryParameters.md#fakebodywithqueryparamsputqueryparametersmap) queryParameters)<br>sets the property |

## Put10RequestBuilder
public static class Put10RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put10RequestBuilder(Put10RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put00RequestBuilder](#put00requestbuilder) | requestBody([FakebodywithqueryparamsPutRequestBody.SealedRequestBody](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutRequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

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
| [Put01RequestBuilder](#put01requestbuilder) | requestBody([FakebodywithqueryparamsPutRequestBody.SealedRequestBody](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutRequestBody.md#sealedrequestbody) requestBody)<br>sets the property |
| [Put10RequestBuilder](#put10requestbuilder) | queryParameters([FakebodywithqueryparamsPutQueryParametersFakebodywithqueryparamsPutQueryParametersMap](../../paths/fakebodywithqueryparams/put/FakebodywithqueryparamsPutQueryParameters.md#fakebodywithqueryparamsputqueryparametersmap) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
