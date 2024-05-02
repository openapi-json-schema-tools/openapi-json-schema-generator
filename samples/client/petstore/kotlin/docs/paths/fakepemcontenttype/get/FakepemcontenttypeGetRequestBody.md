# FakepemcontenttypeGetRequestBody

public class FakepemcontenttypeGetRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakepemcontenttypeGetRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakepemcontenttypeGetRequestBody.ApplicationxpemfileMediaType](#applicationxpemfilemediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakepemcontenttypeGetRequestBody.FakepemcontenttypeGetRequestBody1](#fakepemcontenttypegetrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakepemcontenttypeGetRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakepemcontenttypeGetRequestBody.ApplicationxpemfileRequestBody](#applicationxpemfilerequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationxpemfileMediaType](#applicationxpemfilemediatype)

sealed interface that stores schema and encoding info


## ApplicationxpemfileMediaType
public record ApplicationxpemfileMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationxpemfileSchema.ApplicationxpemfileSchema1](../../../paths/fakepemcontenttype/get/requestbody/content/applicationxpemfile/ApplicationxpemfileSchema.md#applicationxpemfileschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxpemfileMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxpemfileSchema.ApplicationxpemfileSchema1](../../../paths/fakepemcontenttype/get/requestbody/content/applicationxpemfile/ApplicationxpemfileSchema.md#applicationxpemfileschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## FakepemcontenttypeGetRequestBody1
public static class FakepemcontenttypeGetRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakepemcontenttypeGetRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/x-pem-file", new [ApplicationxpemfileMediaType](#applicationxpemfilemediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationxpemfileRequestBody](#applicationxpemfilerequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationxpemfileRequestBody
public record ApplicationxpemfileRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationxpemfileSchema.StringJsonSchema1Boxed><br>

A record class to store request body input for contentType="application/x-pem-file"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxpemfileRequestBody(ApplicationxpemfileSchema.StringJsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/x-pem-file" |
| ApplicationxpemfileSchema.StringJsonSchema1Boxed | body()<br>returns the body passed in in the constructor |
