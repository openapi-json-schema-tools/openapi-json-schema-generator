# BooleanSchema
org.openapijsonschematools.client.components.schemas.BooleanSchema.java
public class BooleanSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [BooleanSchema.BooleanSchema1Boxed](#booleanschema1boxed)<br> sealed validated payload class |
| static class | [BooleanSchema.BooleanSchema1](#booleanschema1)<br> schema class |

## BooleanSchema1Boxed
public static abstract sealed class BooleanSchema1Boxed<br>
permits<br>
[BooleanSchema1BoxedBoolean](#booleanschema1boxedboolean)

A sealed class that stores validated payloads using boxed classes

## BooleanSchema1
public static class BooleanSchema1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
