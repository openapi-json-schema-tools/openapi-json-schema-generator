# SomeHeaderSchema
public class SomeHeaderSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SomeHeaderSchema.SomeHeaderSchema1Boxed](#someheaderschema1boxed)<br> sealed validated payload class |
| static class | [SomeHeaderSchema.SomeHeaderSchema1](#someheaderschema1)<br> schema class |

## SomeHeaderSchema1Boxed
public static abstract sealed class SomeHeaderSchema1Boxed<br>
permits<br>
[SomeHeaderSchema1BoxedString](#someheaderschema1boxedstring)

## SomeHeaderSchema1
public static class SomeHeaderSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
