# PetpetidPost

public class PetpetidPost

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetpetidPost1](#petpetidpost1)<br>The class that has a post method to call the endpoint |
| static class | [PetpetidPostRequest](#petpetidpostrequest)<br>The final request inputs class |
| static class | [PetpetidPostNullableRequest](#petpetidpostnullablerequest)<br>The initial request inputs class |
| static class | [Post0RequestBuilder](#post0requestbuilder)<br>A builder for the request input class |
| static class | [PostRequestBuilder](#postrequestbuilder)<br>A builder for the request input class |

## PetpetidPost1
public static class PetpetidPost1 extends ApiClient.ApiClient1 implements PetpetidPostOperation<br>

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
import org.openapijsonschematools.client.paths.petpetid.post.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PetpetidPostSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.post.PathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.ApiKey;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.paths.petpetid.post.responses.Code405Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.PetpetidPost;
import org.openapijsonschematools.client.paths.petpetid.post.Responses;

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
    .petpetidPostSecurityRequirementObject0SecurityIndex(PetpetidPostSecurityRequirementObject0.SecurityIndex.SECURITY_0)
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
PetpetidPost.PetpetidPost1 apiClient = new PetpetidPost.PetpetidPost1(apiConfiguration, schemaConfiguration);


// Map validation
PathParameters.PathParametersMap pathParameters =
    PathParameters.PathParameters1.validate(
    new PathParameters.PathParametersMapBuilder()
        .petId(1L)

    .build(),
    schemaConfiguration
);

var request = new PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Void response;
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
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetpetidPost1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | post([PetpetidPostRequest](#petpetidpostrequest) request) |

## PetpetidPostRequest
public static class PetpetidPostRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PathParameters.PathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) | pathParameters |
| [RequestBody.@Nullable SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetpetidPostSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PetpetidPostNullableRequest
public static class PetpetidPostNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PathParameters.@Nullable PathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) | pathParameters |
| [RequestBody.@Nullable SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [PetpetidPostSecurityInfo.@Nullable SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) | securityIndex |
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
| [PetpetidPostRequest](#petpetidpostrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Post0RequestBuilder](#post0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/petpetid/post/RequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [Post0RequestBuilder](#post0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Post0RequestBuilder](#post0requestbuilder) | securityIndex([PetpetidPostSecurityInfo.SecurityIndex](../../paths/petpetid/post/PetpetidPostSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
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
| [Post0RequestBuilder](#post0requestbuilder) | pathParameters([PathParametersPathParametersMap](../../paths/petpetid/post/PathParameters.md#pathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
