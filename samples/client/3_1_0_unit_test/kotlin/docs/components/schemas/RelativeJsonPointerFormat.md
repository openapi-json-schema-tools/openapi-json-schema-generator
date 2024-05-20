# RelativeJsonPointerFormat
org.openapijsonschematools.client.components.schemas.RelativeJsonPointerFormat.java
class RelativeJsonPointerFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)<br> sealed interface for validated payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RelativeJsonPointerFormat.RelativeJsonPointerFormat1](#relativejsonpointerformat1)<br> schema class |

## RelativeJsonPointerFormat1Boxed
sealed interface RelativeJsonPointerFormat1Boxed<br>
permits<br>
[RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid),
[RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean),
[RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber),
[RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring),
[RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist),
[RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RelativeJsonPointerFormat1BoxedVoid
data class RelativeJsonPointerFormat1BoxedVoid<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedBoolean
data class RelativeJsonPointerFormat1BoxedBoolean<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedNumber
data class RelativeJsonPointerFormat1BoxedNumber<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedString
data class RelativeJsonPointerFormat1BoxedString<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedList
data class RelativeJsonPointerFormat1BoxedList<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1BoxedMap
data class RelativeJsonPointerFormat1BoxedMap<br>
implements [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RelativeJsonPointerFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RelativeJsonPointerFormat1
class RelativeJsonPointerFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "relative-json-pointer"; |

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
| [RelativeJsonPointerFormat1BoxedString](#relativejsonpointerformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1BoxedVoid](#relativejsonpointerformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1BoxedNumber](#relativejsonpointerformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1BoxedBoolean](#relativejsonpointerformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1BoxedMap](#relativejsonpointerformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1BoxedList](#relativejsonpointerformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RelativeJsonPointerFormat1Boxed](#relativejsonpointerformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
