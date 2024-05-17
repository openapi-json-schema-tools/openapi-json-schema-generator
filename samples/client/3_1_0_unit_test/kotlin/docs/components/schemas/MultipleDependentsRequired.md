# MultipleDependentsRequired
org.openapijsonschematools.client.components.schemas.MultipleDependentsRequired.java
class MultipleDependentsRequired<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleDependentsRequired.MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)<br> sealed interface for validated payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring)<br> boxed class to store validated String payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist)<br> boxed class to store validated List payloads |
| record | [MultipleDependentsRequired.MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MultipleDependentsRequired.MultipleDependentsRequired1](#multipledependentsrequired1)<br> schema class |

## MultipleDependentsRequired1Boxed
sealed interface MultipleDependentsRequired1Boxed<br>
permits<br>
[MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid),
[MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean),
[MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber),
[MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring),
[MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist),
[MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipleDependentsRequired1BoxedVoid
data class MultipleDependentsRequired1BoxedVoid<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedBoolean
data class MultipleDependentsRequired1BoxedBoolean<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedNumber
data class MultipleDependentsRequired1BoxedNumber<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedString
data class MultipleDependentsRequired1BoxedString<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedList
data class MultipleDependentsRequired1BoxedList<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1BoxedMap
data class MultipleDependentsRequired1BoxedMap<br>
implements [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleDependentsRequired1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleDependentsRequired1
class MultipleDependentsRequired1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<String, Set<String>> | dependentRequired = MapUtils.makeMap(<br>
&nbsp;&nbsp;&nbsp;&nbsp;new AbstractMap.SimpleEntry<>(<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"quux",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;setOf(
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"foo",<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"bar"<br>
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
| [MultipleDependentsRequired1BoxedString](#multipledependentsrequired1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1BoxedVoid](#multipledependentsrequired1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1BoxedNumber](#multipledependentsrequired1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1BoxedBoolean](#multipledependentsrequired1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1BoxedMap](#multipledependentsrequired1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1BoxedList](#multipledependentsrequired1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MultipleDependentsRequired1Boxed](#multipledependentsrequired1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
