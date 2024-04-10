# UserusernameGetResponses

public class UserusernameGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointUserusernameGetCode200Response](#endpointuserusernamegetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointUserusernameGetCode200Response](#endpointuserusernamegetcode200response)

a sealed interface that stores endpoint responses

## EndpointUserusernameGetCode200Response
public record EndpointUserusernameGetCode200Response(
    HttpResponse<byte[]> response,
    [UserusernameGetCode200Response.SealedResponseBody](../../../paths/userusername/get/responses/UserusernameGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<UserusernameGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

