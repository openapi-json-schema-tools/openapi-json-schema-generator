# Schema10
public class Schema10<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema10.Schema101Boxed](#schema101boxed)<br> abstract sealed validated payload class |
| record | [Schema10.Schema101BoxedString](#schema101boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema10.Schema101](#schema101)<br> schema class |

## Schema101Boxed
public sealed interface Schema101Boxed<br>
permits<br>
[Schema101BoxedString](#schema101boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema101BoxedString
public record Schema101BoxedString<br>
implements [Schema101Boxed](#schema101boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema101BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema101
public static class Schema101<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
