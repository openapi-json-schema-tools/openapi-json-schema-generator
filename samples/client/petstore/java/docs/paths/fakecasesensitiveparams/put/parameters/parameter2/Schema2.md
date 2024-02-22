# Schema2
public class Schema2<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema2.Schema21Boxed](#schema21boxed)<br> sealed interface for validated payloads |
| record | [Schema2.Schema21BoxedString](#schema21boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema2.Schema21](#schema21)<br> schema class |

## Schema21Boxed
public sealed interface Schema21Boxed<br>
permits<br>
[Schema21BoxedString](#schema21boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema21BoxedString
public record Schema21BoxedString<br>
implements [Schema21Boxed](#schema21boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema21BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema21
public static class Schema21<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
