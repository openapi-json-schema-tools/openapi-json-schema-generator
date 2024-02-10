# Schema11
public class Schema11

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Schema11.Schema111Boxed](#schema111boxed)<br> sealed validated payload class |
| static class | [Schema11.Schema111](#schema111)<br> schema class |

## Schema111Boxed
public static abstract sealed class Schema111Boxed<br>
permits<br>
[Schema111BoxedString](#schema111boxedstring)

## Schema111
public static class Schema111<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
