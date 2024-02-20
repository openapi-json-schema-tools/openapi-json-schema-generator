# Schema11
public class Schema11<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema11.Schema111Boxed](#schema111boxed)<br> abstract sealed validated payload class |
| record | [Schema11.Schema111BoxedString](#schema111boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema11.Schema111](#schema111)<br> schema class |

## Schema111Boxed
public sealed interface Schema111Boxed<br>
permits<br>
[Schema111BoxedString](#schema111boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema111BoxedString
public record Schema111BoxedString<br>
implements [Schema111Boxed](#schema111boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema111BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema111
public static class Schema111<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
