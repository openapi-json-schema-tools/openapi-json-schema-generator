# NumberTypeMatchesNumbers
org.openapijsonschematools.client.components.schemas.NumberTypeMatchesNumbers.java
public class NumberTypeMatchesNumbers

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1Boxed](#numbertypematchesnumbers1boxed)<br> abstract sealed validated payload class |
| static class | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1BoxedNumber](#numbertypematchesnumbers1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NumberTypeMatchesNumbers.NumberTypeMatchesNumbers1](#numbertypematchesnumbers1)<br> schema class |

## NumberTypeMatchesNumbers1Boxed
public static abstract sealed class NumberTypeMatchesNumbers1Boxed<br>
permits<br>
[NumberTypeMatchesNumbers1BoxedNumber](#numbertypematchesnumbers1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## NumberTypeMatchesNumbers1BoxedNumber
public static final class NumberTypeMatchesNumbers1BoxedNumber<br>
extends [NumberTypeMatchesNumbers1Boxed](#numbertypematchesnumbers1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberTypeMatchesNumbers1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NumberTypeMatchesNumbers1
public static class NumberTypeMatchesNumbers1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
