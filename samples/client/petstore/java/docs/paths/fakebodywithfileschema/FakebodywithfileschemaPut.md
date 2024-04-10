# FakebodywithfileschemaPut

public class FakebodywithfileschemaPut

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Put](#put)<br>The class that has a put method to call the endpoint |
| static class | [PutRequest](#putrequest)<br>The final request inputs class |
| static class | [PutNullableRequest](#putnullablerequest)<br>The initial request inputs class |
| static class | [Put0RequestBuilder](#put0requestbuilder)<br>A builder for the request input class |
| static class | [PutRequestBuilder](#putrequestbuilder)<br>A builder for the request input class |

### Put
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
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.FakebodywithfileschemaPutRequestBody;
import org.openapijsonschematools.client.components.schemas.FileSchemaTestClass;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.responses.Code200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.FakebodywithfileschemaPut;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.FakebodywithfileschemaPutResponses;

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
FakebodywithfileschemaPut.Put apiClient = new FakebodywithfileschemaPut.Put(apiConfiguration, schemaConfiguration);


FileSchemaTestClass1BoxedMap requestBodyPayload =
    FileSchemaTestClass.FileSchemaTestClass1.validateAndBox(
    new FileSchemaTestClass.FileSchemaTestClassMapBuilder()
        .files(
            Arrays.asList(
            )
        )
    .build(),
    schemaConfiguration
);
FakebodywithfileschemaPut.SealedRequestBody requestBody = new FakebodywithfileschemaPut.ApplicationjsonRequestBody(requestBodyPayload);

var request = new FakebodywithfileschemaPut.PutRequestBuilder()
    .requestBody(requestBody)
    .build();

FakebodywithfileschemaPutResponses.EndpointResponse response;
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
FakebodywithfileschemaPutResponses.EndpointCode200Response castResponse = (FakebodywithfileschemaPutResponses.EndpointCode200Response) response;
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakebodywithfileschemaPutResponses.EndpointResponse](../../paths/fakebodywithfileschema/put/FakebodywithfileschemaPutResponses.md#endpointresponse) | put([PutRequest](#putrequest) request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakebodywithfileschemaPutRequestBody.SealedRequestBody](../../paths/fakebodywithfileschema/put/FakebodywithfileschemaPutRequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakebodywithfileschemaPutRequestBody.@Nullable SealedRequestBody](../../paths/fakebodywithfileschema/put/FakebodywithfileschemaPutRequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
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
| [Put0RequestBuilder](#put0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
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
| [Put0RequestBuilder](#put0requestbuilder) | requestBody([FakebodywithfileschemaPutRequestBody.SealedRequestBody](../../paths/fakebodywithfileschema/put/FakebodywithfileschemaPutRequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
