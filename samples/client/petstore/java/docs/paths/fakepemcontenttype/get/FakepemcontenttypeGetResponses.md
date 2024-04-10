# FakepemcontenttypeGetResponses

public class FakepemcontenttypeGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakepemcontenttypeGetCode200Response](#endpointfakepemcontenttypegetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakepemcontenttypeGetCode200Response](#endpointfakepemcontenttypegetcode200response)

a sealed interface that stores endpoint responses

## EndpointFakepemcontenttypeGetCode200Response
public record EndpointFakepemcontenttypeGetCode200Response(
    HttpResponse<byte[]> response,
    [FakepemcontenttypeGetCode200Response.SealedResponseBody](../../../paths/fakepemcontenttype/get/responses/FakepemcontenttypeGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakepemcontenttypeGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

