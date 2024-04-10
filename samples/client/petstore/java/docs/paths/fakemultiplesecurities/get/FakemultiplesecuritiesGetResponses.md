# FakemultiplesecuritiesGetResponses

public class FakemultiplesecuritiesGetResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakemultiplesecuritiesGetCode200Response](#endpointfakemultiplesecuritiesgetcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakemultiplesecuritiesGetCode200Response](#endpointfakemultiplesecuritiesgetcode200response)

a sealed interface that stores endpoint responses

## EndpointFakemultiplesecuritiesGetCode200Response
public record EndpointFakemultiplesecuritiesGetCode200Response(
    HttpResponse<byte[]> response,
    [FakemultiplesecuritiesGetCode200Response.SealedResponseBody](../../../paths/fakemultiplesecurities/get/responses/FakemultiplesecuritiesGetCode200Response.md#sealedresponsebody) body,
    Void headers
) implements EndpointResponse, ApiResponse<FakemultiplesecuritiesGetCode200Response.SealedResponseBody, Void><br>

a class that stores an endpoint response

