# Schema8
public class Schema8

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema8.Schema81Boxed](#schema81boxed)<br> sealed validated payload class |
| static class | [Schema8.Schema81BoxedString](#schema81boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema8.Schema81](#schema81)<br> schema class |

## Schema81Boxed
public static abstract sealed class Schema81Boxed<br>
permits<br>
[Schema81BoxedString](#schema81boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema81BoxedString
public static final class Schema81BoxedString<br>
extends Schema81Boxed

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
