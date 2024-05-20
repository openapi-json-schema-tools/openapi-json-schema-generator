# IdnHostnameFormat
org.openapijsonschematools.client.components.schemas.IdnHostnameFormat.java
class IdnHostnameFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IdnHostnameFormat.IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)<br> sealed interface for validated payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IdnHostnameFormat.IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IdnHostnameFormat.IdnHostnameFormat1](#idnhostnameformat1)<br> schema class |

## IdnHostnameFormat1Boxed
sealed interface IdnHostnameFormat1Boxed<br>
permits<br>
[IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid),
[IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean),
[IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber),
[IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring),
[IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist),
[IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IdnHostnameFormat1BoxedVoid
data class IdnHostnameFormat1BoxedVoid<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1BoxedBoolean
data class IdnHostnameFormat1BoxedBoolean<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1BoxedNumber
data class IdnHostnameFormat1BoxedNumber<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1BoxedString
data class IdnHostnameFormat1BoxedString<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1BoxedList
data class IdnHostnameFormat1BoxedList<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1BoxedMap
data class IdnHostnameFormat1BoxedMap<br>
implements [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnHostnameFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnHostnameFormat1
class IdnHostnameFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-hostname"; |

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
| [IdnHostnameFormat1BoxedString](#idnhostnameformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1BoxedVoid](#idnhostnameformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1BoxedNumber](#idnhostnameformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1BoxedBoolean](#idnhostnameformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1BoxedMap](#idnhostnameformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1BoxedList](#idnhostnameformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IdnHostnameFormat1Boxed](#idnhostnameformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
