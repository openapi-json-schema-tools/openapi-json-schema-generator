# PetpetidGetResponses

public class PetpetidGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointPetpetidGetCode200Response](#endpointpetpetidgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointPetpetidGetCode200Response](#endpointpetpetidgetcode200response)

a sealed interface that stores endpoint responses

## EndpointPetpetidGetCode200Response
public record EndpointPetpetidGetCode200Response(
    HttpResponse<byte[]> response,
    [PetpetidGetCode200Response.SealedResponseBody](../../../paths/petpetid/get/responses/PetpetidGetCode200Response.md#sealedresponsebody) body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<PetpetidGetCode200Response.SealedResponseBody, Nothing?><br>

a class that stores an endpoint response

