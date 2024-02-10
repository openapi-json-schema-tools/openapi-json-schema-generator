# RefPet
org.openapijsonschematools.client.components.schemas.RefPet.java
public class RefPet

A class that contains necessary nested
- schema classes (which validates payloads), extends JsonSchema
- a sealed class which stores validated payloads, java version of a sum type
- boxed class(es) to store validated payloads, sealed permits class implementation(s)

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefPet.RefPet1Boxed](#refpet1boxed)<br> sealed validated payload class |
| static class | [RefPet.RefPet1](#refpet1)<br> schema class |

## RefPet1Boxed
public static abstract sealed class RefPet1Boxed<br>
permits<br>
[RefPet1BoxedVoid](#refpet1boxedvoid),
[RefPet1BoxedBoolean](#refpet1boxedboolean),
[RefPet1BoxedNumber](#refpet1boxednumber),
[RefPet1BoxedString](#refpet1boxedstring),
[RefPet1BoxedList](#refpet1boxedlist),
[RefPet1BoxedMap](#refpet1boxedmap)

A sealed class that stores validated payloads using boxed classes

## RefPet1BoxedVoid
public static final class RefPet1BoxedVoid<br>
extends RefPet1Boxed

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## RefPet1BoxedBoolean
public static final class RefPet1BoxedBoolean<br>
extends RefPet1Boxed

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefPet1BoxedString
public static final class RefPet1BoxedString<br>
extends RefPet1Boxed

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefPet1
public static class RefPet1<br>
extends [Pet.Pet1](../../components/schemas/Pet.md#pet1)

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
