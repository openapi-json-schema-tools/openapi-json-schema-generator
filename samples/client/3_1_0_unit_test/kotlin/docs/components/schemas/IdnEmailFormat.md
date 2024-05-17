# IdnEmailFormat
org.openapijsonschematools.client.components.schemas.IdnEmailFormat.java
class IdnEmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IdnEmailFormat.IdnEmailFormat1Boxed](#idnemailformat1boxed)<br> sealed interface for validated payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedString](#idnemailformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedList](#idnemailformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [IdnEmailFormat.IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IdnEmailFormat.IdnEmailFormat1](#idnemailformat1)<br> schema class |

## IdnEmailFormat1Boxed
sealed interface IdnEmailFormat1Boxed<br>
permits<br>
[IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid),
[IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean),
[IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber),
[IdnEmailFormat1BoxedString](#idnemailformat1boxedstring),
[IdnEmailFormat1BoxedList](#idnemailformat1boxedlist),
[IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IdnEmailFormat1BoxedVoid
data class IdnEmailFormat1BoxedVoid<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1BoxedBoolean
data class IdnEmailFormat1BoxedBoolean<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1BoxedNumber
data class IdnEmailFormat1BoxedNumber<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1BoxedString
data class IdnEmailFormat1BoxedString<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1BoxedList
data class IdnEmailFormat1BoxedList<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1BoxedMap
data class IdnEmailFormat1BoxedMap<br>
implements [IdnEmailFormat1Boxed](#idnemailformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IdnEmailFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IdnEmailFormat1
class IdnEmailFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "idn-email"; |

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
| [IdnEmailFormat1BoxedString](#idnemailformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IdnEmailFormat1BoxedVoid](#idnemailformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IdnEmailFormat1BoxedNumber](#idnemailformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IdnEmailFormat1BoxedBoolean](#idnemailformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [IdnEmailFormat1BoxedMap](#idnemailformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [IdnEmailFormat1BoxedList](#idnemailformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IdnEmailFormat1Boxed](#idnemailformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
