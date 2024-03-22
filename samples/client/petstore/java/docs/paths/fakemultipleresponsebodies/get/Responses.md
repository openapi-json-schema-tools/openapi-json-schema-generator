# Responses

public class Responses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCode200Response](#endpointcode200response)<br> the response for 200 |
| record | [EndpointCode202Response](#endpointcode202response)<br> the response for 202 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCode200Response](#endpointcode200response),
[EndpointCode202Response](#endpointcode202response)

a sealed interface that stores endpoint responses

## EndpointCode200Response
public record EndpointCode200Response(
    HttpResponse<byte[]> response,
    [Code200Response.SealedResponseBody](../../../paths/fakemultipleresponsebodies/get/responses/Code200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

## EndpointCode202Response
public record EndpointCode202Response(
    HttpResponse<byte[]> response,
    [Code202Response.SealedResponseBody](../../../paths/fakemultipleresponsebodies/get/responses/Code202Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<Code202Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

