# Pet

public class Pet extends extends ApiClient implements
[FakepetiduploadimagewithrequiredfilePost.UploadFileWithRequiredFileOperation](../../paths/fakepetiduploadimagewithrequiredfile/FakepetiduploadimagewithrequiredfilePost.md#uploadfilewithrequiredfileoperation),
[PetPost.AddPetOperation](../../paths/pet/PetPost.md#addpetoperation),
[PetPut.UpdatePetOperation](../../paths/pet/PetPut.md#updatepetoperation),
[PetfindbytagsGet.FindPetsByTagsOperation](../../paths/petfindbytags/PetfindbytagsGet.md#findpetsbytagsoperation),
[PetfindbystatusGet.FindPetsByStatusOperation](../../paths/petfindbystatus/PetfindbystatusGet.md#findpetsbystatusoperation),
[PetpetiduploadimagePost.UploadImageOperation](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#uploadimageoperation),
[PetpetidDelete.DeletePetOperation](../../paths/petpetid/PetpetidDelete.md#deletepetoperation),
[PetpetidGet.GetPetByIdOperation](../../paths/petpetid/PetpetidGet.md#getpetbyidoperation),
[PetpetidPost.UpdatePetWithFormOperation](../../paths/petpetid/PetpetidPost.md#updatepetwithformoperation)

an api client class which contains all the routes for tag="pet"
Everything about your Pets

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostResponses.md#endpointresponse) | [uploadFileWithRequiredFile](#uploadfilewithrequiredfile)([FakepetiduploadimagewithrequiredfilePost.PostRequest](../../paths/fakepetiduploadimagewithrequiredfile/FakepetiduploadimagewithrequiredfilePost.md#postrequest) request)<br> |
| [PetPostResponses.EndpointResponse](../../paths/pet/post/PetPostResponses.md#endpointresponse) | [addPet](#addpet)([PetPost.PostRequest](../../paths/pet/PetPost.md#postrequest) request)<br>Add a new pet to the store |
| Void | [updatePet](#updatepet)([PetPut.PutRequest](../../paths/pet/PetPut.md#putrequest) request)<br> |
| [PetfindbytagsGetResponses.EndpointResponse](../../paths/petfindbytags/get/PetfindbytagsGetResponses.md#endpointresponse) | [findPetsByTags](#findpetsbytags)([PetfindbytagsGet.GetRequest](../../paths/petfindbytags/PetfindbytagsGet.md#getrequest) request)<br>Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing. |
| [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) | [findPetsByStatus](#findpetsbystatus)([PetfindbystatusGet.GetRequest](../../paths/petfindbystatus/PetfindbystatusGet.md#getrequest) request)<br>Multiple status values can be provided with comma separated strings |
| [PetpetiduploadimagePostResponses.EndpointResponse](../../paths/petpetiduploadimage/post/PetpetiduploadimagePostResponses.md#endpointresponse) | [uploadImage](#uploadimage)([PetpetiduploadimagePost.PostRequest](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#postrequest) request)<br> |
| Void | [deletePet](#deletepet)([PetpetidDelete.DeleteRequest](../../paths/petpetid/PetpetidDelete.md#deleterequest) request)<br> |
| [PetpetidGetResponses.EndpointResponse](../../paths/petpetid/get/PetpetidGetResponses.md#endpointresponse) | [getPetById](#getpetbyid)([PetpetidGet.GetRequest](../../paths/petpetid/PetpetidGet.md#getrequest) request)<br>Returns a single pet |
| Void | [updatePetWithForm](#updatepetwithform)([PetpetidPost.PostRequest](../../paths/petpetid/PetpetidPost.md#postrequest) request)<br> |

## Method Detail

### uploadFileWithRequiredFile
public [FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse](../../paths/fakepetiduploadimagewithrequiredfile/post/FakepetiduploadimagewithrequiredfilePostResponses.md#endpointresponse) uploadFileWithRequiredFile([FakepetiduploadimagewithrequiredfilePost.PostRequest](../../paths/fakepetiduploadimagewithrequiredfile/FakepetiduploadimagewithrequiredfilePost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostRequestBody;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostSecurityInfo;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.responses.FakepetiduploadimagewithrequiredfilePostCode200Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.fakepetiduploadimagewithrequiredfile.post.FakepetiduploadimagewithrequiredfilePostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .fakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0SecurityIndex(FakepetiduploadimagewithrequiredfilePostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


// Map validation
FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMap pathParameters =
    FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParameters1.validate(
    new FakepetiduploadimagewithrequiredfilePostPathParameters.FakepetiduploadimagewithrequiredfilePostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new FakepetiduploadimagewithrequiredfilePost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

FakepetiduploadimagewithrequiredfilePostResponses.EndpointResponse response;
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
FakepetiduploadimagewithrequiredfilePostResponses.EndpointFakepetiduploadimagewithrequiredfilePostCode200Response castResponse = (FakepetiduploadimagewithrequiredfilePostResponses.EndpointFakepetiduploadimagewithrequiredfilePostCode200Response) response;
FakepetiduploadimagewithrequiredfilePostCode200Response.ApplicationjsonResponseBody deserializedBody = (FakepetiduploadimagewithrequiredfilePostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### addPet
public [PetPostResponses.EndpointResponse](../../paths/pet/post/PetPostResponses.md#endpointresponse) addPet([PetPost.PostRequest](../../paths/pet/PetPost.md#postrequest) request)

Add a new pet to the store

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.pet.post.PetPostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.post.PetPostRequestBody;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.pet.post.responses.PetPostCode200Response;
import org.openapijsonschematools.client.paths.pet.post.responses.PetPostCode405Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.pet.post.PetPostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petPostSecurityRequirementObject0SecurityIndex(PetPostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


Pet1BoxedMap requestBodyPayload =
    Pet.Pet1.validateAndBox(
    new Pet.PetMapBuilder()
        .name("a")

        .photoUrls(
            Arrays.asList(
                "a"
            )
        )
        .id(1L)

        .category(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "name",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1L
                )
            )
        )
        .tags(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "name",
                        "a"
                    )
                )
            )
        )
        .status("available")

    .build(),
    schemaConfiguration
);
PetPostRequestBody.SealedRequestBody requestBody = new PetPostRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new PetPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

PetPostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (PetPostCode405Response.ResponseApiException e) {
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
PetPostResponses.EndpointPetPostCode200Response castResponse = (PetPostResponses.EndpointPetPostCode200Response) response;
```
### updatePet
public Void updatePet([PetPut.PutRequest](../../paths/pet/PetPut.md#putrequest) request)



**Parameters:**<br>
request - the input request

**Returns:**<br>
nothing (Void)

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutSecurityInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutRequestBody;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode400Response;
import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode404Response;
import org.openapijsonschematools.client.paths.pet.put.responses.PetPutCode405Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.pet.put.PetPutResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petPutSecurityRequirementObject0SecurityIndex(PetPutSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


Pet1BoxedMap requestBodyPayload =
    Pet.Pet1.validateAndBox(
    new Pet.PetMapBuilder()
        .name("a")

        .photoUrls(
            Arrays.asList(
                "a"
            )
        )
        .id(1L)

        .category(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, Object>(
                    "name",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, Object>(
                    "id",
                    1L
                )
            )
        )
        .tags(
            Arrays.asList(
                MapUtils.makeMap(
                    new AbstractMap.SimpleEntry<String, String>(
                        "name",
                        "a"
                    )
                )
            )
        )
        .status("available")

    .build(),
    schemaConfiguration
);
PetPutRequestBody.SealedRequestBody requestBody = new PetPutRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new PetPut.PutRequestBuilder()
    .requestBody(requestBody)
    .build();

Void response;
try {
    response = apiClient.put(request);
} catch (PetPutCode400Response.ResponseApiException | PetPutCode404Response.ResponseApiException | PetPutCode405Response.ResponseApiException e) {
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
### findPetsByTags
public [PetfindbytagsGetResponses.EndpointResponse](../../paths/petfindbytags/get/PetfindbytagsGetResponses.md#endpointresponse) findPetsByTags([PetfindbytagsGet.GetRequest](../../paths/petfindbytags/PetfindbytagsGet.md#getrequest) request)

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
import org.openapijsonschematools.client.ServerInfo;
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
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petfindbytagsGetSecurityRequirementObject0SecurityIndex(PetfindbytagsGetSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


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
### findPetsByStatus
public [PetfindbystatusGetResponses.EndpointResponse](../../paths/petfindbystatus/get/PetfindbystatusGetResponses.md#endpointresponse) findPetsByStatus([PetfindbystatusGet.GetRequest](../../paths/petfindbystatus/PetfindbystatusGet.md#getrequest) request)

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
import org.openapijsonschematools.client.apis.tags.Pet;
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


// Map validation
PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMap queryParameters =
    PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParameters1.validate(
    new PetfindbystatusGetQueryParameters.PetfindbystatusGetQueryParametersMapBuilder()
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
### uploadImage
public [PetpetiduploadimagePostResponses.EndpointResponse](../../paths/petpetiduploadimage/post/PetpetiduploadimagePostResponses.md#endpointresponse) uploadImage([PetpetiduploadimagePost.PostRequest](../../paths/petpetiduploadimage/PetpetiduploadimagePost.md#postrequest) request)



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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.responses.PetpetiduploadimagePostCode200Response;
import org.openapijsonschematools.client.components.responses.successwithjsonapiresponse.SuccessWithJsonApiResponseHeadersSchema;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.petpetiduploadimage.post.PetpetiduploadimagePostResponses;

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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


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
### deletePet
public Void deletePet([PetpetidDelete.DeleteRequest](../../paths/petpetid/PetpetidDelete.md#deleterequest) request)



**Parameters:**<br>
request - the input request

**Returns:**<br>
nothing (Void)

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
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteHeaderParameters;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeletePathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetid.delete.responses.PetpetidDeleteCode400Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petpetidDeleteSecurityRequirementObject0SecurityIndex(PetpetidDeleteSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


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
### getPetById
public [PetpetidGetResponses.EndpointResponse](../../paths/petpetid/get/PetpetidGetResponses.md#endpointresponse) getPetById([PetpetidGet.GetRequest](../../paths/petpetid/PetpetidGet.md#getrequest) request)

Returns a single pet

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
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode200Response;
import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode400Response;
import org.openapijsonschematools.client.paths.petpetid.get.responses.PetpetidGetCode404Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petpetidGetSecurityRequirementObject0SecurityIndex(PetpetidGetSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


// Map validation
PetpetidGetPathParameters.PetpetidGetPathParametersMap pathParameters =
    PetpetidGetPathParameters.PetpetidGetPathParameters1.validate(
    new PetpetidGetPathParameters.PetpetidGetPathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new PetpetidGet.GetRequestBuilder()
    .pathParameters(pathParameters)
    .build();

PetpetidGetResponses.EndpointResponse response;
try {
    response = apiClient.get(request);
} catch (PetpetidGetCode400Response.ResponseApiException | PetpetidGetCode404Response.ResponseApiException e) {
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
PetpetidGetResponses.EndpointPetpetidGetCode200Response castResponse = (PetpetidGetResponses.EndpointPetpetidGetCode200Response) response;
if (castResponse.body instanceof PetpetidGetCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    PetpetidGetCode200Response.ApplicationjsonResponseBody deserializedBody = (PetpetidGetCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
### updatePetWithForm
public Void updatePetWithForm([PetpetidPost.PostRequest](../../paths/petpetid/PetpetidPost.md#postrequest) request)



**Parameters:**<br>
request - the input request

**Returns:**<br>
nothing (Void)

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
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostRequestBody;
import org.openapijsonschematools.client.ServerInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetid.post.responses.PetpetidPostCode405Response;
import org.openapijsonschematools.client.servers.ServerInfo;
import org.openapijsonschematools.client.apis.tags.Pet;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostResponses;

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
List<SecurityScheme> securitySchemes = new ArrayList();
securitySchemes.add(
    new ApiKey("someApiKey");
);
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfoBuilder()
    .petpetidPostSecurityRequirementObject0SecurityIndex(PetpetidPostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
Pet apiClient = new Pet(apiConfiguration, schemaConfiguration);


// Map validation
PetpetidPostPathParameters.PetpetidPostPathParametersMap pathParameters =
    PetpetidPostPathParameters.PetpetidPostPathParameters1.validate(
    new PetpetidPostPathParameters.PetpetidPostPathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new PetpetidPost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Void response;
try {
    response = apiClient.post(request);
} catch (PetpetidPostCode405Response.ResponseApiException e) {
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
[[Back to top]](#top) [[Back to README]](../../../README.md)
