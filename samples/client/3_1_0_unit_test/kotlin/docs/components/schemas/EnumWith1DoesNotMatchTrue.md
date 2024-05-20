# EnumWith1DoesNotMatchTrue
org.openapijsonschematools.client.components.schemas.EnumWith1DoesNotMatchTrue.java
class EnumWith1DoesNotMatchTrue<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed)<br> sealed interface for validated payloads |
| data class | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber)<br> boxed class to store validated Number payloads |
| class | [EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1](#enumwith1doesnotmatchtrue1)<br> schema class |
| enum | [EnumWith1DoesNotMatchTrue.IntegerEnumWith1DoesNotMatchTrueEnums](#integerenumwith1doesnotmatchtrueenums)<br>Integer enum |
| enum | [EnumWith1DoesNotMatchTrue.LongEnumWith1DoesNotMatchTrueEnums](#longenumwith1doesnotmatchtrueenums)<br>Long enum |
| enum | [EnumWith1DoesNotMatchTrue.FloatEnumWith1DoesNotMatchTrueEnums](#floatenumwith1doesnotmatchtrueenums)<br>Float enum |
| enum | [EnumWith1DoesNotMatchTrue.DoubleEnumWith1DoesNotMatchTrueEnums](#doubleenumwith1doesnotmatchtrueenums)<br>Double enum |

## EnumWith1DoesNotMatchTrue1Boxed
sealed interface EnumWith1DoesNotMatchTrue1Boxed<br>
permits<br>
[EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber)

sealed interface that stores validated payloads using boxed classes

## EnumWith1DoesNotMatchTrue1BoxedNumber
data class EnumWith1DoesNotMatchTrue1BoxedNumber<br>
implements [EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EnumWith1DoesNotMatchTrue1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EnumWith1DoesNotMatchTrue1
class EnumWith1DoesNotMatchTrue1<br>
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
import org.openapijsonschematools.client.components.schemas.EnumWith1DoesNotMatchTrue

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// int validation
val validatedPayload: Int = EnumWith1DoesNotMatchTrue.EnumWith1DoesNotMatchTrue1.validate(
    1,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| Set<Any> | enumValues = setOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;1<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| [EnumWith1DoesNotMatchTrue1BoxedNumber](#enumwith1doesnotmatchtrue1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [EnumWith1DoesNotMatchTrue1Boxed](#enumwith1doesnotmatchtrue1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## IntegerEnumWith1DoesNotMatchTrueEnums
public enum IntegerEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<IntegerEnumWith1DoesNotMatchTrueEnums>`

A class that stores Int enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1 |

## LongEnumWith1DoesNotMatchTrueEnums
public enum LongEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<LongEnumWith1DoesNotMatchTrueEnums>`

A class that stores Long enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1L |

## FloatEnumWith1DoesNotMatchTrueEnums
public enum FloatEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<FloatEnumWith1DoesNotMatchTrueEnums>`

A class that stores Float enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0f |

## DoubleEnumWith1DoesNotMatchTrueEnums
public enum DoubleEnumWith1DoesNotMatchTrueEnums<br>
extends `Enum<DoubleEnumWith1DoesNotMatchTrueEnums>`

A class that stores Double enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_1 | value = 1.0d |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
