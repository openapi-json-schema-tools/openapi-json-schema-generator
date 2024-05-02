# FakemultipleresponsebodiesGetResponses

public class FakemultipleresponsebodiesGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakemultipleresponsebodiesGetCode200Response](#endpointfakemultipleresponsebodiesgetcode200response)<br> the response for 200 |
| record | [EndpointFakemultipleresponsebodiesGetCode202Response](#endpointfakemultipleresponsebodiesgetcode202response)<br> the response for 202 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakemultipleresponsebodiesGetCode200Response](#endpointfakemultipleresponsebodiesgetcode200response),
[EndpointFakemultipleresponsebodiesGetCode202Response](#endpointfakemultipleresponsebodiesgetcode202response)

a sealed interface that stores endpoint responses

## EndpointFakemultipleresponsebodiesGetCode200Response
public record EndpointFakemultipleresponsebodiesGetCode200Response(
    HttpResponse<byte[]> response,
    [FakemultipleresponsebodiesGetCode200Response.SealedResponseBody](../../../paths/fakemultipleresponsebodies/get/responses/FakemultipleresponsebodiesGetCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakemultipleresponsebodiesGetCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

## EndpointFakemultipleresponsebodiesGetCode202Response
public record EndpointFakemultipleresponsebodiesGetCode202Response(
    HttpResponse<byte[]> response,
    [FakemultipleresponsebodiesGetCode202Response.SealedResponseBody](../../../paths/fakemultipleresponsebodies/get/responses/FakemultipleresponsebodiesGetCode202Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakemultipleresponsebodiesGetCode202Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

