# FakeinlinecompositionPostCode200Response

public class FakeinlinecompositionPostCode200Response

A class that contains necessary nested response classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- SealedResponseBody, a sealed interface which contains all the contentType/schema types
- records which implement SealedResponseBody, the concrete response body types
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakeinlinecompositionPostCode200Response.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakeinlinecompositionPostCode200Response.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| record | [FakeinlinecompositionPostCode200Response.MultipartformdataMediaType](#multipartformdatamediatype)<br>record storing schema + encoding for a specific contentType |
| sealed interface | [FakeinlinecompositionPostCode200Response.SealedResponseBody](#sealedresponsebody)<br>response body sealed interface |
| record | [FakeinlinecompositionPostCode200Response.ApplicationjsonResponseBody](#applicationjsonresponsebody)<br>implements sealed interface to store response body |
| record | [FakeinlinecompositionPostCode200Response.MultipartformdataResponseBody](#multipartformdataresponsebody)<br>implements sealed interface to store response body |
| static class | [FakeinlinecompositionPostCode200Response.FakeinlinecompositionPostCode200Response1](#fakeinlinecompositionpostcode200response1)<br>class that deserializes responses |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationjsonMediaType](#applicationjsonmediatype),
[MultipartformdataMediaType](#multipartformdatamediatype)

sealed interface that stores schema and encoding info

## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## MultipartformdataMediaType
public record MultipartformdataMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[MultipartformdataSchema.MultipartformdataSchema1](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [MultipartformdataSchema.MultipartformdataSchema1](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## SealedResponseBody
public sealed interface SealedResponseBody<br>
permits<br>
[ApplicationjsonResponseBody](#applicationjsonresponsebody),
[MultipartformdataResponseBody](#multipartformdataresponsebody)

sealed interface that stores response body

## ApplicationjsonResponseBody
public record ApplicationjsonResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonResponseBody(ApplicationjsonSchema.[ApplicationjsonSchema1Boxed](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationjsonSchema.[ApplicationjsonSchema1Boxed](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1boxed) | body()<br>returns the body passed in in the constructor |
## MultipartformdataResponseBody
public record MultipartformdataResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="multipart/form-data"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipartformdataResponseBody(MultipartformdataSchema.[MultipartformdataSchema1Boxed](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1boxed) body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| MultipartformdataSchema.[MultipartformdataSchema1Boxed](../../../../paths/fakeinlinecomposition/post/responses/code200response/content/multipartformdata/MultipartformdataSchema.md#multipartformdataschema1boxed) | body()<br>returns the body passed in in the constructor |

## FakeinlinecompositionPostCode200Response1
public static class FakeinlinecompositionPostCode200Response1<br>
extends ResponseDeserializer<[SealedResponseBody](#sealedresponsebody), Nothing?, [SealedMediaType](#sealedmediatype)>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakeinlinecompositionPostCode200Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)()),<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("multipart/form-data", new [MultipartformdataMediaType](#multipartformdatamediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<[SealedResponseBody](#sealedresponsebody), Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
