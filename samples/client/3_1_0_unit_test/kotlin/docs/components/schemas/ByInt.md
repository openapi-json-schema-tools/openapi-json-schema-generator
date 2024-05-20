# ByInt
org.openapijsonschematools.client.components.schemas.ByInt.java
class ByInt<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ByInt.ByInt1Boxed](#byint1boxed)<br> sealed interface for validated payloads |
| record | [ByInt.ByInt1BoxedVoid](#byint1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ByInt.ByInt1BoxedBoolean](#byint1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ByInt.ByInt1BoxedNumber](#byint1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ByInt.ByInt1BoxedString](#byint1boxedstring)<br> boxed class to store validated String payloads |
| record | [ByInt.ByInt1BoxedList](#byint1boxedlist)<br> boxed class to store validated List payloads |
| record | [ByInt.ByInt1BoxedMap](#byint1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ByInt.ByInt1](#byint1)<br> schema class |

## ByInt1Boxed
sealed interface ByInt1Boxed<br>
permits<br>
[ByInt1BoxedVoid](#byint1boxedvoid),
[ByInt1BoxedBoolean](#byint1boxedboolean),
[ByInt1BoxedNumber](#byint1boxednumber),
[ByInt1BoxedString](#byint1boxedstring),
[ByInt1BoxedList](#byint1boxedlist),
[ByInt1BoxedMap](#byint1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ByInt1BoxedVoid
data class ByInt1BoxedVoid<br>
implements [ByInt1Boxed](#byint1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1BoxedBoolean
data class ByInt1BoxedBoolean<br>
implements [ByInt1Boxed](#byint1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1BoxedNumber
data class ByInt1BoxedNumber<br>
implements [ByInt1Boxed](#byint1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1BoxedString
data class ByInt1BoxedString<br>
implements [ByInt1Boxed](#byint1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1BoxedList
data class ByInt1BoxedList<br>
implements [ByInt1Boxed](#byint1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1BoxedMap
data class ByInt1BoxedMap<br>
implements [ByInt1Boxed](#byint1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByInt1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByInt1
class ByInt1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("2") |

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
| [ByInt1BoxedString](#byint1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ByInt1BoxedVoid](#byint1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ByInt1BoxedNumber](#byint1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ByInt1BoxedBoolean](#byint1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ByInt1BoxedMap](#byint1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ByInt1BoxedList](#byint1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ByInt1Boxed](#byint1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
