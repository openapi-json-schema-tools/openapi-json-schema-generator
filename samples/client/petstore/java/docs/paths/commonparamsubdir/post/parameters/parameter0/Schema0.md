# Schema0
public class Schema0

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema0.Schema01Boxed](#schema01boxed)<br> sealed validated payload class |
| static class | [Schema0.Schema01](#schema01)<br> schema class |

## Schema01Boxed
public static abstract sealed class Schema01Boxed<br>
permits<br>
[Schema01BoxedString](#schema01boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema01
public static class Schema01<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
