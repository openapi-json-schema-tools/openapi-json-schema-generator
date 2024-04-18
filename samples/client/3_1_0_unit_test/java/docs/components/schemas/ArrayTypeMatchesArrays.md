# ArrayTypeMatchesArrays
unit_test_api.components.schemas.ArrayTypeMatchesArrays.java
public class ArrayTypeMatchesArrays<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)<br> sealed interface for validated payloads |
| record | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |

## ArrayTypeMatchesArrays1Boxed
public sealed interface ArrayTypeMatchesArrays1Boxed<br>
permits<br>
[ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ArrayTypeMatchesArrays1BoxedList
public record ArrayTypeMatchesArrays1BoxedList<br>
implements [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)

record that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArrays1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## ArrayTypeMatchesArrays1
public static class ArrayTypeMatchesArrays1<br>
extends ListJsonSchema.ListJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.ListJsonSchema.ListJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
