# Application1xmlSchema
public class Application1xmlSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1xmlSchema.Application1xmlSchema1Boxed](#application1xmlschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedVoid](#application1xmlschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedBoolean](#application1xmlschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedNumber](#application1xmlschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedString](#application1xmlschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedList](#application1xmlschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1BoxedMap](#application1xmlschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1xmlSchema.Application1xmlSchema1](#application1xmlschema1)<br> schema class |

## Application1xmlSchema1Boxed
public static abstract sealed class Application1xmlSchema1Boxed<br>
permits<br>
[Application1xmlSchema1BoxedVoid](#application1xmlschema1boxedvoid),
[Application1xmlSchema1BoxedBoolean](#application1xmlschema1boxedboolean),
[Application1xmlSchema1BoxedNumber](#application1xmlschema1boxednumber),
[Application1xmlSchema1BoxedString](#application1xmlschema1boxedstring),
[Application1xmlSchema1BoxedList](#application1xmlschema1boxedlist),
[Application1xmlSchema1BoxedMap](#application1xmlschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1xmlSchema1BoxedVoid
public static final class Application1xmlSchema1BoxedVoid<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application1xmlSchema1BoxedBoolean
public static final class Application1xmlSchema1BoxedBoolean<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application1xmlSchema1BoxedNumber
public static final class Application1xmlSchema1BoxedNumber<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1xmlSchema1BoxedString
public static final class Application1xmlSchema1BoxedString<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1xmlSchema1BoxedList
public static final class Application1xmlSchema1BoxedList<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application1xmlSchema1BoxedMap
public static final class Application1xmlSchema1BoxedMap<br>
extends [Application1xmlSchema1Boxed](#application1xmlschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1xmlSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application1xmlSchema1
public static class Application1xmlSchema1<br>
extends [Order.Order1](../../../../../../../../components/schemas/Order.md#order1)

A schema class that validates payloads
