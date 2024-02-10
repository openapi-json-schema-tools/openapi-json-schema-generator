# StringHeaderSchema
public class StringHeaderSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringHeaderSchema.StringHeaderSchema1Boxed](#stringheaderschema1boxed)<br> sealed validated payload class |
| static class | [StringHeaderSchema.StringHeaderSchema1](#stringheaderschema1)<br> schema class |

## StringHeaderSchema1Boxed
public static abstract sealed class StringHeaderSchema1Boxed<br>
permits<br>
[StringHeaderSchema1BoxedString](#stringheaderschema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## StringHeaderSchema1
public static class StringHeaderSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
