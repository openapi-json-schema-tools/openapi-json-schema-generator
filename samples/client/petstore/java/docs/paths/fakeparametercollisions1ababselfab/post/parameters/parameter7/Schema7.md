# Schema7
public class Schema7<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema7.Schema71Boxed](#schema71boxed)<br> abstract sealed validated payload class |
| static class | [Schema7.Schema71BoxedString](#schema71boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema7.Schema71](#schema71)<br> schema class |

## Schema71Boxed
public sealed interface Schema71Boxed<br>
permits<br>
[Schema71BoxedString](#schema71boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema71BoxedString
public static final class Schema71BoxedString<br>
implements [Schema71Boxed](#schema71boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema71BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema71
public static class Schema71<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
