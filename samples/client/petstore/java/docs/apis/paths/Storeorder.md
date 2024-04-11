# Storeorder

public class Storeorder extends extends ApiClient implements
[StoreorderPost.PostOperation](../../paths/storeorder/StoreorderPost.md#postoperation)

an api client class which contains all the routes for path="/store/order"

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [StoreorderPostResponses.EndpointResponse](../../paths/storeorder/post/StoreorderPostResponses.md#endpointresponse) | [post](#post)([StoreorderPost.PostRequest](../../paths/storeorder/StoreorderPost#postrequest) request)<br> |

## Method Detail

### post
public [StoreorderPostResponses.EndpointResponse](../../paths/storeorder/post/StoreorderPostResponses.md#endpointresponse) post([StoreorderPost.PostRequest](../../paths/storeorder/StoreorderPost#postrequest) request)



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
import org.openapijsonschematools.client.paths.storeorder.post.StoreorderPostRequestBody;
import org.openapijsonschematools.client.components.schemas.Order;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode200Response;
import org.openapijsonschematools.client.paths.storeorder.post.responses.StoreorderPostCode400Response;
import org.openapijsonschematools.client.servers.RootServerInfo;
import org.openapijsonschematools.client.apis.paths.Storeorder;
import org.openapijsonschematools.client.paths.storeorder.post.StoreorderPostResponses;

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
Storeorder apiClient = new Storeorder(apiConfiguration, schemaConfiguration);


Order1BoxedMap requestBodyPayload =
    Order.Order1.validateAndBox(
    new Order.OrderMapBuilder()
        .id(1L)

        .petId(1L)

        .quantity(1)

        .shipDate("1970-01-01T00:00:00.00Z")

        .status("placed")

        .complete(true)

    .build(),
    schemaConfiguration
);
StoreorderPost.SealedRequestBody requestBody = new StoreorderPost.ApplicationjsonRequestBody(requestBodyPayload);

var request = new StoreorderPost.PostRequestBuilder()
    .requestBody(requestBody)
    .build();

StoreorderPostResponses.EndpointResponse response;
try {
    response = apiClient.post(request);
} catch (StoreorderPostCode400Response.ResponseApiException e) {
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
StoreorderPostResponses.EndpointStoreorderPostCode200Response castResponse = (StoreorderPostResponses.EndpointStoreorderPostCode200Response) response;
if (castResponse.body instanceof StoreorderPostCode200Response.ApplicationxmlResponseBody deserializedBody) {
    // handle deserialized body here
} else {
    StoreorderPostCode200Response.ApplicationjsonResponseBody deserializedBody = (StoreorderPostCode200Response.ApplicationjsonResponseBody) castResponse.body;
    // handle deserialized body here
}
```
[[Back to top]](#top) [[Back to README]](../../../README.md)
