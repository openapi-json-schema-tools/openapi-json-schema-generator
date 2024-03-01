# NullableString
org.openapijsonschematools.client.components.schemas.NullableString.java
public class NullableString<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NullableString.NullableString1Boxed](#nullablestring1boxed)<br> sealed interface for validated payloads |
| record | [NullableString.NullableString1BoxedVoid](#nullablestring1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NullableString.NullableString1BoxedString](#nullablestring1boxedstring)<br> boxed class to store validated String payloads |
| static class | [NullableString.NullableString1](#nullablestring1)<br> schema class |

## NullableString1Boxed
public sealed interface NullableString1Boxed<br>
permits<br>
[NullableString1BoxedVoid](#nullablestring1boxedvoid),
[NullableString1BoxedString](#nullablestring1boxedstring)

sealed interface that stores validated payloads using boxed classes

## NullableString1BoxedVoid
public record NullableString1BoxedVoid<br>
implements [NullableString1Boxed](#nullablestring1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableString1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NullableString1BoxedString
public record NullableString1BoxedString<br>
implements [NullableString1Boxed](#nullablestring1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullableString1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NullableString1
public static class NullableString1<br>
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
import org.openapijsonschematools.client.components.schemas.NullableString;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// null validation
Void validatedPayload = NullableString.NullableString1.validate(
    (Void) null,
    configuration
);

// String validation
String validatedPayload = NullableString.NullableString1.validate(
    "a",
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Void.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;String.class<br/>)<br/> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | validate(Void arg, SchemaConfiguration configuration) |
| [NullableString1BoxedVoid](#nullablestring1boxedvoid) | validateAndBox(Void arg, SchemaConfiguration configuration) |
| String | validate(String arg, SchemaConfiguration configuration) |
| [NullableString1BoxedString](#nullablestring1boxedstring) | validateAndBox(String arg, SchemaConfiguration configuration) |
| [NullableString1Boxed](#nullablestring1boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
