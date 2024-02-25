# Schema4
public class Schema4<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema4.Schema41Boxed](#schema41boxed)<br> sealed interface for validated payloads |
| record | [Schema4.Schema41BoxedString](#schema41boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema4.Schema41](#schema41)<br> schema class |

## Schema41Boxed
public sealed interface Schema41Boxed<br>
permits<br>
[Schema41BoxedString](#schema41boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema41BoxedString
public record Schema41BoxedString<br>
implements [Schema41Boxed](#schema41boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema41BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema41
public static class Schema41<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
