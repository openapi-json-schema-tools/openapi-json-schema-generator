# IgnoreElseWithoutIf
org.openapijsonschematools.client.components.schemas.IgnoreElseWithoutIf.java
class IgnoreElseWithoutIf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)<br> sealed interface for validated payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreElseWithoutIf.IgnoreElseWithoutIf1](#ignoreelsewithoutif1)<br> schema class |
| sealed interface | [IgnoreElseWithoutIf.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreElseWithoutIf.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreElseWithoutIf.ElseSchema](#elseschema)<br> schema class |
| enum | [IgnoreElseWithoutIf.StringElseConst](#stringelseconst)<br>String enum |

## IgnoreElseWithoutIf1Boxed
sealed interface IgnoreElseWithoutIf1Boxed<br>
permits<br>
[IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid),
[IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean),
[IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber),
[IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring),
[IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist),
[IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreElseWithoutIf1BoxedVoid
data class IgnoreElseWithoutIf1BoxedVoid<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedBoolean
data class IgnoreElseWithoutIf1BoxedBoolean<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedNumber
data class IgnoreElseWithoutIf1BoxedNumber<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedString
data class IgnoreElseWithoutIf1BoxedString<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedList
data class IgnoreElseWithoutIf1BoxedList<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1BoxedMap
data class IgnoreElseWithoutIf1BoxedMap<br>
implements [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreElseWithoutIf1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreElseWithoutIf1
class IgnoreElseWithoutIf1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [IgnoreElseWithoutIf1BoxedString](#ignoreelsewithoutif1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1BoxedVoid](#ignoreelsewithoutif1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1BoxedNumber](#ignoreelsewithoutif1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1BoxedBoolean](#ignoreelsewithoutif1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1BoxedMap](#ignoreelsewithoutif1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1BoxedList](#ignoreelsewithoutif1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IgnoreElseWithoutIf1Boxed](#ignoreelsewithoutif1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| Any? | constValue = "0" |

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
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
