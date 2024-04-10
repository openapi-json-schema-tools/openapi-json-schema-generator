# AnotherfakedummyPatchResponses

public class AnotherfakedummyPatchResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointAnotherfakedummyPatchCode200Response](#endpointanotherfakedummypatchcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointAnotherfakedummyPatchCode200Response](#endpointanotherfakedummypatchcode200response)

a sealed interface that stores endpoint responses

## EndpointAnotherfakedummyPatchCode200Response
public record EndpointAnotherfakedummyPatchCode200Response(
    HttpResponse<byte[]> response,
    [AnotherfakedummyPatchCode200Response.SealedResponseBody](../../../paths/anotherfakedummy/patch/responses/AnotherfakedummyPatchCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<AnotherfakedummyPatchCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

