# DateTimeWithValidations
org.openapijsonschematools.client.components.schemas.DateTimeWithValidations.java
public class DateTimeWithValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateTimeWithValidations.DateTimeWithValidations1Boxed](#datetimewithvalidations1boxed)<br> sealed interface for validated payloads |
| record | [DateTimeWithValidations.DateTimeWithValidations1BoxedString](#datetimewithvalidations1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DateTimeWithValidations.DateTimeWithValidations1](#datetimewithvalidations1)<br> schema class |

## DateTimeWithValidations1Boxed
public sealed interface DateTimeWithValidations1Boxed<br>
permits<br>
[DateTimeWithValidations1BoxedString](#datetimewithvalidations1boxedstring)

sealed interface that stores validated payloads using boxed classes

## DateTimeWithValidations1BoxedString
public record DateTimeWithValidations1BoxedString<br>
implements [DateTimeWithValidations1Boxed](#datetimewithvalidations1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeWithValidations1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateTimeWithValidations1
public static class DateTimeWithValidations1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// String validation
String validatedPayload = DateTimeWithValidations.DateTimeWithValidations1.validate(
    "2020jUR,rZ#UM/?R,Fp^l6$ARj",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date-time"; |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^2020.*"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [DateTimeWithValidations1BoxedString](#datetimewithvalidations1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateTimeWithValidations1Boxed](#datetimewithvalidations1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
