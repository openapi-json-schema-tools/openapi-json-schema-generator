 Responses

public class Responses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

# Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCodedefaultResponse](#endpointcodedefaultresponse)<br> the response for default |

# EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCodedefaultResponse](#endpointcodedefaultresponse)

a sealed interface that stores endpoint responses

# EndpointCodedefaultResponse
public record EndpointCodedefaultResponse(
    HttpResponse<byte[]> response,
    CodedefaultResponse.SealedResponseBody body,
    Void headers
) implements EndpointResponse, ApiResponse<CodedefaultResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

