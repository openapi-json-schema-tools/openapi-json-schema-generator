# Ipv6Format
org.openapijsonschematools.client.components.schemas.Ipv6Format.java
class Ipv6Format<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [Ipv6Format.Ipv6Format1Boxed](#ipv6format1boxed)<br> sealed interface for validated payloads |
| record | [Ipv6Format.Ipv6Format1BoxedVoid](#ipv6format1boxedvoid)<br> boxed class to store validated null payloads |
| record | [Ipv6Format.Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [Ipv6Format.Ipv6Format1BoxedNumber](#ipv6format1boxednumber)<br> boxed class to store validated Number payloads |
| record | [Ipv6Format.Ipv6Format1BoxedString](#ipv6format1boxedstring)<br> boxed class to store validated String payloads |
| record | [Ipv6Format.Ipv6Format1BoxedList](#ipv6format1boxedlist)<br> boxed class to store validated List payloads |
| record | [Ipv6Format.Ipv6Format1BoxedMap](#ipv6format1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [Ipv6Format.Ipv6Format1](#ipv6format1)<br> schema class |

## Ipv6Format1Boxed
sealed interface Ipv6Format1Boxed<br>
permits<br>
[Ipv6Format1BoxedVoid](#ipv6format1boxedvoid),
[Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean),
[Ipv6Format1BoxedNumber](#ipv6format1boxednumber),
[Ipv6Format1BoxedString](#ipv6format1boxedstring),
[Ipv6Format1BoxedList](#ipv6format1boxedlist),
[Ipv6Format1BoxedMap](#ipv6format1boxedmap)

sealed interface that stores validated payloads using boxed classes

## Ipv6Format1BoxedVoid
data class Ipv6Format1BoxedVoid<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1BoxedBoolean
data class Ipv6Format1BoxedBoolean<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1BoxedNumber
data class Ipv6Format1BoxedNumber<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1BoxedString
data class Ipv6Format1BoxedString<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1BoxedList
data class Ipv6Format1BoxedList<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1BoxedMap
data class Ipv6Format1BoxedMap<br>
implements [Ipv6Format1Boxed](#ipv6format1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Ipv6Format1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Ipv6Format1
class Ipv6Format1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "ipv6"; |

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
| [Ipv6Format1BoxedString](#ipv6format1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [Ipv6Format1BoxedVoid](#ipv6format1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [Ipv6Format1BoxedNumber](#ipv6format1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [Ipv6Format1BoxedBoolean](#ipv6format1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [Ipv6Format1BoxedMap](#ipv6format1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [Ipv6Format1BoxedList](#ipv6format1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [Ipv6Format1Boxed](#ipv6format1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
