# FakePatchResponses

public class FakePatchResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakePatchCode200Response](#endpointfakepatchcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakePatchCode200Response](#endpointfakepatchcode200response)

a sealed interface that stores endpoint responses

## EndpointFakePatchCode200Response
public record EndpointFakePatchCode200Response(
    HttpResponse<byte[]> response,
    [FakePatchCode200Response.SealedResponseBody](../../../paths/fake/patch/responses/FakePatchCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakePatchCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

