# PatternIsNotAnchored
org.openapijsonschematools.client.components.schemas.PatternIsNotAnchored.java
class PatternIsNotAnchored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternIsNotAnchored.PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)<br> sealed interface for validated payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring)<br> boxed class to store validated String payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist)<br> boxed class to store validated List payloads |
| data class | [PatternIsNotAnchored.PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap)<br> boxed class to store validated Map payloads |
| class | [PatternIsNotAnchored.PatternIsNotAnchored1](#patternisnotanchored1)<br> schema class |

## PatternIsNotAnchored1Boxed
sealed interface PatternIsNotAnchored1Boxed<br>
permits<br>
[PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid),
[PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean),
[PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber),
[PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring),
[PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist),
[PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternIsNotAnchored1BoxedVoid
data class PatternIsNotAnchored1BoxedVoid<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedBoolean
data class PatternIsNotAnchored1BoxedBoolean<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedNumber
data class PatternIsNotAnchored1BoxedNumber<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedString
data class PatternIsNotAnchored1BoxedString<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedList
data class PatternIsNotAnchored1BoxedList<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1BoxedMap
data class PatternIsNotAnchored1BoxedMap<br>
implements [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternIsNotAnchored1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternIsNotAnchored1
class PatternIsNotAnchored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Pattern | pattern = Pattern.compile(<br>&nbsp;&nbsp;&nbsp;&nbsp;"a+"<br>)<br> |

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
| [PatternIsNotAnchored1BoxedString](#patternisnotanchored1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1BoxedVoid](#patternisnotanchored1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1BoxedNumber](#patternisnotanchored1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1BoxedBoolean](#patternisnotanchored1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1BoxedMap](#patternisnotanchored1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1BoxedList](#patternisnotanchored1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PatternIsNotAnchored1Boxed](#patternisnotanchored1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
