# NumberHeader
NumberHeader.java

public class NumberHeader

A class that contains necessary nested header classes
- a class that extends SchemaHeader/ContentHeader and is used to deserialize the header value

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [NumberHeader.NumberHeader1](#numberheader1)<br>class that deserializes a header |


## NumberHeader1
public static class NumberHeader1 implements Header<br>

a class that deserializes a header value

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberHeader1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| boolean | required = false<br>whether the header is required |
| @Nullable Boolean allowReserved | null |
| @Nullable ParameterStyle | ParameterStyle.SIMPLE |
| @Nullable Boolean explode | false |
| JsonSchema<?> | schema = NumberHeaderSchema.NumberHeaderSchema1.getInstance()

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| HttpHeaders | serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) |
| @Nullable Object | deserialize(List<String> inData, boolean validate, SchemaConfiguration configuration)<br>deserializes the header value |

[[Back to top]](#top) [[Back to Component Headers]](../../../README.md#Component-Headers) [[Back to README]](../../../README.md)
