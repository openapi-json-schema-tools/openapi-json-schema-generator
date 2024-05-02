# Int32JsonContentTypeHeader
Int32JsonContentTypeHeader.java

public class Int32JsonContentTypeHeader

A class that contains necessary nested header classes
- a class that implements MediaType to store content schema info
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the header value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| record | [Int32JsonContentTypeHeader.ApplicationjsonMediaType](#applicationjsonmediatype)<br>record storing schema + encoding for a specific contentType |
| static class | [Int32JsonContentTypeHeader.Int32JsonContentTypeHeader1](#int32jsoncontenttypeheader1)<br>class that deserializes a header |


## ApplicationjsonMediaType
public record ApplicationjsonMediaType<br>
implements [MediaType<[Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1](../../components/headers/int32jsoncontenttypeheader/content/applicationjson/Int32JsonContentTypeHeaderSchema.md#int32jsoncontenttypeheaderschema1), Nothing?>

class storing schema info for a specific contentType

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonMediaType()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [Int32JsonContentTypeHeaderSchema.Int32JsonContentTypeHeaderSchema1](../../components/headers/int32jsoncontenttypeheader/content/applicationjson/Int32JsonContentTypeHeaderSchema.md#int32jsoncontenttypeheaderschema1) | schema()<br>the schema for this MediaType |
| Nothing? | encoding()<br>the encoding info |

## Int32JsonContentTypeHeader1
public static class Int32JsonContentTypeHeader1 implements Header<br>

a class that deserializes a header value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Int32JsonContentTypeHeader1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the header is required |
| @Nullable ParameterStyle | ParameterStyle.SIMPLE |
| @Nullable Boolean explode | false |
| @Nullable Boolean allowReserved | null |
| AbstractMap.SimpleEntry<String, [ApplicationjsonMediaType](#applicationjsonmediatype)> | content =  new AbstractMap.SimpleEntry<>("application/json", new [ApplicationjsonMediaType](#applicationjsonmediatype)())<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| HttpHeaders | serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) |
| @Nullable Object | deserialize(List&lt;String&gt; inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the header value |

[[Back to top]](#top) [[Back to Component Headers]](../../../README.md#Component-Headers) [[Back to README]](../../../README.md)
