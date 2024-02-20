# Schema1
public class Schema1<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema1.Schema11Boxed](#schema11boxed)<br> abstract sealed validated payload class |
| record | [Schema1.Schema11BoxedString](#schema11boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema1.Schema11](#schema11)<br> schema class |

## Schema11Boxed
public sealed interface Schema11Boxed<br>
permits<br>
[Schema11BoxedString](#schema11boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema11BoxedString
public record Schema11BoxedString<br>
implements [Schema11Boxed](#schema11boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema11BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema11
public static class Schema11<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
