# FakedeletecoffeeidDeleteResponses

public class FakedeletecoffeeidDeleteResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakedeletecoffeeidDeleteCode200Response](#endpointfakedeletecoffeeiddeletecode200response)<br> the response for 200 |
| record | [EndpointFakedeletecoffeeidDeleteCodedefaultResponse](#endpointfakedeletecoffeeiddeletecodedefaultresponse)<br> the response for default |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakedeletecoffeeidDeleteCode200Response](#endpointfakedeletecoffeeiddeletecode200response),
[EndpointFakedeletecoffeeidDeleteCodedefaultResponse](#endpointfakedeletecoffeeiddeletecodedefaultresponse)

a sealed interface that stores endpoint responses

## EndpointFakedeletecoffeeidDeleteCode200Response
public record EndpointFakedeletecoffeeidDeleteCode200Response(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

## EndpointFakedeletecoffeeidDeleteCodedefaultResponse
public record EndpointFakedeletecoffeeidDeleteCodedefaultResponse(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

