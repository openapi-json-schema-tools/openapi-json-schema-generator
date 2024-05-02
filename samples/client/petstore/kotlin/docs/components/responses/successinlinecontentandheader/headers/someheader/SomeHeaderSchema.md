# SomeHeaderSchema
public class SomeHeaderSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SomeHeaderSchema.SomeHeaderSchema1Boxed](#someheaderschema1boxed)<br> sealed interface for validated payloads |
| record | [SomeHeaderSchema.SomeHeaderSchema1BoxedString](#someheaderschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [SomeHeaderSchema.SomeHeaderSchema1](#someheaderschema1)<br> schema class |

## SomeHeaderSchema1Boxed
public sealed interface SomeHeaderSchema1Boxed<br>
permits<br>
[SomeHeaderSchema1BoxedString](#someheaderschema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## SomeHeaderSchema1BoxedString
public record SomeHeaderSchema1BoxedString<br>
implements [SomeHeaderSchema1Boxed](#someheaderschema1boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SomeHeaderSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## SomeHeaderSchema1
public static class SomeHeaderSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
