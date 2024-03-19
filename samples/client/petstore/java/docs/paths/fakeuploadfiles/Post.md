# Post

public class Post

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class      | Post1<br>The class that has a post method to call the endpoint |
| static class | PostRequest<br>The request inputs class |
| static class      | PostRequestBuilder<br>A builder for the request input class |

## Post1
public static class Post1 extends ApiClient.ApiClient1 implements PostOperation<br>

a class that allows one to call the endpoint using a method named post

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Post1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Responses.EndpointResponse | post(PostRequest request) |
