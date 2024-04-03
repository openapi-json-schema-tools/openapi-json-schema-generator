# Put

public class Put

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [Put1](#put1)<br>The class that has a put method to call the endpoint |
| static class | [PutRequest](#putrequest)<br>The final request inputs class |
| static class | [PutNullableRequest](#putnullablerequest)<br>The initial request inputs class |
| static class | [Put0RequestBuilder](#put0requestbuilder)<br>A builder for the request input class |
| static class | [PutRequestBuilder](#putrequestbuilder)<br>A builder for the request input class |

## Put1
public static class Put1 extends ApiClient.ApiClient1 implements PutOperation<br>

a class that allows one to call the endpoint using a method named put

### Code Sample
```
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutSecurityInfo;
import org.openapijsonschematools.client.paths.pet.put.RequestBody;
import org.openapijsonschematools.client.components.schemas.Pet;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.securityschemes.SecurityScheme;
import org.openapijsonschematools.client.components.securityschemes.HttpSignatureTest;
import org.openapijsonschematools.client.components.securityschemes.PetstoreAuth;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.InvalidTypeException;
import org.openapijsonschematools.client.exceptions.ApiException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.paths.pet.Put;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

// if you want to use a sever that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfo(
    new Server0(),
    null,
    null
);
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfo()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0);
List<SecurityScheme> securitySchemes = new ArrayList();
ApiConfiguration.SecurityIndexInfo securityIndexInfo = new ApiConfiguration.SecurityIndexInfo();
    .petPutSecurityInfoSecurityIndex(PetPutSecurityInfo.SecurityIndex.SECURITY_0);
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    securitySchemes,
    securityIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
Put.Put1 apiClient = new Put.Put1(apiConfiguration, schemaConfiguration);


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

var request = new PutRequestBuilder()
    .requestBody(requestBody)
    .build();

try {
    Void response = apiClient.put(request);
} catch (ApiException e) {
    // server returned a response/contentType not defined in the openapi document
    throw e;
} catch (ValidationException | InvalidTypeException e) {
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
| Put1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | put([PutRequest](#putrequest) request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.SealedRequestBody](../../paths/pet/put/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [PetPutSecurityInfo.@Nullable SecurityIndex](../../paths/pet/put/PetPutSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/pet/put/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [PetPutSecurityInfo.@Nullable SecurityIndex](../../paths/pet/put/PetPutSecurityInfo.md#securityindex) | securityIndex |
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
| [Put0RequestBuilder](#put0requestbuilder) | securityIndex([PetPutSecurityInfo.SecurityIndex](../../paths/pet/put/PetPutSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
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
| [Put0RequestBuilder](#put0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/pet/put/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
