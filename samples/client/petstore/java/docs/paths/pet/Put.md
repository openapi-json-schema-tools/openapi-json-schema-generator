# Put

public class Put

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class      | Put1<br>The class that has a put method to call the endpoint |
| static class | PutRequest<br>The final request inputs class |
| static class | PutNullableRequest<br>The initial request inputs class |
| static class      | Put0RequestBuilder<br>A builder for the request input class |
| static class      | PutRequestBuilder<br>A builder for the request input class |

## Put1
public static class Put1 extends ApiClient.ApiClient1 implements PutOperation<br>

a class that allows one to call the endpoint using a method named put

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | put(PutRequest request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| RequestBody.SealedRequestBody | requestBody |
| RootServerInfo.@Nullable ServerIndex | serverIndex |
| PetPutSecurityInfo.@Nullable SecurityIndex | securityIndex |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| RequestBody.@Nullable SealedRequestBody | requestBody |
| RootServerInfo.@Nullable ServerIndex | serverIndex |
| PetPutSecurityInfo.@Nullable SecurityIndex | securityIndex |

