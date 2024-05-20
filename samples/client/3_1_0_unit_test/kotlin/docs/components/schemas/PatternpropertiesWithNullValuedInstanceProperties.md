# PatternpropertiesWithNullValuedInstanceProperties
org.openapijsonschematools.client.components.schemas.PatternpropertiesWithNullValuedInstanceProperties.java
class PatternpropertiesWithNullValuedInstanceProperties<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring)<br> boxed class to store validated String payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist)<br> boxed class to store validated List payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.PatternpropertiesWithNullValuedInstanceProperties1](#patternpropertieswithnullvaluedinstanceproperties1)<br> schema class |
| sealed interface | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxed](#barboxed)<br> sealed interface for validated payloads |
| record | [PatternpropertiesWithNullValuedInstanceProperties.BarBoxedVoid](#barboxedvoid)<br> boxed class to store validated null payloads |
| static class | [PatternpropertiesWithNullValuedInstanceProperties.Bar](#bar)<br> schema class |

## PatternpropertiesWithNullValuedInstanceProperties1Boxed
sealed interface PatternpropertiesWithNullValuedInstanceProperties1Boxed<br>
permits<br>
[PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist),
[PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedString
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedString<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedList
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedList<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1BoxedMap
data class PatternpropertiesWithNullValuedInstanceProperties1BoxedMap<br>
implements [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PatternpropertiesWithNullValuedInstanceProperties1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PatternpropertiesWithNullValuedInstanceProperties1
class PatternpropertiesWithNullValuedInstanceProperties1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.compile("^.*bar\$") to [Bar::class.java](#bar))<br>)<br> |

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
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedString](#patternpropertieswithnullvaluedinstanceproperties1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedVoid](#patternpropertieswithnullvaluedinstanceproperties1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedNumber](#patternpropertieswithnullvaluedinstanceproperties1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedBoolean](#patternpropertieswithnullvaluedinstanceproperties1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedMap](#patternpropertieswithnullvaluedinstanceproperties1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1BoxedList](#patternpropertieswithnullvaluedinstanceproperties1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [PatternpropertiesWithNullValuedInstanceProperties1Boxed](#patternpropertieswithnullvaluedinstanceproperties1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## BarBoxed
sealed interface BarBoxed<br>
permits<br>
[BarBoxedVoid](#barboxedvoid)

sealed interface that stores validated payloads using boxed classes

## BarBoxedVoid
data class BarBoxedVoid<br>
implements [BarBoxed](#barboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| BarBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Bar
class Bar<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
