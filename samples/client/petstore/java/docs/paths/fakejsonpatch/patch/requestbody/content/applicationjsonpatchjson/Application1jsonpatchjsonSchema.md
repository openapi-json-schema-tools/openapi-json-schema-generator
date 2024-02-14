# Application1jsonpatchjsonSchema
public class Application1jsonpatchjsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedVoid](#application1jsonpatchjsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedBoolean](#application1jsonpatchjsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedNumber](#application1jsonpatchjsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedString](#application1jsonpatchjsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedList](#application1jsonpatchjsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1BoxedMap](#application1jsonpatchjsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1jsonpatchjsonSchema.Application1jsonpatchjsonSchema1](#application1jsonpatchjsonschema1)<br> schema class |

## Application1jsonpatchjsonSchema1Boxed
public static abstract sealed class Application1jsonpatchjsonSchema1Boxed<br>
permits<br>
[Application1jsonpatchjsonSchema1BoxedVoid](#application1jsonpatchjsonschema1boxedvoid),
[Application1jsonpatchjsonSchema1BoxedBoolean](#application1jsonpatchjsonschema1boxedboolean),
[Application1jsonpatchjsonSchema1BoxedNumber](#application1jsonpatchjsonschema1boxednumber),
[Application1jsonpatchjsonSchema1BoxedString](#application1jsonpatchjsonschema1boxedstring),
[Application1jsonpatchjsonSchema1BoxedList](#application1jsonpatchjsonschema1boxedlist),
[Application1jsonpatchjsonSchema1BoxedMap](#application1jsonpatchjsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1jsonpatchjsonSchema1BoxedVoid
public static final class Application1jsonpatchjsonSchema1BoxedVoid<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application1jsonpatchjsonSchema1BoxedBoolean
public static final class Application1jsonpatchjsonSchema1BoxedBoolean<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application1jsonpatchjsonSchema1BoxedNumber
public static final class Application1jsonpatchjsonSchema1BoxedNumber<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1jsonpatchjsonSchema1BoxedString
public static final class Application1jsonpatchjsonSchema1BoxedString<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1jsonpatchjsonSchema1BoxedList
public static final class Application1jsonpatchjsonSchema1BoxedList<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application1jsonpatchjsonSchema1BoxedMap
public static final class Application1jsonpatchjsonSchema1BoxedMap<br>
extends [Application1jsonpatchjsonSchema1Boxed](#application1jsonpatchjsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonpatchjsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application1jsonpatchjsonSchema1
public static class Application1jsonpatchjsonSchema1<br>
extends [JSONPatchRequest.JSONPatchRequest1](../../../../../../components/schemas/JSONPatchRequest.md#jsonpatchrequest1)

A schema class that validates payloads
