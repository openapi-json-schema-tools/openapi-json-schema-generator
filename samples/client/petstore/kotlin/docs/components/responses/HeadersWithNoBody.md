# HeadersWithNoBody
HeadersWithNoBody.java

public class HeadersWithNoBody

A class that contains necessary nested response classes
- a class that extends ResponseDeserializer and is used to deserialize responses

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [HeadersWithNoBody.HeadersWithNoBody1](#headerswithnobody1)<br>class that deserializes responses |

## HeadersWithNoBody1
public static class HeadersWithNoBody1<br>
extends ResponseDeserializer<Nothing?, [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap](../../components/responses/headerswithnobody/HeadersWithNoBodyHeadersSchema.md#headerswithnobodyheadersschemamap), Nothing?>

a class that deserializes responses

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| HeadersWithNoBody1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| Map<String, Nothing?> | content =  MapUtils.makeMap(<br>)<br>the contentType to schema info |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ApiResponse<Nothing?, [HeadersWithNoBodyHeadersSchema.HeadersWithNoBodyHeadersSchemaMap](../../components/responses/headerswithnobody/HeadersWithNoBodyHeadersSchema.md#headerswithnobodyheadersschemamap)> | deserialize(HttpResponse<byte[]> response, SchemaConfiguration configuration)<br>called by endpoint when deserialize responses |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
