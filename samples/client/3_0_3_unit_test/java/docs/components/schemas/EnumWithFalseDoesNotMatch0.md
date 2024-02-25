# EnumWithFalseDoesNotMatch0
org.openapijsonschematools.client.components.schemas.EnumWithFalseDoesNotMatch0.java
public class EnumWithFalseDoesNotMatch0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01Boxed](#enumwithfalsedoesnotmatch01boxed)<br> sealed interface for validated payloads |
| record | [EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01BoxedBoolean](#enumwithfalsedoesnotmatch01boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01](#enumwithfalsedoesnotmatch01)<br> schema class |
| enum | [EnumWithFalseDoesNotMatch0.BooleanEnumWithFalseDoesNotMatch0Enums](#booleanenumwithfalsedoesnotmatch0enums)<br>boolean enum |

## EnumWithFalseDoesNotMatch01Boxed
public sealed interface EnumWithFalseDoesNotMatch01Boxed<br>
permits<br>
[EnumWithFalseDoesNotMatch01BoxedBoolean](#enumwithfalsedoesnotmatch01boxedboolean)

sealed interface that stores validated payloads using boxed classes

## EnumWithFalseDoesNotMatch01BoxedBoolean
public record EnumWithFalseDoesNotMatch01BoxedBoolean<br>
implements [EnumWithFalseDoesNotMatch01Boxed](#enumwithfalsedoesnotmatch01boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWithFalseDoesNotMatch01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## EnumWithFalseDoesNotMatch01
public static class EnumWithFalseDoesNotMatch01<br>
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

// boolean validation
boolean validatedPayload = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.validate(
    false,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Boolean.class) |
| Set<Object> | enumValues = SetMaker.makeSet(<br>&nbsp;&nbsp;&nbsp;&nbsp;false<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | validate(boolean arg, SchemaConfiguration configuration) |
| boolean | validate([BooleanEnumWithFalseDoesNotMatch0Enums](#booleanenumwithfalsedoesnotmatch0enums) arg, SchemaConfiguration configuration) |
| [EnumWithFalseDoesNotMatch01BoxedBoolean](#enumwithfalsedoesnotmatch01boxedboolean) | validateAndBox(boolean arg, SchemaConfiguration configuration) |
| [EnumWithFalseDoesNotMatch01Boxed](#enumwithfalsedoesnotmatch01boxed) | validateAndBox(@Nullable Object arg, SchemaConfiguration configuration) |
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
