# BySmallNumber
org.openapijsonschematools.client.components.schemas.BySmallNumber.java
class BySmallNumber<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [BySmallNumber.BySmallNumber1Boxed](#bysmallnumber1boxed)<br> sealed interface for validated payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedString](#bysmallnumber1boxedstring)<br> boxed class to store validated String payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedList](#bysmallnumber1boxedlist)<br> boxed class to store validated List payloads |
| data class | [BySmallNumber.BySmallNumber1BoxedMap](#bysmallnumber1boxedmap)<br> boxed class to store validated Map payloads |
| class | [BySmallNumber.BySmallNumber1](#bysmallnumber1)<br> schema class |

## BySmallNumber1Boxed
sealed interface BySmallNumber1Boxed<br>
permits<br>
[BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid),
[BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean),
[BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber),
[BySmallNumber1BoxedString](#bysmallnumber1boxedstring),
[BySmallNumber1BoxedList](#bysmallnumber1boxedlist),
[BySmallNumber1BoxedMap](#bysmallnumber1boxedmap)

sealed interface that stores validated payloads using boxed classes

## BySmallNumber1BoxedVoid
data class BySmallNumber1BoxedVoid<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1BoxedBoolean
data class BySmallNumber1BoxedBoolean<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1BoxedNumber
data class BySmallNumber1BoxedNumber<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1BoxedString
data class BySmallNumber1BoxedString<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1BoxedList
data class BySmallNumber1BoxedList<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1BoxedMap
data class BySmallNumber1BoxedMap<br>
implements [BySmallNumber1Boxed](#bysmallnumber1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BySmallNumber1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## BySmallNumber1
class BySmallNumber1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("0.00010") |

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
| [BySmallNumber1BoxedString](#bysmallnumber1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [BySmallNumber1BoxedVoid](#bysmallnumber1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [BySmallNumber1BoxedNumber](#bysmallnumber1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [BySmallNumber1BoxedBoolean](#bysmallnumber1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [BySmallNumber1BoxedMap](#bysmallnumber1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [BySmallNumber1BoxedList](#bysmallnumber1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [BySmallNumber1Boxed](#bysmallnumber1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
