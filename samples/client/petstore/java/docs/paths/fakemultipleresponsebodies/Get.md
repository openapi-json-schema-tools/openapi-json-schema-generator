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
| static class | [Get1](#get1)<br>The class that has a get method to call the endpoint |
| static class | [GetRequest](#getrequest)<br>The request inputs class |
| static class | [GetRequestBuilder](#getrequestbuilder)<br>A builder for the request input class |

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
| [Responses.EndpointResponse](../../paths/fakemultipleresponsebodies/get/Responses.md#endpointresponse) | get([GetRequest](#getrequest) request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |

## GetRequestBuilder
public static class GetRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| GetRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [GetRequest](#getrequest) | build()<br>Returns the request input used to call an endpoint method |
| [GetRequestBuilder](#getrequestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
