# IriReferenceFormat
org.openapijsonschematools.client.components.schemas.IriReferenceFormat.java
class IriReferenceFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IriReferenceFormat.IriReferenceFormat1Boxed](#irireferenceformat1boxed)<br> sealed interface for validated payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IriReferenceFormat.IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IriReferenceFormat.IriReferenceFormat1](#irireferenceformat1)<br> schema class |

## IriReferenceFormat1Boxed
sealed interface IriReferenceFormat1Boxed<br>
permits<br>
[IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid),
[IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean),
[IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber),
[IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring),
[IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist),
[IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IriReferenceFormat1BoxedVoid
data class IriReferenceFormat1BoxedVoid<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1BoxedBoolean
data class IriReferenceFormat1BoxedBoolean<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1BoxedNumber
data class IriReferenceFormat1BoxedNumber<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1BoxedString
data class IriReferenceFormat1BoxedString<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1BoxedList
data class IriReferenceFormat1BoxedList<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1BoxedMap
data class IriReferenceFormat1BoxedMap<br>
implements [IriReferenceFormat1Boxed](#irireferenceformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriReferenceFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriReferenceFormat1
class IriReferenceFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri-reference"; |

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
| [IriReferenceFormat1BoxedString](#irireferenceformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IriReferenceFormat1BoxedVoid](#irireferenceformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IriReferenceFormat1BoxedNumber](#irireferenceformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IriReferenceFormat1BoxedBoolean](#irireferenceformat1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IriReferenceFormat1BoxedMap](#irireferenceformat1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IriReferenceFormat1BoxedList](#irireferenceformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IriReferenceFormat1Boxed](#irireferenceformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
