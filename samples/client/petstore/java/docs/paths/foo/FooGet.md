# FooGet

public class FooGet

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [FooGet1](#fooget1)<br>The class that has a get method to call the endpoint |
| static class | [FooGetRequest](#foogetrequest)<br>The request inputs class |
| static class | [GetRequestBuilder](#getrequestbuilder)<br>A builder for the request input class |

## FooGet1
public static class FooGet1 extends ApiClient.ApiClient1 implements FooGetOperation<br>

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
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer0;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer1;
import org.openapijsonschematools.client.paths.foo.get.responses.CodedefaultResponse;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.FooGet;
import org.openapijsonschematools.client.paths.foo.get.Responses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

// if you want to use a server that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfoBuilder()
    .fooGetServerInfo(
        new FooGetServerInfo.FooGetServerInfoBuilder()
            .fooGetServer0(new FooGetServer0())
            .build()
    )
    .build();
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfoBuilder()
    .fooGetServerInfoServerIndex(FooGetServerInfo.ServerIndex.SERVER_0)
    .build();
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
FooGet.FooGet1 apiClient = new FooGet.FooGet1(apiConfiguration, schemaConfiguration);


var request = new GetRequestBuilder().build();

Responses.EndpointResponse response;
try {
    response = apiClient.get(request);
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
Responses.EndpointCodedefaultResponse castResponse = (Responses.EndpointCodedefaultResponse) response;
CodedefaultResponse.ApplicationjsonResponseBody deserializedBody = (CodedefaultResponse.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGet1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/foo/get/Responses.md#endpointresponse) | get([FooGetRequest](#foogetrequest) request) |

## FooGetRequest
public static class FooGetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FooGetServerInfo.@Nullable ServerIndex](../../paths/foo/get/FooGetServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

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
| [FooGetRequest](#foogetrequest) | build()<br>Returns the request input used to call an endpoint method |
| [GetRequestBuilder](#getrequestbuilder) | serverIndex([FooGetServerInfo.ServerIndex](../../paths/foo/get/FooGetServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [GetRequestBuilder](#getrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
