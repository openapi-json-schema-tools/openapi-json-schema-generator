# Schema1
public class Schema1

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema1.Schema11Boxed](#schema11boxed)<br> sealed validated payload class |
| static class | [Schema1.Schema11](#schema11)<br> schema class |

## Schema11Boxed
public static abstract sealed class Schema11Boxed<br>
permits<br>
[Schema11BoxedString](#schema11boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema11
public static class Schema11<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
