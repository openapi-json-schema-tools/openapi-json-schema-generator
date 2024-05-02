# FakerefsstringPostResponses

public class FakerefsstringPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsstringPostCode200Response](#endpointfakerefsstringpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsstringPostCode200Response](#endpointfakerefsstringpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsstringPostCode200Response
public record EndpointFakerefsstringPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsstringPostCode200Response.SealedResponseBody](../../../paths/fakerefsstring/post/responses/FakerefsstringPostCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakerefsstringPostCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

