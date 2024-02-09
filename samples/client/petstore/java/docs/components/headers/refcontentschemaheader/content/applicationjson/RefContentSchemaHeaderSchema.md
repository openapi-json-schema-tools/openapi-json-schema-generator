# RefContentSchemaHeaderSchema
public class RefContentSchemaHeaderSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1Boxed](#refcontentschemaheaderschema1boxed)<br> sealed validated payload class |
| static class | [RefContentSchemaHeaderSchema.RefContentSchemaHeaderSchema1](#refcontentschemaheaderschema1)<br> schema class |

## RefContentSchemaHeaderSchema1Boxed
public static abstract sealed class RefContentSchemaHeaderSchema1Boxed<br>

## RefContentSchemaHeaderSchema1
public static class RefContentSchemaHeaderSchema1<br>
extends [StringWithValidation.StringWithValidation1](../../../../../components/schemas/StringWithValidation.md#stringwithvalidation1)

A schema class that validates payloads
