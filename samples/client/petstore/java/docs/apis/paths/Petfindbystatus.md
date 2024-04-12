# Petfindbystatus

public class Petfindbystatus extends extends ApiClient implements
[PetfindbystatusGet.GetOperation](../../paths/petfindbystatus/PetfindbystatusGet.md#getoperation)

an api client class which contains all the routes for path="/pet/findByStatus"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) | [get](#get)([PetfindbystatusGet.GetRequest](../../paths/petfindbystatus/PetfindbystatusGet.md#getrequest) request)<br>Multiple status values can be provided with comma separated strings |

## Method Detail

### get
public [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) get([PetfindbystatusGet.GetRequest](../../paths/petfindbystatus/PetfindbystatusGet.md#getrequest) request)

Multiple status values can be provided with comma separated strings

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
import org.openapijsonschematools.client.apis.paths.Petfindbystatus;
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
Petfindbystatus apiClient = new Petfindbystatus(apiConfiguration, schemaConfiguration);


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
[[Back to top]](#top) [[Back to README]](../../../README.md)
