# PetfindbytagsGetResponses

public class PetfindbytagsGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointPetfindbytagsGetCode200Response](#endpointpetfindbytagsgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointPetfindbytagsGetCode200Response](#endpointpetfindbytagsgetcode200response)

a sealed interface that stores endpoint responses

## EndpointPetfindbytagsGetCode200Response
public record EndpointPetfindbytagsGetCode200Response(
    HttpResponse<byte[]> response,
    [PetfindbytagsGetCode200Response.SealedResponseBody](../../../paths/petfindbytags/get/responses/PetfindbytagsGetCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<PetfindbytagsGetCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

