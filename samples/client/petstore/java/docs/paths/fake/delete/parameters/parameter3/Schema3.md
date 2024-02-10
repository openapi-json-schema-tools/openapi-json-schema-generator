# Schema3
public class Schema3

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema3.Schema31Boxed](#schema31boxed)<br> sealed validated payload class |
| static class | [Schema3.Schema31](#schema31)<br> schema class |

## Schema31Boxed
public static abstract sealed class Schema31Boxed<br>
permits<br>
[Schema31BoxedString](#schema31boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema31BoxedString
public static final class Schema31BoxedString<br>
extends Schema31Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema31BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema31
public static class Schema31<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
