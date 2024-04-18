# Boolean
org.openapijsonschematools.client.components.schemas.Boolean.java
public class Boolean<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Boolean.Boolean1Boxed](#boolean1boxed)<br> sealed interface for validated payloads |
| record | [Boolean.Boolean1BoxedBoolean](#boolean1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Boolean.Boolean1](#boolean1)<br> schema class |

## Boolean1Boxed
public sealed interface Boolean1Boxed<br>
permits<br>
[Boolean1BoxedBoolean](#boolean1boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Boolean1BoxedBoolean
public record Boolean1BoxedBoolean<br>
implements [Boolean1Boxed](#boolean1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Boolean1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Boolean1
public static class Boolean1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
