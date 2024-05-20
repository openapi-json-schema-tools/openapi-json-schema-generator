# MinimumValidationWithSignedInteger
org.openapijsonschematools.client.components.schemas.MinimumValidationWithSignedInteger.java
class MinimumValidationWithSignedInteger<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)<br> sealed interface for validated payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinimumValidationWithSignedInteger.MinimumValidationWithSignedInteger1](#minimumvalidationwithsignedinteger1)<br> schema class |

## MinimumValidationWithSignedInteger1Boxed
sealed interface MinimumValidationWithSignedInteger1Boxed<br>
permits<br>
[MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid),
[MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean),
[MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber),
[MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring),
[MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist),
[MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinimumValidationWithSignedInteger1BoxedVoid
data class MinimumValidationWithSignedInteger1BoxedVoid<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedBoolean
data class MinimumValidationWithSignedInteger1BoxedBoolean<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedNumber
data class MinimumValidationWithSignedInteger1BoxedNumber<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedString
data class MinimumValidationWithSignedInteger1BoxedString<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedList
data class MinimumValidationWithSignedInteger1BoxedList<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1BoxedMap
data class MinimumValidationWithSignedInteger1BoxedMap<br>
implements [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidationWithSignedInteger1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidationWithSignedInteger1
class MinimumValidationWithSignedInteger1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = -2 |

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
| [MinimumValidationWithSignedInteger1BoxedString](#minimumvalidationwithsignedinteger1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1BoxedVoid](#minimumvalidationwithsignedinteger1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1BoxedNumber](#minimumvalidationwithsignedinteger1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1BoxedBoolean](#minimumvalidationwithsignedinteger1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1BoxedMap](#minimumvalidationwithsignedinteger1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1BoxedList](#minimumvalidationwithsignedinteger1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MinimumValidationWithSignedInteger1Boxed](#minimumvalidationwithsignedinteger1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
