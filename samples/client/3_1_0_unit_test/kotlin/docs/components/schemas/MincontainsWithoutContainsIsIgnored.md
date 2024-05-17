# MincontainsWithoutContainsIsIgnored
org.openapijsonschematools.client.components.schemas.MincontainsWithoutContainsIsIgnored.java
class MincontainsWithoutContainsIsIgnored<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)<br> sealed interface for validated payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid)<br> boxed class to store validated null payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber)<br> boxed class to store validated Number payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring)<br> boxed class to store validated String payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist)<br> boxed class to store validated List payloads |
| record | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [MincontainsWithoutContainsIsIgnored.MincontainsWithoutContainsIsIgnored1](#mincontainswithoutcontainsisignored1)<br> schema class |

## MincontainsWithoutContainsIsIgnored1Boxed
sealed interface MincontainsWithoutContainsIsIgnored1Boxed<br>
permits<br>
[MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid),
[MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean),
[MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber),
[MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring),
[MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist),
[MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MincontainsWithoutContainsIsIgnored1BoxedVoid
data class MincontainsWithoutContainsIsIgnored1BoxedVoid<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedBoolean
data class MincontainsWithoutContainsIsIgnored1BoxedBoolean<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedNumber
data class MincontainsWithoutContainsIsIgnored1BoxedNumber<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedString
data class MincontainsWithoutContainsIsIgnored1BoxedString<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedList
data class MincontainsWithoutContainsIsIgnored1BoxedList<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1BoxedMap
data class MincontainsWithoutContainsIsIgnored1BoxedMap<br>
implements [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MincontainsWithoutContainsIsIgnored1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MincontainsWithoutContainsIsIgnored1
class MincontainsWithoutContainsIsIgnored1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Integer | minContains = 1 |

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
| [MincontainsWithoutContainsIsIgnored1BoxedString](#mincontainswithoutcontainsisignored1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1BoxedVoid](#mincontainswithoutcontainsisignored1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1BoxedNumber](#mincontainswithoutcontainsisignored1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1BoxedBoolean](#mincontainswithoutcontainsisignored1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1BoxedMap](#mincontainswithoutcontainsisignored1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1BoxedList](#mincontainswithoutcontainsisignored1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MincontainsWithoutContainsIsIgnored1Boxed](#mincontainswithoutcontainsisignored1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
