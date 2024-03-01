# RefSchemaHeader
RefSchemaHeader.java

public class RefSchemaHeader

A class that contains necessary nested header classes
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the header value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [RefSchemaHeader.RefSchemaHeader1](#refschemaheader1)<br>class that deserializes a header |


## RefSchemaHeader1
public static class RefSchemaHeader1 implements Header<br>

a class that deserializes a header value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefSchemaHeader1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = true<br>whether the header is required |
| @Nullable Boolean allowReserved | null |
| @Nullable ParameterStyle | ParameterStyle.SIMPLE |
| @Nullable Boolean explode | false |
| JsonSchema<?> | schema = [RefSchemaHeaderSchema.RefSchemaHeaderSchema1](../../components/headers/refschemaheader/RefSchemaHeaderSchema.md#refschemaheaderschema1)().getInstance()

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| HttpHeaders | serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) |
| @Nullable Object | deserialize(List&lt;String&gt; inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the header value |

[[Back to top]](#top) [[Back to Component Headers]](../../../README.md#Component-Headers) [[Back to README]](../../../README.md)
