# EmailFormat
org.openapijsonschematools.client.components.schemas.EmailFormat.java
class EmailFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [EmailFormat.EmailFormat1Boxed](#emailformat1boxed)<br> sealed interface for validated payloads |
| record | [EmailFormat.EmailFormat1BoxedVoid](#emailformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [EmailFormat.EmailFormat1BoxedBoolean](#emailformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [EmailFormat.EmailFormat1BoxedNumber](#emailformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [EmailFormat.EmailFormat1BoxedString](#emailformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [EmailFormat.EmailFormat1BoxedList](#emailformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [EmailFormat.EmailFormat1BoxedMap](#emailformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [EmailFormat.EmailFormat1](#emailformat1)<br> schema class |

## EmailFormat1Boxed
sealed interface EmailFormat1Boxed<br>
permits<br>
[EmailFormat1BoxedVoid](#emailformat1boxedvoid),
[EmailFormat1BoxedBoolean](#emailformat1boxedboolean),
[EmailFormat1BoxedNumber](#emailformat1boxednumber),
[EmailFormat1BoxedString](#emailformat1boxedstring),
[EmailFormat1BoxedList](#emailformat1boxedlist),
[EmailFormat1BoxedMap](#emailformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## EmailFormat1BoxedVoid
data class EmailFormat1BoxedVoid<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1BoxedBoolean
data class EmailFormat1BoxedBoolean<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1BoxedNumber
data class EmailFormat1BoxedNumber<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1BoxedString
data class EmailFormat1BoxedString<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1BoxedList
data class EmailFormat1BoxedList<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1BoxedMap
data class EmailFormat1BoxedMap<br>
implements [EmailFormat1Boxed](#emailformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| EmailFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## EmailFormat1
class EmailFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "email"; |

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
| [EmailFormat1BoxedString](#emailformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [EmailFormat1BoxedVoid](#emailformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [EmailFormat1BoxedNumber](#emailformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [EmailFormat1BoxedBoolean](#emailformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [EmailFormat1BoxedMap](#emailformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [EmailFormat1BoxedList](#emailformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [EmailFormat1Boxed](#emailformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
