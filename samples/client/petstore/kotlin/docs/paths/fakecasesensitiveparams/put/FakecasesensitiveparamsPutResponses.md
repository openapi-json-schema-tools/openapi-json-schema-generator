# FakecasesensitiveparamsPutResponses

public class FakecasesensitiveparamsPutResponses

A class that contains necessary responses classes
- a sealed interface, EndpointResponse, that stores endpoint responses
- records for each endpoint response

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [EndpointResponse](#endpointresponse)<br> stores the endpoint responses |
| record | [EndpointFakecasesensitiveparamsPutCode200Response](#endpointfakecasesensitiveparamsputcode200response)<br> the response for 200 |

## EndpointResponse
public sealed interface EndpointResponse permits<br>
[EndpointFakecasesensitiveparamsPutCode200Response](#endpointfakecasesensitiveparamsputcode200response)

a sealed interface that stores endpoint responses

## EndpointFakecasesensitiveparamsPutCode200Response
public record EndpointFakecasesensitiveparamsPutCode200Response(
    HttpResponse<byte[]> response,
    Nothing? body,
    Nothing? headers
) implements EndpointResponse, ApiResponse<Nothing?, Nothing?><br>

a class that stores an endpoint response

