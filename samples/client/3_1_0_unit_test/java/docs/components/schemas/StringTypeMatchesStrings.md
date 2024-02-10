# StringTypeMatchesStrings
org.openapijsonschematools.client.components.schemas.StringTypeMatchesStrings.java
public class StringTypeMatchesStrings

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [StringTypeMatchesStrings.StringTypeMatchesStrings1Boxed](#stringtypematchesstrings1boxed)<br> abstract sealed validated payload class |
| static class | [StringTypeMatchesStrings.StringTypeMatchesStrings1BoxedString](#stringtypematchesstrings1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringTypeMatchesStrings.StringTypeMatchesStrings1](#stringtypematchesstrings1)<br> schema class |

## StringTypeMatchesStrings1Boxed
public static abstract sealed class StringTypeMatchesStrings1Boxed<br>
permits<br>
[StringTypeMatchesStrings1BoxedString](#stringtypematchesstrings1boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## StringTypeMatchesStrings1BoxedString
public static final class StringTypeMatchesStrings1BoxedString<br>
extends [StringTypeMatchesStrings1Boxed](#stringtypematchesstrings1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringTypeMatchesStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## StringTypeMatchesStrings1
public static class StringTypeMatchesStrings1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
