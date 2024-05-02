# FakejsonpatchPatchRequestBody

public class FakejsonpatchPatchRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakejsonpatchPatchRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakejsonpatchPatchRequestBody.ApplicationjsonpatchjsonMediaType](#applicationjsonpatchjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakejsonpatchPatchRequestBody.FakejsonpatchPatchRequestBody1](#fakejsonpatchpatchrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakejsonpatchPatchRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakejsonpatchPatchRequestBody.ApplicationjsonpatchjsonRequestBody](#applicationjsonpatchjsonrequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationjsonpatchjsonMediaType](#applicationjsonpatchjsonmediatype)

sealed interface that stores schema and encoding info


## ApplicationjsonpatchjsonMediaType
public record ApplicationjsonpatchjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1](../../../paths/fakejsonpatch/patch/requestbody/content/applicationjsonpatchjson/ApplicationjsonpatchjsonSchema.md#applicationjsonpatchjsonschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonpatchjsonSchema.ApplicationjsonpatchjsonSchema1](../../../paths/fakejsonpatch/patch/requestbody/content/applicationjsonpatchjson/ApplicationjsonpatchjsonSchema.md#applicationjsonpatchjsonschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## FakejsonpatchPatchRequestBody1
public static class FakejsonpatchPatchRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakejsonpatchPatchRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json-patch+json", new [ApplicationjsonpatchjsonMediaType](#applicationjsonpatchjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationjsonpatchjsonRequestBody](#applicationjsonpatchjsonrequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationjsonpatchjsonRequestBody
public record ApplicationjsonpatchjsonRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationjsonpatchjsonSchema.[JSONPatchRequest1Boxed](../../../components/schemas/JSONPatchRequest.md#jsonpatchrequest1boxed)><br>

A record class to store request body input for contentType="application/json-patch+json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonpatchjsonRequestBody(ApplicationjsonpatchjsonSchema.[JSONPatchRequest1Boxed](../../../components/schemas/JSONPatchRequest.md#jsonpatchrequest1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/json-patch+json" |
| ApplicationjsonpatchjsonSchema.[JSONPatchRequest1Boxed](../../../components/schemas/JSONPatchRequest.md#jsonpatchrequest1boxed) | body()<br>returns the body passed in in the constructor |
