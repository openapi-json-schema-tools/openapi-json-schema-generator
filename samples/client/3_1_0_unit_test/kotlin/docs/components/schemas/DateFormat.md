# DateFormat
org.openapijsonschematools.client.components.schemas.DateFormat.java
class DateFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [DateFormat.DateFormat1Boxed](#dateformat1boxed)<br> sealed interface for validated payloads |
| data class | [DateFormat.DateFormat1BoxedVoid](#dateformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [DateFormat.DateFormat1BoxedBoolean](#dateformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [DateFormat.DateFormat1BoxedNumber](#dateformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [DateFormat.DateFormat1BoxedString](#dateformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [DateFormat.DateFormat1BoxedList](#dateformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [DateFormat.DateFormat1BoxedMap](#dateformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [DateFormat.DateFormat1](#dateformat1)<br> schema class |

## DateFormat1Boxed
sealed interface DateFormat1Boxed<br>
permits<br>
[DateFormat1BoxedVoid](#dateformat1boxedvoid),
[DateFormat1BoxedBoolean](#dateformat1boxedboolean),
[DateFormat1BoxedNumber](#dateformat1boxednumber),
[DateFormat1BoxedString](#dateformat1boxedstring),
[DateFormat1BoxedList](#dateformat1boxedlist),
[DateFormat1BoxedMap](#dateformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## DateFormat1BoxedVoid
data class DateFormat1BoxedVoid<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1BoxedBoolean
data class DateFormat1BoxedBoolean<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1BoxedNumber
data class DateFormat1BoxedNumber<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1BoxedString
data class DateFormat1BoxedString<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1BoxedList
data class DateFormat1BoxedList<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1BoxedMap
data class DateFormat1BoxedMap<br>
implements [DateFormat1Boxed](#dateformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| DateFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## DateFormat1
class DateFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "date"; |

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
| [DateFormat1BoxedString](#dateformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [DateFormat1BoxedVoid](#dateformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [DateFormat1BoxedNumber](#dateformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [DateFormat1BoxedBoolean](#dateformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [DateFormat1BoxedMap](#dateformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [DateFormat1BoxedList](#dateformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [DateFormat1Boxed](#dateformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
