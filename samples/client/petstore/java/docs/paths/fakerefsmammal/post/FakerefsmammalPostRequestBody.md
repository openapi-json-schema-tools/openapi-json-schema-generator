# FakerefsmammalPostRequestBody

public class FakerefsmammalPostRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakerefsmammalPostRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakerefsmammalPostRequestBody.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakerefsmammalPostRequestBody.FakerefsmammalPostRequestBody1](#fakerefsmammalpostrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakerefsmammalPostRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakerefsmammalPostRequestBody.ApplicationjsonRequestBody](#applicationjsonrequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationjsonMediaType](#applicationjsonmediatype)

sealed interface that stores schema and encoding info


## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../../paths/fakerefsmammal/post/requestbody/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../../paths/fakerefsmammal/post/requestbody/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## FakerefsmammalPostRequestBody1
public static class FakerefsmammalPostRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakerefsmammalPostRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationjsonRequestBody](#applicationjsonrequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationjsonRequestBody
public record ApplicationjsonRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationjsonSchema.[Mammal1Boxed](../../../components/schemas/Mammal.md#mammal1boxed)><br>

A record class to store request body input for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonRequestBody(ApplicationjsonSchema.[Mammal1Boxed](../../../components/schemas/Mammal.md#mammal1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/json" |
| ApplicationjsonSchema.[Mammal1Boxed](../../../components/schemas/Mammal.md#mammal1boxed) | body()<br>returns the body passed in in the constructor |
