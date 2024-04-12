# FakequeryparamwithjsoncontenttypeGet

public class FakequeryparamwithjsoncontenttypeGet

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Get](#get)<br>The class that has a get method to call the endpoint |
| interface | [QueryParamWithJsonContentTypeOperation](#queryparamwithjsoncontenttypeoperation)<br>The interface that has a queryParamWithJsonContentType method to call the endpoint |
| static class | [GetRequest](#getrequest)<br>The final request inputs class |
| static class | [GetNullableRequest](#getnullablerequest)<br>The initial request inputs class |
| static class | [Get0RequestBuilder](#get0requestbuilder)<br>A builder for the request input class |
| static class | [GetRequestBuilder](#getrequestbuilder)<br>A builder for the request input class |

## Get
public static class Get extends ApiClient.ApiClient1 implements GetOperation<br>

a class that allows one to call the endpoint using a method named get

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
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.FakequeryparamwithjsoncontenttypeGetQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.responses.FakequeryparamwithjsoncontenttypeGetCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.FakequeryparamwithjsoncontenttypeGet;
import org.openapijsonschematools.client.paths.fakequeryparamwithjsoncontenttype.get.FakequeryparamwithjsoncontenttypeGetResponses;

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
FakequeryparamwithjsoncontenttypeGet.Get apiClient = new FakequeryparamwithjsoncontenttypeGet.Get(apiConfiguration, schemaConfiguration);


// Map validation
FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters9 queryParameters =
    FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters1.validate(
    new FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters8()
    .build(),
    schemaConfiguration
);

var request = new FakequeryparamwithjsoncontenttypeGet.GetRequestBuilder()
    .queryParameters(queryParameters)
    .build();

FakequeryparamwithjsoncontenttypeGetResponses.EndpointResponse response;
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
FakequeryparamwithjsoncontenttypeGetResponses.EndpointFakequeryparamwithjsoncontenttypeGetCode200Response castResponse = (FakequeryparamwithjsoncontenttypeGetResponses.EndpointFakequeryparamwithjsoncontenttypeGetCode200Response) response;
FakequeryparamwithjsoncontenttypeGetCode200Response.ApplicationjsonResponseBody deserializedBody = (FakequeryparamwithjsoncontenttypeGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetResponses.EndpointResponse](../../paths/fakequeryparamwithjsoncontenttype/get/FakequeryparamwithjsoncontenttypeGetResponses.md#endpointresponse) | get([GetRequest](#getrequest) request) |

## QueryParamWithJsonContentTypeOperation
public interface QueryParamWithJsonContentTypeOperation<br>

an interface that allows one to call the endpoint using a method named queryParamWithJsonContentType by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakequeryparamwithjsoncontenttypeGetResponses.EndpointResponse](../../paths/fakequeryparamwithjsoncontenttype/get/FakequeryparamwithjsoncontenttypeGetResponses.md#endpointresponse) | queryParamWithJsonContentType([GetRequest](#getrequest) request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters.FakequeryparamwithjsoncontenttypeGetQueryParameters9](../../paths/fakequeryparamwithjsoncontenttype/get/FakequeryparamwithjsoncontenttypeGetQueryParameters.md#fakequeryparamwithjsoncontenttypegetqueryparameters9) | queryParameters |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## GetNullableRequest
public static class GetNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FakequeryparamwithjsoncontenttypeGetQueryParameters.@Nullable FakequeryparamwithjsoncontenttypeGetQueryParameters9](../../paths/fakequeryparamwithjsoncontenttype/get/FakequeryparamwithjsoncontenttypeGetQueryParameters.md#fakequeryparamwithjsoncontenttypegetqueryparameters9) | queryParameters |
| [ServerInfo.@Nullable ServerIndex](../../ServerInfo.md#serverindex) | serverIndex |
| @Nullable Duration | timeout |

## Get0RequestBuilder
public static class Get0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get0RequestBuilder(Get0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GetRequest](#getrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Get0RequestBuilder](#get0requestbuilder) | serverIndex([ServerInfo.ServerIndex](../../ServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Get0RequestBuilder](#get0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## GetRequestBuilder
public static class GetRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GetRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Get0RequestBuilder](#get0requestbuilder) | queryParameters([FakequeryparamwithjsoncontenttypeGetQueryParametersFakequeryparamwithjsoncontenttypeGetQueryParameters9](../../paths/fakequeryparamwithjsoncontenttype/get/FakequeryparamwithjsoncontenttypeGetQueryParameters.md#fakequeryparamwithjsoncontenttypegetqueryparameters9) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
