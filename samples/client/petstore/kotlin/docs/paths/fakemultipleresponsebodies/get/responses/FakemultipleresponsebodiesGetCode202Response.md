# FakemultipleresponsebodiesGetCode202Response

public class FakemultipleresponsebodiesGetCode202Response

A class that contains necessary nested response classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- SealedResponseBody, a sealed interface which contains all the contentType/schema types
- records which implement SealedResponseBody, the concrete response body types
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakemultipleresponsebodiesGetCode202Response.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakemultipleresponsebodiesGetCode202Response.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| sealed interface | [FakemultipleresponsebodiesGetCode202Response.SealedResponseBody](#sealedresponsebody)<br>response body sealed interface |
| record | [FakemultipleresponsebodiesGetCode202Response.ApplicationjsonResponseBody](#applicationjsonresponsebody)<br>implements sealed interface to store response body |
| static class | [FakemultipleresponsebodiesGetCode202Response.FakemultipleresponsebodiesGetCode202Response1](#fakemultipleresponsebodiesgetcode202response1)<br>class that deserializes responses |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[ApplicationjsonMediaType](#applicationjsonmediatype)

sealed interface that stores schema and encoding info

## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/fakemultipleresponsebodies/get/responses/code202response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ApplicationjsonSchema.ApplicationjsonSchema1](../../../../paths/fakemultipleresponsebodies/get/responses/code202response/content/applicationjson/ApplicationjsonSchema.md#applicationjsonschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## SealedResponseBody
public sealed interface SealedResponseBody<br>
permits<br>
[ApplicationjsonResponseBody](#applicationjsonresponsebody)

sealed interface that stores response body

## ApplicationjsonResponseBody
public record ApplicationjsonResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="application/json"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonResponseBody(ApplicationjsonSchema.AnyTypeJsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApplicationjsonSchema.AnyTypeJsonSchema1Boxed | body()<br>returns the body passed in in the constructor |

## FakemultipleresponsebodiesGetCode202Response1
public static class FakemultipleresponsebodiesGetCode202Response1<br>
extends ResponseDeserializer<[SealedResponseBody](#sealedresponsebody), Nothing?, [SealedMediaType](#sealedmediatype)>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakemultipleresponsebodiesGetCode202Response1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<[SealedResponseBody](#sealedresponsebody), Nothing?> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
