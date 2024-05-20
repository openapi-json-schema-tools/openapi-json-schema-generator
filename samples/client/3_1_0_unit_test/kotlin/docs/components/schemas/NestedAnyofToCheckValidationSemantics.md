# NestedAnyofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedAnyofToCheckValidationSemantics.java
class NestedAnyofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.NestedAnyofToCheckValidationSemantics1](#nestedanyoftocheckvalidationsemantics1)<br> schema class |
| sealed interface | [NestedAnyofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| sealed interface | [NestedAnyofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [NestedAnyofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAnyofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedAnyofToCheckValidationSemantics1Boxed
sealed interface NestedAnyofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid),
[NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean),
[NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber),
[NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring),
[NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist),
[NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NestedAnyofToCheckValidationSemantics1BoxedVoid
data class NestedAnyofToCheckValidationSemantics1BoxedVoid<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedBoolean
data class NestedAnyofToCheckValidationSemantics1BoxedBoolean<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedNumber
data class NestedAnyofToCheckValidationSemantics1BoxedNumber<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedString
data class NestedAnyofToCheckValidationSemantics1BoxedString<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedList
data class NestedAnyofToCheckValidationSemantics1BoxedList<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1BoxedMap
data class NestedAnyofToCheckValidationSemantics1BoxedMap<br>
implements [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAnyofToCheckValidationSemantics1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAnyofToCheckValidationSemantics1
class NestedAnyofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>)<br> |

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
| [NestedAnyofToCheckValidationSemantics1BoxedString](#nestedanyoftocheckvalidationsemantics1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1BoxedVoid](#nestedanyoftocheckvalidationsemantics1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1BoxedNumber](#nestedanyoftocheckvalidationsemantics1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1BoxedBoolean](#nestedanyoftocheckvalidationsemantics1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1BoxedMap](#nestedanyoftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1BoxedList](#nestedanyoftocheckvalidationsemantics1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NestedAnyofToCheckValidationSemantics1Boxed](#nestedanyoftocheckvalidationsemantics1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| List<Class<? extends JsonSchema>> | anyOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01::class.java](#schema01)<br>)<br> |

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
