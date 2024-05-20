# UriFormat
org.openapijsonschematools.client.components.schemas.UriFormat.java
class UriFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriFormat.UriFormat1Boxed](#uriformat1boxed)<br> sealed interface for validated payloads |
| data class | [UriFormat.UriFormat1BoxedVoid](#uriformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [UriFormat.UriFormat1BoxedBoolean](#uriformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [UriFormat.UriFormat1BoxedNumber](#uriformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [UriFormat.UriFormat1BoxedString](#uriformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [UriFormat.UriFormat1BoxedList](#uriformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [UriFormat.UriFormat1BoxedMap](#uriformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [UriFormat.UriFormat1](#uriformat1)<br> schema class |

## UriFormat1Boxed
sealed interface UriFormat1Boxed<br>
permits<br>
[UriFormat1BoxedVoid](#uriformat1boxedvoid),
[UriFormat1BoxedBoolean](#uriformat1boxedboolean),
[UriFormat1BoxedNumber](#uriformat1boxednumber),
[UriFormat1BoxedString](#uriformat1boxedstring),
[UriFormat1BoxedList](#uriformat1boxedlist),
[UriFormat1BoxedMap](#uriformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriFormat1BoxedVoid
data class UriFormat1BoxedVoid<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1BoxedBoolean
data class UriFormat1BoxedBoolean<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1BoxedNumber
data class UriFormat1BoxedNumber<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1BoxedString
data class UriFormat1BoxedString<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1BoxedList
data class UriFormat1BoxedList<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1BoxedMap
data class UriFormat1BoxedMap<br>
implements [UriFormat1Boxed](#uriformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriFormat1
class UriFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri"; |

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
| [UriFormat1BoxedString](#uriformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UriFormat1BoxedVoid](#uriformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UriFormat1BoxedNumber](#uriformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UriFormat1BoxedBoolean](#uriformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UriFormat1BoxedMap](#uriformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UriFormat1BoxedList](#uriformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UriFormat1Boxed](#uriformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
