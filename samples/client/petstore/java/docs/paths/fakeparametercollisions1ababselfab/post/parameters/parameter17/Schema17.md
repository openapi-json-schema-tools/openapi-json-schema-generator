# Schema17
public class Schema17

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema17.Schema171Boxed](#schema171boxed)<br> sealed validated payload class |
| static class | [Schema17.Schema171BoxedString](#schema171boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema17.Schema171](#schema171)<br> schema class |

## Schema171Boxed
public static abstract sealed class Schema171Boxed<br>
permits<br>
[Schema171BoxedString](#schema171boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema171BoxedString
public static final class Schema171BoxedString<br>
extends Schema171Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema171BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema171
public static class Schema171<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
