# Schema15
public class Schema15<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema15.Schema151Boxed](#schema151boxed)<br> abstract sealed validated payload class |
| record | [Schema15.Schema151BoxedString](#schema151boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema15.Schema151](#schema151)<br> schema class |

## Schema151Boxed
public sealed interface Schema151Boxed<br>
permits<br>
[Schema151BoxedString](#schema151boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema151BoxedString
public record Schema151BoxedString<br>
implements [Schema151Boxed](#schema151boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema151BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()validated payload |

## Schema151
public static class Schema151<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
