# UniqueitemsFalseValidation
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseValidation.java
class UniqueitemsFalseValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsFalseValidation.UniqueitemsFalseValidation1](#uniqueitemsfalsevalidation1)<br> schema class |

## UniqueitemsFalseValidation1Boxed
sealed interface UniqueitemsFalseValidation1Boxed<br>
permits<br>
[UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid),
[UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean),
[UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber),
[UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring),
[UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist),
[UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsFalseValidation1BoxedVoid
data class UniqueitemsFalseValidation1BoxedVoid<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedBoolean
data class UniqueitemsFalseValidation1BoxedBoolean<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedNumber
data class UniqueitemsFalseValidation1BoxedNumber<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedString
data class UniqueitemsFalseValidation1BoxedString<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedList
data class UniqueitemsFalseValidation1BoxedList<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1BoxedMap
data class UniqueitemsFalseValidation1BoxedMap<br>
implements [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseValidation1
class UniqueitemsFalseValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = false |

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
| [UniqueitemsFalseValidation1BoxedString](#uniqueitemsfalsevalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1BoxedVoid](#uniqueitemsfalsevalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1BoxedNumber](#uniqueitemsfalsevalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1BoxedBoolean](#uniqueitemsfalsevalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1BoxedMap](#uniqueitemsfalsevalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1BoxedList](#uniqueitemsfalsevalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UniqueitemsFalseValidation1Boxed](#uniqueitemsfalsevalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
