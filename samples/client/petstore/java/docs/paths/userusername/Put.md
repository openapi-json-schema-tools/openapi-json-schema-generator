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
| static class | [Put00RequestBuilder](#put00requestbuilder)<br>A builder for the request input class |
| static class | [Put01RequestBuilder](#put01requestbuilder)<br>A builder for the request input class |
| static class | [Put10RequestBuilder](#put10requestbuilder)<br>A builder for the request input class |
| static class | [PutRequestBuilder](#putrequestbuilder)<br>A builder for the request input class |

## Put1
public static class Put1 extends ApiClient.ApiClient1 implements PutOperation<br>

a class that allows one to call the endpoint using a method named put

### Code Sample
```
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.paths.userusername.Put;

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
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
Put.Put1 apiClient = new Put.Put1(apiConfiguration, schemaConfiguration);

// todo set sample for requestBody
// RequestBody

// Map validation
PathParameters.PathParametersMap pathParameters =
    PathParameters.PathParameters1.validate(
    new PathParameters.PathParametersMapBuilder()
        .username("a")

    .build(),
    schemaConfiguration
);
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
| [RequestBody.SealedRequestBody](../../paths/userusername/put/RequestBody.md#sealedrequestbody) | requestBody |
| [PathParameters.PathParametersMap](../../paths/userusername/put/PathParameters.md#pathparametersmap) | pathParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/userusername/put/RequestBody.md#sealedrequestbody) | requestBody |
| [PathParameters.@Nullable PathParametersMap](../../paths/userusername/put/PathParameters.md#pathparametersmap) | pathParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| @Nullable Duration | timeout |

## Put00RequestBuilder
public static class Put00RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put00RequestBuilder(Put00RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PutRequest](#putrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Put00RequestBuilder](#put00requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Put00RequestBuilder](#put00requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## Put01RequestBuilder
public static class Put01RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put01RequestBuilder(Put01RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put00RequestBuilder](#put00requestbuilder) | pathParameters([PathParametersPathParametersMap](../../paths/userusername/put/PathParameters.md#pathparametersmap) pathParameters)<br>sets the property |

## Put10RequestBuilder
public static class Put10RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put10RequestBuilder(Put10RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put00RequestBuilder](#put00requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/userusername/put/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

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
| [Put01RequestBuilder](#put01requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/userusername/put/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |
| [Put10RequestBuilder](#put10requestbuilder) | pathParameters([PathParametersPathParametersMap](../../paths/userusername/put/PathParameters.md#pathparametersmap) pathParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
