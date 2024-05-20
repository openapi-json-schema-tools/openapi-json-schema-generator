# UriReferenceFormat
org.openapijsonschematools.client.components.schemas.UriReferenceFormat.java
class UriReferenceFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriReferenceFormat.UriReferenceFormat1Boxed](#urireferenceformat1boxed)<br> sealed interface for validated payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UriReferenceFormat.UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriReferenceFormat.UriReferenceFormat1](#urireferenceformat1)<br> schema class |

## UriReferenceFormat1Boxed
sealed interface UriReferenceFormat1Boxed<br>
permits<br>
[UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid),
[UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean),
[UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber),
[UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring),
[UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist),
[UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriReferenceFormat1BoxedVoid
data class UriReferenceFormat1BoxedVoid<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1BoxedBoolean
data class UriReferenceFormat1BoxedBoolean<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1BoxedNumber
data class UriReferenceFormat1BoxedNumber<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1BoxedString
data class UriReferenceFormat1BoxedString<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1BoxedList
data class UriReferenceFormat1BoxedList<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1BoxedMap
data class UriReferenceFormat1BoxedMap<br>
implements [UriReferenceFormat1Boxed](#urireferenceformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriReferenceFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriReferenceFormat1
class UriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri-reference"; |

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
| [UriReferenceFormat1BoxedString](#urireferenceformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UriReferenceFormat1BoxedVoid](#urireferenceformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UriReferenceFormat1BoxedNumber](#urireferenceformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UriReferenceFormat1BoxedBoolean](#urireferenceformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [UriReferenceFormat1BoxedMap](#urireferenceformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [UriReferenceFormat1BoxedList](#urireferenceformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UriReferenceFormat1Boxed](#urireferenceformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
