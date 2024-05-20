# IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence
org.openapijsonschematools.client.components.schemas.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.java
class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1](#ifappearsattheendwhenserializedkeywordprocessingsequence1)<br> schema class |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.Then](#then)<br> schema class |
| enum | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.StringThenConst](#stringthenconst)<br>String enum |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.IfSchema](#ifschema)<br> schema class |
| sealed interface | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.ElseSchema](#elseschema)<br> schema class |
| enum | [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence.StringElseConst](#stringelseconst)<br>String enum |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed
sealed interface IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed<br>
permits<br>
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist),
[IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap
data class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap<br>
implements [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1
class IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema::class.java](#ifschema) |
| Class<? extends JsonSchema> | then = [Then::class.java](#then) |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema::class.java](#elseschema) |

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
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedString](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedVoid](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedNumber](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedBoolean](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedMap](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1BoxedList](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfAppearsAtTheEndWhenSerializedKeywordProcessingSequence1Boxed](#ifappearsattheendwhenserializedkeywordprocessingsequence1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ThenBoxed
sealed interface ThenBoxed<br>
permits<br>
[ThenBoxedVoid](#thenboxedvoid),
[ThenBoxedBoolean](#thenboxedboolean),
[ThenBoxedNumber](#thenboxednumber),
[ThenBoxedString](#thenboxedstring),
[ThenBoxedList](#thenboxedlist),
[ThenBoxedMap](#thenboxedmap)

sealed interface that stores validated payloads using boxed classes

## ThenBoxedVoid
data class ThenBoxedVoid<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedBoolean
data class ThenBoxedBoolean<br>
implements [ThenBoxed](#thenboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedNumber
data class ThenBoxedNumber<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedString
data class ThenBoxedString<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedList
data class ThenBoxedList<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ThenBoxedMap
data class ThenBoxedMap<br>
implements [ThenBoxed](#thenboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ThenBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Then
class Then<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Any? | constValue = "yes" |

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
| [ThenBoxedString](#thenboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ThenBoxedVoid](#thenboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ThenBoxedNumber](#thenboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ThenBoxedBoolean](#thenboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ThenBoxedMap](#thenboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ThenBoxedList](#thenboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ThenBoxed](#thenboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringThenConst
public enum StringThenConst<br>
extends `Enum<StringThenConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| YES | value = "yes" |

## IfSchemaBoxed
sealed interface IfSchemaBoxed<br>
permits<br>
[IfSchemaBoxedVoid](#ifschemaboxedvoid),
[IfSchemaBoxedBoolean](#ifschemaboxedboolean),
[IfSchemaBoxedNumber](#ifschemaboxednumber),
[IfSchemaBoxedString](#ifschemaboxedstring),
[IfSchemaBoxedList](#ifschemaboxedlist),
[IfSchemaBoxedMap](#ifschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## IfSchemaBoxedVoid
data class IfSchemaBoxedVoid<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedBoolean
data class IfSchemaBoxedBoolean<br>
implements [IfSchemaBoxed](#ifschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedNumber
data class IfSchemaBoxedNumber<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedString
data class IfSchemaBoxedString<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedList
data class IfSchemaBoxedList<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchemaBoxedMap
data class IfSchemaBoxedMap<br>
implements [IfSchemaBoxed](#ifschemaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfSchemaBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfSchema
class IfSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Int | maxLength = 4 |

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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfSchemaBoxed](#ifschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ElseSchemaBoxed
sealed interface ElseSchemaBoxed<br>
permits<br>
[ElseSchemaBoxedVoid](#elseschemaboxedvoid),
[ElseSchemaBoxedBoolean](#elseschemaboxedboolean),
[ElseSchemaBoxedNumber](#elseschemaboxednumber),
[ElseSchemaBoxedString](#elseschemaboxedstring),
[ElseSchemaBoxedList](#elseschemaboxedlist),
[ElseSchemaBoxedMap](#elseschemaboxedmap)

sealed interface that stores validated payloads using boxed classes

## ElseSchemaBoxedVoid
data class ElseSchemaBoxedVoid<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedBoolean
data class ElseSchemaBoxedBoolean<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedNumber
data class ElseSchemaBoxedNumber<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedString
data class ElseSchemaBoxedString<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedList
data class ElseSchemaBoxedList<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchemaBoxedMap
data class ElseSchemaBoxedMap<br>
implements [ElseSchemaBoxed](#elseschemaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ElseSchemaBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ElseSchema
class ElseSchema<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Any? | constValue = "other" |

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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringElseConst
public enum StringElseConst<br>
extends `Enum<StringElseConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| OTHER | value = "other" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
