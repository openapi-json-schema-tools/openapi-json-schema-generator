# RefPet
org.openapijsonschematools.client.components.schemas.RefPet.java
public class RefPet

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [RefPet.RefPet1Boxed](#refpet1boxed)<br> abstract sealed validated payload class |
| static class | [RefPet.RefPet1BoxedVoid](#refpet1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [RefPet.RefPet1BoxedBoolean](#refpet1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [RefPet.RefPet1BoxedNumber](#refpet1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [RefPet.RefPet1BoxedString](#refpet1boxedstring)<br> boxed class to store validated String payloads |
| static class | [RefPet.RefPet1BoxedList](#refpet1boxedlist)<br> boxed class to store validated List payloads |
| static class | [RefPet.RefPet1BoxedMap](#refpet1boxedmap)<br> boxed class to store validated Map payloads |
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

abstract sealed class that stores validated payloads using boxed classes

## RefPet1BoxedVoid
public static final class RefPet1BoxedVoid<br>
extends [RefPet1Boxed](#refpet1boxed)

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
extends [RefPet1Boxed](#refpet1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## RefPet1BoxedNumber
public static final class RefPet1BoxedNumber<br>
extends [RefPet1Boxed](#refpet1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## RefPet1BoxedString
public static final class RefPet1BoxedString<br>
extends [RefPet1Boxed](#refpet1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## RefPet1BoxedList
public static final class RefPet1BoxedList<br>
extends [RefPet1Boxed](#refpet1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## RefPet1BoxedMap
public static final class RefPet1BoxedMap<br>
extends [RefPet1Boxed](#refpet1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefPet1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## RefPet1
public static class RefPet1<br>
extends [Pet.Pet1](../../components/schemas/Pet.md#pet1)

A schema class that validates payloads

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
