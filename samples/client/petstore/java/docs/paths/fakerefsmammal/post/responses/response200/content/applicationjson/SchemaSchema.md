# SchemaSchema
public class SchemaSchema

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [SchemaSchema.SchemaSchema1Boxed](#schemaschema1boxed)<br> abstract sealed validated payload class |
| static class | [SchemaSchema.SchemaSchema1BoxedVoid](#schemaschema1boxedvoid)<br> boxed class to store validated null payloads |
| static class | [SchemaSchema.SchemaSchema1BoxedBoolean](#schemaschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [SchemaSchema.SchemaSchema1BoxedNumber](#schemaschema1boxednumber)<br> boxed class to store validated Number payloads |
| static class | [SchemaSchema.SchemaSchema1BoxedString](#schemaschema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [SchemaSchema.SchemaSchema1BoxedList](#schemaschema1boxedlist)<br> boxed class to store validated List payloads |
| static class | [SchemaSchema.SchemaSchema1BoxedMap](#schemaschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SchemaSchema.SchemaSchema1](#schemaschema1)<br> schema class |

## SchemaSchema1Boxed
public static abstract sealed class SchemaSchema1Boxed<br>
permits<br>
[SchemaSchema1BoxedVoid](#schemaschema1boxedvoid),
[SchemaSchema1BoxedBoolean](#schemaschema1boxedboolean),
[SchemaSchema1BoxedNumber](#schemaschema1boxednumber),
[SchemaSchema1BoxedString](#schemaschema1boxedstring),
[SchemaSchema1BoxedList](#schemaschema1boxedlist),
[SchemaSchema1BoxedMap](#schemaschema1boxedmap)

abstract sealed class that stores validated payloads using boxed classes

## SchemaSchema1BoxedVoid
public static final class SchemaSchema1BoxedVoid<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated null payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedVoid(Void data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Void | data<br>validated payload |

## SchemaSchema1BoxedBoolean
public static final class SchemaSchema1BoxedBoolean<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated boolean payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| boolean | data<br>validated payload |

## SchemaSchema1BoxedNumber
public static final class SchemaSchema1BoxedNumber<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## SchemaSchema1BoxedString
public static final class SchemaSchema1BoxedString<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## SchemaSchema1BoxedList
public static final class SchemaSchema1BoxedList<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedList(FrozenList<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenList<@Nullable Object> | data<br>validated payload |

## SchemaSchema1BoxedMap
public static final class SchemaSchema1BoxedMap<br>
extends [SchemaSchema1Boxed](#schemaschema1boxed)

a boxed class to store validated Map payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SchemaSchema1BoxedMap(FrozenMap<@Nullable Object> data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| FrozenMap<@Nullable Object> | data<br>validated payload |

## SchemaSchema1
public static class SchemaSchema1<br>
extends [Mammal.Mammal1](../../../../../../../../components/schemas/Mammal.md#mammal1)

A schema class that validates payloads
