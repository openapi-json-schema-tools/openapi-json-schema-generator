# StringTypeMatchesStrings
org.openapijsonschematools.client.components.schemas.StringTypeMatchesStrings.java
class StringTypeMatchesStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [StringTypeMatchesStrings.StringTypeMatchesStrings1Boxed](#stringtypematchesstrings1boxed)<br> sealed interface for validated payloads |
| record | [StringTypeMatchesStrings.StringTypeMatchesStrings1BoxedString](#stringtypematchesstrings1boxedstring)<br> boxed class to store validated String payloads |
| static class | [StringTypeMatchesStrings.StringTypeMatchesStrings1](#stringtypematchesstrings1)<br> schema class |

## StringTypeMatchesStrings1Boxed
sealed interface StringTypeMatchesStrings1Boxed<br>
permits<br>
[StringTypeMatchesStrings1BoxedString](#stringtypematchesstrings1boxedstring)

sealed interface that stores validated payloads using boxed classes

## StringTypeMatchesStrings1BoxedString
data class StringTypeMatchesStrings1BoxedString<br>
implements [StringTypeMatchesStrings1Boxed](#stringtypematchesstrings1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| StringTypeMatchesStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## StringTypeMatchesStrings1
class StringTypeMatchesStrings1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
