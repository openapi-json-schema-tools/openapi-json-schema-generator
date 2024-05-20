# RefInOneof
org.openapijsonschematools.client.components.schemas.RefInOneof.java
class RefInOneof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInOneof.RefInOneof1Boxed](#refinoneof1boxed)<br> sealed interface for validated payloads |
| data class | [RefInOneof.RefInOneof1BoxedVoid](#refinoneof1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RefInOneof.RefInOneof1BoxedBoolean](#refinoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RefInOneof.RefInOneof1BoxedNumber](#refinoneof1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RefInOneof.RefInOneof1BoxedString](#refinoneof1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RefInOneof.RefInOneof1BoxedList](#refinoneof1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RefInOneof.RefInOneof1BoxedMap](#refinoneof1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RefInOneof.RefInOneof1](#refinoneof1)<br> schema class |

## RefInOneof1Boxed
sealed interface RefInOneof1Boxed<br>
permits<br>
[RefInOneof1BoxedVoid](#refinoneof1boxedvoid),
[RefInOneof1BoxedBoolean](#refinoneof1boxedboolean),
[RefInOneof1BoxedNumber](#refinoneof1boxednumber),
[RefInOneof1BoxedString](#refinoneof1boxedstring),
[RefInOneof1BoxedList](#refinoneof1boxedlist),
[RefInOneof1BoxedMap](#refinoneof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInOneof1BoxedVoid
data class RefInOneof1BoxedVoid<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1BoxedBoolean
data class RefInOneof1BoxedBoolean<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1BoxedNumber
data class RefInOneof1BoxedNumber<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1BoxedString
data class RefInOneof1BoxedString<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1BoxedList
data class RefInOneof1BoxedList<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1BoxedMap
data class RefInOneof1BoxedMap<br>
implements [RefInOneof1Boxed](#refinoneof1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInOneof1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInOneof1
class RefInOneof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>))<br> |

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
| [RefInOneof1BoxedString](#refinoneof1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RefInOneof1BoxedVoid](#refinoneof1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RefInOneof1BoxedNumber](#refinoneof1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RefInOneof1BoxedBoolean](#refinoneof1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RefInOneof1BoxedMap](#refinoneof1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [RefInOneof1BoxedList](#refinoneof1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RefInOneof1Boxed](#refinoneof1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
