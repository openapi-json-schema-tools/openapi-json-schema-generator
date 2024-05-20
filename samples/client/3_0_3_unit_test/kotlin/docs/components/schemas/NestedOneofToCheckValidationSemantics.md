# NestedOneofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedOneofToCheckValidationSemantics.java
class NestedOneofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)<br> sealed interface for validated payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedOneofToCheckValidationSemantics.NestedOneofToCheckValidationSemantics1](#nestedoneoftocheckvalidationsemantics1)<br> schema class |
| sealed interface | [NestedOneofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| sealed interface | [NestedOneofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [NestedOneofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedOneofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedOneofToCheckValidationSemantics1Boxed
sealed interface NestedOneofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid),
[NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean),
[NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber),
[NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring),
[NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist),
[NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NestedOneofToCheckValidationSemantics1BoxedVoid
data class NestedOneofToCheckValidationSemantics1BoxedVoid<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedBoolean
data class NestedOneofToCheckValidationSemantics1BoxedBoolean<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedNumber
data class NestedOneofToCheckValidationSemantics1BoxedNumber<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedString
data class NestedOneofToCheckValidationSemantics1BoxedString<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedList
data class NestedOneofToCheckValidationSemantics1BoxedList<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1BoxedMap
data class NestedOneofToCheckValidationSemantics1BoxedMap<br>
implements [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedOneofToCheckValidationSemantics1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedOneofToCheckValidationSemantics1
class NestedOneofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>))<br> |

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
| [NestedOneofToCheckValidationSemantics1BoxedString](#nestedoneoftocheckvalidationsemantics1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1BoxedVoid](#nestedoneoftocheckvalidationsemantics1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1BoxedNumber](#nestedoneoftocheckvalidationsemantics1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1BoxedBoolean](#nestedoneoftocheckvalidationsemantics1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1BoxedMap](#nestedoneoftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1BoxedList](#nestedoneoftocheckvalidationsemantics1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NestedOneofToCheckValidationSemantics1Boxed](#nestedoneoftocheckvalidationsemantics1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid),
[Schema0BoxedBoolean](#schema0boxedboolean),
[Schema0BoxedNumber](#schema0boxednumber),
[Schema0BoxedString](#schema0boxedstring),
[Schema0BoxedList](#schema0boxedlist),
[Schema0BoxedMap](#schema0boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
data class Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedBoolean
data class Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedNumber
data class Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedString
data class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedList
data class Schema0BoxedList<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0BoxedMap
data class Schema0BoxedMap<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | oneOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01::class.java](#schema01)<br>))<br> |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema0BoxedList](#schema0boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema0Boxed](#schema0boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema01Boxed
sealed interface Schema01Boxed<br>
permits<br>
[Schema01BoxedVoid](#schema01boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema01BoxedVoid
data class Schema01BoxedVoid<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01
class Schema01<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
