# Schema18
public class Schema18

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema18.Schema181Boxed](#schema181boxed)<br> sealed validated payload class |
| static class | [Schema18.Schema181](#schema181)<br> schema class |

## Schema181Boxed
public static abstract sealed class Schema181Boxed<br>

## Schema181
public static class Schema181<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
