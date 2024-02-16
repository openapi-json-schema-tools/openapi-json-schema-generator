# ArrayTypeMatchesArrays
org.openapijsonschematools.client.components.schemas.ArrayTypeMatchesArrays.java
public class ArrayTypeMatchesArrays<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)<br> abstract sealed validated payload class |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ArrayTypeMatchesArrays.ArrayTypeMatchesArrays1](#arraytypematchesarrays1)<br> schema class |

## ArrayTypeMatchesArrays1Boxed
public static abstract sealed class ArrayTypeMatchesArrays1Boxed<br>
permits<br>
[ArrayTypeMatchesArrays1BoxedList](#arraytypematchesarrays1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## ArrayTypeMatchesArrays1BoxedList
public static final class ArrayTypeMatchesArrays1BoxedList<br>
extends [ArrayTypeMatchesArrays1Boxed](#arraytypematchesarrays1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ArrayTypeMatchesArrays1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ArrayTypeMatchesArrays1
public static class ArrayTypeMatchesArrays1<br>
extends ListJsonSchema.ListJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.ListJsonSchema.ListJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
