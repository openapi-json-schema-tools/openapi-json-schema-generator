# JsonPointerFormat
org.openapijsonschematools.client.components.schemas.JsonPointerFormat.java
class JsonPointerFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [JsonPointerFormat.JsonPointerFormat1Boxed](#jsonpointerformat1boxed)<br> sealed interface for validated payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [JsonPointerFormat.JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [JsonPointerFormat.JsonPointerFormat1](#jsonpointerformat1)<br> schema class |

## JsonPointerFormat1Boxed
sealed interface JsonPointerFormat1Boxed<br>
permits<br>
[JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid),
[JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean),
[JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber),
[JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring),
[JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist),
[JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## JsonPointerFormat1BoxedVoid
data class JsonPointerFormat1BoxedVoid<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1BoxedBoolean
data class JsonPointerFormat1BoxedBoolean<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1BoxedNumber
data class JsonPointerFormat1BoxedNumber<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1BoxedString
data class JsonPointerFormat1BoxedString<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1BoxedList
data class JsonPointerFormat1BoxedList<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1BoxedMap
data class JsonPointerFormat1BoxedMap<br>
implements [JsonPointerFormat1Boxed](#jsonpointerformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| JsonPointerFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## JsonPointerFormat1
class JsonPointerFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "json-pointer"; |

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
| [JsonPointerFormat1BoxedString](#jsonpointerformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [JsonPointerFormat1BoxedVoid](#jsonpointerformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [JsonPointerFormat1BoxedNumber](#jsonpointerformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [JsonPointerFormat1BoxedBoolean](#jsonpointerformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [JsonPointerFormat1BoxedMap](#jsonpointerformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [JsonPointerFormat1BoxedList](#jsonpointerformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [JsonPointerFormat1Boxed](#jsonpointerformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
