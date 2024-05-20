# SingleDependency
org.openapijsonschematools.client.components.schemas.SingleDependency.java
class SingleDependency<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [SingleDependency.SingleDependency1Boxed](#singledependency1boxed)<br> sealed interface for validated payloads |
| record | [SingleDependency.SingleDependency1BoxedVoid](#singledependency1boxedvoid)<br> boxed class to store validated null payloads |
| record | [SingleDependency.SingleDependency1BoxedBoolean](#singledependency1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [SingleDependency.SingleDependency1BoxedNumber](#singledependency1boxednumber)<br> boxed class to store validated Number payloads |
| record | [SingleDependency.SingleDependency1BoxedString](#singledependency1boxedstring)<br> boxed class to store validated String payloads |
| record | [SingleDependency.SingleDependency1BoxedList](#singledependency1boxedlist)<br> boxed class to store validated List payloads |
| record | [SingleDependency.SingleDependency1BoxedMap](#singledependency1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [SingleDependency.SingleDependency1](#singledependency1)<br> schema class |

## SingleDependency1Boxed
sealed interface SingleDependency1Boxed<br>
permits<br>
[SingleDependency1BoxedVoid](#singledependency1boxedvoid),
[SingleDependency1BoxedBoolean](#singledependency1boxedboolean),
[SingleDependency1BoxedNumber](#singledependency1boxednumber),
[SingleDependency1BoxedString](#singledependency1boxedstring),
[SingleDependency1BoxedList](#singledependency1boxedlist),
[SingleDependency1BoxedMap](#singledependency1boxedmap)

sealed interface that stores validated payloads using boxed classes

## SingleDependency1BoxedVoid
data class SingleDependency1BoxedVoid<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1BoxedBoolean
data class SingleDependency1BoxedBoolean<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1BoxedNumber
data class SingleDependency1BoxedNumber<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1BoxedString
data class SingleDependency1BoxedString<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1BoxedList
data class SingleDependency1BoxedList<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1BoxedMap
data class SingleDependency1BoxedMap<br>
implements [SingleDependency1Boxed](#singledependency1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| SingleDependency1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## SingleDependency1
class SingleDependency1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = mapOf(<br>
&nbsp;&nbsp;&nbsp;&nbsp;Pair(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setOf(
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo"<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;)
&nbsp;&nbsp;&nbsp;&nbsp;)<br>
)
 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | validate(arg: String, configuration: SchemaConfiguration) |
| Nothing? | validate(arg: Nothing?, configuration: SchemaConfiguration) |
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedString](#singledependency1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedVoid](#singledependency1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedNumber](#singledependency1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedBoolean](#singledependency1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedMap](#singledependency1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [SingleDependency1BoxedList](#singledependency1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [SingleDependency1Boxed](#singledependency1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
