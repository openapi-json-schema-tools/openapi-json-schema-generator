# String
org.openapijsonschematools.client.components.schemas.String.java
public class String<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [String.String1Boxed](#string1boxed)<br> sealed interface for validated payloads |
| record | [String.String1BoxedString](#string1boxedstring)<br> boxed class to store validated String payloads |
| static class | [String.String1](#string1)<br> schema class |

## String1Boxed
public sealed interface String1Boxed<br>
permits<br>
[String1BoxedString](#string1boxedstring)

sealed interface that stores validated payloads using boxed classes

## String1BoxedString
public record String1BoxedString<br>
implements [String1Boxed](#string1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| String1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## String1
public static class String1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
