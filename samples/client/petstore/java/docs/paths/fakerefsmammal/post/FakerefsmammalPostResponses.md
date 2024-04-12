# FakerefsmammalPostResponses

public class FakerefsmammalPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsmammalPostCode200Response](#endpointfakerefsmammalpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsmammalPostCode200Response](#endpointfakerefsmammalpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsmammalPostCode200Response
public record EndpointFakerefsmammalPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsmammalPostCode200Response.SealedResponseBody](../../../paths/fakerefsmammal/post/responses/FakerefsmammalPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefsmammalPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

