# UserloginGetResponses

public class UserloginGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCode200Response](#endpointcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCode200Response](#endpointcode200response)

a sealed interface that stores endpoint responses

## EndpointCode200Response
public record EndpointCode200Response(
    HttpResponse<byte[]> response,
    [Code200Response.SealedResponseBody](../../../paths/userlogin/get/responses/Code200Response.md#sealedresponsebody) body,
    [Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap](../../../paths/userlogin/get/responses/code200response/Code200ResponseHeadersSchema.md#code200responseheadersschemamap) headers
) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Code200ResponseHeadersSchema.Code200ResponseHeadersSchemaMap><br>

a class that stores an endpoint response

