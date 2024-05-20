# MaxlengthValidation
org.openapijsonschematools.client.components.schemas.MaxlengthValidation.java
class MaxlengthValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxlengthValidation.MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxlengthValidation.MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxlengthValidation.MaxlengthValidation1](#maxlengthvalidation1)<br> schema class |

## MaxlengthValidation1Boxed
sealed interface MaxlengthValidation1Boxed<br>
permits<br>
[MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid),
[MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean),
[MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber),
[MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring),
[MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist),
[MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxlengthValidation1BoxedVoid
data class MaxlengthValidation1BoxedVoid<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1BoxedBoolean
data class MaxlengthValidation1BoxedBoolean<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1BoxedNumber
data class MaxlengthValidation1BoxedNumber<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1BoxedString
data class MaxlengthValidation1BoxedString<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1BoxedList
data class MaxlengthValidation1BoxedList<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1BoxedMap
data class MaxlengthValidation1BoxedMap<br>
implements [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxlengthValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxlengthValidation1
class MaxlengthValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxLength = 2 |

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
| [MaxlengthValidation1BoxedString](#maxlengthvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaxlengthValidation1BoxedVoid](#maxlengthvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaxlengthValidation1BoxedNumber](#maxlengthvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaxlengthValidation1BoxedBoolean](#maxlengthvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MaxlengthValidation1BoxedMap](#maxlengthvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MaxlengthValidation1BoxedList](#maxlengthvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaxlengthValidation1Boxed](#maxlengthvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
