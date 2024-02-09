# Schema16
public class Schema16

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema16.Schema161Boxed](#schema161boxed)<br> sealed validated payload class |
| static class | [Schema16.Schema161](#schema161)<br> schema class |

## Schema161Boxed
public static abstract sealed class Schema161Boxed<br>

## Schema161
public static class Schema161<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
