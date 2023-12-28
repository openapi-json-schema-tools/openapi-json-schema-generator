# EnumWithTrueDoesNotMatch1
org.openapijsonschematools.client.components.schemas.EnumWithTrueDoesNotMatch1.java
public class EnumWithTrueDoesNotMatch1

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11](#enumwithtruedoesnotmatch11)<br> schema class |
| enum | [EnumWithTrueDoesNotMatch1.BooleanEnumWithTrueDoesNotMatch1Enums](#booleanenumwithtruedoesnotmatch1enums)<br>boolean enum |

## EnumWithTrueDoesNotMatch11
public static class EnumWithTrueDoesNotMatch11<br>
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

// boolean validation
boolean validatedPayload = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.validate(
    true,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Boolean.class) |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;true<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| boolean | validate([BooleanEnumWithTrueDoesNotMatch1Enums](#booleanenumwithtruedoesnotmatch1enums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BooleanEnumWithTrueDoesNotMatch1Enums
public enum BooleanEnumWithTrueDoesNotMatch1Enums<br>
extends `Enum<BooleanEnumWithTrueDoesNotMatch1Enums>`

A class that stores boolean enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRUE | value = true |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
