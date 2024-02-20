# DecimalPayload
org.openapijsonschematools.client.components.schemas.DecimalPayload.java
public class DecimalPayload<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DecimalPayload.DecimalPayload1Boxed](#decimalpayload1boxed)<br> abstract sealed validated payload class |
| record | [DecimalPayload.DecimalPayload1BoxedString](#decimalpayload1boxedstring)<br> boxed class to store validated String payloads |
| static class | [DecimalPayload.DecimalPayload1](#decimalpayload1)<br> schema class |

## DecimalPayload1Boxed
public sealed interface DecimalPayload1Boxed<br>
permits<br>
[DecimalPayload1BoxedString](#decimalpayload1boxedstring)

sealed interface that stores validated payloads using boxed classes

## DecimalPayload1BoxedString
public record DecimalPayload1BoxedString<br>
implements [DecimalPayload1Boxed](#decimalpayload1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DecimalPayload1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## DecimalPayload1
public static class DecimalPayload1<br>
extends DecimalJsonSchema.DecimalJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema.DecimalJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
