# MaximumValidation
org.openapijsonschematools.client.components.schemas.MaximumValidation.java
class MaximumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaximumValidation.MaximumValidation1Boxed](#maximumvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedString](#maximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedList](#maximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [MaximumValidation.MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [MaximumValidation.MaximumValidation1](#maximumvalidation1)<br> schema class |

## MaximumValidation1Boxed
sealed interface MaximumValidation1Boxed<br>
permits<br>
[MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid),
[MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean),
[MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber),
[MaximumValidation1BoxedString](#maximumvalidation1boxedstring),
[MaximumValidation1BoxedList](#maximumvalidation1boxedlist),
[MaximumValidation1BoxedMap](#maximumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaximumValidation1BoxedVoid
data class MaximumValidation1BoxedVoid<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1BoxedBoolean
data class MaximumValidation1BoxedBoolean<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1BoxedNumber
data class MaximumValidation1BoxedNumber<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1BoxedString
data class MaximumValidation1BoxedString<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1BoxedList
data class MaximumValidation1BoxedList<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1BoxedMap
data class MaximumValidation1BoxedMap<br>
implements [MaximumValidation1Boxed](#maximumvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaximumValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaximumValidation1
class MaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 3.0 |

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
| [MaximumValidation1BoxedString](#maximumvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaximumValidation1BoxedVoid](#maximumvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaximumValidation1BoxedNumber](#maximumvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaximumValidation1BoxedBoolean](#maximumvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MaximumValidation1BoxedMap](#maximumvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MaximumValidation1BoxedList](#maximumvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaximumValidation1Boxed](#maximumvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
