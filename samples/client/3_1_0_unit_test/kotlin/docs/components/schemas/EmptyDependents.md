# EmptyDependents
org.openapijsonschematools.client.components.schemas.EmptyDependents.java
class EmptyDependents<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EmptyDependents.EmptyDependents1Boxed](#emptydependents1boxed)<br> sealed interface for validated payloads |
| record | [EmptyDependents.EmptyDependents1BoxedVoid](#emptydependents1boxedvoid)<br> boxed class to store validated null payloads |
| record | [EmptyDependents.EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [EmptyDependents.EmptyDependents1BoxedNumber](#emptydependents1boxednumber)<br> boxed class to store validated Number payloads |
| record | [EmptyDependents.EmptyDependents1BoxedString](#emptydependents1boxedstring)<br> boxed class to store validated String payloads |
| record | [EmptyDependents.EmptyDependents1BoxedList](#emptydependents1boxedlist)<br> boxed class to store validated List payloads |
| record | [EmptyDependents.EmptyDependents1BoxedMap](#emptydependents1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EmptyDependents.EmptyDependents1](#emptydependents1)<br> schema class |

## EmptyDependents1Boxed
sealed interface EmptyDependents1Boxed<br>
permits<br>
[EmptyDependents1BoxedVoid](#emptydependents1boxedvoid),
[EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean),
[EmptyDependents1BoxedNumber](#emptydependents1boxednumber),
[EmptyDependents1BoxedString](#emptydependents1boxedstring),
[EmptyDependents1BoxedList](#emptydependents1boxedlist),
[EmptyDependents1BoxedMap](#emptydependents1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EmptyDependents1BoxedVoid
data class EmptyDependents1BoxedVoid<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1BoxedBoolean
data class EmptyDependents1BoxedBoolean<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1BoxedNumber
data class EmptyDependents1BoxedNumber<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1BoxedString
data class EmptyDependents1BoxedString<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1BoxedList
data class EmptyDependents1BoxedList<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1BoxedMap
data class EmptyDependents1BoxedMap<br>
implements [EmptyDependents1Boxed](#emptydependents1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmptyDependents1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmptyDependents1
class EmptyDependents1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = mapOf(<br>
&nbsp;&nbsp;&nbsp;&nbsp;Pair(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setOf(
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;)
&nbsp;&nbsp;&nbsp;&nbsp;)<br>
)
 |

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
| [EmptyDependents1BoxedString](#emptydependents1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [EmptyDependents1BoxedVoid](#emptydependents1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [EmptyDependents1BoxedNumber](#emptydependents1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [EmptyDependents1BoxedBoolean](#emptydependents1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [EmptyDependents1BoxedMap](#emptydependents1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [EmptyDependents1BoxedList](#emptydependents1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [EmptyDependents1Boxed](#emptydependents1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
