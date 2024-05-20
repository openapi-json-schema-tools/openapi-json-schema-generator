# AllofWithTheFirstEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithTheFirstEmptySchema.java
class AllofWithTheFirstEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithTheFirstEmptySchema.AllofWithTheFirstEmptySchema1](#allofwiththefirstemptyschema1)<br> schema class |
| sealed interface | [AllofWithTheFirstEmptySchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| class | [AllofWithTheFirstEmptySchema.Schema1](#schema1)<br> schema class |
| sealed interface | [AllofWithTheFirstEmptySchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofWithTheFirstEmptySchema.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofWithTheFirstEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheFirstEmptySchema1Boxed
sealed interface AllofWithTheFirstEmptySchema1Boxed<br>
permits<br>
[AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid),
[AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean),
[AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber),
[AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring),
[AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist),
[AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithTheFirstEmptySchema1BoxedVoid
data class AllofWithTheFirstEmptySchema1BoxedVoid<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedBoolean
data class AllofWithTheFirstEmptySchema1BoxedBoolean<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedNumber
data class AllofWithTheFirstEmptySchema1BoxedNumber<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedString
data class AllofWithTheFirstEmptySchema1BoxedString<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedList
data class AllofWithTheFirstEmptySchema1BoxedList<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1BoxedMap
data class AllofWithTheFirstEmptySchema1BoxedMap<br>
implements [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheFirstEmptySchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheFirstEmptySchema1
class AllofWithTheFirstEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>;)<br> |

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
| [AllofWithTheFirstEmptySchema1BoxedString](#allofwiththefirstemptyschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1BoxedVoid](#allofwiththefirstemptyschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1BoxedNumber](#allofwiththefirstemptyschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1BoxedBoolean](#allofwiththefirstemptyschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1BoxedMap](#allofwiththefirstemptyschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1BoxedList](#allofwiththefirstemptyschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofWithTheFirstEmptySchema1Boxed](#allofwiththefirstemptyschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedNumber](#schema1boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedNumber
data class Schema1BoxedNumber<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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
