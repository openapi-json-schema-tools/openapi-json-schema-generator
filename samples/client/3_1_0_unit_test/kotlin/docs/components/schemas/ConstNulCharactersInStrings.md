# ConstNulCharactersInStrings
org.openapijsonschematools.client.components.schemas.ConstNulCharactersInStrings.java
class ConstNulCharactersInStrings<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- enum classes

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)<br> sealed interface for validated payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring)<br> boxed class to store validated String payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist)<br> boxed class to store validated List payloads |
| data class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)<br> boxed class to store validated Map payloads |
| class | [ConstNulCharactersInStrings.ConstNulCharactersInStrings1](#constnulcharactersinstrings1)<br> schema class |
| enum | [ConstNulCharactersInStrings.StringConstNulCharactersInStringsConst](#stringconstnulcharactersinstringsconst)<br>String enum |

## ConstNulCharactersInStrings1Boxed
sealed interface ConstNulCharactersInStrings1Boxed<br>
permits<br>
[ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid),
[ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean),
[ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber),
[ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring),
[ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist),
[ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ConstNulCharactersInStrings1BoxedVoid
data class ConstNulCharactersInStrings1BoxedVoid<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedBoolean
data class ConstNulCharactersInStrings1BoxedBoolean<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedNumber
data class ConstNulCharactersInStrings1BoxedNumber<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedString
data class ConstNulCharactersInStrings1BoxedString<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedList
data class ConstNulCharactersInStrings1BoxedList<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1BoxedMap
data class ConstNulCharactersInStrings1BoxedMap<br>
implements [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ConstNulCharactersInStrings1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ConstNulCharactersInStrings1
class ConstNulCharactersInStrings1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Any? | constValue = JsonValue.of("hello\u0000there") |

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
| [ConstNulCharactersInStrings1BoxedString](#constnulcharactersinstrings1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1BoxedVoid](#constnulcharactersinstrings1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1BoxedNumber](#constnulcharactersinstrings1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1BoxedBoolean](#constnulcharactersinstrings1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1BoxedMap](#constnulcharactersinstrings1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1BoxedList](#constnulcharactersinstrings1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ConstNulCharactersInStrings1Boxed](#constnulcharactersinstrings1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## StringConstNulCharactersInStringsConst
public enum StringConstNulCharactersInStringsConst<br>
extends `Enum<StringConstNulCharactersInStringsConst>`

A class that stores String enum values

### Enum Constant Summary
| Enum Constant | Description |
| ------------- | ----------- |
| HELLO_NULL_THERE | value = "hello\u0000there" |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
