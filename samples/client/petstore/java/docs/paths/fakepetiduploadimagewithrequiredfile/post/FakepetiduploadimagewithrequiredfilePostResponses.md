# FakepetiduploadimagewithrequiredfilePostResponses

public class FakepetiduploadimagewithrequiredfilePostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakepetiduploadimagewithrequiredfilePostCode200Response](#endpointfakepetiduploadimagewithrequiredfilepostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakepetiduploadimagewithrequiredfilePostCode200Response](#endpointfakepetiduploadimagewithrequiredfilepostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakepetiduploadimagewithrequiredfilePostCode200Response
public record EndpointFakepetiduploadimagewithrequiredfilePostCode200Response(
    HttpResponse<byte[]> response,
    [FakepetiduploadimagewithrequiredfilePostCode200Response.SealedResponseBody](../../../paths/fakepetiduploadimagewithrequiredfile/post/responses/FakepetiduploadimagewithrequiredfilePostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakepetiduploadimagewithrequiredfilePostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

