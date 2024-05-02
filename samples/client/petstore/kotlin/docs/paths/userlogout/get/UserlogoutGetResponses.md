# UserlogoutGetResponses

public class UserlogoutGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointUserlogoutGetCodedefaultResponse](#endpointuserlogoutgetcodedefaultresponse)<br> the response for default |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointUserlogoutGetCodedefaultResponse](#endpointuserlogoutgetcodedefaultresponse)

a sealed interface that stores endpoint responses

## EndpointUserlogoutGetCodedefaultResponse
public record EndpointUserlogoutGetCodedefaultResponse(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

