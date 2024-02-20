# Schema7
public class Schema7<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema7.Schema71Boxed](#schema71boxed)<br> abstract sealed validated payload class |
| record | [Schema7.Schema71BoxedString](#schema71boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema7.Schema71](#schema71)<br> schema class |

## Schema71Boxed
public sealed interface Schema71Boxed<br>
permits<br>
[Schema71BoxedString](#schema71boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema71BoxedString
public record Schema71BoxedString<br>
implements [Schema71Boxed](#schema71boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema71BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema71
public static class Schema71<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
