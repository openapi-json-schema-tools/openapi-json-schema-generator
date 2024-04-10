# FakeuploadfilePostResponses

public class FakeuploadfilePostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeuploadfilePostCode200Response](#endpointfakeuploadfilepostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeuploadfilePostCode200Response](#endpointfakeuploadfilepostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeuploadfilePostCode200Response
public record EndpointFakeuploadfilePostCode200Response(
    HttpResponse<byte[]> response,
    [FakeuploadfilePostCode200Response.SealedResponseBody](../../../paths/fakeuploadfile/post/responses/FakeuploadfilePostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakeuploadfilePostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

