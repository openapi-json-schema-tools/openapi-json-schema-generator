# UriTemplateFormat
org.openapijsonschematools.client.components.schemas.UriTemplateFormat.java
class UriTemplateFormat<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UriTemplateFormat.UriTemplateFormat1Boxed](#uritemplateformat1boxed)<br> sealed interface for validated payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring)<br> boxed class to store validated String payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist)<br> boxed class to store validated List payloads |
| record | [UriTemplateFormat.UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UriTemplateFormat.UriTemplateFormat1](#uritemplateformat1)<br> schema class |

## UriTemplateFormat1Boxed
sealed interface UriTemplateFormat1Boxed<br>
permits<br>
[UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid),
[UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean),
[UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber),
[UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring),
[UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist),
[UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UriTemplateFormat1BoxedVoid
data class UriTemplateFormat1BoxedVoid<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1BoxedBoolean
data class UriTemplateFormat1BoxedBoolean<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1BoxedNumber
data class UriTemplateFormat1BoxedNumber<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1BoxedString
data class UriTemplateFormat1BoxedString<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1BoxedList
data class UriTemplateFormat1BoxedList<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1BoxedMap
data class UriTemplateFormat1BoxedMap<br>
implements [UriTemplateFormat1Boxed](#uritemplateformat1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UriTemplateFormat1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UriTemplateFormat1
class UriTemplateFormat1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | type = "uri-template"; |

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
| [UriTemplateFormat1BoxedString](#uritemplateformat1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UriTemplateFormat1BoxedVoid](#uritemplateformat1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UriTemplateFormat1BoxedNumber](#uritemplateformat1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UriTemplateFormat1BoxedBoolean](#uritemplateformat1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [UriTemplateFormat1BoxedMap](#uritemplateformat1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [UriTemplateFormat1BoxedList](#uritemplateformat1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [UriTemplateFormat1Boxed](#uritemplateformat1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
