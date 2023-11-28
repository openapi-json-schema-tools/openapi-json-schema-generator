# ComposedNumber
org.openapijsonschematools.components.schemas.ComposedNumber.java
public class ComposedNumber

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedNumber.ComposedNumber1](#composednumber1)<br> schema class |
| static class | [ComposedNumber.Schema0](#schema0)<br> schema class |

## ComposedNumber1
public static class ComposedNumber1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>&nbsp;&nbsp;&nbsp;&nbsp;))))); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Number | validate(Number arg, SchemaConfiguration configuration) |

## Schema0
public static class Schema0<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
