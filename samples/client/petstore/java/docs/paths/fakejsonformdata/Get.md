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

### Code Sample
```
import org.openapijsonschematools.client.paths.fakejsonformdata.get.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.servers.Server0;
import org.openapijsonschematools.client.servers.Server1;
import org.openapijsonschematools.client.servers.Server2;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.paths.fakejsonformdata.Get

// if you want to use a sever that is not SERVER_0 pass it in here and change the ServerIndex input below
ApiConfiguration.ServerInfo serverInfo = new ApiConfiguration.ServerInfo(
    new Server0(),
    null,
    null
);
ApiConfiguration.ServerIndexInfo serverIndexInfo = new ApiConfiguration.ServerIndexInfo()
    .rootServerInfoServerIndex(RootServerInfo.ServerIndex.SERVER_0);
Duration timeout = Duration.ofSeconds(1L);
ApiConfiguration apiConfiguration = new ApiConfiguration(
    serverInfo
    serverIndexInfo,
    timeout
);
SchemaConfiguration schemaConfiguration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());
Get.Get1 apiClient = new Get.Get1(apiConfiguration, schemaConfiguration);

// todo set sample for requestBody
// RequestBody
// todo set sample for serverIndex
// RootServerInfo
// todo set sample for timeout
// Get
```
### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Get1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/fakejsonformdata/get/Responses.md#endpointresponse) | get([GetRequest](#getrequest) request) |

## GetRequest
public static class GetRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/fakejsonformdata/get/RequestBody.md#sealedrequestbody) | requestBody<br>optional |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

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
| [GetRequestBuilder](#getrequestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/fakejsonformdata/get/RequestBody.md#sealedrequestbody) requestBody)<br>sets the optional property |
| [GetRequestBuilder](#getrequestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [GetRequestBuilder](#getrequestbuilder) | timeout(Duration timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

[[Back to top]](#top) [[Back to README]](../../../README.md)
