# Not
org.openapijsonschematools.client.components.schemas.Not.java
class Not<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Not.Not1Boxed](#not1boxed)<br> sealed interface for validated payloads |
| record | [Not.Not1BoxedVoid](#not1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Not.Not1BoxedBoolean](#not1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Not.Not1BoxedNumber](#not1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Not.Not1BoxedString](#not1boxedstring)<br> boxed class to store validated String payloads |
| record | [Not.Not1BoxedList](#not1boxedlist)<br> boxed class to store validated List payloads |
| record | [Not.Not1BoxedMap](#not1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Not.Not1](#not1)<br> schema class |
| sealed interface | [Not.Not2Boxed](#not2boxed)<br> sealed interface for validated payloads |
| record | [Not.Not2BoxedNumber](#not2boxednumber)<br> boxed class to store validated Number payloads |
| static class | [Not.Not2](#not2)<br> schema class |

## Not1Boxed
sealed interface Not1Boxed<br>
permits<br>
[Not1BoxedVoid](#not1boxedvoid),
[Not1BoxedBoolean](#not1boxedboolean),
[Not1BoxedNumber](#not1boxednumber),
[Not1BoxedString](#not1boxedstring),
[Not1BoxedList](#not1boxedlist),
[Not1BoxedMap](#not1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Not1BoxedVoid
data class Not1BoxedVoid<br>
implements [Not1Boxed](#not1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1BoxedBoolean
data class Not1BoxedBoolean<br>
implements [Not1Boxed](#not1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1BoxedNumber
data class Not1BoxedNumber<br>
implements [Not1Boxed](#not1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1BoxedString
data class Not1BoxedString<br>
implements [Not1Boxed](#not1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1BoxedList
data class Not1BoxedList<br>
implements [Not1Boxed](#not1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1BoxedMap
data class Not1BoxedMap<br>
implements [Not1Boxed](#not1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not1
class Not1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [Not2::class.java](#not2) |

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
| [Not1BoxedString](#not1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Not1BoxedVoid](#not1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Not1BoxedNumber](#not1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Not1BoxedBoolean](#not1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Not1BoxedMap](#not1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [Not1BoxedList](#not1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Not1Boxed](#not1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Not2Boxed
sealed interface Not2Boxed<br>
permits<br>
[Not2BoxedNumber](#not2boxednumber)

sealed interface that stores validated payloads using boxed classes

## Not2BoxedNumber
data class Not2BoxedNumber<br>
implements [Not2Boxed](#not2boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Not2BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Not2
class Not2<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
