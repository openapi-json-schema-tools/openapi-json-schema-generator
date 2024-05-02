# FakebodywithqueryparamsPutResponses

public class FakebodywithqueryparamsPutResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakebodywithqueryparamsPutCode200Response](#endpointfakebodywithqueryparamsputcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakebodywithqueryparamsPutCode200Response](#endpointfakebodywithqueryparamsputcode200response)

a sealed interface that stores endpoint responses

## EndpointFakebodywithqueryparamsPutCode200Response
public record EndpointFakebodywithqueryparamsPutCode200Response(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

