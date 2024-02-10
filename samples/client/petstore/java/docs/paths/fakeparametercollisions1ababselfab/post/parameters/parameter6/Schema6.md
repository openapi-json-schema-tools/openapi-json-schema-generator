# Schema6
public class Schema6

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema6.Schema61Boxed](#schema61boxed)<br> abstract sealed validated payload class |
| static class | [Schema6.Schema61BoxedString](#schema61boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema6.Schema61](#schema61)<br> schema class |

## Schema61Boxed
public static abstract sealed class Schema61Boxed<br>
permits<br>
[Schema61BoxedString](#schema61boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema61BoxedString
public static final class Schema61BoxedString<br>
extends [Schema61Boxed](#schema61boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema61BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema61
public static class Schema61<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
