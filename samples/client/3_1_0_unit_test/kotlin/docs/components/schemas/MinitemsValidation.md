# MinitemsValidation
org.openapijsonschematools.client.components.schemas.MinitemsValidation.java
class MinitemsValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinitemsValidation.MinitemsValidation1Boxed](#minitemsvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [MinitemsValidation.MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [MinitemsValidation.MinitemsValidation1](#minitemsvalidation1)<br> schema class |

## MinitemsValidation1Boxed
sealed interface MinitemsValidation1Boxed<br>
permits<br>
[MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid),
[MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean),
[MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber),
[MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring),
[MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist),
[MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinitemsValidation1BoxedVoid
data class MinitemsValidation1BoxedVoid<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1BoxedBoolean
data class MinitemsValidation1BoxedBoolean<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1BoxedNumber
data class MinitemsValidation1BoxedNumber<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1BoxedString
data class MinitemsValidation1BoxedString<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1BoxedList
data class MinitemsValidation1BoxedList<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1BoxedMap
data class MinitemsValidation1BoxedMap<br>
implements [MinitemsValidation1Boxed](#minitemsvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinitemsValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinitemsValidation1
class MinitemsValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | minItems = 1 |

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
| [MinitemsValidation1BoxedString](#minitemsvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MinitemsValidation1BoxedVoid](#minitemsvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MinitemsValidation1BoxedNumber](#minitemsvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MinitemsValidation1BoxedBoolean](#minitemsvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MinitemsValidation1BoxedMap](#minitemsvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MinitemsValidation1BoxedList](#minitemsvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MinitemsValidation1Boxed](#minitemsvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
