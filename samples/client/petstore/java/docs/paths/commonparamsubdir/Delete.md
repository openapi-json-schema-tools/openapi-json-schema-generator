# Delete

public class Delete

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class      | Delete1<br>The class that has a delete method to call the endpoint |
| static class | DeleteRequest<br>The final request inputs class |
| static class | DeleteNullableRequest<br>The initial request inputs class |
| static class      | Delete0RequestBuilder<br>A builder for the request input class |
| static class      | DeleteRequestBuilder<br>A builder for the request input class |

## Delete1
public static class Delete1 extends ApiClient.ApiClient1 implements DeleteOperation<br>

a class that allows one to call the endpoint using a method named delete

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Responses.EndpointResponse | delete(DeleteRequest request) |

## DeleteRequest
public static class DeleteRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.PathParametersMap | pathParameters |
| HeaderParameters.@Nullable HeaderParametersMap | headerParameters |
| RootServerInfo.@Nullable ServerIndex | serverIndex |

## DeleteNullableRequest
public static class DeleteNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.@Nullable PathParametersMap | pathParameters |
| HeaderParameters.@Nullable HeaderParametersMap | headerParameters |
| RootServerInfo.@Nullable ServerIndex | serverIndex |

