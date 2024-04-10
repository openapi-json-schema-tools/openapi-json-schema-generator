# FakeredirectionGetResponses

public class FakeredirectionGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeredirectionGetCode3XXResponse](#endpointfakeredirectiongetcode3xxresponse)<br> the response for 3XX |
| record | [EndpointFakeredirectionGetCode303Response](#endpointfakeredirectiongetcode303response)<br> the response for 303 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeredirectionGetCode3XXResponse](#endpointfakeredirectiongetcode3xxresponse),
[EndpointFakeredirectionGetCode303Response](#endpointfakeredirectiongetcode303response)

a sealed interface that stores endpoint responses

## EndpointFakeredirectionGetCode3XXResponse
public record EndpointFakeredirectionGetCode3XXResponse(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

## EndpointFakeredirectionGetCode303Response
public record EndpointFakeredirectionGetCode303Response(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

