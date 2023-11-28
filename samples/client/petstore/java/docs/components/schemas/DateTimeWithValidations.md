# DateTimeWithValidations
org.openapijsonschematools.components.schemas.DateTimeWithValidations.java
public class DateTimeWithValidations

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [DateTimeWithValidations.DateTimeWithValidations1](#datetimewithvalidations1)<br> schema class |

## DateTimeWithValidations1
public static class DateTimeWithValidations1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(    String.class<br>))),new KeywordEntry("format", new FormatValidator("date-time"))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
