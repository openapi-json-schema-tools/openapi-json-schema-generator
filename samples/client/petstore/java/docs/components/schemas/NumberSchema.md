# NumberSchema
org.openapijsonschematools.client.components.schemas.NumberSchema.java
public class NumberSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberSchema.NumberSchema1Boxed](#numberschema1boxed)<br> sealed validated payload class |
| static class | [NumberSchema.NumberSchema1](#numberschema1)<br> schema class |

## NumberSchema1Boxed
public static abstract sealed class NumberSchema1Boxed<br>
permits<br>
[NumberSchema1BoxedNumber](#numberschema1boxednumber)

A sealed class that stores validated payloads using boxed classes

## NumberSchema1BoxedNumber
public static final class NumberSchema1BoxedNumber<br>
extends NumberSchema1Boxed

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NumberSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## NumberSchema1
public static class NumberSchema1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
