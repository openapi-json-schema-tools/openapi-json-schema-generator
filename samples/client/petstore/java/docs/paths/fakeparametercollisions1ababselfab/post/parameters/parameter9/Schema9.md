# Schema9
public class Schema9

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema9.Schema91Boxed](#schema91boxed)<br> sealed validated payload class |
| static class | [Schema9.Schema91](#schema91)<br> schema class |

## Schema91Boxed
public static abstract sealed class Schema91Boxed<br>
permits<br>
[Schema91BoxedString](#schema91boxedstring)

A sealed class that stores validated payloads using boxed classes

## Schema91
public static class Schema91<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
