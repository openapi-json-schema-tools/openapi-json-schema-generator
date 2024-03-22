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
| static class | [Put1](#put1)<br>The class that has a put method to call the endpoint |
| static class | [PutRequest](#putrequest)<br>The final request inputs class |
| static class | [PutNullableRequest](#putnullablerequest)<br>The initial request inputs class |
| static class | [Put0RequestBuilder](#put0requestbuilder)<br>A builder for the request input class |
| static class | [PutRequestBuilder](#putrequestbuilder)<br>A builder for the request input class |

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
| [Responses.EndpointResponse](../../paths/fakecasesensitiveparams/put/Responses.md#endpointresponse) | put([PutRequest](#putrequest) request) |

## PutRequest
public static class PutRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [QueryParameters.QueryParametersMap](../../paths/fakecasesensitiveparams/put/QueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |

## PutNullableRequest
public static class PutNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [QueryParameters.@Nullable QueryParametersMap](../../paths/fakecasesensitiveparams/put/QueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |

## Put0RequestBuilder
public static class Put0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Put0RequestBuilder(Put0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PutRequest](#putrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Put0RequestBuilder](#put0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## PutRequestBuilder
public static class PutRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PutRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Put0RequestBuilder](#put0requestbuilder) | queryParameters([QueryParameters.QueryParametersMap](../../paths/fakecasesensitiveparams/put/QueryParameters.md#queryparametersmap) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
