# FakerefsobjectmodelwithrefpropsPostResponses

public class FakerefsobjectmodelwithrefpropsPostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakerefsobjectmodelwithrefpropsPostCode200Response](#endpointfakerefsobjectmodelwithrefpropspostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakerefsobjectmodelwithrefpropsPostCode200Response](#endpointfakerefsobjectmodelwithrefpropspostcode200response)

a sealed interface that stores endpoint responses

## EndpointFakerefsobjectmodelwithrefpropsPostCode200Response
public record EndpointFakerefsobjectmodelwithrefpropsPostCode200Response(
    HttpResponse<byte[]> response,
    [FakerefsobjectmodelwithrefpropsPostCode200Response.SealedResponseBody](../../../paths/fakerefsobjectmodelwithrefprops/post/responses/FakerefsobjectmodelwithrefpropsPostCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakerefsobjectmodelwithrefpropsPostCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

