# FakeuploadfilesPostResponses

public class FakeuploadfilesPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeuploadfilesPostCode200Response](#endpointfakeuploadfilespostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeuploadfilesPostCode200Response](#endpointfakeuploadfilespostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeuploadfilesPostCode200Response
public record EndpointFakeuploadfilesPostCode200Response(
    HttpResponse<byte[]> response,
    [FakeuploadfilesPostCode200Response.SealedResponseBody](../../../paths/fakeuploadfiles/post/responses/FakeuploadfilesPostCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<FakeuploadfilesPostCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

