# UuidFormat
org.openapijsonschematools.client.components.schemas.UuidFormat.java
class UuidFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UuidFormat.UuidFormat1Boxed](#uuidformat1boxed)<br> sealed interface for validated payloads |
| data class | [UuidFormat.UuidFormat1BoxedVoid](#uuidformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [UuidFormat.UuidFormat1BoxedBoolean](#uuidformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [UuidFormat.UuidFormat1BoxedNumber](#uuidformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [UuidFormat.UuidFormat1BoxedString](#uuidformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [UuidFormat.UuidFormat1BoxedList](#uuidformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [UuidFormat.UuidFormat1BoxedMap](#uuidformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [UuidFormat.UuidFormat1](#uuidformat1)<br> schema class |

## UuidFormat1Boxed
sealed interface UuidFormat1Boxed<br>
permits<br>
[UuidFormat1BoxedVoid](#uuidformat1boxedvoid),
[UuidFormat1BoxedBoolean](#uuidformat1boxedboolean),
[UuidFormat1BoxedNumber](#uuidformat1boxednumber),
[UuidFormat1BoxedString](#uuidformat1boxedstring),
[UuidFormat1BoxedList](#uuidformat1boxedlist),
[UuidFormat1BoxedMap](#uuidformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UuidFormat1BoxedVoid
data class UuidFormat1BoxedVoid<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1BoxedBoolean
data class UuidFormat1BoxedBoolean<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1BoxedNumber
data class UuidFormat1BoxedNumber<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1BoxedString
data class UuidFormat1BoxedString<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1BoxedList
data class UuidFormat1BoxedList<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1BoxedMap
data class UuidFormat1BoxedMap<br>
implements [UuidFormat1Boxed](#uuidformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UuidFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UuidFormat1
class UuidFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uuid"; |

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
| [UuidFormat1BoxedString](#uuidformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UuidFormat1BoxedVoid](#uuidformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UuidFormat1BoxedNumber](#uuidformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UuidFormat1BoxedBoolean](#uuidformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UuidFormat1BoxedMap](#uuidformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UuidFormat1BoxedList](#uuidformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UuidFormat1Boxed](#uuidformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
