# SimpleEnumValidation
org.openapijsonschematools.client.components.schemas.SimpleEnumValidation.java
class SimpleEnumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SimpleEnumValidation.SimpleEnumValidation1Boxed](#simpleenumvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [SimpleEnumValidation.SimpleEnumValidation1BoxedNumber](#simpleenumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| class | [SimpleEnumValidation.SimpleEnumValidation1](#simpleenumvalidation1)<br> schema class |
| enum | [SimpleEnumValidation.IntegerSimpleEnumValidationEnums](#integersimpleenumvalidationenums)<br>Integer enum |
| enum | [SimpleEnumValidation.LongSimpleEnumValidationEnums](#longsimpleenumvalidationenums)<br>Long enum |
| enum | [SimpleEnumValidation.FloatSimpleEnumValidationEnums](#floatsimpleenumvalidationenums)<br>Float enum |
| enum | [SimpleEnumValidation.DoubleSimpleEnumValidationEnums](#doublesimpleenumvalidationenums)<br>Double enum |

## SimpleEnumValidation1Boxed
sealed interface SimpleEnumValidation1Boxed<br>
permits<br>
[SimpleEnumValidation1BoxedNumber](#simpleenumvalidation1boxednumber)

sealed interface that stores validated payloads using boxed classes

## SimpleEnumValidation1BoxedNumber
data class SimpleEnumValidation1BoxedNumber<br>
implements [SimpleEnumValidation1Boxed](#simpleenumvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SimpleEnumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SimpleEnumValidation1
class SimpleEnumValidation1<br>
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
import org.openapijsonschematools.client.components.schemas.SimpleEnumValidation

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// int validation
val validatedPayload: Int = SimpleEnumValidation.SimpleEnumValidation1.validate(
    1,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;1,<br>&nbsp;&nbsp;&nbsp;&nbsp;2,<br>&nbsp;&nbsp;&nbsp;&nbsp;3<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| [SimpleEnumValidation1BoxedNumber](#simpleenumvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [SimpleEnumValidation1Boxed](#simpleenumvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## IntegerSimpleEnumValidationEnums
public enum IntegerSimpleEnumValidationEnums<br>
extends `Enum<IntegerSimpleEnumValidationEnums>`

A class that stores Int enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |
| POSITIVE_2 | value = 2 |
| POSITIVE_3 | value = 3 |

## LongSimpleEnumValidationEnums
public enum LongSimpleEnumValidationEnums<br>
extends `Enum<LongSimpleEnumValidationEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1L |
| POSITIVE_2 | value = 2L |
| POSITIVE_3 | value = 3L |

## FloatSimpleEnumValidationEnums
public enum FloatSimpleEnumValidationEnums<br>
extends `Enum<FloatSimpleEnumValidationEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0f |
| POSITIVE_2 | value = 2.0f |
| POSITIVE_3 | value = 3.0f |

## DoubleSimpleEnumValidationEnums
public enum DoubleSimpleEnumValidationEnums<br>
extends `Enum<DoubleSimpleEnumValidationEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0d |
| POSITIVE_2 | value = 2.0d |
| POSITIVE_3 | value = 3.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
