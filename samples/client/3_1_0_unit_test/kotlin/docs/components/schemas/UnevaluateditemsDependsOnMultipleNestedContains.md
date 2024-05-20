# UnevaluateditemsDependsOnMultipleNestedContains
org.openapijsonschematools.client.components.schemas.UnevaluateditemsDependsOnMultipleNestedContains.java
class UnevaluateditemsDependsOnMultipleNestedContains<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluateditemsDependsOnMultipleNestedContains1](#unevaluateditemsdependsonmultiplenestedcontains1)<br> schema class |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.UnevaluatedItems](#unevaluateditems)<br> schema class |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedVoid](#schema1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedNumber](#schema1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedList](#schema1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1BoxedMap](#schema1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema1](#schema1)<br> schema class |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1Boxed](#contains1boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedVoid](#contains1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedBoolean](#contains1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedNumber](#contains1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedString](#contains1boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedList](#contains1boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1BoxedMap](#contains1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains1](#contains1)<br> schema class |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Schema0](#schema0)<br> schema class |
| sealed interface | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| record | [UnevaluateditemsDependsOnMultipleNestedContains.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [UnevaluateditemsDependsOnMultipleNestedContains.Contains](#contains)<br> schema class |

## UnevaluateditemsDependsOnMultipleNestedContains1Boxed
sealed interface UnevaluateditemsDependsOnMultipleNestedContains1Boxed<br>
permits<br>
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist),
[UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedString
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedString<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedList
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedList<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap
data class UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap<br>
implements [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsDependsOnMultipleNestedContains1
class UnevaluateditemsDependsOnMultipleNestedContains1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>;)<br> |
| Class<? extends JsonSchema> | unevaluatedItems = [UnevaluatedItems::class.java](#unevaluateditems) |

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
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedString](#unevaluateditemsdependsonmultiplenestedcontains1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedVoid](#unevaluateditemsdependsonmultiplenestedcontains1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedNumber](#unevaluateditemsdependsonmultiplenestedcontains1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedBoolean](#unevaluateditemsdependsonmultiplenestedcontains1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedMap](#unevaluateditemsdependsonmultiplenestedcontains1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1BoxedList](#unevaluateditemsdependsonmultiplenestedcontains1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluateditemsDependsOnMultipleNestedContains1Boxed](#unevaluateditemsdependsonmultiplenestedcontains1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedItemsBoxed
sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid),
[UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean),
[UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber),
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring),
[UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist),
[UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedVoid
data class UnevaluatedItemsBoxedVoid<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItemsBoxedBoolean
data class UnevaluatedItemsBoxedBoolean<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItemsBoxedNumber
data class UnevaluatedItemsBoxedNumber<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItemsBoxedString
data class UnevaluatedItemsBoxedString<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItemsBoxedList
data class UnevaluatedItemsBoxedList<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItemsBoxedMap
data class UnevaluatedItemsBoxedMap<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItems
class UnevaluatedItems<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("5") |

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
| [UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxedVoid](#unevaluateditemsboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxedNumber](#unevaluateditemsboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxedBoolean](#unevaluateditemsboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxedMap](#unevaluateditemsboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxedList](#unevaluateditemsboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UnevaluatedItemsBoxed](#unevaluateditemsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains1::class.java](#contains1) |

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
| [Schema1BoxedString](#schema1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema1BoxedVoid](#schema1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema1BoxedNumber](#schema1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema1BoxedBoolean](#schema1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Schema1BoxedMap](#schema1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [Schema1BoxedList](#schema1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema1Boxed](#schema1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Contains1Boxed
sealed interface Contains1Boxed<br>
permits<br>
[Contains1BoxedVoid](#contains1boxedvoid),
[Contains1BoxedBoolean](#contains1boxedboolean),
[Contains1BoxedNumber](#contains1boxednumber),
[Contains1BoxedString](#contains1boxedstring),
[Contains1BoxedList](#contains1boxedlist),
[Contains1BoxedMap](#contains1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Contains1BoxedVoid
data class Contains1BoxedVoid<br>
implements [Contains1Boxed](#contains1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1BoxedBoolean
data class Contains1BoxedBoolean<br>
implements [Contains1Boxed](#contains1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1BoxedNumber
data class Contains1BoxedNumber<br>
implements [Contains1Boxed](#contains1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1BoxedString
data class Contains1BoxedString<br>
implements [Contains1Boxed](#contains1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1BoxedList
data class Contains1BoxedList<br>
implements [Contains1Boxed](#contains1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1BoxedMap
data class Contains1BoxedMap<br>
implements [Contains1Boxed](#contains1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Contains1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains1
class Contains1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("3") |

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
| [Contains1BoxedString](#contains1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Contains1BoxedVoid](#contains1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Contains1BoxedNumber](#contains1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Contains1BoxedBoolean](#contains1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [Contains1BoxedMap](#contains1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [Contains1BoxedList](#contains1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Contains1Boxed](#contains1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| Class<? extends JsonSchema> | contains = [Contains::class.java](#contains) |

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

## ContainsBoxed
sealed interface ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid),
[ContainsBoxedBoolean](#containsboxedboolean),
[ContainsBoxedNumber](#containsboxednumber),
[ContainsBoxedString](#containsboxedstring),
[ContainsBoxedList](#containsboxedlist),
[ContainsBoxedMap](#containsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsBoxedVoid
data class ContainsBoxedVoid<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedBoolean
data class ContainsBoxedBoolean<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedNumber
data class ContainsBoxedNumber<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedString
data class ContainsBoxedString<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedList
data class ContainsBoxedList<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedMap
data class ContainsBoxedMap<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains
class Contains<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("2") |

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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ContainsBoxed](#containsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
