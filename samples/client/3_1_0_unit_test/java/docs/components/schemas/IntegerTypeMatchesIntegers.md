# IntegerTypeMatchesIntegers
org.openapijsonschematools.client.components.schemas.IntegerTypeMatchesIntegers.java
public class IntegerTypeMatchesIntegers

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1Boxed](#integertypematchesintegers1boxed)<br> abstract sealed validated payload class |
| static class | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1BoxedNumber](#integertypematchesintegers1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1](#integertypematchesintegers1)<br> schema class |

## IntegerTypeMatchesIntegers1Boxed
public static abstract sealed class IntegerTypeMatchesIntegers1Boxed<br>
permits<br>
[IntegerTypeMatchesIntegers1BoxedNumber](#integertypematchesintegers1boxednumber)

abstract sealed class that stores validated payloads using boxed classes

## IntegerTypeMatchesIntegers1BoxedNumber
public static final class IntegerTypeMatchesIntegers1BoxedNumber<br>
extends [IntegerTypeMatchesIntegers1Boxed](#integertypematchesintegers1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerTypeMatchesIntegers1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## IntegerTypeMatchesIntegers1
public static class IntegerTypeMatchesIntegers1<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
