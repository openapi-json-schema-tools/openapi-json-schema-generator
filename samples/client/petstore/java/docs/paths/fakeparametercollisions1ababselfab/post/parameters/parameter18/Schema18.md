# Schema18
public class Schema18<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema18.Schema181Boxed](#schema181boxed)<br> abstract sealed validated payload class |
| static class | [Schema18.Schema181BoxedString](#schema181boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema18.Schema181](#schema181)<br> schema class |

## Schema181Boxed
public static abstract sealed class Schema181Boxed<br>
permits<br>
[Schema181BoxedString](#schema181boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema181BoxedString
public static final class Schema181BoxedString<br>
extends [Schema181Boxed](#schema181boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema181BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema181
public static class Schema181<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
