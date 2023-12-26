# EnumWithFalseDoesNotMatch0
org.openapijsonschematools.client.components.schemas.EnumWithFalseDoesNotMatch0.java
public class EnumWithFalseDoesNotMatch0

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01](#enumwithfalsedoesnotmatch01)<br> schema class |
| enum | [EnumWithFalseDoesNotMatch0.BooleanEnumWithFalseDoesNotMatch0Enums](#booleanenumwithfalsedoesnotmatch0enums)<br>boolean enum |

## EnumWithFalseDoesNotMatch01
public static class EnumWithFalseDoesNotMatch01<br>
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
boolean validatedPayload = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.validate(
    false,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Boolean.class)<br/> |
| Set<Object> | &nbsp;&nbsp;&nbsp;&nbsp;enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;false)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| boolean | validate([BooleanEnumWithFalseDoesNotMatch0Enums](#booleanenumwithfalsedoesnotmatch0enums) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## BooleanEnumWithFalseDoesNotMatch0Enums
public enum BooleanEnumWithFalseDoesNotMatch0Enums<br>
extends `Enum<BooleanEnumWithFalseDoesNotMatch0Enums>`

A class that stores boolean enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FALSE | value = false |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
