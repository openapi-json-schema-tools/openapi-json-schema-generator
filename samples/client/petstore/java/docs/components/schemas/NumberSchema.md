# NumberSchema
org.openapijsonschematools.client.components.schemas.NumberSchema.java
public class NumberSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NumberSchema.NumberSchema1Boxed](#numberschema1boxed)<br> abstract sealed validated payload class |
| record | [NumberSchema.NumberSchema1BoxedNumber](#numberschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NumberSchema.NumberSchema1](#numberschema1)<br> schema class |

## NumberSchema1Boxed
public sealed interface NumberSchema1Boxed<br>
permits<br>
[NumberSchema1BoxedNumber](#numberschema1boxednumber)

sealed interface that stores validated payloads using boxed classes

## NumberSchema1BoxedNumber
public record NumberSchema1BoxedNumber<br>
implements [NumberSchema1Boxed](#numberschema1boxed)

record that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NumberSchema1
public static class NumberSchema1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
