# FakejsonwithcharsetPostRequestBody

public class FakejsonwithcharsetPostRequestBody

A class that contains necessary nested request body classes
- SealedMediaType, a sealed interface which contains all the schema/encoding info for each contentType
- records which implement SealedMediaType, the concrete media types
- a class that extends RequestBodySerializer and is used to serialize input SealedRequestBody instances
- SealedRequestBody, a sealed interface which contains all the contentType/schema input types
- records which implement SealedRequestBody, the concrete request body types

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| sealed interface | [FakejsonwithcharsetPostRequestBody.SealedMediaType](#sealedmediatype)<br>media type sealed interface |
| record | [FakejsonwithcharsetPostRequestBody.Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [FakejsonwithcharsetPostRequestBody.FakejsonwithcharsetPostRequestBody1](#fakejsonwithcharsetpostrequestbody1)<br>class that serializes request bodies |
| sealed interface | [FakejsonwithcharsetPostRequestBody.SealedRequestBody](#sealedrequestbody)<br>request body sealed interface |
| record | [FakejsonwithcharsetPostRequestBody.Applicationjsoncharsetutf8RequestBody](#applicationjsoncharsetutf8requestbody)<br>implements sealed interface to store request body input |

## SealedMediaType
public sealed interface SealedMediaType<br>
permits<br>
[Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)

sealed interface that stores schema and encoding info


## Applicationjsoncharsetutf8MediaType
public record Applicationjsoncharsetutf8MediaType<br>
implements [SealedMediaType](#sealedmediatype), MediaType<[Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1](../../../paths/fakejsonwithcharset/post/requestbody/content/applicationjsoncharsetutf8/Applicationjsoncharsetutf8Schema.md#applicationjsoncharsetutf8schema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8MediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Applicationjsoncharsetutf8Schema.Applicationjsoncharsetutf8Schema1](../../../paths/fakejsonwithcharset/post/requestbody/content/applicationjsoncharsetutf8/Applicationjsoncharsetutf8Schema.md#applicationjsoncharsetutf8schema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## FakejsonwithcharsetPostRequestBody1
public static class FakejsonwithcharsetPostRequestBody1<br>

a class that serializes SealedRequestBody request bodies

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FakejsonwithcharsetPostRequestBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the request body is required |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json; charset=utf-8", new [Applicationjsoncharsetutf8MediaType](#applicationjsoncharsetutf8mediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SerializedRequestBody | serialize([SealedRequestBody](#sealedrequestbody) requestBody)<br>called by endpoint when creating request body bytes |

## SealedRequestBody
public sealed interface SealedRequestBody<br>
permits<br>
[Applicationjsoncharsetutf8RequestBody](#applicationjsoncharsetutf8requestbody)

sealed interface that stores request contentType + validated schema data

## Applicationjsoncharsetutf8RequestBody
public record Applicationjsoncharsetutf8RequestBody<br>
implements [SealedRequestBody](#sealedrequestbody),<br>
GenericRequestBody<Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed><br>

A record class to store request body input for contentType="application/json; charset=utf-8"

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Applicationjsoncharsetutf8RequestBody(Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed body)<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | contentType()<br>always returns "application/json; charset=utf-8" |
| Applicationjsoncharsetutf8Schema.AnyTypeJsonSchema1Boxed | body()<br>returns the body passed in in the constructor |
