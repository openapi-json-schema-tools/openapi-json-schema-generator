# FakerefsarraymodelPostResponses

public class FakerefsarraymodelPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsarraymodelPostCode200Response](#endpointfakerefsarraymodelpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsarraymodelPostCode200Response](#endpointfakerefsarraymodelpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsarraymodelPostCode200Response
public record EndpointFakerefsarraymodelPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsarraymodelPostCode200Response.SealedResponseBody](../../../paths/fakerefsarraymodel/post/responses/FakerefsarraymodelPostCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakerefsarraymodelPostCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

