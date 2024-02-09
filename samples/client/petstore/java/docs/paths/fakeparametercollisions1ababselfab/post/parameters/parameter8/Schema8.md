# Schema8
public class Schema8

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema8.Schema81Boxed](#schema81boxed)<br> sealed validated payload class |
| static class | [Schema8.Schema81](#schema81)<br> schema class |

## Schema81Boxed
public static abstract sealed class Schema81Boxed<br>

## Schema81
public static class Schema81<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
