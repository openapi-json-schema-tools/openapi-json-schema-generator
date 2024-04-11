# Usercreatewitharray

public class Usercreatewitharray extends extends ApiClient implements
[UsercreatewitharrayPost.PostOperation](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#postoperation)

an api client class which contains all the routes for path=""

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UsercreatewitharrayPostResponses.EndpointResponse](../../paths/usercreatewitharray/post/UsercreatewitharrayPostResponses.md#endpointresponse) | [post](#post)([UsercreatewitharrayPost.PostRequest](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#postrequest) request)<br> |

## Method Detail

### post
public [UsercreatewitharrayPostResponses.EndpointResponse](../../paths/usercreatewitharray/post/UsercreatewitharrayPostResponses.md#endpointresponse) post([UsercreatewitharrayPost.PostRequest](../../paths/usercreatewitharray/UsercreatewitharrayPost.md#postrequest) request)



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
import org.openapijsonschematools.client.paths.usercreatewitharray.post.UsercreatewitharrayPostRequestBody;
import org.openapijsonschematools.client.components.requestbodies.userarray.content.applicationjson.ApplicationjsonSchema;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.responses.UsercreatewitharrayPostCodedefaultResponse;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Usercreatewitharray;
import org.openapijsonschematools.client.paths.usercreatewitharray.post.UsercreatewitharrayPostResponses;

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
Usercreatewitharray apiClient = new Usercreatewitharray(apiConfiguration, schemaConfiguration);


ApplicationjsonSchema1BoxedList requestBodyPayload =
    ApplicationjsonSchema.ApplicationjsonSchema1.validateAndBox(
    new ApplicationjsonSchema.ApplicationjsonSchemaListBuilder()
        .add(
            MapUtils.makeMap(
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "id",
                    1L
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "username",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "firstName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "lastName",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "email",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "password",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "phone",
                    "a"
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "userStatus",
                    1
                ),
                new AbstractMap.SimpleEntry<String, @Nullable Object>(
                    "objectWithNoDeclaredPropsNullable",
                    null
                )
            )
        )
    .build(),
    schemaConfiguration
);
UsercreatewitharrayPostRequestBody.SealedRequestBody requestBody = new UsercreatewitharrayPostRequestBody.ApplicationjsonRequestBody(requestBodyPayload);

var request = new UsercreatewitharrayPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

UsercreatewitharrayPostResponses.EndpointResponse response;
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
UsercreatewitharrayPostResponses.EndpointUsercreatewitharrayPostCodedefaultResponse castResponse = (UsercreatewitharrayPostResponses.EndpointUsercreatewitharrayPostCodedefaultResponse) response;
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
