# Schema8
public class Schema8<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema8.Schema81Boxed](#schema81boxed)<br> abstract sealed validated payload class |
| static class | [Schema8.Schema81BoxedString](#schema81boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema8.Schema81](#schema81)<br> schema class |

## Schema81Boxed
public static abstract sealed class Schema81Boxed<br>
permits<br>
[Schema81BoxedString](#schema81boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema81BoxedString
public static final class Schema81BoxedString<br>
extends [Schema81Boxed](#schema81boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema81BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema81
public static class Schema81<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
