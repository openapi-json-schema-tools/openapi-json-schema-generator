# Responses

public class Responses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCode3XXResponse](#endpointcode3xxresponse)<br> the response for 3XX |
| record | [EndpointCode303Response](#endpointcode303response)<br> the response for 303 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCode3XXResponse](#endpointcode3xxresponse),
[EndpointCode303Response](#endpointcode303response)

a sealed interface that stores endpoint responses

## EndpointCode3XXResponse
public record EndpointCode3XXResponse(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

## EndpointCode303Response
public record EndpointCode303Response(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

