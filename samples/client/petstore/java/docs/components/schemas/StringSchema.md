# StringSchema
org.openapijsonschematools.client.components.schemas.StringSchema.java
public class StringSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StringSchema.StringSchema1Boxed](#stringschema1boxed)<br> abstract sealed validated payload class |
| record | [StringSchema.StringSchema1BoxedString](#stringschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringSchema.StringSchema1](#stringschema1)<br> schema class |

## StringSchema1Boxed
public sealed interface StringSchema1Boxed<br>
permits<br>
[StringSchema1BoxedString](#stringschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringSchema1BoxedString
public record StringSchema1BoxedString<br>
implements [StringSchema1Boxed](#stringschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## StringSchema1
public static class StringSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
