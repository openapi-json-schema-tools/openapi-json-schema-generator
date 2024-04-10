# Fakeparametercollisions1ababselfabPostResponses

public class Fakeparametercollisions1ababselfabPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeparametercollisions1ababselfabPostCode200Response](#endpointfakeparametercollisions1ababselfabpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeparametercollisions1ababselfabPostCode200Response](#endpointfakeparametercollisions1ababselfabpostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeparametercollisions1ababselfabPostCode200Response
public record EndpointFakeparametercollisions1ababselfabPostCode200Response(
    HttpResponse<byte[]> response,
    [Fakeparametercollisions1ababselfabPostCode200Response.SealedResponseBody](../../../paths/fakeparametercollisions1ababselfab/post/responses/Fakeparametercollisions1ababselfabPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<Fakeparametercollisions1ababselfabPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

