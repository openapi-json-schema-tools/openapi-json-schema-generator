# RefInNot
org.openapijsonschematools.client.components.schemas.RefInNot.java
class RefInNot<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInNot.RefInNot1Boxed](#refinnot1boxed)<br> sealed interface for validated payloads |
| data class | [RefInNot.RefInNot1BoxedVoid](#refinnot1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [RefInNot.RefInNot1BoxedBoolean](#refinnot1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [RefInNot.RefInNot1BoxedNumber](#refinnot1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [RefInNot.RefInNot1BoxedString](#refinnot1boxedstring)<br> boxed class to store validated String payloads |
| data class | [RefInNot.RefInNot1BoxedList](#refinnot1boxedlist)<br> boxed class to store validated List payloads |
| data class | [RefInNot.RefInNot1BoxedMap](#refinnot1boxedmap)<br> boxed class to store validated Map payloads |
| class | [RefInNot.RefInNot1](#refinnot1)<br> schema class |

## RefInNot1Boxed
sealed interface RefInNot1Boxed<br>
permits<br>
[RefInNot1BoxedVoid](#refinnot1boxedvoid),
[RefInNot1BoxedBoolean](#refinnot1boxedboolean),
[RefInNot1BoxedNumber](#refinnot1boxednumber),
[RefInNot1BoxedString](#refinnot1boxedstring),
[RefInNot1BoxedList](#refinnot1boxedlist),
[RefInNot1BoxedMap](#refinnot1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RefInNot1BoxedVoid
data class RefInNot1BoxedVoid<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1BoxedBoolean
data class RefInNot1BoxedBoolean<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1BoxedNumber
data class RefInNot1BoxedNumber<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1BoxedString
data class RefInNot1BoxedString<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1BoxedList
data class RefInNot1BoxedList<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1BoxedMap
data class RefInNot1BoxedMap<br>
implements [RefInNot1Boxed](#refinnot1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInNot1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInNot1
class RefInNot1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | not = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

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
| [RefInNot1BoxedString](#refinnot1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RefInNot1BoxedVoid](#refinnot1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RefInNot1BoxedNumber](#refinnot1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RefInNot1BoxedBoolean](#refinnot1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [RefInNot1BoxedMap](#refinnot1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [RefInNot1BoxedList](#refinnot1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RefInNot1Boxed](#refinnot1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
