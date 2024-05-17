# ExclusiveminimumValidation
org.openapijsonschematools.client.components.schemas.ExclusiveminimumValidation.java
class ExclusiveminimumValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ExclusiveminimumValidation.ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ExclusiveminimumValidation.ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ExclusiveminimumValidation.ExclusiveminimumValidation1](#exclusiveminimumvalidation1)<br> schema class |

## ExclusiveminimumValidation1Boxed
sealed interface ExclusiveminimumValidation1Boxed<br>
permits<br>
[ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid),
[ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean),
[ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber),
[ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring),
[ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist),
[ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ExclusiveminimumValidation1BoxedVoid
data class ExclusiveminimumValidation1BoxedVoid<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedBoolean
data class ExclusiveminimumValidation1BoxedBoolean<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedNumber
data class ExclusiveminimumValidation1BoxedNumber<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedString
data class ExclusiveminimumValidation1BoxedString<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedList
data class ExclusiveminimumValidation1BoxedList<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1BoxedMap
data class ExclusiveminimumValidation1BoxedMap<br>
implements [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ExclusiveminimumValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ExclusiveminimumValidation1
class ExclusiveminimumValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | exclusiveMinimum = 1.1 |

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
| [ExclusiveminimumValidation1BoxedString](#exclusiveminimumvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1BoxedVoid](#exclusiveminimumvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1BoxedNumber](#exclusiveminimumvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1BoxedBoolean](#exclusiveminimumvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1BoxedMap](#exclusiveminimumvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1BoxedList](#exclusiveminimumvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ExclusiveminimumValidation1Boxed](#exclusiveminimumvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
