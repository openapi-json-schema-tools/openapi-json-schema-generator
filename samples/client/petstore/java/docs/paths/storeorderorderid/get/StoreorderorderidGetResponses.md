# StoreorderorderidGetResponses

public class StoreorderorderidGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointStoreorderorderidGetCode200Response](#endpointstoreorderorderidgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointStoreorderorderidGetCode200Response](#endpointstoreorderorderidgetcode200response)

a sealed interface that stores endpoint responses

## EndpointStoreorderorderidGetCode200Response
public record EndpointStoreorderorderidGetCode200Response(
    HttpResponse<byte[]> response,
    [StoreorderorderidGetCode200Response.SealedResponseBody](../../../paths/storeorderorderid/get/responses/StoreorderorderidGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<StoreorderorderidGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

