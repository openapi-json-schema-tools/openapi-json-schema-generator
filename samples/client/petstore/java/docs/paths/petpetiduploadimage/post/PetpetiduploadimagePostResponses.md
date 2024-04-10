# PetpetiduploadimagePostResponses

public class PetpetiduploadimagePostResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointPetpetiduploadimagePostCode200Response](#endpointpetpetiduploadimagepostcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointPetpetiduploadimagePostCode200Response](#endpointpetpetiduploadimagepostcode200response)

a sealed interface that stores endpoint responses

## EndpointPetpetiduploadimagePostCode200Response
public record EndpointPetpetiduploadimagePostCode200Response(
    HttpResponse<byte[]> response,
    [PetpetiduploadimagePostCode200Response.SealedResponseBody](../../../paths/petpetiduploadimage/post/responses/PetpetiduploadimagePostCode200Response.md#sealedresponsebody) body,
    [SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap](../../../components/responses/successwithjsonapiresponse/SuccessWithJsonApiResponseHeadersSchema.md#successwithjsonapiresponseheadersschemamap) headers
) implements EndpointResponse, ApiResponse<PetpetiduploadimagePostCode200Response.SealedResponseBody, SuccessWithJsonApiResponseHeadersSchema.SuccessWithJsonApiResponseHeadersSchemaMap><br>

a class that stores an endpoint response

