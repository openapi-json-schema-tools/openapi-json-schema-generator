# FakehealthGetResponses

public class FakehealthGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakehealthGetCode200Response](#endpointfakehealthgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakehealthGetCode200Response](#endpointfakehealthgetcode200response)

a sealed interface that stores endpoint responses

## EndpointFakehealthGetCode200Response
public record EndpointFakehealthGetCode200Response(
    HttpResponse<byte[]> response,
    [FakehealthGetCode200Response.SealedResponseBody](../../../paths/fakehealth/get/responses/FakehealthGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakehealthGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

