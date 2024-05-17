# MaximumValidationWithUnsignedInteger
org.openapijsonschematools.client.components.schemas.MaximumValidationWithUnsignedInteger.java
class MaximumValidationWithUnsignedInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)<br> sealed interface for validated payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaximumValidationWithUnsignedInteger.MaximumValidationWithUnsignedInteger1](#maximumvalidationwithunsignedinteger1)<br> schema class |

## MaximumValidationWithUnsignedInteger1Boxed
sealed interface MaximumValidationWithUnsignedInteger1Boxed<br>
permits<br>
[MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid),
[MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean),
[MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber),
[MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring),
[MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist),
[MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaximumValidationWithUnsignedInteger1BoxedVoid
data class MaximumValidationWithUnsignedInteger1BoxedVoid<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedBoolean
data class MaximumValidationWithUnsignedInteger1BoxedBoolean<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedNumber
data class MaximumValidationWithUnsignedInteger1BoxedNumber<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedString
data class MaximumValidationWithUnsignedInteger1BoxedString<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedList
data class MaximumValidationWithUnsignedInteger1BoxedList<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1BoxedMap
data class MaximumValidationWithUnsignedInteger1BoxedMap<br>
implements [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidationWithUnsignedInteger1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidationWithUnsignedInteger1
class MaximumValidationWithUnsignedInteger1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 300 |

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
| [MaximumValidationWithUnsignedInteger1BoxedString](#maximumvalidationwithunsignedinteger1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1BoxedVoid](#maximumvalidationwithunsignedinteger1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1BoxedNumber](#maximumvalidationwithunsignedinteger1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1BoxedBoolean](#maximumvalidationwithunsignedinteger1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1BoxedMap](#maximumvalidationwithunsignedinteger1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1BoxedList](#maximumvalidationwithunsignedinteger1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaximumValidationWithUnsignedInteger1Boxed](#maximumvalidationwithunsignedinteger1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
