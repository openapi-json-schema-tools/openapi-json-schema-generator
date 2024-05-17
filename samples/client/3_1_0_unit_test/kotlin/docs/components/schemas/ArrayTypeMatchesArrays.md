# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
class ArrayTypeMatchesArrays<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)<br> sealed interface for validated payloads |
| record | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |

## ArrayTypeMatchesArrays1Boxed
sealed interface ArrayTypeMatchesArrays1Boxed<br>
permits<br>
[ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayTypeMatchesArrays1BoxedList
data class ArrayTypeMatchesArrays1BoxedList<br>
implements [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArrays1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ArrayTypeMatchesArrays1
class ArrayTypeMatchesArrays1<br>
extends ListJsonSchema.ListJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.ListJsonSchema.ListJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
