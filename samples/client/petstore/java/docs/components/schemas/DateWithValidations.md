# DateWithValidations
org.openapijsonschematools.client.components.schemas.DateWithValidations.java
public class DateWithValidations<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateWithValidations.DateWithValidations1Boxed](#datewithvalidations1boxed)<br> sealed interface for validated payloads |
| record | [DateWithValidations.DateWithValidations1BoxedString](#datewithvalidations1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DateWithValidations.DateWithValidations1](#datewithvalidations1)<br> schema class |

## DateWithValidations1Boxed
public sealed interface DateWithValidations1Boxed<br>
permits<br>
[DateWithValidations1BoxedString](#datewithvalidations1boxedstring)

sealed interface that stores validated payloads using boxed classes

## DateWithValidations1BoxedString
public record DateWithValidations1BoxedString<br>
implements [DateWithValidations1Boxed](#datewithvalidations1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateWithValidations1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DateWithValidations1
public static class DateWithValidations1<br>
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
String validatedPayload = DateWithValidations.DateWithValidations1.validate(
    "2020jUR,rZ#UM/?R,Fp^l6$ARj",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| String | type = "date"; |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^2020.*"<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [DateWithValidations1BoxedString](#datewithvalidations1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [DateWithValidations1Boxed](#datewithvalidations1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
