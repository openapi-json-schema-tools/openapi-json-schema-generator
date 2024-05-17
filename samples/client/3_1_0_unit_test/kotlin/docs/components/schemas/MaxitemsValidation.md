# MaxitemsValidation
org.openapijsonschematools.client.components.schemas.MaxitemsValidation.java
class MaxitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxitemsValidation.MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxitemsValidation.MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxitemsValidation.MaxitemsValidation1](#maxitemsvalidation1)<br> schema class |

## MaxitemsValidation1Boxed
sealed interface MaxitemsValidation1Boxed<br>
permits<br>
[MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid),
[MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean),
[MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber),
[MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring),
[MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist),
[MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxitemsValidation1BoxedVoid
data class MaxitemsValidation1BoxedVoid<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1BoxedBoolean
data class MaxitemsValidation1BoxedBoolean<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1BoxedNumber
data class MaxitemsValidation1BoxedNumber<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1BoxedString
data class MaxitemsValidation1BoxedString<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1BoxedList
data class MaxitemsValidation1BoxedList<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1BoxedMap
data class MaxitemsValidation1BoxedMap<br>
implements [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxitemsValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxitemsValidation1
class MaxitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxItems = 2 |

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
| [MaxitemsValidation1BoxedString](#maxitemsvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaxitemsValidation1BoxedVoid](#maxitemsvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaxitemsValidation1BoxedNumber](#maxitemsvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaxitemsValidation1BoxedBoolean](#maxitemsvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MaxitemsValidation1BoxedMap](#maxitemsvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MaxitemsValidation1BoxedList](#maxitemsvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaxitemsValidation1Boxed](#maxitemsvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
