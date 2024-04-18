# Number
org.openapijsonschematools.client.components.schemas.Number.java
public class Number<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Number.Number1Boxed](#number1boxed)<br> sealed interface for validated payloads |
| record | [Number.Number1BoxedNumber](#number1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Number.Number1](#number1)<br> schema class |

## Number1Boxed
public sealed interface Number1Boxed<br>
permits<br>
[Number1BoxedNumber](#number1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Number1BoxedNumber
public record Number1BoxedNumber<br>
implements [Number1Boxed](#number1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Number1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Number1
public static class Number1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
