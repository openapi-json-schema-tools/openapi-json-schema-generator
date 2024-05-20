# IgnoreThenWithoutIf
org.openapijsonschematools.client.components.schemas.IgnoreThenWithoutIf.java
class IgnoreThenWithoutIf<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)<br> sealed interface for validated payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreThenWithoutIf.IgnoreThenWithoutIf1](#ignorethenwithoutif1)<br> schema class |
| sealed interface | [IgnoreThenWithoutIf.ThenBoxed](#thenboxed)<br> sealed interface for validated payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedVoid](#thenboxedvoid)<br> boxed class to store validated null payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedBoolean](#thenboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedNumber](#thenboxednumber)<br> boxed class to store validated Number payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedString](#thenboxedstring)<br> boxed class to store validated String payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedList](#thenboxedlist)<br> boxed class to store validated List payloads |
| data class | [IgnoreThenWithoutIf.ThenBoxedMap](#thenboxedmap)<br> boxed class to store validated Map payloads |
| class | [IgnoreThenWithoutIf.Then](#then)<br> schema class |
| enum | [IgnoreThenWithoutIf.StringThenConst](#stringthenconst)<br>String enum |

## IgnoreThenWithoutIf1Boxed
sealed interface IgnoreThenWithoutIf1Boxed<br>
permits<br>
[IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid),
[IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean),
[IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber),
[IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring),
[IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist),
[IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap)

sealed interface that stores validated payloads using boxed classes

## IgnoreThenWithoutIf1BoxedVoid
data class IgnoreThenWithoutIf1BoxedVoid<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedBoolean
data class IgnoreThenWithoutIf1BoxedBoolean<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedNumber
data class IgnoreThenWithoutIf1BoxedNumber<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedString
data class IgnoreThenWithoutIf1BoxedString<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedList
data class IgnoreThenWithoutIf1BoxedList<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1BoxedMap
data class IgnoreThenWithoutIf1BoxedMap<br>
implements [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| IgnoreThenWithoutIf1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## IgnoreThenWithoutIf1
class IgnoreThenWithoutIf1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [IgnoreThenWithoutIf1BoxedString](#ignorethenwithoutif1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1BoxedVoid](#ignorethenwithoutif1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1BoxedNumber](#ignorethenwithoutif1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1BoxedBoolean](#ignorethenwithoutif1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1BoxedMap](#ignorethenwithoutif1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1BoxedList](#ignorethenwithoutif1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [IgnoreThenWithoutIf1Boxed](#ignorethenwithoutif1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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
| POSITIVE_0 | value = "0" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
