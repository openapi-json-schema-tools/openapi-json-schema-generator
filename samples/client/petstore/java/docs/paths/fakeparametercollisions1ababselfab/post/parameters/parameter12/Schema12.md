# Schema12
public class Schema12

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema12.Schema121Boxed](#schema121boxed)<br> sealed validated payload class |
| static class | [Schema12.Schema121](#schema121)<br> schema class |

## Schema121Boxed
public static abstract sealed class Schema121Boxed<br>
permits<br>
[Schema121BoxedString](#schema121boxedstring)

## Schema121
public static class Schema121<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
