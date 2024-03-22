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
| static class | [Patch1](#patch1)<br>The class that has a patch method to call the endpoint |
| static class | [PatchRequest](#patchrequest)<br>The final request inputs class |
| static class | [PatchNullableRequest](#patchnullablerequest)<br>The initial request inputs class |
| static class | [Patch0RequestBuilder](#patch0requestbuilder)<br>A builder for the request input class |
| static class | [PatchRequestBuilder](#patchrequestbuilder)<br>A builder for the request input class |

## Patch1
public static class Patch1 extends ApiClient.ApiClient1 implements PatchOperation<br>

a class that allows one to call the endpoint using a method named patch

TODO code sample

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Patch1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Responses.EndpointResponse](../../paths/fakeclassnametest/patch/Responses.md#endpointresponse) | patch([PatchRequest](#patchrequest) request) |

## PatchRequest
public static class PatchRequest<br>

a class that stores the final request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.SealedRequestBody](../../paths/fakeclassnametest/patch/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex<br>optional. Note: this will override the value in apiConfiguration |
| [FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex](../../paths/fakeclassnametest/patch/FakeclassnametestPatchSecurityInfo.md#securityindex) | securityIndex<br>optional. Note: this will override the value in apiConfiguration |
| @Nullable Duration | timeout<br>optional. Note: this will override the value in apiConfiguration |

## PatchNullableRequest
public static class PatchNullableRequest<br>

a class that stores the initial request inputs

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [RequestBody.@Nullable SealedRequestBody](../../paths/fakeclassnametest/patch/RequestBody.md#sealedrequestbody) | requestBody |
| [RootServerInfo.@Nullable ServerIndex](../../RootServerInfo.md#serverindex) | serverIndex |
| [FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex](../../paths/fakeclassnametest/patch/FakeclassnametestPatchSecurityInfo.md#securityindex) | securityIndex |
| @Nullable Duration | timeout |

## Patch0RequestBuilder
public static class Patch0RequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Patch0RequestBuilder(Patch0RequestBuilder instance)<br>Creates a builder that contains the passed instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PatchRequest](#patchrequest) | build()<br>Returns the request input used to call an endpoint method |
| [Patch0RequestBuilder](#patch0requestbuilder) | serverIndex([RootServerInfo.ServerIndex](../../RootServerInfo.md#serverindex) serverIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Patch0RequestBuilder](#patch0requestbuilder) | securityIndex([FakeclassnametestPatchSecurityInfo.SecurityIndex](../../paths/fakeclassnametest/patch/FakeclassnametestPatchSecurityInfo.md#securityindex) securityIndex)<br>sets the optional property. Note: this will override the value in apiConfiguration |
| [Patch0RequestBuilder](#patch0requestbuilder) | timeout([Patch.Duration](../../.md#duration) timeout)<br>sets the optional property. Note: this will override the value in apiConfiguration |

## PatchRequestBuilder
public static class PatchRequestBuilder<br>

a builder for request inputs

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatchRequestBuilder()<br>Creates a builder that contains null for all parameters |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Patch0RequestBuilder](#patch0requestbuilder) | requestBody([RequestBody.SealedRequestBody](../../paths/fakeclassnametest/patch/RequestBody.md#sealedrequestbody) requestBody)<br>sets the property |

[[Back to top]](#top) [[Back to README]](../../../README.md)
