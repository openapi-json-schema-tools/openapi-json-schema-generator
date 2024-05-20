# IgnoreIfWithoutThenOrElse
org.openapijsonschematools.client.components.schemas.IgnoreIfWithoutThenOrElse.java
class IgnoreIfWithoutThenOrElse<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)<br> sealed interface for validated payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreIfWithoutThenOrElse.IgnoreIfWithoutThenOrElse1](#ignoreifwithoutthenorelse1)<br> schema class |
| sealed interface | [IgnoreIfWithoutThenOrElse.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreIfWithoutThenOrElse.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreIfWithoutThenOrElse.IfSchema](#ifschema)<br> schema class |
| enum | [IgnoreIfWithoutThenOrElse.StringIfConst](#stringifconst)<br>String enum |

## IgnoreIfWithoutThenOrElse1Boxed
sealed interface IgnoreIfWithoutThenOrElse1Boxed<br>
permits<br>
[IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid),
[IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean),
[IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber),
[IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring),
[IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist),
[IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreIfWithoutThenOrElse1BoxedVoid
data class IgnoreIfWithoutThenOrElse1BoxedVoid<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedBoolean
data class IgnoreIfWithoutThenOrElse1BoxedBoolean<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedNumber
data class IgnoreIfWithoutThenOrElse1BoxedNumber<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedString
data class IgnoreIfWithoutThenOrElse1BoxedString<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedList
data class IgnoreIfWithoutThenOrElse1BoxedList<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1BoxedMap
data class IgnoreIfWithoutThenOrElse1BoxedMap<br>
implements [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreIfWithoutThenOrElse1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreIfWithoutThenOrElse1
class IgnoreIfWithoutThenOrElse1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema::class.java](#ifschema) |

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
| [IgnoreIfWithoutThenOrElse1BoxedString](#ignoreifwithoutthenorelse1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1BoxedVoid](#ignoreifwithoutthenorelse1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1BoxedNumber](#ignoreifwithoutthenorelse1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1BoxedBoolean](#ignoreifwithoutthenorelse1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1BoxedMap](#ignoreifwithoutthenorelse1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1BoxedList](#ignoreifwithoutthenorelse1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IgnoreIfWithoutThenOrElse1Boxed](#ignoreifwithoutthenorelse1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IfSchemaBoxedList](#ifschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfSchemaBoxed](#ifschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringIfConst
public enum StringIfConst<br>
extends `Enum<StringIfConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
