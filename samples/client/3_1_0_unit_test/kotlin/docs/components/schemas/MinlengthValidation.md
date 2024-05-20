# MinlengthValidation
org.openapijsonschematools.client.components.schemas.MinlengthValidation.java
class MinlengthValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinlengthValidation.MinlengthValidation1Boxed](#minlengthvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MinlengthValidation.MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MinlengthValidation.MinlengthValidation1](#minlengthvalidation1)<br> schema class |

## MinlengthValidation1Boxed
sealed interface MinlengthValidation1Boxed<br>
permits<br>
[MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid),
[MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean),
[MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber),
[MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring),
[MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist),
[MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinlengthValidation1BoxedVoid
data class MinlengthValidation1BoxedVoid<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1BoxedBoolean
data class MinlengthValidation1BoxedBoolean<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1BoxedNumber
data class MinlengthValidation1BoxedNumber<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1BoxedString
data class MinlengthValidation1BoxedString<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1BoxedList
data class MinlengthValidation1BoxedList<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1BoxedMap
data class MinlengthValidation1BoxedMap<br>
implements [MinlengthValidation1Boxed](#minlengthvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinlengthValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinlengthValidation1
class MinlengthValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minLength = 2 |

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
| [MinlengthValidation1BoxedString](#minlengthvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MinlengthValidation1BoxedVoid](#minlengthvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MinlengthValidation1BoxedNumber](#minlengthvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MinlengthValidation1BoxedBoolean](#minlengthvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MinlengthValidation1BoxedMap](#minlengthvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MinlengthValidation1BoxedList](#minlengthvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MinlengthValidation1Boxed](#minlengthvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
