# NumberHeaderSchema
public class NumberHeaderSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NumberHeaderSchema.NumberHeaderSchema1Boxed](#numberheaderschema1boxed)<br> sealed validated payload class |
| static class | [NumberHeaderSchema.NumberHeaderSchema1](#numberheaderschema1)<br> schema class |

## NumberHeaderSchema1Boxed
public static abstract sealed class NumberHeaderSchema1Boxed<br>
permits<br>
[NumberHeaderSchema1BoxedString](#numberheaderschema1boxedstring)

## NumberHeaderSchema1
public static class NumberHeaderSchema1<br>
extends DecimalJsonSchema.DecimalJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.DecimalJsonSchema.DecimalJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |
