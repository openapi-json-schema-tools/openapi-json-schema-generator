# BooleanTypeMatchesBooleans
org.openapijsonschematools.client.components.schemas.BooleanTypeMatchesBooleans.java
public class BooleanTypeMatchesBooleans

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1Boxed](#booleantypematchesbooleans1boxed)<br> abstract sealed validated payload class |
| static class | [BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1BoxedBoolean](#booleantypematchesbooleans1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [BooleanTypeMatchesBooleans.BooleanTypeMatchesBooleans1](#booleantypematchesbooleans1)<br> schema class |

## BooleanTypeMatchesBooleans1Boxed
public static abstract sealed class BooleanTypeMatchesBooleans1Boxed<br>
permits<br>
[BooleanTypeMatchesBooleans1BoxedBoolean](#booleantypematchesbooleans1boxedboolean)

abstract sealed class that stores validated payloads using boxed classes

## BooleanTypeMatchesBooleans1BoxedBoolean
public static final class BooleanTypeMatchesBooleans1BoxedBoolean<br>
extends [BooleanTypeMatchesBooleans1Boxed](#booleantypematchesbooleans1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BooleanTypeMatchesBooleans1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## BooleanTypeMatchesBooleans1
public static class BooleanTypeMatchesBooleans1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
