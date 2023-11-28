# IntegerEnumWithDefaultValue
org.openapijsonschematools.components.schemas.IntegerEnumWithDefaultValue.java
public class IntegerEnumWithDefaultValue

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerEnumWithDefaultValue.IntegerEnumWithDefaultValue1](#integerenumwithdefaultvalue1)<br> schema class |

## IntegerEnumWithDefaultValue1
public static class IntegerEnumWithDefaultValue1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    Integer.class,<br>Long.class,<br>Float.class,<br>Double.class<br>)))));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
