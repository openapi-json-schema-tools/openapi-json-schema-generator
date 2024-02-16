# Schema13
public class Schema13<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema13.Schema131Boxed](#schema131boxed)<br> abstract sealed validated payload class |
| static class | [Schema13.Schema131BoxedString](#schema131boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema13.Schema131](#schema131)<br> schema class |

## Schema131Boxed
public static abstract sealed class Schema131Boxed<br>
permits<br>
[Schema131BoxedString](#schema131boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema131BoxedString
public static final class Schema131BoxedString<br>
extends [Schema131Boxed](#schema131boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema131BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema131
public static class Schema131<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
