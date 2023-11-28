# IntegerEnumOneValue
org.openapijsonschematools.components.schemas.IntegerEnumOneValue.java
public class IntegerEnumOneValue

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerEnumOneValue.IntegerEnumOneValue1](#integerenumonevalue1)<br> schema class |

## IntegerEnumOneValue1
public static class IntegerEnumOneValue1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>
        new KeywordEntry("type", new TypeValidator(Set.of(
        Integer.class,
        Long.class,
        Float.class,
        Double.class
    )))
<br/>
));</code>

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
