# ValidateAgainstCorrectBranchThenVsElse
org.openapijsonschematools.client.components.schemas.ValidateAgainstCorrectBranchThenVsElse.java
class ValidateAgainstCorrectBranchThenVsElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)<br> sealed interface for validated payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring)<br> boxed class to store validated String payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist)<br> boxed class to store validated List payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)<br> boxed class to store validated Map payloads |
| class | [ValidateAgainstCorrectBranchThenVsElse.ValidateAgainstCorrectBranchThenVsElse1](#validateagainstcorrectbranchthenvselse1)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| class | [ValidateAgainstCorrectBranchThenVsElse.Then](#then)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [ValidateAgainstCorrectBranchThenVsElse.IfSchema](#ifschema)<br> schema class |
| sealed interface | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [ValidateAgainstCorrectBranchThenVsElse.ElseSchema](#elseschema)<br> schema class |

## ValidateAgainstCorrectBranchThenVsElse1Boxed
sealed interface ValidateAgainstCorrectBranchThenVsElse1Boxed<br>
permits<br>
[ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid),
[ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean),
[ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber),
[ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring),
[ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist),
[ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ValidateAgainstCorrectBranchThenVsElse1BoxedVoid
data class ValidateAgainstCorrectBranchThenVsElse1BoxedVoid<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean
data class ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedNumber
data class ValidateAgainstCorrectBranchThenVsElse1BoxedNumber<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedString
data class ValidateAgainstCorrectBranchThenVsElse1BoxedString<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedList
data class ValidateAgainstCorrectBranchThenVsElse1BoxedList<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1BoxedMap
data class ValidateAgainstCorrectBranchThenVsElse1BoxedMap<br>
implements [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ValidateAgainstCorrectBranchThenVsElse1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ValidateAgainstCorrectBranchThenVsElse1
class ValidateAgainstCorrectBranchThenVsElse1<br>
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
| [ValidateAgainstCorrectBranchThenVsElse1BoxedString](#validateagainstcorrectbranchthenvselse1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedVoid](#validateagainstcorrectbranchthenvselse1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedNumber](#validateagainstcorrectbranchthenvselse1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedBoolean](#validateagainstcorrectbranchthenvselse1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedMap](#validateagainstcorrectbranchthenvselse1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1BoxedList](#validateagainstcorrectbranchthenvselse1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ValidateAgainstCorrectBranchThenVsElse1Boxed](#validateagainstcorrectbranchthenvselse1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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

data class that stores validated boolean payloads, sealed permits implementation

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
| Number | minimum = -10 |

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

data class that stores validated boolean payloads, sealed permits implementation

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
| Number | exclusiveMaximum = 0 |

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

data class that stores validated boolean payloads, sealed permits implementation

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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
