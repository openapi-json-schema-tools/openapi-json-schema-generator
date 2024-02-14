# ApplicationjsonSchema
public class ApplicationjsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ApplicationjsonSchema.ApplicationjsonSchema1](#applicationjsonschema1)<br> schema class |

## ApplicationjsonSchema1Boxed
public static abstract sealed class ApplicationjsonSchema1Boxed<br>
permits<br>
[ApplicationjsonSchema1BoxedVoid](#applicationjsonschema1boxedvoid),
[ApplicationjsonSchema1BoxedBoolean](#applicationjsonschema1boxedboolean),
[ApplicationjsonSchema1BoxedNumber](#applicationjsonschema1boxednumber),
[ApplicationjsonSchema1BoxedString](#applicationjsonschema1boxedstring),
[ApplicationjsonSchema1BoxedList](#applicationjsonschema1boxedlist),
[ApplicationjsonSchema1BoxedMap](#applicationjsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## ApplicationjsonSchema1BoxedVoid
public static final class ApplicationjsonSchema1BoxedVoid<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## ApplicationjsonSchema1BoxedBoolean
public static final class ApplicationjsonSchema1BoxedBoolean<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## ApplicationjsonSchema1BoxedNumber
public static final class ApplicationjsonSchema1BoxedNumber<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## ApplicationjsonSchema1BoxedString
public static final class ApplicationjsonSchema1BoxedString<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## ApplicationjsonSchema1BoxedList
public static final class ApplicationjsonSchema1BoxedList<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## ApplicationjsonSchema1BoxedMap
public static final class ApplicationjsonSchema1BoxedMap<br>
extends [ApplicationjsonSchema1Boxed](#applicationjsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ApplicationjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## ApplicationjsonSchema1
public static class ApplicationjsonSchema1<br>
extends [AnimalFarm.AnimalFarm1](../../../../../../components/schemas/AnimalFarm.md#animalfarm1)

A schema class that validates payloads
