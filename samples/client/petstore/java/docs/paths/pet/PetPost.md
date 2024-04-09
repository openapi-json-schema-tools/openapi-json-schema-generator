# PetPost

public class PetPost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetPost1](#petpost1)<br>The class that has a post method to call the endpoint |
| static class | [PetPostRequest](#petpostrequest)<br>The final request inputs class |
| static class | [PetPostNullableRequest](#petpostnullablerequest)<br>The initial request inputs class |
| static class | [Post0RequestBuilder](#post0requestbuilder)<br>A builder for the request input class |
| static class | [PostRequestBuilder](#postrequestbuilder)<br>A builder for the request input class |

## PetPost1
public static class PetPost1 extends ApiClient.ApiClient1 implements PetPostOperation<br>

a class that allows one to call the endpoint using a method named post

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
import org.openapijsonschematools.client.paths.pet.post.PetPostSecurityInfo;
import org.openapijsonschematools.client.paths.pet.post.RequestBody;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.pet.post.responses.Code200Response;
import org.openapijsonschematools.client.paths.pet.post.responses.Code405Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.PetPost;
import org.openapijsonschematools.client.paths.pet.post.Responses;

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
    .petPostSecurityRequirementObject0SecurityIndex(PetPostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
PetPost.PetPost1 apiClient = new PetPost.PetPost1(apiConfiguration, schemaConfiguration);


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
RequestBody.SealedRequestBody requestBody = new RequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new PostRequestBuilder()
    .requestBody(requestBody)
    .build();

Responses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (Code405Response.ResponseApiException e) {
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
Responses.EndpointCode200Response castResponse = (Responses.EndpointCode200Response) response;
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/pet/post/Responses.md#endpointresponse) | post([PetPostRequest](#petpostrequest) request) |

## PetPostRequest
public static class PetPostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.SealedRequestBody](../../paths/pet/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetPostSecurityInfo.@Nullable SecurityIndex](../../paths/pet/post/PetPostSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PetPostNullableRequest
public static class PetPostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/pet/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [PetPostSecurityInfo.@Nullable SecurityIndex](../../paths/pet/post/PetPostSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

## Post0RequestBuilder
public static class Post0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post0RequestBuilder(Post0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetPostRequest](#petpostrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | securityIndex([PetPostSecurityInfo.SecurityIndex](../../paths/pet/post/PetPostSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## PostRequestBuilder
public static class PostRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PostRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/pet/post/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
