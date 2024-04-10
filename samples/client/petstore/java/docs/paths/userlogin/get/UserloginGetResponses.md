# UserloginGetResponses

public class UserloginGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointUserloginGetCode200Response](#endpointuserlogingetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointUserloginGetCode200Response](#endpointuserlogingetcode200response)

a sealed interface that stores endpoint responses

## EndpointUserloginGetCode200Response
public record EndpointUserloginGetCode200Response(
    HttpResponse<byte[]> response,
    [UserloginGetCode200Response.SealedResponseBody](../../../paths/userlogin/get/responses/UserloginGetCode200Response.md#sealedresponsebody) body,
    [UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap](../../../paths/userlogin/get/responses/code200response/UserloginGetCode200ResponseHeadersSchema.md#userlogingetcode200responseheadersschemamap) headers
) implements EndpointResponse, ApiResponse<UserloginGetCode200Response.SealedResponseBody, UserloginGetCode200ResponseHeadersSchema.UserloginGetCode200ResponseHeadersSchemaMap><br>

a class that stores an endpoint response

