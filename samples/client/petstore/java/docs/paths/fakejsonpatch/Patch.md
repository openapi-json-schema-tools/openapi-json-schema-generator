# Patch

public class Patch

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class      | Patch1<br>The class that has a patch method to call the endpoint |
| static class | PatchRequest<br>The request inputs class |
| static class      | PatchRequestBuilder<br>A builder for the request input class |

## Patch1
public static class Patch1 extends ApiClient.ApiClient1 implements PatchOperation<br>

a class that allows one to call the endpoint using a method named patch

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Patch1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Responses.EndpointResponse | patch(PatchRequest request) |
