# BooleanSchema
org.openapijsonschematools.client.components.schemas.BooleanSchema.java
public class BooleanSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [BooleanSchema.BooleanSchema1Boxed](#booleanschema1boxed)<br> abstract sealed validated payload class |
| record | [BooleanSchema.BooleanSchema1BoxedBoolean](#booleanschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [BooleanSchema.BooleanSchema1](#booleanschema1)<br> schema class |

## BooleanSchema1Boxed
public sealed interface BooleanSchema1Boxed<br>
permits<br>
[BooleanSchema1BoxedBoolean](#booleanschema1boxedboolean)

sealed interface that stores validated payloads using boxed classes

## BooleanSchema1BoxedBoolean
public record BooleanSchema1BoxedBoolean<br>
implements [BooleanSchema1Boxed](#booleanschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BooleanSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## BooleanSchema1
public static class BooleanSchema1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
