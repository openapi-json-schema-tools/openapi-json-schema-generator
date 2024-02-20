# Schema16
public class Schema16<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema16.Schema161Boxed](#schema161boxed)<br> abstract sealed validated payload class |
| record | [Schema16.Schema161BoxedString](#schema161boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema16.Schema161](#schema161)<br> schema class |

## Schema161Boxed
public sealed interface Schema161Boxed<br>
permits<br>
[Schema161BoxedString](#schema161boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema161BoxedString
public record Schema161BoxedString<br>
implements [Schema161Boxed](#schema161boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema161BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema161
public static class Schema161<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
