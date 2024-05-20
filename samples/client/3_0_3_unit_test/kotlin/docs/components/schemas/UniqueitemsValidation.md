# UniqueitemsValidation
org.openapijsonschematools.client.components.schemas.UniqueitemsValidation.java
class UniqueitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsValidation.UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [UniqueitemsValidation.UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [UniqueitemsValidation.UniqueitemsValidation1](#uniqueitemsvalidation1)<br> schema class |

## UniqueitemsValidation1Boxed
sealed interface UniqueitemsValidation1Boxed<br>
permits<br>
[UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid),
[UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean),
[UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber),
[UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring),
[UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist),
[UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsValidation1BoxedVoid
data class UniqueitemsValidation1BoxedVoid<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1BoxedBoolean
data class UniqueitemsValidation1BoxedBoolean<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1BoxedNumber
data class UniqueitemsValidation1BoxedNumber<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1BoxedString
data class UniqueitemsValidation1BoxedString<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1BoxedList
data class UniqueitemsValidation1BoxedList<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1BoxedMap
data class UniqueitemsValidation1BoxedMap<br>
implements [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsValidation1
class UniqueitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = true |

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
| [UniqueitemsValidation1BoxedString](#uniqueitemsvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1BoxedVoid](#uniqueitemsvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1BoxedNumber](#uniqueitemsvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1BoxedBoolean](#uniqueitemsvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1BoxedMap](#uniqueitemsvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1BoxedList](#uniqueitemsvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UniqueitemsValidation1Boxed](#uniqueitemsvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
