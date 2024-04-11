# CommonparamsubdirPostResponses

public class CommonparamsubdirPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointCommonparamsubdirPostCode200Response](#endpointcommonparamsubdirpostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointCommonparamsubdirPostCode200Response](#endpointcommonparamsubdirpostcode200response)

a sealed interface that stores endpoint responses

## EndpointCommonparamsubdirPostCode200Response
public record EndpointCommonparamsubdirPostCode200Response(
    HttpResponse<byte[]> response,
    Void body,
    Void headers
) implements EndpointResponse, ApiResponse<Void, Void><br>

a class that stores an endpoint response

