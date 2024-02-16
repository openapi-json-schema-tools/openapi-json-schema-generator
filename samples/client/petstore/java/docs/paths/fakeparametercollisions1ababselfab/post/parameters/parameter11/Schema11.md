# Schema11
public class Schema11<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema11.Schema111Boxed](#schema111boxed)<br> abstract sealed validated payload class |
| static class | [Schema11.Schema111BoxedString](#schema111boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema11.Schema111](#schema111)<br> schema class |

## Schema111Boxed
public static abstract sealed class Schema111Boxed<br>
permits<br>
[Schema111BoxedString](#schema111boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema111BoxedString
public static final class Schema111BoxedString<br>
extends [Schema111Boxed](#schema111boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema111BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema111
public static class Schema111<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
