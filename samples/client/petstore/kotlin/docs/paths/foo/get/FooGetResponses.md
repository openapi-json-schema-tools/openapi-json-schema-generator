# FooGetResponses

public class FooGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFooGetCodedefaultResponse](#endpointfoogetcodedefaultresponse)<br> the response for default |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFooGetCodedefaultResponse](#endpointfoogetcodedefaultresponse)

a sealed interface that stores endpoint responses

## EndpointFooGetCodedefaultResponse
public record EndpointFooGetCodedefaultResponse(
    HttpResponse<byte[]> response,
    [FooGetCodedefaultResponse.SealedResponseBody](../../../paths/foo/get/responses/FooGetCodedefaultResponse.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FooGetCodedefaultResponse.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

