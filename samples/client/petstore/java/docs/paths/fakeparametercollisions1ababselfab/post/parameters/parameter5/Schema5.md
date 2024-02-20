# Schema5
public class Schema5<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema5.Schema51Boxed](#schema51boxed)<br> abstract sealed validated payload class |
| record | [Schema5.Schema51BoxedString](#schema51boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema5.Schema51](#schema51)<br> schema class |

## Schema51Boxed
public sealed interface Schema51Boxed<br>
permits<br>
[Schema51BoxedString](#schema51boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema51BoxedString
public record Schema51BoxedString<br>
implements [Schema51Boxed](#schema51boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema51BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema51
public static class Schema51<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
