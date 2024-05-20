# FloatDivisionInf
org.openapijsonschematools.client.components.schemas.FloatDivisionInf.java
class FloatDivisionInf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [FloatDivisionInf.FloatDivisionInf1Boxed](#floatdivisioninf1boxed)<br> sealed interface for validated payloads |
| record | [FloatDivisionInf.FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [FloatDivisionInf.FloatDivisionInf1](#floatdivisioninf1)<br> schema class |

## FloatDivisionInf1Boxed
sealed interface FloatDivisionInf1Boxed<br>
permits<br>
[FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber)

sealed interface that stores validated payloads using boxed classes

## FloatDivisionInf1BoxedNumber
data class FloatDivisionInf1BoxedNumber<br>
implements [FloatDivisionInf1Boxed](#floatdivisioninf1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FloatDivisionInf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## FloatDivisionInf1
class FloatDivisionInf1<br>
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
import org.openapijsonschematools.client.components.schemas.FloatDivisionInf

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// int validation
val validatedPayload: Int = FloatDivisionInf.FloatDivisionInf1.validate(
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
| [FloatDivisionInf1BoxedNumber](#floatdivisioninf1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [FloatDivisionInf1Boxed](#floatdivisioninf1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
