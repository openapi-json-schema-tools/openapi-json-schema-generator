# NullTypeMatchesOnlyTheNullObject
org.openapijsonschematools.client.components.schemas.NullTypeMatchesOnlyTheNullObject.java
class NullTypeMatchesOnlyTheNullObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)<br> sealed interface for validated payloads |
| data class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)<br> boxed class to store validated null payloads |
| class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1](#nulltypematchesonlythenullobject1)<br> schema class |

## NullTypeMatchesOnlyTheNullObject1Boxed
sealed interface NullTypeMatchesOnlyTheNullObject1Boxed<br>
permits<br>
[NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)

sealed interface that stores validated payloads using boxed classes

## NullTypeMatchesOnlyTheNullObject1BoxedVoid
data class NullTypeMatchesOnlyTheNullObject1BoxedVoid<br>
implements [NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullTypeMatchesOnlyTheNullObject1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NullTypeMatchesOnlyTheNullObject1
class NullTypeMatchesOnlyTheNullObject1<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
