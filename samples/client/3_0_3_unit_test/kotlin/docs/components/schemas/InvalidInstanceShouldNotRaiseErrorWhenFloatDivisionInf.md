# InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf
org.openapijsonschematools.client.components.schemas.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.java
class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxed)<br> sealed interface for validated payloads |
| data class | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber)<br> boxed class to store validated Number payloads |
| class | [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1)<br> schema class |

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed
sealed interface InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed<br>
permits<br>
[InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber)

sealed interface that stores validated payloads using boxed classes

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber
data class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber<br>
implements [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1
class InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf

val configuration = SchemaConfiguration()

// int validation
val validatedPayload: Int = InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf.InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1.validate(
    1L,
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(<br/>&nbsp;&nbsp;&nbsp;&nbsp;Int::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Long::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Float::class.java,<br/>&nbsp;&nbsp;&nbsp;&nbsp;Double::class.java<br/>)<br/> |
| String | type = "int"; |
| BigDecimal | multipleOf = BigDecimal("0.123456789") |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1BoxedNumber](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [InvalidInstanceShouldNotRaiseErrorWhenFloatDivisionInf1Boxed](#invalidinstanceshouldnotraiseerrorwhenfloatdivisioninf1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
