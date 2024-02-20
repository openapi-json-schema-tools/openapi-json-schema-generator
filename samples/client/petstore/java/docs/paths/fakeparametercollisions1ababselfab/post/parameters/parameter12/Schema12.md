# Schema12
public class Schema12<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema12.Schema121Boxed](#schema121boxed)<br> abstract sealed validated payload class |
| record | [Schema12.Schema121BoxedString](#schema121boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema12.Schema121](#schema121)<br> schema class |

## Schema121Boxed
public sealed interface Schema121Boxed<br>
permits<br>
[Schema121BoxedString](#schema121boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema121BoxedString
public record Schema121BoxedString<br>
implements [Schema121Boxed](#schema121boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema121BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema121
public static class Schema121<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
