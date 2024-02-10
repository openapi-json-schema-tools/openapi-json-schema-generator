# Schema13
public class Schema13

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema13.Schema131Boxed](#schema131boxed)<br> sealed validated payload class |
| static class | [Schema13.Schema131](#schema131)<br> schema class |

## Schema131Boxed
public static abstract sealed class Schema131Boxed<br>
permits<br>
[Schema131BoxedString](#schema131boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema131
public static class Schema131<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
