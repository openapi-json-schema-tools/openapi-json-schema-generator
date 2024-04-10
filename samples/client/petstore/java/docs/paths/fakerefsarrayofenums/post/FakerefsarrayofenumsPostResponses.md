# FakerefsarrayofenumsPostResponses

public class FakerefsarrayofenumsPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsarrayofenumsPostCode200Response](#endpointfakerefsarrayofenumspostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsarrayofenumsPostCode200Response](#endpointfakerefsarrayofenumspostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsarrayofenumsPostCode200Response
public record EndpointFakerefsarrayofenumsPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsarrayofenumsPostCode200Response.SealedResponseBody](../../../paths/fakerefsarrayofenums/post/responses/FakerefsarrayofenumsPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefsarrayofenumsPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

