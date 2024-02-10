# Schema
public class Schema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema.Schema1Boxed](#schema1boxed)<br> abstract sealed validated payload class |
| static class | [Schema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema.Schema1](#schema1)<br> schema class |

## Schema1Boxed
public static abstract sealed class Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema1BoxedString
public static final class Schema1BoxedString<br>
extends [Schema1Boxed](#schema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema1
public static class Schema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
