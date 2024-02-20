# Schema18
public class Schema18<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema18.Schema181Boxed](#schema181boxed)<br> abstract sealed validated payload class |
| record | [Schema18.Schema181BoxedString](#schema181boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema18.Schema181](#schema181)<br> schema class |

## Schema181Boxed
public sealed interface Schema181Boxed<br>
permits<br>
[Schema181BoxedString](#schema181boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema181BoxedString
public record Schema181BoxedString<br>
implements [Schema181Boxed](#schema181boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema181BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema181
public static class Schema181<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
