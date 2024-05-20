# NumberTypeMatchesNumbers
org.openapijsonschematools.client.components.schemas.NumberTypeMatchesNumbers.java
class NumberTypeMatchesNumbers<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1Boxed](#numbertypematchesnumbers1boxed)<br> sealed interface for validated payloads |
| record | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1BoxedNumber](#numbertypematchesnumbers1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1](#numbertypematchesnumbers1)<br> schema class |

## NumberTypeMatchesNumbers1Boxed
sealed interface NumberTypeMatchesNumbers1Boxed<br>
permits<br>
[NumberTypeMatchesNumbers1BoxedNumber](#numbertypematchesnumbers1boxednumber)

sealed interface that stores validated payloads using boxed classes

## NumberTypeMatchesNumbers1BoxedNumber
data class NumberTypeMatchesNumbers1BoxedNumber<br>
implements [NumberTypeMatchesNumbers1Boxed](#numbertypematchesnumbers1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberTypeMatchesNumbers1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NumberTypeMatchesNumbers1
class NumberTypeMatchesNumbers1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
