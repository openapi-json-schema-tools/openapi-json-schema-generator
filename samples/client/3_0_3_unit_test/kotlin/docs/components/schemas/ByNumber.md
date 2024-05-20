# ByNumber
org.openapijsonschematools.client.components.schemas.ByNumber.java
class ByNumber<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ByNumber.ByNumber1Boxed](#bynumber1boxed)<br> sealed interface for validated payloads |
| record | [ByNumber.ByNumber1BoxedVoid](#bynumber1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ByNumber.ByNumber1BoxedBoolean](#bynumber1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ByNumber.ByNumber1BoxedNumber](#bynumber1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ByNumber.ByNumber1BoxedString](#bynumber1boxedstring)<br> boxed class to store validated String payloads |
| record | [ByNumber.ByNumber1BoxedList](#bynumber1boxedlist)<br> boxed class to store validated List payloads |
| record | [ByNumber.ByNumber1BoxedMap](#bynumber1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ByNumber.ByNumber1](#bynumber1)<br> schema class |

## ByNumber1Boxed
sealed interface ByNumber1Boxed<br>
permits<br>
[ByNumber1BoxedVoid](#bynumber1boxedvoid),
[ByNumber1BoxedBoolean](#bynumber1boxedboolean),
[ByNumber1BoxedNumber](#bynumber1boxednumber),
[ByNumber1BoxedString](#bynumber1boxedstring),
[ByNumber1BoxedList](#bynumber1boxedlist),
[ByNumber1BoxedMap](#bynumber1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ByNumber1BoxedVoid
data class ByNumber1BoxedVoid<br>
implements [ByNumber1Boxed](#bynumber1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1BoxedBoolean
data class ByNumber1BoxedBoolean<br>
implements [ByNumber1Boxed](#bynumber1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1BoxedNumber
data class ByNumber1BoxedNumber<br>
implements [ByNumber1Boxed](#bynumber1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1BoxedString
data class ByNumber1BoxedString<br>
implements [ByNumber1Boxed](#bynumber1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1BoxedList
data class ByNumber1BoxedList<br>
implements [ByNumber1Boxed](#bynumber1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1BoxedMap
data class ByNumber1BoxedMap<br>
implements [ByNumber1Boxed](#bynumber1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ByNumber1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ByNumber1
class ByNumber1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| BigDecimal | multipleOf = BigDecimal("1.5") |

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
| [ByNumber1BoxedString](#bynumber1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ByNumber1BoxedVoid](#bynumber1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ByNumber1BoxedNumber](#bynumber1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ByNumber1BoxedBoolean](#bynumber1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ByNumber1BoxedMap](#bynumber1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ByNumber1BoxedList](#bynumber1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ByNumber1Boxed](#bynumber1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
