# FakePostRequestBody

public class FakePostRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakePostRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakePostRequestBody.ApplicationxwwwformurlencodedMediaType](#applicationxwwwformurlencodedmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakePostRequestBody.FakePostRequestBody1](#fakepostrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakePostRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakePostRequestBody.ApplicationxwwwformurlencodedRequestBody](#applicationxwwwformurlencodedrequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationxwwwformurlencodedMediaType](#applicationxwwwformurlencodedmediatype)

sealed interface that stores schema and encoding info


## ApplicationxwwwformurlencodedMediaType
public record ApplicationxwwwformurlencodedMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1](../../../paths/fake/post/requestbody/content/applicationxwwwformurlencoded/ApplicationxwwwformurlencodedSchema.md#applicationxwwwformurlencodedschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxwwwformurlencodedSchema.ApplicationxwwwformurlencodedSchema1](../../../paths/fake/post/requestbody/content/applicationxwwwformurlencoded/ApplicationxwwwformurlencodedSchema.md#applicationxwwwformurlencodedschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## FakePostRequestBody1
public static class FakePostRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakePostRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/x-www-form-urlencoded", new [ApplicationxwwwformurlencodedMediaType](#applicationxwwwformurlencodedmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationxwwwformurlencodedRequestBody](#applicationxwwwformurlencodedrequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationxwwwformurlencodedRequestBody
public record ApplicationxwwwformurlencodedRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationxwwwformurlencodedSchema.[ApplicationxwwwformurlencodedSchema1Boxed](../../../paths/fake/post/requestbody/content/applicationxwwwformurlencoded/ApplicationxwwwformurlencodedSchema.md#applicationxwwwformurlencodedschema1boxed)><br>

A record class to store request body input for contentType="application/x-www-form-urlencoded"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxwwwformurlencodedRequestBody(ApplicationxwwwformurlencodedSchema.[ApplicationxwwwformurlencodedSchema1Boxed](../../../paths/fake/post/requestbody/content/applicationxwwwformurlencoded/ApplicationxwwwformurlencodedSchema.md#applicationxwwwformurlencodedschema1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/x-www-form-urlencoded" |
| ApplicationxwwwformurlencodedSchema.[ApplicationxwwwformurlencodedSchema1Boxed](../../../paths/fake/post/requestbody/content/applicationxwwwformurlencoded/ApplicationxwwwformurlencodedSchema.md#applicationxwwwformurlencodedschema1boxed) | body()<br>returns the body passed in in the constructor |
