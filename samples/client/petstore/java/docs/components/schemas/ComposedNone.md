# ComposedNone
org.openapijsonschematools.components.schemas.ComposedNone.java
public class ComposedNone

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ComposedNone.ComposedNone1](#composednone1)<br> schema class |
| static class | [ComposedNone.Schema0](#schema0)<br> schema class |

## ComposedNone1
public static class ComposedNone1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(Void.class)))<br>)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static Void | validate(Void arg, SchemaConfiguration configuration) |

## Schema0
public static class Schema0<br>
extends AnyTypeJsonSchema

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
