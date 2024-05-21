# AllofCombinedWithAnyofOneof
org.openapijsonschematools.client.components.schemas.AllofCombinedWithAnyofOneof.java
class AllofCombinedWithAnyofOneof<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)<br> sealed interface for validated payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofCombinedWithAnyofOneof.AllofCombinedWithAnyofOneof1](#allofcombinedwithanyofoneof1)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedList](#schema0boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema0BoxedMap](#schema0boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofCombinedWithAnyofOneof.Schema0](#schema0)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema01Boxed](#schema01boxed)<br> sealed interface for validated payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedVoid](#schema01boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedBoolean](#schema01boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedNumber](#schema01boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedString](#schema01boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedList](#schema01boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema01BoxedMap](#schema01boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofCombinedWithAnyofOneof.Schema01](#schema01)<br> schema class |
| sealed interface | [AllofCombinedWithAnyofOneof.Schema02Boxed](#schema02boxed)<br> sealed interface for validated payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedVoid](#schema02boxedvoid)<br> boxed class to store validated null payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedBoolean](#schema02boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedNumber](#schema02boxednumber)<br> boxed class to store validated Number payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedString](#schema02boxedstring)<br> boxed class to store validated String payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedList](#schema02boxedlist)<br> boxed class to store validated List payloads |
| data class | [AllofCombinedWithAnyofOneof.Schema02BoxedMap](#schema02boxedmap)<br> boxed class to store validated Map payloads |
| class | [AllofCombinedWithAnyofOneof.Schema02](#schema02)<br> schema class |

## AllofCombinedWithAnyofOneof1Boxed
sealed interface AllofCombinedWithAnyofOneof1Boxed<br>
permits<br>
[AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid),
[AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean),
[AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber),
[AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring),
[AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist),
[AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AllofCombinedWithAnyofOneof1BoxedVoid
data class AllofCombinedWithAnyofOneof1BoxedVoid<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedBoolean
data class AllofCombinedWithAnyofOneof1BoxedBoolean<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedNumber
data class AllofCombinedWithAnyofOneof1BoxedNumber<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedString
data class AllofCombinedWithAnyofOneof1BoxedString<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedList
data class AllofCombinedWithAnyofOneof1BoxedList<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1BoxedMap
data class AllofCombinedWithAnyofOneof1BoxedMap<br>
implements [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AllofCombinedWithAnyofOneof1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AllofCombinedWithAnyofOneof1
class AllofCombinedWithAnyofOneof1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | allOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema02::class.java](#schema02)<br>)<br> |
| List<Class<? extends JsonSchema>> | anyOf = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema01::class.java](#schema01)<br>)<br> |
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
| [AllofCombinedWithAnyofOneof1BoxedString](#allofcombinedwithanyofoneof1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1BoxedVoid](#allofcombinedwithanyofoneof1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1BoxedNumber](#allofcombinedwithanyofoneof1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1BoxedBoolean](#allofcombinedwithanyofoneof1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1BoxedMap](#allofcombinedwithanyofoneof1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1BoxedList](#allofcombinedwithanyofoneof1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AllofCombinedWithAnyofOneof1Boxed](#allofcombinedwithanyofoneof1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
[Schema01BoxedVoid](#schema01boxedvoid),
[Schema01BoxedBoolean](#schema01boxedboolean),
[Schema01BoxedNumber](#schema01boxednumber),
[Schema01BoxedString](#schema01boxedstring),
[Schema01BoxedList](#schema01boxedlist),
[Schema01BoxedMap](#schema01boxedmap)

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

## Schema01BoxedBoolean
data class Schema01BoxedBoolean<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01BoxedNumber
data class Schema01BoxedNumber<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01BoxedString
data class Schema01BoxedString<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01BoxedList
data class Schema01BoxedList<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01BoxedMap
data class Schema01BoxedMap<br>
implements [Schema01Boxed](#schema01boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema01BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema01
class Schema01<br>
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
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema01BoxedString](#schema01boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema01BoxedVoid](#schema01boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema01BoxedNumber](#schema01boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema01BoxedBoolean](#schema01boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema01BoxedMap](#schema01boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema01BoxedList](#schema01boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema01Boxed](#schema01boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema02Boxed
sealed interface Schema02Boxed<br>
permits<br>
[Schema02BoxedVoid](#schema02boxedvoid),
[Schema02BoxedBoolean](#schema02boxedboolean),
[Schema02BoxedNumber](#schema02boxednumber),
[Schema02BoxedString](#schema02boxedstring),
[Schema02BoxedList](#schema02boxedlist),
[Schema02BoxedMap](#schema02boxedmap)

sealed interface that stores validated payloads using boxed classes

## Schema02BoxedVoid
data class Schema02BoxedVoid<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02BoxedBoolean
data class Schema02BoxedBoolean<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02BoxedNumber
data class Schema02BoxedNumber<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02BoxedString
data class Schema02BoxedString<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02BoxedList
data class Schema02BoxedList<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02BoxedMap
data class Schema02BoxedMap<br>
implements [Schema02Boxed](#schema02boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema02BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema02
class Schema02<br>
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
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [Schema02BoxedString](#schema02boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Schema02BoxedVoid](#schema02boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Schema02BoxedNumber](#schema02boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Schema02BoxedBoolean](#schema02boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Schema02BoxedMap](#schema02boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Schema02BoxedList](#schema02boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Schema02Boxed](#schema02boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
