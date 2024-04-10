# FakeinlinecompositionPostResponses

public class FakeinlinecompositionPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeinlinecompositionPostCode200Response](#endpointfakeinlinecompositionpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeinlinecompositionPostCode200Response](#endpointfakeinlinecompositionpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeinlinecompositionPostCode200Response
public record EndpointFakeinlinecompositionPostCode200Response(
    HttpResponse<byte[]> response,
    [FakeinlinecompositionPostCode200Response.SealedResponseBody](../../../paths/fakeinlinecomposition/post/responses/FakeinlinecompositionPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakeinlinecompositionPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

