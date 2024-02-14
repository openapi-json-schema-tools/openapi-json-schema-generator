# Application~1xmlSchema
public class Application~1xmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1xmlSchema.Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedVoid](#application~1xmlschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedBoolean](#application~1xmlschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedNumber](#application~1xmlschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedString](#application~1xmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedList](#application~1xmlschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1BoxedMap](#application~1xmlschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1xmlSchema.Application~1xmlSchema1](#application~1xmlschema1)<br> schema class |

## Application~1xmlSchema1Boxed
public static abstract sealed class Application~1xmlSchema1Boxed<br>
permits<br>
[Application~1xmlSchema1BoxedVoid](#application~1xmlschema1boxedvoid),
[Application~1xmlSchema1BoxedBoolean](#application~1xmlschema1boxedboolean),
[Application~1xmlSchema1BoxedNumber](#application~1xmlschema1boxednumber),
[Application~1xmlSchema1BoxedString](#application~1xmlschema1boxedstring),
[Application~1xmlSchema1BoxedList](#application~1xmlschema1boxedlist),
[Application~1xmlSchema1BoxedMap](#application~1xmlschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1xmlSchema1BoxedVoid
public static final class Application~1xmlSchema1BoxedVoid<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application~1xmlSchema1BoxedBoolean
public static final class Application~1xmlSchema1BoxedBoolean<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application~1xmlSchema1BoxedNumber
public static final class Application~1xmlSchema1BoxedNumber<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1xmlSchema1BoxedString
public static final class Application~1xmlSchema1BoxedString<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1xmlSchema1BoxedList
public static final class Application~1xmlSchema1BoxedList<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application~1xmlSchema1BoxedMap
public static final class Application~1xmlSchema1BoxedMap<br>
extends [Application~1xmlSchema1Boxed](#application~1xmlschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1xmlSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application~1xmlSchema1
public static class Application~1xmlSchema1<br>
extends [Pet.Pet1](../../../../../../../../components/schemas/Pet.md#pet1)

A schema class that validates payloads
