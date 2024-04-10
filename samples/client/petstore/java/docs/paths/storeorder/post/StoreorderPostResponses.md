# StoreorderPostResponses

public class StoreorderPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointStoreorderPostCode200Response](#endpointstoreorderpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointStoreorderPostCode200Response](#endpointstoreorderpostcode200response)

a sealed interface that stores endpoint responses

## EndpointStoreorderPostCode200Response
public record EndpointStoreorderPostCode200Response(
    HttpResponse<byte[]> response,
    [StoreorderPostCode200Response.SealedResponseBody](../../../paths/storeorder/post/responses/StoreorderPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<StoreorderPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

