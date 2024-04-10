# FakeadditionalpropertieswitharrayofenumsGetResponses

public class FakeadditionalpropertieswitharrayofenumsGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response](#endpointfakeadditionalpropertieswitharrayofenumsgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response](#endpointfakeadditionalpropertieswitharrayofenumsgetcode200response)

a sealed interface that stores endpoint responses

## EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response
public record EndpointFakeadditionalpropertieswitharrayofenumsGetCode200Response(
    HttpResponse<byte[]> response,
    [FakeadditionalpropertieswitharrayofenumsGetCode200Response.SealedResponseBody](../../../paths/fakeadditionalpropertieswitharrayofenums/get/responses/FakeadditionalpropertieswitharrayofenumsGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakeadditionalpropertieswitharrayofenumsGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

