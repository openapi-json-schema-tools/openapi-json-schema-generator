# AnyofWithOneEmptySchema
org.openapijsonschematools.client.components.schemas.AnyofWithOneEmptySchema.java
class AnyofWithOneEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)<br> sealed interface for validated payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedVoid](#anyofwithoneemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedBoolean](#anyofwithoneemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedNumber](#anyofwithoneemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedString](#anyofwithoneemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedList](#anyofwithoneemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1BoxedMap](#anyofwithoneemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyofWithOneEmptySchema.AnyofWithOneEmptySchema1](#anyofwithoneemptyschema1)<br> schema class |
| sealed interface | [AnyofWithOneEmptySchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AnyofWithOneEmptySchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AnyofWithOneEmptySchema.Schema1](#schema1)<br> schema class |
| sealed interface | [AnyofWithOneEmptySchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AnyofWithOneEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AnyofWithOneEmptySchema.Schema0](#schema0)<br> schema class |

## AnyofWithOneEmptySchema1Boxed
sealed interface AnyofWithOneEmptySchema1Boxed<br>
permits<br>
[AnyofWithOneEmptySchema1BoxedVoid](#anyofwithoneemptyschema1boxedvoid),
[AnyofWithOneEmptySchema1BoxedBoolean](#anyofwithoneemptyschema1boxedboolean),
[AnyofWithOneEmptySchema1BoxedNumber](#anyofwithoneemptyschema1boxednumber),
[AnyofWithOneEmptySchema1BoxedString](#anyofwithoneemptyschema1boxedstring),
[AnyofWithOneEmptySchema1BoxedList](#anyofwithoneemptyschema1boxedlist),
[AnyofWithOneEmptySchema1BoxedMap](#anyofwithoneemptyschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AnyofWithOneEmptySchema1BoxedVoid
data class AnyofWithOneEmptySchema1BoxedVoid<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1BoxedBoolean
data class AnyofWithOneEmptySchema1BoxedBoolean<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1BoxedNumber
data class AnyofWithOneEmptySchema1BoxedNumber<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1BoxedString
data class AnyofWithOneEmptySchema1BoxedString<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1BoxedList
data class AnyofWithOneEmptySchema1BoxedList<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1BoxedMap
data class AnyofWithOneEmptySchema1BoxedMap<br>
implements [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AnyofWithOneEmptySchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AnyofWithOneEmptySchema1
class AnyofWithOneEmptySchema1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | anyOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>)<br> |

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
| [AnyofWithOneEmptySchema1BoxedString](#anyofwithoneemptyschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1BoxedVoid](#anyofwithoneemptyschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1BoxedNumber](#anyofwithoneemptyschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1BoxedBoolean](#anyofwithoneemptyschema1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1BoxedMap](#anyofwithoneemptyschema1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1BoxedList](#anyofwithoneemptyschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AnyofWithOneEmptySchema1Boxed](#anyofwithoneemptyschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedVoid](#schema1boxedvoid),
[Schema1BoxedBoolean](#schema1boxedboolean),
[Schema1BoxedNumber](#schema1boxednumber),
[Schema1BoxedString](#schema1boxedstring),
[Schema1BoxedList](#schema1boxedlist),
[Schema1BoxedMap](#schema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedVoid
data class Schema1BoxedVoid<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedBoolean
data class Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

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

## Schema1BoxedString
data class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedList
data class Schema1BoxedList<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1BoxedMap
data class Schema1BoxedMap<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Schema0
class Schema0<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
