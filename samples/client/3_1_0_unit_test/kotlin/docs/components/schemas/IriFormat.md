# IriFormat
org.openapijsonschematools.client.components.schemas.IriFormat.java
class IriFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IriFormat.IriFormat1Boxed](#iriformat1boxed)<br> sealed interface for validated payloads |
| record | [IriFormat.IriFormat1BoxedVoid](#iriformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IriFormat.IriFormat1BoxedBoolean](#iriformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IriFormat.IriFormat1BoxedNumber](#iriformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IriFormat.IriFormat1BoxedString](#iriformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IriFormat.IriFormat1BoxedList](#iriformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IriFormat.IriFormat1BoxedMap](#iriformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IriFormat.IriFormat1](#iriformat1)<br> schema class |

## IriFormat1Boxed
sealed interface IriFormat1Boxed<br>
permits<br>
[IriFormat1BoxedVoid](#iriformat1boxedvoid),
[IriFormat1BoxedBoolean](#iriformat1boxedboolean),
[IriFormat1BoxedNumber](#iriformat1boxednumber),
[IriFormat1BoxedString](#iriformat1boxedstring),
[IriFormat1BoxedList](#iriformat1boxedlist),
[IriFormat1BoxedMap](#iriformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IriFormat1BoxedVoid
data class IriFormat1BoxedVoid<br>
implements [IriFormat1Boxed](#iriformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1BoxedBoolean
data class IriFormat1BoxedBoolean<br>
implements [IriFormat1Boxed](#iriformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1BoxedNumber
data class IriFormat1BoxedNumber<br>
implements [IriFormat1Boxed](#iriformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1BoxedString
data class IriFormat1BoxedString<br>
implements [IriFormat1Boxed](#iriformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1BoxedList
data class IriFormat1BoxedList<br>
implements [IriFormat1Boxed](#iriformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1BoxedMap
data class IriFormat1BoxedMap<br>
implements [IriFormat1Boxed](#iriformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IriFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IriFormat1
class IriFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "iri"; |

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
| [IriFormat1BoxedString](#iriformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IriFormat1BoxedVoid](#iriformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IriFormat1BoxedNumber](#iriformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IriFormat1BoxedBoolean](#iriformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [IriFormat1BoxedMap](#iriformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [IriFormat1BoxedList](#iriformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IriFormat1Boxed](#iriformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
