# Application1jsonSchema
public class Application1jsonSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Application1jsonSchema.Application1jsonSchema1Boxed](#application1jsonschema1boxed)<br> abstract sealed validated payload class |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedVoid](#application1jsonschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedBoolean](#application1jsonschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedNumber](#application1jsonschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedString](#application1jsonschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedList](#application1jsonschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1BoxedMap](#application1jsonschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Application1jsonSchema.Application1jsonSchema1](#application1jsonschema1)<br> schema class |

## Application1jsonSchema1Boxed
public static abstract sealed class Application1jsonSchema1Boxed<br>
permits<br>
[Application1jsonSchema1BoxedVoid](#application1jsonschema1boxedvoid),
[Application1jsonSchema1BoxedBoolean](#application1jsonschema1boxedboolean),
[Application1jsonSchema1BoxedNumber](#application1jsonschema1boxednumber),
[Application1jsonSchema1BoxedString](#application1jsonschema1boxedstring),
[Application1jsonSchema1BoxedList](#application1jsonschema1boxedlist),
[Application1jsonSchema1BoxedMap](#application1jsonschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## Application1jsonSchema1BoxedVoid
public static final class Application1jsonSchema1BoxedVoid<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## Application1jsonSchema1BoxedBoolean
public static final class Application1jsonSchema1BoxedBoolean<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## Application1jsonSchema1BoxedNumber
public static final class Application1jsonSchema1BoxedNumber<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Application1jsonSchema1BoxedString
public static final class Application1jsonSchema1BoxedString<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Application1jsonSchema1BoxedList
public static final class Application1jsonSchema1BoxedList<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## Application1jsonSchema1BoxedMap
public static final class Application1jsonSchema1BoxedMap<br>
extends [Application1jsonSchema1Boxed](#application1jsonschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Application1jsonSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## Application1jsonSchema1
public static class Application1jsonSchema1<br>
extends [AdditionalPropertiesWithArrayOfEnums.AdditionalPropertiesWithArrayOfEnums1](../../../../../../../../components/schemas/AdditionalPropertiesWithArrayOfEnums.md#additionalpropertieswitharrayofenums1)

A schema class that validates payloads
