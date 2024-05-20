# MinimumValidation
org.openapijsonschematools.client.components.schemas.MinimumValidation.java
class MinimumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinimumValidation.MinimumValidation1Boxed](#minimumvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedString](#minimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedList](#minimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [MinimumValidation.MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [MinimumValidation.MinimumValidation1](#minimumvalidation1)<br> schema class |

## MinimumValidation1Boxed
sealed interface MinimumValidation1Boxed<br>
permits<br>
[MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid),
[MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean),
[MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber),
[MinimumValidation1BoxedString](#minimumvalidation1boxedstring),
[MinimumValidation1BoxedList](#minimumvalidation1boxedlist),
[MinimumValidation1BoxedMap](#minimumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinimumValidation1BoxedVoid
data class MinimumValidation1BoxedVoid<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1BoxedBoolean
data class MinimumValidation1BoxedBoolean<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1BoxedNumber
data class MinimumValidation1BoxedNumber<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1BoxedString
data class MinimumValidation1BoxedString<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1BoxedList
data class MinimumValidation1BoxedList<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1BoxedMap
data class MinimumValidation1BoxedMap<br>
implements [MinimumValidation1Boxed](#minimumvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinimumValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinimumValidation1
class MinimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 1.1 |

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
| [MinimumValidation1BoxedString](#minimumvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MinimumValidation1BoxedVoid](#minimumvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MinimumValidation1BoxedNumber](#minimumvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MinimumValidation1BoxedBoolean](#minimumvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MinimumValidation1BoxedMap](#minimumvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MinimumValidation1BoxedList](#minimumvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MinimumValidation1Boxed](#minimumvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
