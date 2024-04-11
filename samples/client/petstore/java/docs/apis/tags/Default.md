# Default

public class Default extends extends ApiClient implements
[FooGet.FooGetOperation](../../paths/foo/FooGet.md#foogetoperation)

an api client class which contains all the routes for tag="default"
operations that lack tags are assigned this default tag

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooGetResponses.EndpointResponse](../../paths/foo/get/FooGetResponses.md#endpointresponse) | [fooGet](#fooget)([FooGet.GetRequest](../../paths/foo/FooGet.md#getrequest) request) |

## Method Detail

### fooGet
public [FooGetResponses.EndpointResponse](../../paths/foo/get/FooGetResponses.md#endpointresponse) fooGet([FooGet.GetRequest](../../paths/foo/FooGet.md#getrequest) request)

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
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer0;
import org.openapijsonschematools.client.paths.foo.get.servers.FooGetServer1;
import org.openapijsonschematools.client.paths.foo.get.responses.FooGetCodedefaultResponse;
import org.openapijsonschematools.client.paths.foo.get.FooGetServerInfo;
import org.openapijsonschematools.client.apis.tags.Default;
import org.openapijsonschematools.client.paths.foo.get.FooGetResponses;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
Map<String, List<String>> defaultHeaders = Map.of("User-Agent", List.of("OpenAPI-JSON-Schema-Generator//java"));
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout,
    defaultHeaders
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Default apiClient = new Default(apiConfiguration, schemaConfiguration);


var request = new FooGet.GetRequestBuilder().build();

FooGetResponses.EndpointResponse response;
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
FooGetResponses.EndpointFooGetCodedefaultResponse castResponse = (FooGetResponses.EndpointFooGetCodedefaultResponse) response;
FooGetCodedefaultResponse.ApplicationjsonResponseBody deserializedBody = (FooGetCodedefaultResponse.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
