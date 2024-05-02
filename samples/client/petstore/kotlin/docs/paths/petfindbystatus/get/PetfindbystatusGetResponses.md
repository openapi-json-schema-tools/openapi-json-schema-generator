# PetfindbystatusGetResponses

public class PetfindbystatusGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointPetfindbystatusGetCode200Response](#endpointpetfindbystatusgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointPetfindbystatusGetCode200Response](#endpointpetfindbystatusgetcode200response)

a sealed interface that stores endpoint responses

## EndpointPetfindbystatusGetCode200Response
public record EndpointPetfindbystatusGetCode200Response(
    HttpResponse<byte[]> response,
    [PetfindbystatusGetCode200Response.SealedResponseBody](../../../paths/petfindbystatus/get/responses/PetfindbystatusGetCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<PetfindbystatusGetCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

