# PrefixitemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.PrefixitemsWithNullInstanceElements.java
class PrefixitemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid)<br> boxed class to store validated null payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber)<br> boxed class to store validated Number payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring)<br> boxed class to store validated String payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| record | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElements1](#prefixitemswithnullinstanceelements1)<br> schema class |
| sealed interface | [PrefixitemsWithNullInstanceElements.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [PrefixitemsWithNullInstanceElements.Schema0BoxedVoid](#schema0boxedvoid)<br> boxed class to store validated null payloads |
| static class | [PrefixitemsWithNullInstanceElements.Schema0](#schema0)<br> schema class |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsListBuilder](#prefixitemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| static class | [PrefixitemsWithNullInstanceElements.PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist)<br> output class for List payloads |

## PrefixitemsWithNullInstanceElements1Boxed
sealed interface PrefixitemsWithNullInstanceElements1Boxed<br>
permits<br>
[PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid),
[PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean),
[PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber),
[PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring),
[PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist),
[PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap)

sealed interface that stores validated payloads using boxed classes

## PrefixitemsWithNullInstanceElements1BoxedVoid
data class PrefixitemsWithNullInstanceElements1BoxedVoid<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedBoolean
data class PrefixitemsWithNullInstanceElements1BoxedBoolean<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedNumber
data class PrefixitemsWithNullInstanceElements1BoxedNumber<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedString
data class PrefixitemsWithNullInstanceElements1BoxedString<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedList
data class PrefixitemsWithNullInstanceElements1BoxedList<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedList([PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1BoxedMap
data class PrefixitemsWithNullInstanceElements1BoxedMap<br>
implements [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElements1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsWithNullInstanceElements1
class PrefixitemsWithNullInstanceElements1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| List<Class<? extends JsonSchema>> | prefixItems = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>)<br> |

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
| [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | validate(arg: [List<*>](#prefixitemswithnullinstanceelementslistbuilder), configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedString](#prefixitemswithnullinstanceelements1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedVoid](#prefixitemswithnullinstanceelements1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedNumber](#prefixitemswithnullinstanceelements1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedBoolean](#prefixitemswithnullinstanceelements1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedMap](#prefixitemswithnullinstanceelements1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1BoxedList](#prefixitemswithnullinstanceelements1boxedlist) | validateAndBox([List<*>](#prefixitemswithnullinstanceelementslistbuilder), configuration: SchemaConfiguration) |
| [PrefixitemsWithNullInstanceElements1Boxed](#prefixitemswithnullinstanceelements1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedVoid](#schema0boxedvoid)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedVoid
data class Schema0BoxedVoid<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PrefixitemsWithNullInstanceElementsListBuilder
class PrefixitemsWithNullInstanceElementsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsWithNullInstanceElementsListBuilder()<br>Creates an empty list |
| PrefixitemsWithNullInstanceElementsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Nothing?) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Boolean) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: String) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Int) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Float) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Long) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Double) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: List<Any?>) |
| PrefixitemsWithNullInstanceElementsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## PrefixitemsWithNullInstanceElementsList
class PrefixitemsWithNullInstanceElementsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PrefixitemsWithNullInstanceElementsList](#prefixitemswithnullinstanceelementslist) | of([List<Any?>](#prefixitemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
