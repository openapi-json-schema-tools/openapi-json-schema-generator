# DateTimeFormat
org.openapijsonschematools.client.components.schemas.DateTimeFormat.java
class DateTimeFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateTimeFormat.DateTimeFormat1Boxed](#datetimeformat1boxed)<br> sealed interface for validated payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedString](#datetimeformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedList](#datetimeformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [DateTimeFormat.DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [DateTimeFormat.DateTimeFormat1](#datetimeformat1)<br> schema class |

## DateTimeFormat1Boxed
sealed interface DateTimeFormat1Boxed<br>
permits<br>
[DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid),
[DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean),
[DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber),
[DateTimeFormat1BoxedString](#datetimeformat1boxedstring),
[DateTimeFormat1BoxedList](#datetimeformat1boxedlist),
[DateTimeFormat1BoxedMap](#datetimeformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DateTimeFormat1BoxedVoid
data class DateTimeFormat1BoxedVoid<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1BoxedBoolean
data class DateTimeFormat1BoxedBoolean<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1BoxedNumber
data class DateTimeFormat1BoxedNumber<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1BoxedString
data class DateTimeFormat1BoxedString<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1BoxedList
data class DateTimeFormat1BoxedList<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1BoxedMap
data class DateTimeFormat1BoxedMap<br>
implements [DateTimeFormat1Boxed](#datetimeformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateTimeFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateTimeFormat1
class DateTimeFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date-time"; |

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
| [DateTimeFormat1BoxedString](#datetimeformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DateTimeFormat1BoxedVoid](#datetimeformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DateTimeFormat1BoxedNumber](#datetimeformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DateTimeFormat1BoxedBoolean](#datetimeformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [DateTimeFormat1BoxedMap](#datetimeformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [DateTimeFormat1BoxedList](#datetimeformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DateTimeFormat1Boxed](#datetimeformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
