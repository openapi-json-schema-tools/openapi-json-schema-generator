# NullTypeMatchesOnlyTheNullObject
org.openapijsonschematools.client.components.schemas.NullTypeMatchesOnlyTheNullObject.java
public class NullTypeMatchesOnlyTheNullObject<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)<br> abstract sealed validated payload class |
| static class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NullTypeMatchesOnlyTheNullObject.NullTypeMatchesOnlyTheNullObject1](#nulltypematchesonlythenullobject1)<br> schema class |

## NullTypeMatchesOnlyTheNullObject1Boxed
public static abstract sealed class NullTypeMatchesOnlyTheNullObject1Boxed<br>
permits<br>
[NullTypeMatchesOnlyTheNullObject1BoxedVoid](#nulltypematchesonlythenullobject1boxedvoid)

abstract sealed class that stores validated payloads using boxed classes

## NullTypeMatchesOnlyTheNullObject1BoxedVoid
public static final class NullTypeMatchesOnlyTheNullObject1BoxedVoid<br>
extends [NullTypeMatchesOnlyTheNullObject1Boxed](#nulltypematchesonlythenullobject1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NullTypeMatchesOnlyTheNullObject1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## NullTypeMatchesOnlyTheNullObject1
public static class NullTypeMatchesOnlyTheNullObject1<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
