# MaxpropertiesValidation
org.openapijsonschematools.client.components.schemas.MaxpropertiesValidation.java
class MaxpropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxpropertiesValidation.MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)<br> sealed interface for validated payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxpropertiesValidation.MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxpropertiesValidation.MaxpropertiesValidation1](#maxpropertiesvalidation1)<br> schema class |

## MaxpropertiesValidation1Boxed
sealed interface MaxpropertiesValidation1Boxed<br>
permits<br>
[MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid),
[MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean),
[MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber),
[MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring),
[MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist),
[MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxpropertiesValidation1BoxedVoid
data class MaxpropertiesValidation1BoxedVoid<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedBoolean
data class MaxpropertiesValidation1BoxedBoolean<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedNumber
data class MaxpropertiesValidation1BoxedNumber<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedString
data class MaxpropertiesValidation1BoxedString<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedList
data class MaxpropertiesValidation1BoxedList<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1BoxedMap
data class MaxpropertiesValidation1BoxedMap<br>
implements [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxpropertiesValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxpropertiesValidation1
class MaxpropertiesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | maxProperties = 2 |

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
| [MaxpropertiesValidation1BoxedString](#maxpropertiesvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1BoxedVoid](#maxpropertiesvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1BoxedNumber](#maxpropertiesvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1BoxedBoolean](#maxpropertiesvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1BoxedMap](#maxpropertiesvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1BoxedList](#maxpropertiesvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaxpropertiesValidation1Boxed](#maxpropertiesvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
