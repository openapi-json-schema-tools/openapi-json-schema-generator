# PetfindbystatusGet

public class PetfindbystatusGet

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Get](#get)<br>The class that has a get method to call the endpoint |
| interface | [FindPetsByStatusOperation](#findpetsbystatusoperation)<br>The interface that has a findPetsByStatus method to call the endpoint |
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
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetQueryParameters;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer0;
import org.openapijsonschematools.client.paths.petfindbystatus.servers.PetfindbystatusServer1;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petfindbystatus.get.responses.PetfindbystatusGetCode200Response;
import org.openapijsonschematools.client.paths.petfindbystatus.get.responses.PetfindbystatusGetCode400Response;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusGet;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .petfindbystatusServerInfo(
        new PetfindbystatusServerInfo.PetfindbystatusServerInfoBuilder()
            .petfindbystatusServer0(new PetfindbystatusServer0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .petfindbystatusServerInfoServerIndex(PetfindbystatusServerInfo.ServerIndex.SERVER_0)
    .build();
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petfindbystatusGetSecurityRequirementObject0SecurityIndex(PetfindbystatusGetSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator/1.0.0/java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
PetfindbystatusGet.Get apiClient = new PetfindbystatusGet.Get(apiConfiguration, schemaConfiguration);


// Map validation
PetfindbystatusGetQueryParameters.QueryParametersMap queryParameters =
    PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1.validate(
    new PetfindbystatusGetQueryParameters.QueryParametersMapBuilder()
        .status(
            Arrays.asList(
                "available"
            )
        )
    .build(),
    schemaConfiguration
);

var request = new PetfindbystatusGet.GetRequestBuilder()
    .queryParameters(queryParameters)
    .build();

PetfindbystatusGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (PetfindbystatusGetCode400Response.ResponseApiException e) {
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
PetfindbystatusGetResponses.EndpointPetfindbystatusGetCode200Response castResponse = (PetfindbystatusGetResponses.EndpointPetfindbystatusGetCode200Response) response;
}
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) | get([GetRequest](#getrequest) request) |

## FindPetsByStatusOperation
public interface FindPetsByStatusOperation<br>

an interface that allows one to call the endpoint using a method named findPetsByStatus by the operationId

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) | findPetsByStatus([GetRequest](#getrequest) request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetfindbystatusGetQueryParameters.QueryParametersMap](../../paths/petfindbystatus/get/PetfindbystatusGetQueryParameters.md#queryparametersmap) | queryParameters |
| [PetfindbystatusServerInfo.@Nullable ServerIndex](../../paths/petfindbystatus/PetfindbystatusServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex](../../paths/petfindbystatus/get/PetfindbystatusGetSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## GetNullableRequest
public static class GetNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetfindbystatusGetQueryParameters.@Nullable QueryParametersMap](../../paths/petfindbystatus/get/PetfindbystatusGetQueryParameters.md#queryparametersmap) | queryParameters |
| [PetfindbystatusServerInfo.@Nullable ServerIndex](../../paths/petfindbystatus/PetfindbystatusServerInfo.md#serverindex) | serverIndex |
| [PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex](../../paths/petfindbystatus/get/PetfindbystatusGetSecurityInfo.md#securityindex) | securityIndex |
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
| [Get0RequestBuilder](#get0requestbuilder) | serverIndex([PetfindbystatusServerInfo.ServerIndex](../../paths/petfindbystatus/PetfindbystatusServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Get0RequestBuilder](#get0requestbuilder) | securityIndex([PetfindbystatusGetSecurityInfo.SecurityIndex](../../paths/petfindbystatus/get/PetfindbystatusGetSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
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
| [Get0RequestBuilder](#get0requestbuilder) | queryParameters([PetfindbystatusGetQueryParametersQueryParametersMap](../../paths/petfindbystatus/get/PetfindbystatusGetQueryParameters.md#queryparametersmap) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
