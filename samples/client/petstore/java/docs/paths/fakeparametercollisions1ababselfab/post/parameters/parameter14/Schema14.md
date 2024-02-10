# Schema14
public class Schema14

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema14.Schema141Boxed](#schema141boxed)<br> sealed validated payload class |
| static class | [Schema14.Schema141](#schema141)<br> schema class |

## Schema141Boxed
public static abstract sealed class Schema141Boxed<br>
permits<br>
[Schema141BoxedString](#schema141boxedstring)

## Schema141
public static class Schema141<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
