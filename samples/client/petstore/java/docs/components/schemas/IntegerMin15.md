# IntegerMin15
org.openapijsonschematools.client.components.schemas.IntegerMin15.java
public class IntegerMin15<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IntegerMin15.IntegerMin151Boxed](#integermin151boxed)<br> sealed interface for validated payloads |
| record | [IntegerMin15.IntegerMin151BoxedNumber](#integermin151boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IntegerMin15.IntegerMin151](#integermin151)<br> schema class |

## IntegerMin151Boxed
public sealed interface IntegerMin151Boxed<br>
permits<br>
[IntegerMin151BoxedNumber](#integermin151boxednumber)

sealed interface that stores validated payloads using boxed classes

## IntegerMin151BoxedNumber
public record IntegerMin151BoxedNumber<br>
implements [IntegerMin151Boxed](#integermin151boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerMin151BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IntegerMin151
public static class IntegerMin151<br>
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
import org.openapijsonschematools.client.components.schemas.IntegerMin15;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// long validation
long validatedPayload = IntegerMin15.IntegerMin151.validate(
    1L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>)<br/> |
| String | type = "int64"; |
| Number | minimum = 15 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| long | validate(long arg, SchemaConfiguration configuration) |
| [IntegerMin151BoxedNumber](#integermin151boxednumber) | validateAndBox(Number arg, SchemaConfiguration configuration) |
| [IntegerMin151Boxed](#integermin151boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
