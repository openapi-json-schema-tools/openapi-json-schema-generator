# StringWithValidation
org.openapijsonschematools.client.components.schemas.StringWithValidation.java
public class StringWithValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StringWithValidation.StringWithValidation1Boxed](#stringwithvalidation1boxed)<br> abstract sealed validated payload class |
| record | [StringWithValidation.StringWithValidation1BoxedString](#stringwithvalidation1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringWithValidation.StringWithValidation1](#stringwithvalidation1)<br> schema class |

## StringWithValidation1Boxed
public sealed interface StringWithValidation1Boxed<br>
permits<br>
[StringWithValidation1BoxedString](#stringwithvalidation1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringWithValidation1BoxedString
public record StringWithValidation1BoxedString<br>
implements [StringWithValidation1Boxed](#stringwithvalidation1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringWithValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StringWithValidation1
public static class StringWithValidation1<br>
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
String validatedPayload = StringWithValidation.StringWithValidation1.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |
| Integer | minLength = 7 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(String arg, SchemaConfiguration configuration) |
| [StringWithValidation1BoxedString](#stringwithvalidation1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [StringWithValidation1Boxed](#stringwithvalidation1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
