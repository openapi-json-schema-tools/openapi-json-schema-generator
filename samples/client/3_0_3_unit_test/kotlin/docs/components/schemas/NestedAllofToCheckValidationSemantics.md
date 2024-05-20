# NestedAllofToCheckValidationSemantics
org.openapijsonschematools.client.components.schemas.NestedAllofToCheckValidationSemantics.java
class NestedAllofToCheckValidationSemantics<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)<br> sealed interface for validated payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAllofToCheckValidationSemantics.NestedAllofToCheckValidationSemantics1](#nestedalloftocheckvalidationsemantics1)<br> schema class |
| sealed interface | [NestedAllofToCheckValidationSemantics.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema0](#schema0)<br> schema class |
| sealed interface | [NestedAllofToCheckValidationSemantics.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| record | [NestedAllofToCheckValidationSemantics.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| static class | [NestedAllofToCheckValidationSemantics.Schema01](#schema01)<br> schema class |

## NestedAllofToCheckValidationSemantics1Boxed
sealed interface NestedAllofToCheckValidationSemantics1Boxed<br>
permits<br>
[NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid),
[NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean),
[NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber),
[NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring),
[NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist),
[NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap)

sealed interface that stores validated payloads using boxed classes

## NestedAllofToCheckValidationSemantics1BoxedVoid
data class NestedAllofToCheckValidationSemantics1BoxedVoid<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedBoolean
data class NestedAllofToCheckValidationSemantics1BoxedBoolean<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedNumber
data class NestedAllofToCheckValidationSemantics1BoxedNumber<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedString
data class NestedAllofToCheckValidationSemantics1BoxedString<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedList
data class NestedAllofToCheckValidationSemantics1BoxedList<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1BoxedMap
data class NestedAllofToCheckValidationSemantics1BoxedMap<br>
implements [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedAllofToCheckValidationSemantics1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedAllofToCheckValidationSemantics1
class NestedAllofToCheckValidationSemantics1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>;)<br> |

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
| [NestedAllofToCheckValidationSemantics1BoxedString](#nestedalloftocheckvalidationsemantics1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1BoxedVoid](#nestedalloftocheckvalidationsemantics1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1BoxedNumber](#nestedalloftocheckvalidationsemantics1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1BoxedBoolean](#nestedalloftocheckvalidationsemantics1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1BoxedMap](#nestedalloftocheckvalidationsemantics1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1BoxedList](#nestedalloftocheckvalidationsemantics1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [NestedAllofToCheckValidationSemantics1Boxed](#nestedalloftocheckvalidationsemantics1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01::class.java](#schema01)<br>;)<br> |

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
| [Schema0BoxedString](#schema0boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema0BoxedVoid](#schema0boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema0BoxedNumber](#schema0boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema0BoxedBoolean](#schema0boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Schema0BoxedMap](#schema0boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
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
