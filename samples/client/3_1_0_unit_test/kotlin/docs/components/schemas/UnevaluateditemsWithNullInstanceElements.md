# UnevaluateditemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithNullInstanceElements.java
class UnevaluateditemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluateditemsWithNullInstanceElements1](#unevaluateditemswithnullinstanceelements1)<br> schema class |
| sealed interface | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [UnevaluateditemsWithNullInstanceElements.UnevaluatedItems](#unevaluateditems)<br> schema class |

## UnevaluateditemsWithNullInstanceElements1Boxed
sealed interface UnevaluateditemsWithNullInstanceElements1Boxed<br>
permits<br>
[UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid),
[UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean),
[UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber),
[UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring),
[UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist),
[UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsWithNullInstanceElements1BoxedVoid
data class UnevaluateditemsWithNullInstanceElements1BoxedVoid<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedBoolean
data class UnevaluateditemsWithNullInstanceElements1BoxedBoolean<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedNumber
data class UnevaluateditemsWithNullInstanceElements1BoxedNumber<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedString
data class UnevaluateditemsWithNullInstanceElements1BoxedString<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedList
data class UnevaluateditemsWithNullInstanceElements1BoxedList<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1BoxedMap
data class UnevaluateditemsWithNullInstanceElements1BoxedMap<br>
implements [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithNullInstanceElements1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithNullInstanceElements1
class UnevaluateditemsWithNullInstanceElements1<br>
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
| [UnevaluateditemsWithNullInstanceElements1BoxedString](#unevaluateditemswithnullinstanceelements1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedVoid](#unevaluateditemswithnullinstanceelements1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedNumber](#unevaluateditemswithnullinstanceelements1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedBoolean](#unevaluateditemswithnullinstanceelements1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedMap](#unevaluateditemswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1BoxedList](#unevaluateditemswithnullinstanceelements1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluateditemsWithNullInstanceElements1Boxed](#unevaluateditemswithnullinstanceelements1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedItemsBoxed
sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedVoid
data class UnevaluatedItemsBoxedVoid<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItems
class UnevaluatedItems<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
