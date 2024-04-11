# Petfindbytags

public class  extends extends ApiClient implements
[PetfindbytagsGet.GetOperation](../../paths/petfindbytags/PetfindbytagsGet.md#getoperation)

an api client class which contains all the routes for path="/pet/findByTags"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbytagsGetResponses.EndpointResponse](../../paths/petfindbytags/get/PetfindbytagsGetResponses.md#endpointresponse) | [get](#get)([PetfindbytagsGet.GetRequest](../../paths/petfindbytags/PetfindbytagsGet#getrequest) request)<br>Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing. |

## Method Detail

### get
public [PetfindbytagsGetResponses.EndpointResponse](../../paths/petfindbytags/get/PetfindbytagsGetResponses.md#endpointresponse) get([PetfindbytagsGet.GetRequest](../../paths/petfindbytags/PetfindbytagsGet#getrequest) request)

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

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
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetQueryParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petfindbytags.get.responses.PetfindbytagsGetCode200Response;
import org.openapijsonschematools.client.paths.petfindbytags.get.responses.PetfindbytagsGetCode400Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.petfindbytags.PetfindbytagsGet;
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetResponses;

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
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petfindbytagsGetSecurityRequirementObject0SecurityIndex(PetfindbytagsGetSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
PetfindbytagsGet.Get apiClient = new PetfindbytagsGet.Get(apiConfiguration, schemaConfiguration);


// Map validation
PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMap queryParameters =
    PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParameters1.validate(
    new PetfindbytagsGetQueryParameters.PetfindbytagsGetQueryParametersMapBuilder()
        .tags(
            Arrays.asList(
                "a"
            )
        )
    .build(),
    schemaConfiguration
);

var request = new PetfindbytagsGet.GetRequestBuilder()
    .queryParameters(queryParameters)
    .build();

PetfindbytagsGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (PetfindbytagsGetCode400Response.ResponseApiException e) {
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
PetfindbytagsGetResponses.EndpointPetfindbytagsGetCode200Response castResponse = (PetfindbytagsGetResponses.EndpointPetfindbytagsGetCode200Response) response;
}
```