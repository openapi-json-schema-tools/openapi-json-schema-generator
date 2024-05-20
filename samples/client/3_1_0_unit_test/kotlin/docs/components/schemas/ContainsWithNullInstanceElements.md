# ContainsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ContainsWithNullInstanceElements.java
class ContainsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsWithNullInstanceElements.ContainsWithNullInstanceElements1](#containswithnullinstanceelements1)<br> schema class |
| sealed interface | [ContainsWithNullInstanceElements.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| record | [ContainsWithNullInstanceElements.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| static class | [ContainsWithNullInstanceElements.Contains](#contains)<br> schema class |

## ContainsWithNullInstanceElements1Boxed
sealed interface ContainsWithNullInstanceElements1Boxed<br>
permits<br>
[ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid),
[ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean),
[ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber),
[ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring),
[ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist),
[ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsWithNullInstanceElements1BoxedVoid
data class ContainsWithNullInstanceElements1BoxedVoid<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedBoolean
data class ContainsWithNullInstanceElements1BoxedBoolean<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedNumber
data class ContainsWithNullInstanceElements1BoxedNumber<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedString
data class ContainsWithNullInstanceElements1BoxedString<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedList
data class ContainsWithNullInstanceElements1BoxedList<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1BoxedMap
data class ContainsWithNullInstanceElements1BoxedMap<br>
implements [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsWithNullInstanceElements1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsWithNullInstanceElements1
class ContainsWithNullInstanceElements1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains::class.java](#contains) |

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
| [ContainsWithNullInstanceElements1BoxedString](#containswithnullinstanceelements1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1BoxedVoid](#containswithnullinstanceelements1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1BoxedNumber](#containswithnullinstanceelements1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1BoxedBoolean](#containswithnullinstanceelements1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1BoxedMap](#containswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1BoxedList](#containswithnullinstanceelements1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ContainsWithNullInstanceElements1Boxed](#containswithnullinstanceelements1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ContainsBoxed
sealed interface ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid)

sealed interface that stores validated payloads using boxed classes

## ContainsBoxedVoid
data class ContainsBoxedVoid<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains
class Contains<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
