# NullableString
org.openapijsonschematools.client.components.schemas.NullableString.java
public class NullableString

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullableString.NullableString1Boxed](#nullablestring1boxed)<br> sealed validated payload class |
| static class | [NullableString.NullableString1](#nullablestring1)<br> schema class |

## NullableString1Boxed
public static abstract sealed class NullableString1Boxed<br>
permits<br>
[NullableString1BoxedVoid](#nullablestring1boxedvoid),
[NullableString1BoxedString](#nullablestring1boxedstring)

A sealed class that stores validated payloads using boxed classes

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
| String | validate(String arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
