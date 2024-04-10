# FakerefsenumPostResponses

public class FakerefsenumPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsenumPostCode200Response](#endpointfakerefsenumpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsenumPostCode200Response](#endpointfakerefsenumpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsenumPostCode200Response
public record EndpointFakerefsenumPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsenumPostCode200Response.SealedResponseBody](../../../paths/fakerefsenum/post/responses/FakerefsenumPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefsenumPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

