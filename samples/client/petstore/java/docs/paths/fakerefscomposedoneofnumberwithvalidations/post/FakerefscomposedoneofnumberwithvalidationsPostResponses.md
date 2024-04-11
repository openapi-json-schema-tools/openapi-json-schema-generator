# FakerefscomposedoneofnumberwithvalidationsPostResponses

public class FakerefscomposedoneofnumberwithvalidationsPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response](#endpointfakerefscomposedoneofnumberwithvalidationspostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response](#endpointfakerefscomposedoneofnumberwithvalidationspostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response
public record EndpointFakerefscomposedoneofnumberwithvalidationsPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefscomposedoneofnumberwithvalidationsPostCode200Response.SealedResponseBody](../../../paths/fakerefscomposedoneofnumberwithvalidations/post/responses/FakerefscomposedoneofnumberwithvalidationsPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefscomposedoneofnumberwithvalidationsPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

