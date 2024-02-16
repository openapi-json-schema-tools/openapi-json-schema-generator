# Schema16
public class Schema16<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema16.Schema161Boxed](#schema161boxed)<br> abstract sealed validated payload class |
| static class | [Schema16.Schema161BoxedString](#schema161boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema16.Schema161](#schema161)<br> schema class |

## Schema161Boxed
public static abstract sealed class Schema161Boxed<br>
permits<br>
[Schema161BoxedString](#schema161boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema161BoxedString
public static final class Schema161BoxedString<br>
extends [Schema161Boxed](#schema161boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema161BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema161
public static class Schema161<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
