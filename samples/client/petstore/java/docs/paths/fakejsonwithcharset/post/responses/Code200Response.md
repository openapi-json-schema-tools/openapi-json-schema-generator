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
| record | [Code200Response.Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)<br>record storing schema + encoding for a specific contentType |
| sealed interface | [Code200Response.SealedResponseBody](#sealedresponsebody)<br>response body sealed interface |
| record | [Code200Response.Applicationjsoncharsetutf8ResponseBody](#applicationjsoncharsetutf8responsebody)<br>implements sealed interface to store response body |
| static class | [Code200Response.Code200Response1](#code200response1)<br>class that deserializes responses |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)

sealed interface that stores schema and encoding info

## Applicationjsoncharsetutf8MediaType
public record Applicationjsoncharsetutf8MediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1](../../../../paths/fakejsonwithcharset/post/responses/code200response/content/applicationjsoncharsetutf8/Applicationjsoncharsetutf8Schema.md#applicationjsoncharsetutf8schema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8MediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1](../../../../paths/fakejsonwithcharset/post/responses/code200response/content/applicationjsoncharsetutf8/Applicationjsoncharsetutf8Schema.md#applicationjsoncharsetutf8schema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## SealedResponseBody
public sealed interface SealedResponseBody<br>
permits<br>
[Applicationjsoncharsetutf8ResponseBody](#applicationjsoncharsetutf8responsebody)

sealed interface that stores response body

## Applicationjsoncharsetutf8ResponseBody
public record Applicationjsoncharsetutf8ResponseBody<br>
implements [SealedResponseBody](#sealedresponsebody)

A record class to store response body for contentType="application/json; charset=utf-8"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8ResponseBody(Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed | body()<br>returns the body passed in in the constructor |

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
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json; charset=utf-8", new [Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<[SealedResponseBody](#sealedresponsebody), Void> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |
