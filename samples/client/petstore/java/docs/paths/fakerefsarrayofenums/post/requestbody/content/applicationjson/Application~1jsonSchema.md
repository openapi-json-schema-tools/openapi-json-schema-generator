# Application~1jsonSchema
public class Application~1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application~1jsonSchema.Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedVoid](#application~1jsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedBoolean](#application~1jsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedNumber](#application~1jsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application~1jsonSchema.Application~1jsonSchema1](#application~1jsonschema1)<br> schema class |

## Application~1jsonSchema1Boxed
public static abstract sealed class Application~1jsonSchema1Boxed<br>
permits<br>
[Application~1jsonSchema1BoxedVoid](#application~1jsonschema1boxedvoid),
[Application~1jsonSchema1BoxedBoolean](#application~1jsonschema1boxedboolean),
[Application~1jsonSchema1BoxedNumber](#application~1jsonschema1boxednumber),
[Application~1jsonSchema1BoxedString](#application~1jsonschema1boxedstring),
[Application~1jsonSchema1BoxedList](#application~1jsonschema1boxedlist),
[Application~1jsonSchema1BoxedMap](#application~1jsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application~1jsonSchema1BoxedVoid
public static final class Application~1jsonSchema1BoxedVoid<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application~1jsonSchema1BoxedBoolean
public static final class Application~1jsonSchema1BoxedBoolean<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application~1jsonSchema1BoxedNumber
public static final class Application~1jsonSchema1BoxedNumber<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application~1jsonSchema1BoxedString
public static final class Application~1jsonSchema1BoxedString<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application~1jsonSchema1BoxedList
public static final class Application~1jsonSchema1BoxedList<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application~1jsonSchema1BoxedMap
public static final class Application~1jsonSchema1BoxedMap<br>
extends [Application~1jsonSchema1Boxed](#application~1jsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application~1jsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application~1jsonSchema1
public static class Application~1jsonSchema1<br>
extends [ArrayOfEnums.ArrayOfEnums1](../../../../../../components/schemas/ArrayOfEnums.md#arrayofenums1)

A schema class that validates payloads
