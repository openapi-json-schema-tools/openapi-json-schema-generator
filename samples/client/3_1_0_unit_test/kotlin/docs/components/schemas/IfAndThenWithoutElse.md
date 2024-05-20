# IfAndThenWithoutElse
org.openapijsonschematools.client.components.schemas.IfAndThenWithoutElse.java
class IfAndThenWithoutElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAndThenWithoutElse.IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)<br> sealed interface for validated payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IfAndThenWithoutElse.IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IfAndThenWithoutElse.IfAndThenWithoutElse1](#ifandthenwithoutelse1)<br> schema class |
| sealed interface | [IfAndThenWithoutElse.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| data class | [IfAndThenWithoutElse.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| class | [IfAndThenWithoutElse.Then](#then)<br> schema class |
| sealed interface | [IfAndThenWithoutElse.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [IfAndThenWithoutElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [IfAndThenWithoutElse.IfSchema](#ifschema)<br> schema class |

## IfAndThenWithoutElse1Boxed
sealed interface IfAndThenWithoutElse1Boxed<br>
permits<br>
[IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid),
[IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean),
[IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber),
[IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring),
[IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist),
[IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAndThenWithoutElse1BoxedVoid
data class IfAndThenWithoutElse1BoxedVoid<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedBoolean
data class IfAndThenWithoutElse1BoxedBoolean<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedNumber
data class IfAndThenWithoutElse1BoxedNumber<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedString
data class IfAndThenWithoutElse1BoxedString<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedList
data class IfAndThenWithoutElse1BoxedList<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1BoxedMap
data class IfAndThenWithoutElse1BoxedMap<br>
implements [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndThenWithoutElse1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndThenWithoutElse1
class IfAndThenWithoutElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema::class.java](#ifschema) |
| Class<? extends JsonSchema> | then = [Then::class.java](#then) |

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
| [IfAndThenWithoutElse1BoxedString](#ifandthenwithoutelse1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1BoxedVoid](#ifandthenwithoutelse1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1BoxedNumber](#ifandthenwithoutelse1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1BoxedBoolean](#ifandthenwithoutelse1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1BoxedMap](#ifandthenwithoutelse1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1BoxedList](#ifandthenwithoutelse1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfAndThenWithoutElse1Boxed](#ifandthenwithoutelse1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
