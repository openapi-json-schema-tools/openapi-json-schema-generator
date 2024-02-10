# Schema2
public class Schema2

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema2.Schema21Boxed](#schema21boxed)<br> sealed validated payload class |
| static class | [Schema2.Schema21BoxedString](#schema21boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema2.Schema21](#schema21)<br> schema class |

## Schema21Boxed
public static abstract sealed class Schema21Boxed<br>
permits<br>
[Schema21BoxedString](#schema21boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema21BoxedString
public static final class Schema21BoxedString<br>
extends Schema21Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema21BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema21
public static class Schema21<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
