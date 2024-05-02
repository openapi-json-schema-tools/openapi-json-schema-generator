# FakerefsbooleanPostResponses

public class FakerefsbooleanPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsbooleanPostCode200Response](#endpointfakerefsbooleanpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsbooleanPostCode200Response](#endpointfakerefsbooleanpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsbooleanPostCode200Response
public record EndpointFakerefsbooleanPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsbooleanPostCode200Response.SealedResponseBody](../../../paths/fakerefsboolean/post/responses/FakerefsbooleanPostCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakerefsbooleanPostCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

