# FakewildcardresponsesGetResponses

public class FakewildcardresponsesGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakewildcardresponsesGetCode1XXResponse](#endpointfakewildcardresponsesgetcode1xxresponse)<br> the response for 1XX |
| record | [EndpointFakewildcardresponsesGetCode2XXResponse](#endpointfakewildcardresponsesgetcode2xxresponse)<br> the response for 2XX |
| record | [EndpointFakewildcardresponsesGetCode200Response](#endpointfakewildcardresponsesgetcode200response)<br> the response for 200 |
| record | [EndpointFakewildcardresponsesGetCode3XXResponse](#endpointfakewildcardresponsesgetcode3xxresponse)<br> the response for 3XX |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakewildcardresponsesGetCode1XXResponse](#endpointfakewildcardresponsesgetcode1xxresponse),
[EndpointFakewildcardresponsesGetCode2XXResponse](#endpointfakewildcardresponsesgetcode2xxresponse),
[EndpointFakewildcardresponsesGetCode200Response](#endpointfakewildcardresponsesgetcode200response),
[EndpointFakewildcardresponsesGetCode3XXResponse](#endpointfakewildcardresponsesgetcode3xxresponse)

a sealed interface that stores endpoint responses

## EndpointFakewildcardresponsesGetCode1XXResponse
public record EndpointFakewildcardresponsesGetCode1XXResponse(
    HttpResponse<byte[]> response,
    [FakewildcardresponsesGetCode1XXResponse.SealedResponseBody](../../../paths/fakewildcardresponses/get/responses/FakewildcardresponsesGetCode1XXResponse.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode1XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

## EndpointFakewildcardresponsesGetCode2XXResponse
public record EndpointFakewildcardresponsesGetCode2XXResponse(
    HttpResponse<byte[]> response,
    [FakewildcardresponsesGetCode2XXResponse.SealedResponseBody](../../../paths/fakewildcardresponses/get/responses/FakewildcardresponsesGetCode2XXResponse.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode2XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

## EndpointFakewildcardresponsesGetCode200Response
public record EndpointFakewildcardresponsesGetCode200Response(
    HttpResponse<byte[]> response,
    [FakewildcardresponsesGetCode200Response.SealedResponseBody](../../../paths/fakewildcardresponses/get/responses/FakewildcardresponsesGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

## EndpointFakewildcardresponsesGetCode3XXResponse
public record EndpointFakewildcardresponsesGetCode3XXResponse(
    HttpResponse<byte[]> response,
    [FakewildcardresponsesGetCode3XXResponse.SealedResponseBody](../../../paths/fakewildcardresponses/get/responses/FakewildcardresponsesGetCode3XXResponse.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakewildcardresponsesGetCode3XXResponse.SealedResponseBody, Void><br>

a class that stores an endpoint response

