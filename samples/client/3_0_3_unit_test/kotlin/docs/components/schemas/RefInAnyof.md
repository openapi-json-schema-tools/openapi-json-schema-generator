# RefInAnyof
org.openapijsonschematools.client.components.schemas.RefInAnyof.java
class RefInAnyof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInAnyof.RefInAnyof1Boxed](#refinanyof1boxed)<br> sealed interface for validated payloads |
| record | [RefInAnyof.RefInAnyof1BoxedVoid](#refinanyof1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RefInAnyof.RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RefInAnyof.RefInAnyof1BoxedNumber](#refinanyof1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RefInAnyof.RefInAnyof1BoxedString](#refinanyof1boxedstring)<br> boxed class to store validated String payloads |
| record | [RefInAnyof.RefInAnyof1BoxedList](#refinanyof1boxedlist)<br> boxed class to store validated List payloads |
| record | [RefInAnyof.RefInAnyof1BoxedMap](#refinanyof1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RefInAnyof.RefInAnyof1](#refinanyof1)<br> schema class |

## RefInAnyof1Boxed
sealed interface RefInAnyof1Boxed<br>
permits<br>
[RefInAnyof1BoxedVoid](#refinanyof1boxedvoid),
[RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean),
[RefInAnyof1BoxedNumber](#refinanyof1boxednumber),
[RefInAnyof1BoxedString](#refinanyof1boxedstring),
[RefInAnyof1BoxedList](#refinanyof1boxedlist),
[RefInAnyof1BoxedMap](#refinanyof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInAnyof1BoxedVoid
data class RefInAnyof1BoxedVoid<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1BoxedBoolean
data class RefInAnyof1BoxedBoolean<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1BoxedNumber
data class RefInAnyof1BoxedNumber<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1BoxedString
data class RefInAnyof1BoxedString<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1BoxedList
data class RefInAnyof1BoxedList<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1BoxedMap
data class RefInAnyof1BoxedMap<br>
implements [RefInAnyof1Boxed](#refinanyof1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAnyof1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAnyof1
class RefInAnyof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>)<br> |

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
| [RefInAnyof1BoxedString](#refinanyof1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RefInAnyof1BoxedVoid](#refinanyof1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RefInAnyof1BoxedNumber](#refinanyof1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RefInAnyof1BoxedBoolean](#refinanyof1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [RefInAnyof1BoxedMap](#refinanyof1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [RefInAnyof1BoxedList](#refinanyof1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RefInAnyof1Boxed](#refinanyof1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
