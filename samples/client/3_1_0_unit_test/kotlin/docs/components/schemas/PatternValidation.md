# PatternValidation
org.openapijsonschematools.client.components.schemas.PatternValidation.java
class PatternValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternValidation.PatternValidation1Boxed](#patternvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [PatternValidation.PatternValidation1BoxedVoid](#patternvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [PatternValidation.PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PatternValidation.PatternValidation1BoxedNumber](#patternvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [PatternValidation.PatternValidation1BoxedString](#patternvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [PatternValidation.PatternValidation1BoxedList](#patternvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [PatternValidation.PatternValidation1BoxedMap](#patternvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [PatternValidation.PatternValidation1](#patternvalidation1)<br> schema class |

## PatternValidation1Boxed
sealed interface PatternValidation1Boxed<br>
permits<br>
[PatternValidation1BoxedVoid](#patternvalidation1boxedvoid),
[PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean),
[PatternValidation1BoxedNumber](#patternvalidation1boxednumber),
[PatternValidation1BoxedString](#patternvalidation1boxedstring),
[PatternValidation1BoxedList](#patternvalidation1boxedlist),
[PatternValidation1BoxedMap](#patternvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternValidation1BoxedVoid
data class PatternValidation1BoxedVoid<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1BoxedBoolean
data class PatternValidation1BoxedBoolean<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1BoxedNumber
data class PatternValidation1BoxedNumber<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1BoxedString
data class PatternValidation1BoxedString<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1BoxedList
data class PatternValidation1BoxedList<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1BoxedMap
data class PatternValidation1BoxedMap<br>
implements [PatternValidation1Boxed](#patternvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternValidation1
class PatternValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"^a*\$"<br>)<br> |

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
| [PatternValidation1BoxedString](#patternvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PatternValidation1BoxedVoid](#patternvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PatternValidation1BoxedNumber](#patternvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PatternValidation1BoxedBoolean](#patternvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PatternValidation1BoxedMap](#patternvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [PatternValidation1BoxedList](#patternvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PatternValidation1Boxed](#patternvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
