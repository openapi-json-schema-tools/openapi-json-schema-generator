# FakerefsnumberPostResponses

public class FakerefsnumberPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsnumberPostCode200Response](#endpointfakerefsnumberpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsnumberPostCode200Response](#endpointfakerefsnumberpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsnumberPostCode200Response
public record EndpointFakerefsnumberPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsnumberPostCode200Response.SealedResponseBody](../../../paths/fakerefsnumber/post/responses/FakerefsnumberPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefsnumberPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

