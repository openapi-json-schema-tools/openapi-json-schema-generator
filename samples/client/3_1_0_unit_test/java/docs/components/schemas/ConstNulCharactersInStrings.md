# ConstNulCharactersInStrings
org.openapijsonschematools.client.components.schemas.ConstNulCharactersInStrings.java
public class ConstNulCharactersInStrings

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1](#constnulcharactersinstrings1)<br> schema class |
| enum | [ConstNulCharactersInStrings.StringConstNulCharactersInStringsConst](#stringconstnulcharactersinstringsconst)<br>String enum |

## ConstNulCharactersInStrings1
public static class ConstNulCharactersInStrings1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| @Nullable Object | constValue = "hello\0there" |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| int | validate(int arg, SchemaConfiguration configuration) |
| long | validate(long arg, SchemaConfiguration configuration) |
| float | validate(float arg, SchemaConfiguration configuration) |
| double | validate(double arg, SchemaConfiguration configuration) |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| FrozenMap<String, @Nullable Object> | validate(Map&lt;?, ?&gt; arg, SchemaConfiguration configuration) |
| FrozenList<@Nullable Object> | validate(List<?> arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## StringConstNulCharactersInStringsConst
public enum StringConstNulCharactersInStringsConst<br>
extends `Enum<StringConstNulCharactersInStringsConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| HELLO_NULL_THERE | value = "hello\0there" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
