# Schema17
public class Schema17<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema17.Schema171Boxed](#schema171boxed)<br> abstract sealed validated payload class |
| record | [Schema17.Schema171BoxedString](#schema171boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema17.Schema171](#schema171)<br> schema class |

## Schema171Boxed
public sealed interface Schema171Boxed<br>
permits<br>
[Schema171BoxedString](#schema171boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema171BoxedString
public record Schema171BoxedString<br>
implements [Schema171Boxed](#schema171boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema171BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema171
public static class Schema171<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
