# Code200Response

public class Code200Response

A class that contains necessary nested response classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- SealedResponseBody, a sealed interface which contains all the contentType/schema types
- records which implement SealedResponseBody, the concrete response body types
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [Code200Response.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [Code200Response.ApplicationxmlMediaType](#applicationxmlmediatype)<br>record storing schema + encoding for a specific contentType |
| record | [Code200Response.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| sealed interface | [Code200Response.SealedResponseBody](#sealedresponsebody)<br>response body sealed interface |
| record | [Code200Response.ApplicationxmlResponseBody](#applicationxmlresponsebody)<br>implements sealed interface to store response body |
| record | [Code200Response.ApplicationjsonResponseBody](#applicationjsonresponsebody)<br>implements sealed interface to store response body |
| static class | [Code200Response.Code200Response1](#code200response1)<br>class that deserializes responses |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationxmlMediaType](#applicationxmlmediatype),
[ApplicationjsonMediaType](#applicationjsonmediatype)

sealed interface that stores schema and encoding info

## ApplicationxmlMediaType
public record ApplicationxmlMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationxmlSchema.ApplicationxmlSchema1](../../../../paths/petpetid/get/responses/code200response/content/applicationxml/ApplicationxmlSchema.md#applicationxmlschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationxmlSchema.ApplicationxmlSchema1](../../../../paths/petpetid/get/responses/code200response/content/applicationxml/ApplicationxmlSchema.md#applicationxmlschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/petpetid/get/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/petpetid/get/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## SealedResponseBody
public sealed interface SealedResponseBody<br>
permits<br>
[ApplicationxmlResponseBody](#applicationxmlresponsebody),
[ApplicationjsonResponseBody](#applicationjsonresponsebody)

sealed interface that stores response body

## ApplicationxmlResponseBody
public record ApplicationxmlResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="application/xml"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationxmlResponseBody(ApplicationxmlSchema.[Pet1Boxed](../../../../components/schemas/Pet.md#pet1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationxmlSchema.[Pet1Boxed](../../../../components/schemas/Pet.md#pet1boxed) | body()<br>returns the body passed in in the constructor |
## ApplicationjsonResponseBody
public record ApplicationjsonResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonResponseBody(ApplicationjsonSchema.[Pet1Boxed](../../../../components/schemas/Pet.md#pet1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationjsonSchema.[Pet1Boxed](../../../../components/schemas/Pet.md#pet1boxed) | body()<br>returns the body passed in in the constructor |

## Code200Response1
public static class Code200Response1<br>
extends ResponseDeserializer<[SealedResponseBody](#sealedresponsebody), Void, [SealedMediaType](#sealedmediatype)>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Code200Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/xml", new [ApplicationxmlMediaType](#applicationxmlmediatype)()),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<[SealedResponseBody](#sealedresponsebody), Void> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
