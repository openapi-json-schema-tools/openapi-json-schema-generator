# Schema0
org.openapijsonschematools.paths.storeorderorderid.get.parameters.parameter0.Schema0.java
public class Schema0

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01](#schema01)<br> schema class |

## Schema01
public static class Schema01<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> |keywordToValidator<br/>new LinkedHashMap<>(Map.ofEntries(<br/>&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("type", new TypeValidator(Set.of(&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br>))),&nbsp;&nbsp;&nbsp;&nbsp;new KeywordEntry("format", new FormatValidator("int64"))<br>
)); |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |
