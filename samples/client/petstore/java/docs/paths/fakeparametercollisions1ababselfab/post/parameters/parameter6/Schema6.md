# Schema6
public class Schema6

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema6.Schema61Boxed](#schema61boxed)<br> sealed validated payload class |
| static class | [Schema6.Schema61](#schema61)<br> schema class |

## Schema61Boxed
public static abstract sealed class Schema61Boxed<br>

## Schema61
public static class Schema61<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
