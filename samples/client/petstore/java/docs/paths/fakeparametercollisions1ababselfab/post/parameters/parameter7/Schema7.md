# Schema7
public class Schema7

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema7.Schema71Boxed](#schema71boxed)<br> sealed validated payload class |
| static class | [Schema7.Schema71](#schema71)<br> schema class |

## Schema71Boxed
public static abstract sealed class Schema71Boxed<br>

## Schema71
public static class Schema71<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
