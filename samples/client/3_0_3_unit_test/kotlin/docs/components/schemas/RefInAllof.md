# RefInAllof
org.openapijsonschematools.client.components.schemas.RefInAllof.java
class RefInAllof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInAllof.RefInAllof1Boxed](#refinallof1boxed)<br> sealed interface for validated payloads |
| data class | [RefInAllof.RefInAllof1BoxedVoid](#refinallof1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RefInAllof.RefInAllof1BoxedBoolean](#refinallof1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RefInAllof.RefInAllof1BoxedNumber](#refinallof1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RefInAllof.RefInAllof1BoxedString](#refinallof1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RefInAllof.RefInAllof1BoxedList](#refinallof1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RefInAllof.RefInAllof1BoxedMap](#refinallof1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RefInAllof.RefInAllof1](#refinallof1)<br> schema class |

## RefInAllof1Boxed
sealed interface RefInAllof1Boxed<br>
permits<br>
[RefInAllof1BoxedVoid](#refinallof1boxedvoid),
[RefInAllof1BoxedBoolean](#refinallof1boxedboolean),
[RefInAllof1BoxedNumber](#refinallof1boxednumber),
[RefInAllof1BoxedString](#refinallof1boxedstring),
[RefInAllof1BoxedList](#refinallof1boxedlist),
[RefInAllof1BoxedMap](#refinallof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInAllof1BoxedVoid
data class RefInAllof1BoxedVoid<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1BoxedBoolean
data class RefInAllof1BoxedBoolean<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1BoxedNumber
data class RefInAllof1BoxedNumber<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1BoxedString
data class RefInAllof1BoxedString<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1BoxedList
data class RefInAllof1BoxedList<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1BoxedMap
data class RefInAllof1BoxedMap<br>
implements [RefInAllof1Boxed](#refinallof1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInAllof1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInAllof1
class RefInAllof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1)<br>)<br> |

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
| [RefInAllof1BoxedString](#refinallof1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RefInAllof1BoxedVoid](#refinallof1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RefInAllof1BoxedNumber](#refinallof1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RefInAllof1BoxedBoolean](#refinallof1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RefInAllof1BoxedMap](#refinallof1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [RefInAllof1BoxedList](#refinallof1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RefInAllof1Boxed](#refinallof1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
