# RefContentSchemaHeader
RefContentSchemaHeader.java

public class RefContentSchemaHeader

A class that contains necessary nested header classes
- a class that implements MediaType to store content schema info
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the header value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| record | [RefContentSchemaHeader.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [RefContentSchemaHeader.RefContentSchemaHeader1](#refcontentschemaheader1)<br>class that deserializes a header |


## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [MediaType<[RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1](../../components/headers/refcontentschemaheader/content/applicationjson/RefContentSchemaHeaderSchema.md#refcontentschemaheaderschema1), Void>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1](../../components/headers/refcontentschemaheader/content/applicationjson/RefContentSchemaHeaderSchema.md#refcontentschemaheaderschema1) | schema()<br>the schema for this MediaType |
| Void | encoding()<br>the encoding info |

## RefContentSchemaHeader1
public static class RefContentSchemaHeader1 implements Header<br>

a class that deserializes a header value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefContentSchemaHeader1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the header is required |
| @Nullable Boolean allowReserved | null |
| @Nullable ParameterStyle | ParameterStyle.SIMPLE |
| @Nullable Boolean explode | false |
| Map<String, [SealedMediaType](#sealedmediatype)> | content =  Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| HttpHeaders | serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) |
| @Nullable Object | deserialize(List<String> inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the header value |

[[Back to top]](#top) [[Back to Component Headers]](../../../README.md#Component-Headers) [[Back to README]](../../../README.md)
