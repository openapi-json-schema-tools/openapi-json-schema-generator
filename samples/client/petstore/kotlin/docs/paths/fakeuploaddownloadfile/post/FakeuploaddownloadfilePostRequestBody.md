# FakeuploaddownloadfilePostRequestBody

public class FakeuploaddownloadfilePostRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakeuploaddownloadfilePostRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakeuploaddownloadfilePostRequestBody.ApplicationoctetstreamMediaType](#applicationoctetstreammediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakeuploaddownloadfilePostRequestBody.FakeuploaddownloadfilePostRequestBody1](#fakeuploaddownloadfilepostrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakeuploaddownloadfilePostRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakeuploaddownloadfilePostRequestBody.ApplicationoctetstreamRequestBody](#applicationoctetstreamrequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationoctetstreamMediaType](#applicationoctetstreammediatype)

sealed interface that stores schema and encoding info


## ApplicationoctetstreamMediaType
public record ApplicationoctetstreamMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1](../../../paths/fakeuploaddownloadfile/post/requestbody/content/applicationoctetstream/ApplicationoctetstreamSchema.md#applicationoctetstreamschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationoctetstreamMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationoctetstreamSchema.ApplicationoctetstreamSchema1](../../../paths/fakeuploaddownloadfile/post/requestbody/content/applicationoctetstream/ApplicationoctetstreamSchema.md#applicationoctetstreamschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## FakeuploaddownloadfilePostRequestBody1
public static class FakeuploaddownloadfilePostRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeuploaddownloadfilePostRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/octet-stream", new [ApplicationoctetstreamMediaType](#applicationoctetstreammediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationoctetstreamRequestBody](#applicationoctetstreamrequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationoctetstreamRequestBody
public record ApplicationoctetstreamRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationoctetstreamSchema.StringJsonSchema1Boxed><br>

A record class to store request body input for contentType="application/octet-stream"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationoctetstreamRequestBody(ApplicationoctetstreamSchema.StringJsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/octet-stream" |
| ApplicationoctetstreamSchema.StringJsonSchema1Boxed | body()<br>returns the body passed in in the constructor |
