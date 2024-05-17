# IfAndElseWithoutThen
org.openapijsonschematools.client.components.schemas.IfAndElseWithoutThen.java
class IfAndElseWithoutThen<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IfAndElseWithoutThen.IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.IfAndElseWithoutThen1](#ifandelsewithoutthen1)<br> schema class |
| sealed interface | [IfAndElseWithoutThen.IfSchemaBoxed](#ifschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedVoid](#ifschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedBoolean](#ifschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedNumber](#ifschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedString](#ifschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedList](#ifschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.IfSchemaBoxedMap](#ifschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.IfSchema](#ifschema)<br> schema class |
| sealed interface | [IfAndElseWithoutThen.ElseSchemaBoxed](#elseschemaboxed)<br> sealed interface for validated payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedVoid](#elseschemaboxedvoid)<br> boxed class to store validated null payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedBoolean](#elseschemaboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedNumber](#elseschemaboxednumber)<br> boxed class to store validated Number payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedString](#elseschemaboxedstring)<br> boxed class to store validated String payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedList](#elseschemaboxedlist)<br> boxed class to store validated List payloads |
| record | [IfAndElseWithoutThen.ElseSchemaBoxedMap](#elseschemaboxedmap)<br> boxed class to store validated Map payloads |
| static class | [IfAndElseWithoutThen.ElseSchema](#elseschema)<br> schema class |

## IfAndElseWithoutThen1Boxed
sealed interface IfAndElseWithoutThen1Boxed<br>
permits<br>
[IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid),
[IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean),
[IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber),
[IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring),
[IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist),
[IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IfAndElseWithoutThen1BoxedVoid
data class IfAndElseWithoutThen1BoxedVoid<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedBoolean
data class IfAndElseWithoutThen1BoxedBoolean<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedNumber
data class IfAndElseWithoutThen1BoxedNumber<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedString
data class IfAndElseWithoutThen1BoxedString<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedList
data class IfAndElseWithoutThen1BoxedList<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1BoxedMap
data class IfAndElseWithoutThen1BoxedMap<br>
implements [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IfAndElseWithoutThen1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IfAndElseWithoutThen1
class IfAndElseWithoutThen1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | if = [IfSchema::class.java](#ifschema) |
| Class<? extends JsonSchema> | elseSchema = [ElseSchema::class.java](#elseschema) |

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
| [IfAndElseWithoutThen1BoxedString](#ifandelsewithoutthen1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1BoxedVoid](#ifandelsewithoutthen1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1BoxedNumber](#ifandelsewithoutthen1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1BoxedBoolean](#ifandelsewithoutthen1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1BoxedMap](#ifandelsewithoutthen1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1BoxedList](#ifandelsewithoutthen1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IfAndElseWithoutThen1Boxed](#ifandelsewithoutthen1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| Number | exclusiveMaximum = 0 |

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
| [IfSchemaBoxedString](#ifschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IfSchemaBoxedVoid](#ifschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IfSchemaBoxedNumber](#ifschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IfSchemaBoxedBoolean](#ifschemaboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [IfSchemaBoxedMap](#ifschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
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
| [ElseSchemaBoxedString](#elseschemaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedVoid](#elseschemaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedNumber](#elseschemaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedBoolean](#elseschemaboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedMap](#elseschemaboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ElseSchemaBoxedList](#elseschemaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ElseSchemaBoxed](#elseschemaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
