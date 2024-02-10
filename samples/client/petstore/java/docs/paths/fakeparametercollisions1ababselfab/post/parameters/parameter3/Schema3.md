# Schema3
public class Schema3

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
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

## Schema31
public static class Schema31<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
