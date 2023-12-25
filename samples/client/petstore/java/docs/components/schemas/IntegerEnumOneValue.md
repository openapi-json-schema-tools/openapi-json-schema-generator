# IntegerEnumOneValue
org.openapijsonschematools.client.components.schemas.IntegerEnumOneValue.java
public class IntegerEnumOneValue

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerEnumOneValue.IntegerEnumOneValue1](#integerenumonevalue1)<br> schema class |
| enum | [IntegerEnumOneValue.IntegerIntegerEnumOneValueEnums]()<br>integer enum |
| enum | [IntegerEnumOneValue.NumberIntegerEnumOneValueEnums]()<br>number enum |

## IntegerEnumOneValue1
public static class IntegerEnumOneValue1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// long validation
long validatedPayload = IntegerEnumOneValue.IntegerEnumOneValue1.validate(
    0L,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Integer.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Long.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Float.class,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Double.class<br/>&nbsp;&nbsp;&nbsp;&nbsp;)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## IntegerIntegerEnumOneValueEnums
public enum IntegerIntegerEnumOneValueEnums<br>
extends `Enum<IntegerIntegerEnumOneValueEnums>`

A class that stores Integer enum values


## NumberIntegerEnumOneValueEnums
public enum NumberIntegerEnumOneValueEnums<br>
extends `Enum<NumberIntegerEnumOneValueEnums>`

A class that stores Number enum values

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
