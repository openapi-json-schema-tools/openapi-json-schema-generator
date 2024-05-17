# ContainsKeywordValidation
org.openapijsonschematools.client.components.schemas.ContainsKeywordValidation.java
class ContainsKeywordValidation<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ContainsKeywordValidation.ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)<br> sealed interface for validated payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsKeywordValidation.ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsKeywordValidation.ContainsKeywordValidation1](#containskeywordvalidation1)<br> schema class |
| sealed interface | [ContainsKeywordValidation.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| record | [ContainsKeywordValidation.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| record | [ContainsKeywordValidation.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ContainsKeywordValidation.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| record | [ContainsKeywordValidation.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| record | [ContainsKeywordValidation.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| record | [ContainsKeywordValidation.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| static class | [ContainsKeywordValidation.Contains](#contains)<br> schema class |

## ContainsKeywordValidation1Boxed
sealed interface ContainsKeywordValidation1Boxed<br>
permits<br>
[ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid),
[ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean),
[ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber),
[ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring),
[ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist),
[ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsKeywordValidation1BoxedVoid
data class ContainsKeywordValidation1BoxedVoid<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedBoolean
data class ContainsKeywordValidation1BoxedBoolean<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedNumber
data class ContainsKeywordValidation1BoxedNumber<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedString
data class ContainsKeywordValidation1BoxedString<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedList
data class ContainsKeywordValidation1BoxedList<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1BoxedMap
data class ContainsKeywordValidation1BoxedMap<br>
implements [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsKeywordValidation1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsKeywordValidation1
class ContainsKeywordValidation1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Class<? extends JsonSchema> | contains = [Contains::class.java](#contains) |

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
| [ContainsKeywordValidation1BoxedString](#containskeywordvalidation1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1BoxedVoid](#containskeywordvalidation1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1BoxedNumber](#containskeywordvalidation1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1BoxedBoolean](#containskeywordvalidation1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1BoxedMap](#containskeywordvalidation1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1BoxedList](#containskeywordvalidation1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ContainsKeywordValidation1Boxed](#containskeywordvalidation1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ContainsBoxed
sealed interface ContainsBoxed<br>
permits<br>
[ContainsBoxedVoid](#containsboxedvoid),
[ContainsBoxedBoolean](#containsboxedboolean),
[ContainsBoxedNumber](#containsboxednumber),
[ContainsBoxedString](#containsboxedstring),
[ContainsBoxedList](#containsboxedlist),
[ContainsBoxedMap](#containsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ContainsBoxedVoid
data class ContainsBoxedVoid<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedBoolean
data class ContainsBoxedBoolean<br>
implements [ContainsBoxed](#containsboxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedNumber
data class ContainsBoxedNumber<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedString
data class ContainsBoxedString<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedList
data class ContainsBoxedList<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ContainsBoxedMap
data class ContainsBoxedMap<br>
implements [ContainsBoxed](#containsboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ContainsBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Contains
class Contains<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | minimum = 5 |

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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ContainsBoxed](#containsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
