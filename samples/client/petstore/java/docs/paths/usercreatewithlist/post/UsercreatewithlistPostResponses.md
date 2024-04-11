# UsercreatewithlistPostResponses

public class UsercreatewithlistPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointUsercreatewithlistPostCodedefaultResponse](#endpointusercreatewithlistpostcodedefaultresponse)<br> the response for default |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointUsercreatewithlistPostCodedefaultResponse](#endpointusercreatewithlistpostcodedefaultresponse)

a sealed interface that stores endpoint responses

## EndpointUsercreatewithlistPostCodedefaultResponse
public record EndpointUsercreatewithlistPostCodedefaultResponse(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

