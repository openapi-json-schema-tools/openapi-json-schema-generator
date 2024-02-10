# Schema12
public class Schema12

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema12.Schema121Boxed](#schema121boxed)<br> abstract sealed validated payload class |
| static class | [Schema12.Schema121BoxedString](#schema121boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema12.Schema121](#schema121)<br> schema class |

## Schema121Boxed
public static abstract sealed class Schema121Boxed<br>
permits<br>
[Schema121BoxedString](#schema121boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema121BoxedString
public static final class Schema121BoxedString<br>
extends [Schema121Boxed](#schema121boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema121BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema121
public static class Schema121<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
