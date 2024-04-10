# FakeuploaddownloadfilePostResponses

public class FakeuploaddownloadfilePostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeuploaddownloadfilePostCode200Response](#endpointfakeuploaddownloadfilepostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeuploaddownloadfilePostCode200Response](#endpointfakeuploaddownloadfilepostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeuploaddownloadfilePostCode200Response
public record EndpointFakeuploaddownloadfilePostCode200Response(
    HttpResponse<byte[]> response,
    [FakeuploaddownloadfilePostCode200Response.SealedResponseBody](../../../paths/fakeuploaddownloadfile/post/responses/FakeuploaddownloadfilePostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakeuploaddownloadfilePostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

