# PetpetidDelete

public class PetpetidDelete

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Delete](#delete)<br>The class that has a delete method to call the endpoint |
| static class | [DeleteRequest](#deleterequest)<br>The final request inputs class |
| static class | [DeleteNullableRequest](#deletenullablerequest)<br>The initial request inputs class |
| static class | [Delete0RequestBuilder](#delete0requestbuilder)<br>A builder for the request input class |
| static class | [DeleteRequestBuilder](#deleterequestbuilder)<br>A builder for the request input class |

### Delete
public static class Delete extends ApiClient.ApiClient1 implements DeleteOperation<br>

a class that allows one to call the endpoint using a method named delete

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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteHeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetid.delete.responses.PetpetidDeleteCode400Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.PetpetidDelete;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petpetidDeleteSecurityRequirementObject0SecurityIndex(PetpetidDeleteSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
PetpetidDelete.Delete apiClient = new PetpetidDelete.Delete(apiConfiguration, schemaConfiguration);


// Map validation
PetpetidDeletePathParameters.PetpetidDeletePathParametersMap pathParameters =
    PetpetidDeletePathParameters.PetpetidDeletePathParameters1.validate(
    new PetpetidDeletePathParameters.PetpetidDeletePathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new PetpetidDelete.DeleteRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Void response;
try {
    response = apiClient.delete(request);
} catch (PetpetidDeleteCode400Response.ResponseApiException e) {
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
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | delete([DeleteRequest](#deleterequest) request) |

## DeleteRequest
public static class DeleteRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetpetidDeletePathParameters.PetpetidDeletePathParametersMap](../../paths/petpetid/delete/PetpetidDeletePathParameters.md#petpetiddeletepathparametersmap) | pathParameters |
| [PetpetidDeleteHeaderParameters.@Nullable PetpetidDeleteHeaderParametersMap](../../paths/petpetid/delete/PetpetidDeleteHeaderParameters.md#petpetiddeleteheaderparametersmap) | headerParameters<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetpetidDeleteSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/delete/PetpetidDeleteSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## DeleteNullableRequest
public static class DeleteNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetpetidDeletePathParameters.@Nullable PetpetidDeletePathParametersMap](../../paths/petpetid/delete/PetpetidDeletePathParameters.md#petpetiddeletepathparametersmap) | pathParameters |
| [PetpetidDeleteHeaderParameters.@Nullable PetpetidDeleteHeaderParametersMap](../../paths/petpetid/delete/PetpetidDeleteHeaderParameters.md#petpetiddeleteheaderparametersmap) | headerParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [PetpetidDeleteSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/delete/PetpetidDeleteSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

## Delete0RequestBuilder
public static class Delete0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete0RequestBuilder(Delete0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DeleteRequest](#deleterequest) | build()<br>Returns the request input used to call an endpoint method |
| [Delete0RequestBuilder](#delete0requestbuilder) | headerParameters([PetpetidDeleteHeaderParametersPetpetidDeleteHeaderParametersMap](../../paths/petpetid/delete/PetpetidDeleteHeaderParameters.md#petpetiddeleteheaderparametersmap) headerParameters)<br>sets the optional property |
| [Delete0RequestBuilder](#delete0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Delete0RequestBuilder](#delete0requestbuilder) | securityIndex([PetpetidDeleteSecurityInfo.SecurityIndex](../../paths/petpetid/delete/PetpetidDeleteSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Delete0RequestBuilder](#delete0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## DeleteRequestBuilder
public static class DeleteRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DeleteRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Delete0RequestBuilder](#delete0requestbuilder) | pathParameters([PetpetidDeletePathParametersPetpetidDeletePathParametersMap](../../paths/petpetid/delete/PetpetidDeletePathParameters.md#petpetiddeletepathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
