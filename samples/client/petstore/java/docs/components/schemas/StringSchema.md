# StringSchema
org.openapijsonschematools.client.components.schemas.StringSchema.java
public class StringSchema

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringSchema.StringSchema1Boxed](#stringschema1boxed)<br> sealed validated payload class |
| static class | [StringSchema.StringSchema1BoxedString](#stringschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringSchema.StringSchema1](#stringschema1)<br> schema class |

## StringSchema1Boxed
public static abstract sealed class StringSchema1Boxed<br>
permits<br>
[StringSchema1BoxedString](#stringschema1boxedstring)

A sealed class that stores validated payloads using boxed classes

## StringSchema1BoxedString
public static final class StringSchema1BoxedString<br>
extends StringSchema1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringSchema1
public static class StringSchema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
