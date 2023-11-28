# Schema5
org.openapijsonschematools.paths.fake.get.parameters.parameter5.Schema5.java
public class Schema5

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema5.Schema51](#schema51)<br> schema class |

## Schema51
public static class Schema51<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(
    Integer.class,
    Long.class,
    Float.class,
    Double.class
))),
new KeywordEntry("format", new FormatValidator("double"))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static double | validate(double arg, SchemaConfiguration configuration) |
