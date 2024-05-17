# EnumWithFalseDoesNotMatch0
org.openapijsonschematools.client.components.schemas.EnumWithFalseDoesNotMatch0.java
class EnumWithFalseDoesNotMatch0<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
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
sealed interface EnumWithFalseDoesNotMatch01Boxed<br>
permits<br>
[EnumWithFalseDoesNotMatch01BoxedBoolean](#enumwithfalsedoesnotmatch01boxedboolean)

sealed interface that stores validated payloads using boxed classes

## EnumWithFalseDoesNotMatch01BoxedBoolean
data class EnumWithFalseDoesNotMatch01BoxedBoolean<br>
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
| Any? | getData()<br>validated payload |

## EnumWithFalseDoesNotMatch01
class EnumWithFalseDoesNotMatch01<br>
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
import org.openapijsonschematools.client.components.schemas.EnumWithFalseDoesNotMatch0;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// boolean validation
boolean validatedPayload = EnumWithFalseDoesNotMatch0.EnumWithFalseDoesNotMatch01.validate(
    false,
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Boolean::class.java) |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;false<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| boolean | validate(arg: [BooleanEnumWithFalseDoesNotMatch0Enums](#booleanenumwithfalsedoesnotmatch0enums), configuration: SchemaConfiguration) |
| [EnumWithFalseDoesNotMatch01BoxedBoolean](#enumwithfalsedoesnotmatch01boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [EnumWithFalseDoesNotMatch01Boxed](#enumwithfalsedoesnotmatch01boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## BooleanEnumWithFalseDoesNotMatch0Enums
public enum BooleanEnumWithFalseDoesNotMatch0Enums<br>
extends `Enum<BooleanEnumWithFalseDoesNotMatch0Enums>`

A class that stores boolean enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| FALSE | value = false |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
