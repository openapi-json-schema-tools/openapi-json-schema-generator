# MultipleSimultaneousPatternpropertiesAreValidated
org.openapijsonschematools.client.components.schemas.MultipleSimultaneousPatternpropertiesAreValidated.java
class MultipleSimultaneousPatternpropertiesAreValidated<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)<br> sealed interface for validated payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid)<br> boxed class to store validated null payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber)<br> boxed class to store validated Number payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring)<br> boxed class to store validated String payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist)<br> boxed class to store validated List payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap)<br> boxed class to store validated Map payloads |
| class | [MultipleSimultaneousPatternpropertiesAreValidated.MultipleSimultaneousPatternpropertiesAreValidated1](#multiplesimultaneouspatternpropertiesarevalidated1)<br> schema class |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxed](#aaaboxed)<br> sealed interface for validated payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedVoid](#aaaboxedvoid)<br> boxed class to store validated null payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedBoolean](#aaaboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedNumber](#aaaboxednumber)<br> boxed class to store validated Number payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedString](#aaaboxedstring)<br> boxed class to store validated String payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedList](#aaaboxedlist)<br> boxed class to store validated List payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.AaaBoxedMap](#aaaboxedmap)<br> boxed class to store validated Map payloads |
| class | [MultipleSimultaneousPatternpropertiesAreValidated.Aaa](#aaa)<br> schema class |
| sealed interface | [MultipleSimultaneousPatternpropertiesAreValidated.ABoxed](#aboxed)<br> sealed interface for validated payloads |
| data class | [MultipleSimultaneousPatternpropertiesAreValidated.ABoxedNumber](#aboxednumber)<br> boxed class to store validated Number payloads |
| class | [MultipleSimultaneousPatternpropertiesAreValidated.A](#a)<br> schema class |

## MultipleSimultaneousPatternpropertiesAreValidated1Boxed
sealed interface MultipleSimultaneousPatternpropertiesAreValidated1Boxed<br>
permits<br>
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist),
[MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap)

sealed interface that stores validated payloads using boxed classes

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedString
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedString<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedList
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedList<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap
data class MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap<br>
implements [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## MultipleSimultaneousPatternpropertiesAreValidated1
class MultipleSimultaneousPatternpropertiesAreValidated1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Map<Pattern, Class<? extends JsonSchema>> | patternProperties = mapOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.compile("a*") to [A::class.java](#a)),<br>&nbsp;&nbsp;&nbsp;&nbsp;Pattern.compile("aaa*") to [Aaa::class.java](#aaa))<br>)<br> |

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
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedString](#multiplesimultaneouspatternpropertiesarevalidated1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedVoid](#multiplesimultaneouspatternpropertiesarevalidated1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedNumber](#multiplesimultaneouspatternpropertiesarevalidated1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedBoolean](#multiplesimultaneouspatternpropertiesarevalidated1boxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedMap](#multiplesimultaneouspatternpropertiesarevalidated1boxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1BoxedList](#multiplesimultaneouspatternpropertiesarevalidated1boxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [MultipleSimultaneousPatternpropertiesAreValidated1Boxed](#multiplesimultaneouspatternpropertiesarevalidated1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## AaaBoxed
sealed interface AaaBoxed<br>
permits<br>
[AaaBoxedVoid](#aaaboxedvoid),
[AaaBoxedBoolean](#aaaboxedboolean),
[AaaBoxedNumber](#aaaboxednumber),
[AaaBoxedString](#aaaboxedstring),
[AaaBoxedList](#aaaboxedlist),
[AaaBoxedMap](#aaaboxedmap)

sealed interface that stores validated payloads using boxed classes

## AaaBoxedVoid
data class AaaBoxedVoid<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AaaBoxedBoolean
data class AaaBoxedBoolean<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AaaBoxedNumber
data class AaaBoxedNumber<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AaaBoxedString
data class AaaBoxedString<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AaaBoxedList
data class AaaBoxedList<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AaaBoxedMap
data class AaaBoxedMap<br>
implements [AaaBoxed](#aaaboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AaaBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Aaa
class Aaa<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | maximum = 20 |

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
| [AaaBoxedString](#aaaboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AaaBoxedVoid](#aaaboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AaaBoxedNumber](#aaaboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AaaBoxedBoolean](#aaaboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [AaaBoxedMap](#aaaboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [AaaBoxedList](#aaaboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [AaaBoxed](#aaaboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ABoxed
sealed interface ABoxed<br>
permits<br>
[ABoxedNumber](#aboxednumber)

sealed interface that stores validated payloads using boxed classes

## ABoxedNumber
data class ABoxedNumber<br>
implements [ABoxed](#aboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ABoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## A
class A<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
