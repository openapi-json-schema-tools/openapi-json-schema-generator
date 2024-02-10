# StringSchema
org.openapijsonschematools.client.components.schemas.StringSchema.java
public class StringSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- a sealed class which stored validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringSchema.StringSchema1Boxed](#stringschema1boxed)<br> sealed validated payload class |
| static class | [StringSchema.StringSchema1](#stringschema1)<br> schema class |

## StringSchema1Boxed
public static abstract sealed class StringSchema1Boxed<br>
permits<br>
[StringSchema1BoxedString](#stringschema1boxedstring)

## StringSchema1
public static class StringSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
