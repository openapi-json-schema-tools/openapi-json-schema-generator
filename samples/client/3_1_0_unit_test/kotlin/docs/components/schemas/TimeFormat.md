# TimeFormat
org.openapijsonschematools.client.components.schemas.TimeFormat.java
class TimeFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [TimeFormat.TimeFormat1Boxed](#timeformat1boxed)<br> sealed interface for validated payloads |
| record | [TimeFormat.TimeFormat1BoxedVoid](#timeformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [TimeFormat.TimeFormat1BoxedBoolean](#timeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [TimeFormat.TimeFormat1BoxedNumber](#timeformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [TimeFormat.TimeFormat1BoxedString](#timeformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [TimeFormat.TimeFormat1BoxedList](#timeformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [TimeFormat.TimeFormat1BoxedMap](#timeformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [TimeFormat.TimeFormat1](#timeformat1)<br> schema class |

## TimeFormat1Boxed
sealed interface TimeFormat1Boxed<br>
permits<br>
[TimeFormat1BoxedVoid](#timeformat1boxedvoid),
[TimeFormat1BoxedBoolean](#timeformat1boxedboolean),
[TimeFormat1BoxedNumber](#timeformat1boxednumber),
[TimeFormat1BoxedString](#timeformat1boxedstring),
[TimeFormat1BoxedList](#timeformat1boxedlist),
[TimeFormat1BoxedMap](#timeformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## TimeFormat1BoxedVoid
data class TimeFormat1BoxedVoid<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1BoxedBoolean
data class TimeFormat1BoxedBoolean<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1BoxedNumber
data class TimeFormat1BoxedNumber<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1BoxedString
data class TimeFormat1BoxedString<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1BoxedList
data class TimeFormat1BoxedList<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1BoxedMap
data class TimeFormat1BoxedMap<br>
implements [TimeFormat1Boxed](#timeformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| TimeFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## TimeFormat1
class TimeFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "time"; |

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
| [TimeFormat1BoxedString](#timeformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [TimeFormat1BoxedVoid](#timeformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [TimeFormat1BoxedNumber](#timeformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [TimeFormat1BoxedBoolean](#timeformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [TimeFormat1BoxedMap](#timeformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [TimeFormat1BoxedList](#timeformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [TimeFormat1Boxed](#timeformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
