# AllofWithOneEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithOneEmptySchema.java
class AllofWithOneEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithOneEmptySchema.AllofWithOneEmptySchema1](#allofwithoneemptyschema1)<br> schema class |
| sealed interface | [AllofWithOneEmptySchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithOneEmptySchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithOneEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithOneEmptySchema1Boxed
sealed interface AllofWithOneEmptySchema1Boxed<br>
permits<br>
[AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid),
[AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean),
[AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber),
[AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring),
[AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist),
[AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithOneEmptySchema1BoxedVoid
data class AllofWithOneEmptySchema1BoxedVoid<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1BoxedBoolean
data class AllofWithOneEmptySchema1BoxedBoolean<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1BoxedNumber
data class AllofWithOneEmptySchema1BoxedNumber<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1BoxedString
data class AllofWithOneEmptySchema1BoxedString<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1BoxedList
data class AllofWithOneEmptySchema1BoxedList<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1BoxedMap
data class AllofWithOneEmptySchema1BoxedMap<br>
implements [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithOneEmptySchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithOneEmptySchema1
class AllofWithOneEmptySchema1<br>
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
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedString](#allofwithoneemptyschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedVoid](#allofwithoneemptyschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedNumber](#allofwithoneemptyschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedBoolean](#allofwithoneemptyschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedMap](#allofwithoneemptyschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1BoxedList](#allofwithoneemptyschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofWithOneEmptySchema1Boxed](#allofwithoneemptyschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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

data class that stores validated boolean payloads, sealed permits implementation

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
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
