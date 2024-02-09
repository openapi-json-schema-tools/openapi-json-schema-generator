# RefSchemaHeaderSchema
public class RefSchemaHeaderSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefSchemaHeaderSchema.RefSchemaHeaderSchema1](#refschemaheaderschema1)<br> schema class |

## RefSchemaHeaderSchema1
public static class RefSchemaHeaderSchema1<br>
extends [StringWithValidation.StringWithValidation1](../../../components/schemas/StringWithValidation.md#stringwithvalidation1)

A schema class that validates payloads
