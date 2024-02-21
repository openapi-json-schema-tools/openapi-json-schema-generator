# Pet
Pet.java

public class Pet

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [Pet.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [Pet.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| record | [Pet.ApplicationxmlMediaType](#applicationxmlmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [Pet.Pet1](#pet1)<br>class that serializes request bodies |
| sealed interface | [Pet.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [Pet.ApplicationjsonRequestBody](#applicationjsonrequestbody)<br>implements sealed interface to store request body input |
| record | [Pet.ApplicationxmlRequestBody](#applicationxmlrequestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationjsonMediaType](#applicationjsonmediatype),
[ApplicationxmlMediaType](#applicationxmlmediatype)

sealed interface that stores schema and encoding info


## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../components/requestbodies/pet/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../components/requestbodies/pet/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## ApplicationxmlMediaType
public record ApplicationxmlMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationxmlSchema.ApplicationxmlSchema1](../../components/requestbodies/pet/content/applicationxml/ApplicationxmlSchema.md#applicationxmlschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxmlSchema.ApplicationxmlSchema1](../../components/requestbodies/pet/content/applicationxml/ApplicationxmlSchema.md#applicationxmlschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## Pet1
public static class Pet1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Pet1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the request body is required |
| Map<String, MediaType<?>> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)()),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/xml", new [ApplicationxmlMediaType](#applicationxmlmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[ApplicationjsonRequestBody](#applicationjsonrequestbody),
[ApplicationxmlRequestBody](#applicationxmlrequestbody)

sealed interface that stores request contentType + validated schema data

## ApplicationjsonRequestBody
public record ApplicationjsonRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationjsonSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed)><br>

A record class to store request body input for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonRequestBody(ApplicationjsonSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/json" |
| ApplicationjsonSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed) | body()<br>returns the body passed in in the constructor |
## ApplicationxmlRequestBody
public record ApplicationxmlRequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<ApplicationxmlSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed)><br>

A record class to store request body input for contentType="application/xml"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlRequestBody(ApplicationxmlSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/xml" |
| ApplicationxmlSchema.[Pet1Boxed](../../components/schemas/Pet.md#pet1boxed) | body()<br>returns the body passed in in the constructor |

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
