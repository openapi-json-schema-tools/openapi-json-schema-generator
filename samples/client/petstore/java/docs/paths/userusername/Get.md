# Get

public class Get

A class that contains necessary endpoint classes
- a class that calls the endpoint method using the http verb
- a class that calls the endpoint method using the operationId name
- class(es) to store the request inputs
- builder(s) to set the request input data

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class      | Get1<br>The class that has a get method to call the endpoint |
| static class | GetRequest<br>The final request inputs class |
| static class | GetNullableRequest<br>The initial request inputs class |
| static class      | Get0RequestBuilder<br>A builder for the request input class |
| static class      | GetRequestBuilder<br>A builder for the request input class |

## Get1
public static class Get1 extends ApiClient.ApiClient1 implements GetOperation<br>

a class that allows one to call the endpoint using a method named get

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Responses.EndpointResponse | get(GetRequest request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.PathParametersMap | pathParameters |
| RootServerInfo.@Nullable ServerIndex | serverIndex |

## GetNullableRequest
public static class GetNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| PathParameters.@Nullable PathParametersMap | pathParameters |
| RootServerInfo.@Nullable ServerIndex | serverIndex |

