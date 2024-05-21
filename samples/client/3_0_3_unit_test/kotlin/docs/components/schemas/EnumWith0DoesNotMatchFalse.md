# EnumWith0DoesNotMatchFalse
org.openapijsonschematools.client.components.schemas.EnumWith0DoesNotMatchFalse.java
class EnumWith0DoesNotMatchFalse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed)<br> sealed interface for validated payloads |
| data class | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber)<br> boxed class to store validated Number payloads |
| class | [EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1](#enumwith0doesnotmatchfalse1)<br> schema class |
| enum | [EnumWith0DoesNotMatchFalse.IntegerEnumWith0DoesNotMatchFalseEnums](#integerenumwith0doesnotmatchfalseenums)<br>Integer enum |
| enum | [EnumWith0DoesNotMatchFalse.LongEnumWith0DoesNotMatchFalseEnums](#longenumwith0doesnotmatchfalseenums)<br>Long enum |
| enum | [EnumWith0DoesNotMatchFalse.FloatEnumWith0DoesNotMatchFalseEnums](#floatenumwith0doesnotmatchfalseenums)<br>Float enum |
| enum | [EnumWith0DoesNotMatchFalse.DoubleEnumWith0DoesNotMatchFalseEnums](#doubleenumwith0doesnotmatchfalseenums)<br>Double enum |

## EnumWith0DoesNotMatchFalse1Boxed
sealed interface EnumWith0DoesNotMatchFalse1Boxed<br>
permits<br>
[EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber)

sealed interface that stores validated payloads using boxed classes

## EnumWith0DoesNotMatchFalse1BoxedNumber
data class EnumWith0DoesNotMatchFalse1BoxedNumber<br>
implements [EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWith0DoesNotMatchFalse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EnumWith0DoesNotMatchFalse1
class EnumWith0DoesNotMatchFalse1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.EnumWith0DoesNotMatchFalse

val configuration = SchemaConfiguration()

// int validation
val validatedPayload: Int = EnumWith0DoesNotMatchFalse.EnumWith0DoesNotMatchFalse1.validate(
    1,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;0<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| [EnumWith0DoesNotMatchFalse1BoxedNumber](#enumwith0doesnotmatchfalse1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [EnumWith0DoesNotMatchFalse1Boxed](#enumwith0doesnotmatchfalse1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## IntegerEnumWith0DoesNotMatchFalseEnums
public enum IntegerEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<IntegerEnumWith0DoesNotMatchFalseEnums>`

A class that stores Int enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0 |

## LongEnumWith0DoesNotMatchFalseEnums
public enum LongEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<LongEnumWith0DoesNotMatchFalseEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0L |

## FloatEnumWith0DoesNotMatchFalseEnums
public enum FloatEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<FloatEnumWith0DoesNotMatchFalseEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0f |

## DoubleEnumWith0DoesNotMatchFalseEnums
public enum DoubleEnumWith0DoesNotMatchFalseEnums<br>
extends `Enum<DoubleEnumWith0DoesNotMatchFalseEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = 0.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
