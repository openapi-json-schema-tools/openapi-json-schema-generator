# FakequeryparamwithjsoncontenttypeGetResponses

public class FakequeryparamwithjsoncontenttypeGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakequeryparamwithjsoncontenttypeGetCode200Response](#endpointfakequeryparamwithjsoncontenttypegetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakequeryparamwithjsoncontenttypeGetCode200Response](#endpointfakequeryparamwithjsoncontenttypegetcode200response)

a sealed interface that stores endpoint responses

## EndpointFakequeryparamwithjsoncontenttypeGetCode200Response
public record EndpointFakequeryparamwithjsoncontenttypeGetCode200Response(
    HttpResponse<byte[]> response,
    [FakequeryparamwithjsoncontenttypeGetCode200Response.SealedResponseBody](../../../paths/fakequeryparamwithjsoncontenttype/get/responses/FakequeryparamwithjsoncontenttypeGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakequeryparamwithjsoncontenttypeGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

