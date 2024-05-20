# MinpropertiesValidation
org.openapijsonschematools.client.components.schemas.MinpropertiesValidation.java
class MinpropertiesValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MinpropertiesValidation.MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)<br> sealed interface for validated payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring)<br> boxed class to store validated String payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist)<br> boxed class to store validated List payloads |
| data class | [MinpropertiesValidation.MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| class | [MinpropertiesValidation.MinpropertiesValidation1](#minpropertiesvalidation1)<br> schema class |

## MinpropertiesValidation1Boxed
sealed interface MinpropertiesValidation1Boxed<br>
permits<br>
[MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid),
[MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean),
[MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber),
[MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring),
[MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist),
[MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MinpropertiesValidation1BoxedVoid
data class MinpropertiesValidation1BoxedVoid<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1BoxedBoolean
data class MinpropertiesValidation1BoxedBoolean<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1BoxedNumber
data class MinpropertiesValidation1BoxedNumber<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1BoxedString
data class MinpropertiesValidation1BoxedString<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1BoxedList
data class MinpropertiesValidation1BoxedList<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1BoxedMap
data class MinpropertiesValidation1BoxedMap<br>
implements [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MinpropertiesValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MinpropertiesValidation1
class MinpropertiesValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | minProperties = 1 |

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
| [MinpropertiesValidation1BoxedString](#minpropertiesvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1BoxedVoid](#minpropertiesvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1BoxedNumber](#minpropertiesvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1BoxedBoolean](#minpropertiesvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1BoxedMap](#minpropertiesvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1BoxedList](#minpropertiesvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MinpropertiesValidation1Boxed](#minpropertiesvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
