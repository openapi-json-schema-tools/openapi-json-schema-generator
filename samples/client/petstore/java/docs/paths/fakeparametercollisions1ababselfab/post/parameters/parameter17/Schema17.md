# Schema17
public class Schema17

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema17.Schema171Boxed](#schema171boxed)<br> sealed validated payload class |
| static class | [Schema17.Schema171](#schema171)<br> schema class |

## Schema171Boxed
public static abstract sealed class Schema171Boxed<br>
permits<br>
[Schema171BoxedString](#schema171boxedstring)

## Schema171
public static class Schema171<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
