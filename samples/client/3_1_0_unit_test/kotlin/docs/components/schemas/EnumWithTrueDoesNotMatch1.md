# EnumWithTrueDoesNotMatch1
org.openapijsonschematools.client.components.schemas.EnumWithTrueDoesNotMatch1.java
class EnumWithTrueDoesNotMatch1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11Boxed](#enumwithtruedoesnotmatch11boxed)<br> sealed interface for validated payloads |
| data class | [EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11BoxedBoolean](#enumwithtruedoesnotmatch11boxedboolean)<br> boxed class to store validated boolean payloads |
| class | [EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11](#enumwithtruedoesnotmatch11)<br> schema class |
| enum | [EnumWithTrueDoesNotMatch1.BooleanEnumWithTrueDoesNotMatch1Enums](#booleanenumwithtruedoesnotmatch1enums)<br>boolean enum |

## EnumWithTrueDoesNotMatch11Boxed
sealed interface EnumWithTrueDoesNotMatch11Boxed<br>
permits<br>
[EnumWithTrueDoesNotMatch11BoxedBoolean](#enumwithtruedoesnotmatch11boxedboolean)

sealed interface that stores validated payloads using boxed classes

## EnumWithTrueDoesNotMatch11BoxedBoolean
data class EnumWithTrueDoesNotMatch11BoxedBoolean<br>
implements [EnumWithTrueDoesNotMatch11Boxed](#enumwithtruedoesnotmatch11boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWithTrueDoesNotMatch11BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EnumWithTrueDoesNotMatch11
class EnumWithTrueDoesNotMatch11<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.EnumWithTrueDoesNotMatch1

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// boolean validation
val validatedPayload: Boolean = EnumWithTrueDoesNotMatch1.EnumWithTrueDoesNotMatch11.validate(
    true,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(Boolean::class.java) |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;true<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| Boolean | validate(arg: [BooleanEnumWithTrueDoesNotMatch1Enums](#booleanenumwithtruedoesnotmatch1enums), configuration: SchemaConfiguration) |
| [EnumWithTrueDoesNotMatch11BoxedBoolean](#enumwithtruedoesnotmatch11boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [EnumWithTrueDoesNotMatch11Boxed](#enumwithtruedoesnotmatch11boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## BooleanEnumWithTrueDoesNotMatch1Enums
public enum BooleanEnumWithTrueDoesNotMatch1Enums<br>
extends `Enum<BooleanEnumWithTrueDoesNotMatch1Enums>`

A class that stores boolean enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| TRUE | value = true |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
