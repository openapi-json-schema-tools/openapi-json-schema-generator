# Schema9
public class Schema9<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema9.Schema91Boxed](#schema91boxed)<br> abstract sealed validated payload class |
| record | [Schema9.Schema91BoxedString](#schema91boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema9.Schema91](#schema91)<br> schema class |

## Schema91Boxed
public sealed interface Schema91Boxed<br>
permits<br>
[Schema91BoxedString](#schema91boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema91BoxedString
public record Schema91BoxedString<br>
implements [Schema91Boxed](#schema91boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema91BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema91
public static class Schema91<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
