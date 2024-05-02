# FakejsonwithcharsetPostResponses

public class FakejsonwithcharsetPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakejsonwithcharsetPostCode200Response](#endpointfakejsonwithcharsetpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakejsonwithcharsetPostCode200Response](#endpointfakejsonwithcharsetpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakejsonwithcharsetPostCode200Response
public record EndpointFakejsonwithcharsetPostCode200Response(
    HttpResponse<byte[]> response,
    [FakejsonwithcharsetPostCode200Response.SealedResponseBody](../../../paths/fakejsonwithcharset/post/responses/FakejsonwithcharsetPostCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakejsonwithcharsetPostCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

