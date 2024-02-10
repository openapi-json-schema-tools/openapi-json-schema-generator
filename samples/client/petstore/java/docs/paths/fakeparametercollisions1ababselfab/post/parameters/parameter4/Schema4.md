# Schema4
public class Schema4

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema4.Schema41Boxed](#schema41boxed)<br> abstract sealed validated payload class |
| static class | [Schema4.Schema41BoxedString](#schema41boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema4.Schema41](#schema41)<br> schema class |

## Schema41Boxed
public static abstract sealed class Schema41Boxed<br>
permits<br>
[Schema41BoxedString](#schema41boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema41BoxedString
public static final class Schema41BoxedString<br>
extends [Schema41Boxed](#schema41boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema41BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema41
public static class Schema41<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
