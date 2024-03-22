 Responses

public class Responses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

# Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCode1XXResponse](#endpointcode1xxresponse)<br> the response for 1XX |
| record | [EndpointCode2XXResponse](#endpointcode2xxresponse)<br> the response for 2XX |
| record | [EndpointCode200Response](#endpointcode200response)<br> the response for 200 |
| record | [EndpointCode3XXResponse](#endpointcode3xxresponse)<br> the response for 3XX |

# EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCode1XXResponse](#endpointcode1xxresponse),
[EndpointCode2XXResponse](#endpointcode2xxresponse),
[EndpointCode200Response](#endpointcode200response),
[EndpointCode3XXResponse](#endpointcode3xxresponse)

a sealed interface that stores endpoint responses

# EndpointCode1XXResponse
public record EndpointCode1XXResponse(
    HttpResponse<byte[]> response,
    Code1XXResponse.SealedResponseBody body,
    Void headers
) implements EndpointResponse, ApiResponse<Code1XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

# EndpointCode2XXResponse
public record EndpointCode2XXResponse(
    HttpResponse<byte[]> response,
    Code2XXResponse.SealedResponseBody body,
    Void headers
) implements EndpointResponse, ApiResponse<Code2XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

# EndpointCode200Response
public record EndpointCode200Response(
    HttpResponse<byte[]> response,
    Code200Response.SealedResponseBody body,
    Void headers
) implements EndpointResponse, ApiResponse<Code200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

# EndpointCode3XXResponse
public record EndpointCode3XXResponse(
    HttpResponse<byte[]> response,
    Code3XXResponse.SealedResponseBody body,
    Void headers
) implements EndpointResponse, ApiResponse<Code3XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

