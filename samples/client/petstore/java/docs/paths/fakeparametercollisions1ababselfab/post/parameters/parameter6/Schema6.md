# Schema6
public class Schema6<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Schema6.Schema61Boxed](#schema61boxed)<br> abstract sealed validated payload class |
| record | [Schema6.Schema61BoxedString](#schema61boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema6.Schema61](#schema61)<br> schema class |

## Schema61Boxed
public sealed interface Schema61Boxed<br>
permits<br>
[Schema61BoxedString](#schema61boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema61BoxedString
public record Schema61BoxedString<br>
implements [Schema61Boxed](#schema61boxed)

record that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema61BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## Schema61
public static class Schema61<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
