# ExclusivemaximumValidation
org.openapijsonschematools.client.components.schemas.ExclusivemaximumValidation.java
class ExclusivemaximumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ExclusivemaximumValidation.ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ExclusivemaximumValidation.ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusivemaximumValidation.ExclusivemaximumValidation1](#exclusivemaximumvalidation1)<br> schema class |

## ExclusivemaximumValidation1Boxed
sealed interface ExclusivemaximumValidation1Boxed<br>
permits<br>
[ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid),
[ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean),
[ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber),
[ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring),
[ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist),
[ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ExclusivemaximumValidation1BoxedVoid
data class ExclusivemaximumValidation1BoxedVoid<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedBoolean
data class ExclusivemaximumValidation1BoxedBoolean<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedNumber
data class ExclusivemaximumValidation1BoxedNumber<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedString
data class ExclusivemaximumValidation1BoxedString<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedList
data class ExclusivemaximumValidation1BoxedList<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1BoxedMap
data class ExclusivemaximumValidation1BoxedMap<br>
implements [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusivemaximumValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusivemaximumValidation1
class ExclusivemaximumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMaximum = 3.0 |

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
| [ExclusivemaximumValidation1BoxedString](#exclusivemaximumvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1BoxedVoid](#exclusivemaximumvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1BoxedNumber](#exclusivemaximumvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1BoxedBoolean](#exclusivemaximumvalidation1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1BoxedMap](#exclusivemaximumvalidation1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1BoxedList](#exclusivemaximumvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ExclusivemaximumValidation1Boxed](#exclusivemaximumvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
