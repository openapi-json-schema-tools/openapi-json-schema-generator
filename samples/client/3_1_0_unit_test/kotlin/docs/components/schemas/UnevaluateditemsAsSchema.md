# UnevaluateditemsAsSchema
org.openapijsonschematools.client.components.schemas.UnevaluateditemsAsSchema.java
class UnevaluateditemsAsSchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluateditemsAsSchema1](#unevaluateditemsasschema1)<br> schema class |
| sealed interface | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsAsSchema.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsAsSchema.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsAsSchema1Boxed
sealed interface UnevaluateditemsAsSchema1Boxed<br>
permits<br>
[UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid),
[UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean),
[UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber),
[UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring),
[UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist),
[UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsAsSchema1BoxedVoid
data class UnevaluateditemsAsSchema1BoxedVoid<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedBoolean
data class UnevaluateditemsAsSchema1BoxedBoolean<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedNumber
data class UnevaluateditemsAsSchema1BoxedNumber<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedString
data class UnevaluateditemsAsSchema1BoxedString<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedList
data class UnevaluateditemsAsSchema1BoxedList<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1BoxedMap
data class UnevaluateditemsAsSchema1BoxedMap<br>
implements [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsAsSchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsAsSchema1
class UnevaluateditemsAsSchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | unevaluatedItems = [UnevaluatedItems::class.java](#unevaluateditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedString](#unevaluateditemsasschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedVoid](#unevaluateditemsasschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedNumber](#unevaluateditemsasschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedBoolean](#unevaluateditemsasschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedMap](#unevaluateditemsasschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1BoxedList](#unevaluateditemsasschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluateditemsAsSchema1Boxed](#unevaluateditemsasschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedItemsBoxed
sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedString
data class UnevaluatedItemsBoxedString<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItems
class UnevaluatedItems<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
