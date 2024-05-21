# NullTypeMatchesOnlyTheNullObject
unit_test_api.components.schemas.NullTypeMatchesOnlyTheNullObject.java
public class NullTypeMatchesOnlyTheNullObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)<br> sealed interface for validated payloads |
| record | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1](#nulltypematchesonlythenullobject1)<br> schema class |

## NullTypeMatchesOnlyTheNullObject1Boxed
public sealed interface NullTypeMatchesOnlyTheNullObject1Boxed<br>
permits<br>
[NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)

sealed interface that stores validated payloads using boxed classes

## NullTypeMatchesOnlyTheNullObject1BoxedVoid
public record NullTypeMatchesOnlyTheNullObject1BoxedVoid<br>
implements [NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)

record that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullTypeMatchesOnlyTheNullObject1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Void | data()<br>validated payload |
| @Nullable Object | getData()<br>validated payload |

## NullTypeMatchesOnlyTheNullObject1
public static class NullTypeMatchesOnlyTheNullObject1<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class unit_test_api.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
