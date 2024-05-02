# UserPostResponses

public class UserPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointUserPostCodedefaultResponse](#endpointuserpostcodedefaultresponse)<br> the response for default |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointUserPostCodedefaultResponse](#endpointuserpostcodedefaultresponse)

a sealed interface that stores endpoint responses

## EndpointUserPostCodedefaultResponse
public record EndpointUserPostCodedefaultResponse(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

