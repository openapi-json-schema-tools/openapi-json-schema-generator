# StoreinventoryGetResponses

public class StoreinventoryGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointStoreinventoryGetCode200Response](#endpointstoreinventorygetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointStoreinventoryGetCode200Response](#endpointstoreinventorygetcode200response)

a sealed interface that stores endpoint responses

## EndpointStoreinventoryGetCode200Response
public record EndpointStoreinventoryGetCode200Response(
    HttpResponse<byte[]> response,
    [StoreinventoryGetCode200Response.SealedResponseBody](../../../paths/storeinventory/get/responses/StoreinventoryGetCode200Response.md#sealedresponsebody) body,
    [SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap](../../../components/responses/successinlinecontentandheader/SuccessInlineContentAndHeaderHeadersSchema.md#successinlinecontentandheaderheadersschemamap) headers
) implements EndpointResponse, ApiResponse<StoreinventoryGetCode200Response.SealedResponseBody, SuccessInlineContentAndHeaderHeadersSchema.SuccessInlineContentAndHeaderHeadersSchemaMap><br>

a class that stores an endpoint response

