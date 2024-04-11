# Fakeparametercollisions1ababselfab

public class Fakeparametercollisions1ababselfab extends extends ApiClient implements
[Fakeparametercollisions1ababselfabPost.PostOperation](../../paths/fakeparametercollisions1ababselfab/Fakeparametercollisions1ababselfabPost.md#postoperation)

an api client class which contains all the routes for path="/fake/parameterCollisions/{1}/{aB}/{Ab}/{self}/{A-B}/"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Fakeparametercollisions1ababselfabPostResponses.EndpointResponse](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostResponses.md#endpointresponse) | [post](#post)([Fakeparametercollisions1ababselfabPost.PostRequest](../../paths/fakeparametercollisions1ababselfab/Fakeparametercollisions1ababselfabPost.md#postrequest) request) |

## Method Detail

### post
public [Fakeparametercollisions1ababselfabPostResponses.EndpointResponse](../../paths/fakeparametercollisions1ababselfab/post/Fakeparametercollisions1ababselfabPostResponses.md#endpointresponse) post([Fakeparametercollisions1ababselfabPost.PostRequest](../../paths/fakeparametercollisions1ababselfab/Fakeparametercollisions1ababselfabPost.md#postrequest) request)

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
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostRequestBody;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostHeaderParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostQueryParameters;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostCookieParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostPathParameters;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.responses.Fakeparametercollisions1ababselfabPostCode200Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Fakeparametercollisions1ababselfab;
import org.openapijsonschematools.client.paths.fakeparametercollisions1ababselfab.post.Fakeparametercollisions1ababselfabPostResponses;

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
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());
Fakeparametercollisions1ababselfab apiClient = new Fakeparametercollisions1ababselfab(apiConfiguration, schemaConfiguration);


// Map validation
Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMap pathParameters =
    Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParameters1.validate(
    new Fakeparametercollisions1ababselfabPostPathParameters.Fakeparametercollisions1ababselfabPostPathParametersMapBuilder()
        .positive1("a")

        .aHyphenMinusB("a")

        .Ab("a")

        .aB("a")

        .self("a")

    .build(),
    schemaConfiguration
);

var request = new Fakeparametercollisions1ababselfabPost.PostRequestBuilder()
    .pathParameters(pathParameters)
    .build();

Fakeparametercollisions1ababselfabPostResponses.EndpointResponse response;
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
Fakeparametercollisions1ababselfabPostResponses.EndpointFakeparametercollisions1ababselfabPostCode200Response castResponse = (Fakeparametercollisions1ababselfabPostResponses.EndpointFakeparametercollisions1ababselfabPostCode200Response) response;
Fakeparametercollisions1ababselfabPostCode200Response.ApplicationjsonResponseBody deserializedBody = (Fakeparametercollisions1ababselfabPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
// handle deserialized body here
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
