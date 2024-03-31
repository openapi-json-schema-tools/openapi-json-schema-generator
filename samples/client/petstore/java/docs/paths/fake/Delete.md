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
| static class | [Delete1](#delete1)<br>The class that has a delete method to call the endpoint |
| static class | [DeleteRequest](#deleterequest)<br>The final request inputs class |
| static class | [DeleteNullableRequest](#deletenullablerequest)<br>The initial request inputs class |
| static class | [Delete00RequestBuilder](#delete00requestbuilder)<br>A builder for the request input class |
| static class | [Delete01RequestBuilder](#delete01requestbuilder)<br>A builder for the request input class |
| static class | [Delete10RequestBuilder](#delete10requestbuilder)<br>A builder for the request input class |
| static class | [DeleteRequestBuilder](#deleterequestbuilder)<br>A builder for the request input class |

## Delete1
public static class Delete1 extends ApiClient.ApiClient1 implements DeleteOperation<br>

a class that allows one to call the endpoint using a method named delete

### Code Sample
```
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.delete.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.delete.QueryParameters;
// ServerIndex.SERVER_0 Server
import org.openapijsonschematools.client.servers.Server0;
// ServerIndex.SERVER_1 Server
import org.openapijsonschematools.client.servers.Server1;
// ServerIndex.SERVER_2 Server
import org.openapijsonschematools.client.servers.Server2;
// SecurityIndex.SECURITY_INDEX_0 SecurityScheme
import org.openapijsonschematools.client.components.securityschemes.BearerTest;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fake.Delete;


```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/fake/delete/Responses.md#endpointresponse) | delete([DeleteRequest](#deleterequest) request) |

## DeleteRequest
public static class DeleteRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [HeaderParameters.HeaderParametersMap](../../paths/fake/delete/HeaderParameters.md#headerparametersmap) | headerParameters |
| [QueryParameters.QueryParametersMap](../../paths/fake/delete/QueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [FakeDeleteSecurityInfo.@Nullable SecurityIndex](../../paths/fake/delete/FakeDeleteSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## DeleteNullableRequest
public static class DeleteNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [HeaderParameters.@Nullable HeaderParametersMap](../../paths/fake/delete/HeaderParameters.md#headerparametersmap) | headerParameters |
| [QueryParameters.@Nullable QueryParametersMap](../../paths/fake/delete/QueryParameters.md#queryparametersmap) | queryParameters |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [FakeDeleteSecurityInfo.@Nullable SecurityIndex](../../paths/fake/delete/FakeDeleteSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

## Delete00RequestBuilder
public static class Delete00RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete00RequestBuilder(Delete00RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [DeleteRequest](#deleterequest) | build()<br>Returns the request input used to call an endpoint method |
| [Delete00RequestBuilder](#delete00requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Delete00RequestBuilder](#delete00requestbuilder) | securityIndex([FakeDeleteSecurityInfo.SecurityIndex](../../paths/fake/delete/FakeDeleteSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Delete00RequestBuilder](#delete00requestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## Delete01RequestBuilder
public static class Delete01RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete01RequestBuilder(Delete01RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Delete00RequestBuilder](#delete00requestbuilder) | queryParameters([QueryParametersQueryParametersMap](../../paths/fake/delete/QueryParameters.md#queryparametersmap) queryParameters)<br>sets the property |

## Delete10RequestBuilder
public static class Delete10RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Delete10RequestBuilder(Delete10RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Delete00RequestBuilder](#delete00requestbuilder) | headerParameters([HeaderParametersHeaderParametersMap](../../paths/fake/delete/HeaderParameters.md#headerparametersmap) headerParameters)<br>sets the property |

## DeleteRequestBuilder
public static class DeleteRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DeleteRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Delete01RequestBuilder](#delete01requestbuilder) | headerParameters([HeaderParametersHeaderParametersMap](../../paths/fake/delete/HeaderParameters.md#headerparametersmap) headerParameters)<br>sets the property |
| [Delete10RequestBuilder](#delete10requestbuilder) | queryParameters([QueryParametersQueryParametersMap](../../paths/fake/delete/QueryParameters.md#queryparametersmap) queryParameters)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
