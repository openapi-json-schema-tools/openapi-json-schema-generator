# RegexFormat
org.openapijsonschematools.client.components.schemas.RegexFormat.java
class RegexFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RegexFormat.RegexFormat1Boxed](#regexformat1boxed)<br> sealed interface for validated payloads |
| record | [RegexFormat.RegexFormat1BoxedVoid](#regexformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [RegexFormat.RegexFormat1BoxedBoolean](#regexformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [RegexFormat.RegexFormat1BoxedNumber](#regexformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [RegexFormat.RegexFormat1BoxedString](#regexformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [RegexFormat.RegexFormat1BoxedList](#regexformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [RegexFormat.RegexFormat1BoxedMap](#regexformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [RegexFormat.RegexFormat1](#regexformat1)<br> schema class |

## RegexFormat1Boxed
sealed interface RegexFormat1Boxed<br>
permits<br>
[RegexFormat1BoxedVoid](#regexformat1boxedvoid),
[RegexFormat1BoxedBoolean](#regexformat1boxedboolean),
[RegexFormat1BoxedNumber](#regexformat1boxednumber),
[RegexFormat1BoxedString](#regexformat1boxedstring),
[RegexFormat1BoxedList](#regexformat1boxedlist),
[RegexFormat1BoxedMap](#regexformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## RegexFormat1BoxedVoid
data class RegexFormat1BoxedVoid<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1BoxedBoolean
data class RegexFormat1BoxedBoolean<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1BoxedNumber
data class RegexFormat1BoxedNumber<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1BoxedString
data class RegexFormat1BoxedString<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1BoxedList
data class RegexFormat1BoxedList<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1BoxedMap
data class RegexFormat1BoxedMap<br>
implements [RegexFormat1Boxed](#regexformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RegexFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RegexFormat1
class RegexFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "regex"; |

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
| [RegexFormat1BoxedString](#regexformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [RegexFormat1BoxedVoid](#regexformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [RegexFormat1BoxedNumber](#regexformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [RegexFormat1BoxedBoolean](#regexformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [RegexFormat1BoxedMap](#regexformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [RegexFormat1BoxedList](#regexformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [RegexFormat1Boxed](#regexformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
