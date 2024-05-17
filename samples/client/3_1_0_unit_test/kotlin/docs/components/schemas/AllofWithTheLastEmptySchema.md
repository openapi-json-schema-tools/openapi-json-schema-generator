# AllofWithTheLastEmptySchema
org.openapijsonschematools.client.components.schemas.AllofWithTheLastEmptySchema.java
class AllofWithTheLastEmptySchema<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheLastEmptySchema.AllofWithTheLastEmptySchema1](#allofwiththelastemptyschema1)<br> schema class |
| sealed interface | [AllofWithTheLastEmptySchema.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTheLastEmptySchema.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTheLastEmptySchema.Schema1](#schema1)<br> schema class |
| sealed interface | [AllofWithTheLastEmptySchema.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTheLastEmptySchema.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AllofWithTheLastEmptySchema.Schema0](#schema0)<br> schema class |

## AllofWithTheLastEmptySchema1Boxed
sealed interface AllofWithTheLastEmptySchema1Boxed<br>
permits<br>
[AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid),
[AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean),
[AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber),
[AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring),
[AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist),
[AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithTheLastEmptySchema1BoxedVoid
data class AllofWithTheLastEmptySchema1BoxedVoid<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedBoolean
data class AllofWithTheLastEmptySchema1BoxedBoolean<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedNumber
data class AllofWithTheLastEmptySchema1BoxedNumber<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedString
data class AllofWithTheLastEmptySchema1BoxedString<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedList
data class AllofWithTheLastEmptySchema1BoxedList<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1BoxedMap
data class AllofWithTheLastEmptySchema1BoxedMap<br>
implements [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTheLastEmptySchema1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTheLastEmptySchema1
class AllofWithTheLastEmptySchema1<br>
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
| int | validate(arg: int, configuration: SchemaConfiguration) |
| long | validate(arg: long, configuration: SchemaConfiguration) |
| float | validate(arg: float, configuration: SchemaConfiguration) |
| double | validate(arg: double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| boolean | validate(arg: boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedString](#allofwiththelastemptyschema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedVoid](#allofwiththelastemptyschema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedNumber](#allofwiththelastemptyschema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedBoolean](#allofwiththelastemptyschema1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedMap](#allofwiththelastemptyschema1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1BoxedList](#allofwiththelastemptyschema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofWithTheLastEmptySchema1Boxed](#allofwiththelastemptyschema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
