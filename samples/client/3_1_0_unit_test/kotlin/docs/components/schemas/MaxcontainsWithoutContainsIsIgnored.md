# MaxcontainsWithoutContainsIsIgnored
org.openapijsonschematools.client.components.schemas.MaxcontainsWithoutContainsIsIgnored.java
class MaxcontainsWithoutContainsIsIgnored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)<br> sealed interface for validated payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring)<br> boxed class to store validated String payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist)<br> boxed class to store validated List payloads |
| record | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MaxcontainsWithoutContainsIsIgnored.MaxcontainsWithoutContainsIsIgnored1](#maxcontainswithoutcontainsisignored1)<br> schema class |

## MaxcontainsWithoutContainsIsIgnored1Boxed
sealed interface MaxcontainsWithoutContainsIsIgnored1Boxed<br>
permits<br>
[MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid),
[MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean),
[MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber),
[MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring),
[MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist),
[MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MaxcontainsWithoutContainsIsIgnored1BoxedVoid
data class MaxcontainsWithoutContainsIsIgnored1BoxedVoid<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedBoolean
data class MaxcontainsWithoutContainsIsIgnored1BoxedBoolean<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedNumber
data class MaxcontainsWithoutContainsIsIgnored1BoxedNumber<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedString
data class MaxcontainsWithoutContainsIsIgnored1BoxedString<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedList
data class MaxcontainsWithoutContainsIsIgnored1BoxedList<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1BoxedMap
data class MaxcontainsWithoutContainsIsIgnored1BoxedMap<br>
implements [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MaxcontainsWithoutContainsIsIgnored1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MaxcontainsWithoutContainsIsIgnored1
class MaxcontainsWithoutContainsIsIgnored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | maxContains = 1 |

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
| [MaxcontainsWithoutContainsIsIgnored1BoxedString](#maxcontainswithoutcontainsisignored1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedVoid](#maxcontainswithoutcontainsisignored1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedNumber](#maxcontainswithoutcontainsisignored1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedBoolean](#maxcontainswithoutcontainsisignored1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedMap](#maxcontainswithoutcontainsisignored1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1BoxedList](#maxcontainswithoutcontainsisignored1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MaxcontainsWithoutContainsIsIgnored1Boxed](#maxcontainswithoutcontainsisignored1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
