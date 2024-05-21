# IntegerTypeMatchesIntegers
unit_test_api.components.schemas.IntegerTypeMatchesIntegers.java
public class IntegerTypeMatchesIntegers<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1Boxed](#integertypematchesintegers1boxed)<br> sealed interface for validated payloads |
| record | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1BoxedNumber](#integertypematchesintegers1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [IntegerTypeMatchesIntegers.IntegerTypeMatchesIntegers1](#integertypematchesintegers1)<br> schema class |

## IntegerTypeMatchesIntegers1Boxed
public sealed interface IntegerTypeMatchesIntegers1Boxed<br>
permits<br>
[IntegerTypeMatchesIntegers1BoxedNumber](#integertypematchesintegers1boxednumber)

sealed interface that stores validated payloads using boxed classes

## IntegerTypeMatchesIntegers1BoxedNumber
public record IntegerTypeMatchesIntegers1BoxedNumber<br>
implements [IntegerTypeMatchesIntegers1Boxed](#integertypematchesintegers1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IntegerTypeMatchesIntegers1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## IntegerTypeMatchesIntegers1
public static class IntegerTypeMatchesIntegers1<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
