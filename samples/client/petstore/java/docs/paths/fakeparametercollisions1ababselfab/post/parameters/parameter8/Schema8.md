# Schema8
public class Schema8<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema8.Schema81Boxed](#schema81boxed)<br> abstract sealed validated payload class |
| record | [Schema8.Schema81BoxedString](#schema81boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema8.Schema81](#schema81)<br> schema class |

## Schema81Boxed
public sealed interface Schema81Boxed<br>
permits<br>
[Schema81BoxedString](#schema81boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema81BoxedString
public record Schema81BoxedString<br>
implements [Schema81Boxed](#schema81boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema81BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema81
public static class Schema81<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
