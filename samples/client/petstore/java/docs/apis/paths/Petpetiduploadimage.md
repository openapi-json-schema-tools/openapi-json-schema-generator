# Petpetiduploadimage

public class Petpetiduploadimage extends extends ApiClient implements
[PetpetiduploadimagePost.PostOperation](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#postoperation)

an api client class which contains all the routes for path="/pet/{petId}/uploadImage"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetpetiduploadimagePostResponses.EndpointResponse](../../paths/petpetiduploadimage/post/PetpetiduploadimagePostResponses.md#endpointresponse) | [post](#post)([PetpetiduploadimagePost.PostRequest](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#postrequest) request)<br> |

## Method Detail

### post
public [PetpetiduploadimagePostResponses.EndpointResponse](../../paths/petpetiduploadimage/post/PetpetiduploadimagePostResponses.md#endpointresponse) post([PetpetiduploadimagePost.PostRequest](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostRequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.responses.PetpetiduploadimagePostCode200Response;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.SuccessWithJsonApiResponseHeadersSchema;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Petpetiduploadimage;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petpetiduploadimagePostSecurityRequirementObject0SecurityIndex(PetpetiduploadimagePostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Petpetiduploadimage apiClient = new Petpetiduploadimage(apiConfiguration, schemaConfiguration);


// Map validation
PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMap pathParameters =
    PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParameters1.validate(
    new PetpetiduploadimagePostPathParameters.PetpetiduploadimagePostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new PetpetiduploadimagePost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

PetpetiduploadimagePostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
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
PetpetiduploadimagePostResponses.EndpointPetpetiduploadimagePostCode200Response castResponse = (PetpetiduploadimagePostResponses.EndpointPetpetiduploadimagePostCode200Response) response;
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
