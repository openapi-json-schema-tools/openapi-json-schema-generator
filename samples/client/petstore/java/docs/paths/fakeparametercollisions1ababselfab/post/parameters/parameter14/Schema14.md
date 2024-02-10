# Schema14
public class Schema14

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema14.Schema141Boxed](#schema141boxed)<br> abstract sealed validated payload class |
| static class | [Schema14.Schema141BoxedString](#schema141boxedstring)<br> boxed class to store validated String payloads |
| static class | [Schema14.Schema141](#schema141)<br> schema class |

## Schema141Boxed
public static abstract sealed class Schema141Boxed<br>
permits<br>
[Schema141BoxedString](#schema141boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema141BoxedString
public static final class Schema141BoxedString<br>
extends [Schema141Boxed](#schema141boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema141BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema141
public static class Schema141<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
