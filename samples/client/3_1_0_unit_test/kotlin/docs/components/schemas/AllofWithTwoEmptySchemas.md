# AllofWithTwoEmptySchemas
org.openapijsonschematools.client.components.schemas.AllofWithTwoEmptySchemas.java
class AllofWithTwoEmptySchemas<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.AllofWithTwoEmptySchemas1](#allofwithtwoemptyschemas1)<br> schema class |
| sealed interface | [AllofWithTwoEmptySchemas.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema1](#schema1)<br> schema class |
| sealed interface | [AllofWithTwoEmptySchemas.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [AllofWithTwoEmptySchemas.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AllofWithTwoEmptySchemas.Schema0](#schema0)<br> schema class |

## AllofWithTwoEmptySchemas1Boxed
sealed interface AllofWithTwoEmptySchemas1Boxed<br>
permits<br>
[AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid),
[AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean),
[AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber),
[AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring),
[AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist),
[AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofWithTwoEmptySchemas1BoxedVoid
data class AllofWithTwoEmptySchemas1BoxedVoid<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedBoolean
data class AllofWithTwoEmptySchemas1BoxedBoolean<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedNumber
data class AllofWithTwoEmptySchemas1BoxedNumber<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedString
data class AllofWithTwoEmptySchemas1BoxedString<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedList
data class AllofWithTwoEmptySchemas1BoxedList<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1BoxedMap
data class AllofWithTwoEmptySchemas1BoxedMap<br>
implements [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofWithTwoEmptySchemas1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofWithTwoEmptySchemas1
class AllofWithTwoEmptySchemas1<br>
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
| [AllofWithTwoEmptySchemas1BoxedString](#allofwithtwoemptyschemas1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1BoxedVoid](#allofwithtwoemptyschemas1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1BoxedNumber](#allofwithtwoemptyschemas1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1BoxedBoolean](#allofwithtwoemptyschemas1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1BoxedMap](#allofwithtwoemptyschemas1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1BoxedList](#allofwithtwoemptyschemas1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofWithTwoEmptySchemas1Boxed](#allofwithtwoemptyschemas1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
extends AnyTypeJsonSchema.AnyTypeJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.AnyTypeJsonSchema.AnyTypeJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
