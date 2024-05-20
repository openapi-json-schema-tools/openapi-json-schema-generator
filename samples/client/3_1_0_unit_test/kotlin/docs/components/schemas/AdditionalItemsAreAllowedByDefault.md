# AdditionalItemsAreAllowedByDefault
org.openapijsonschematools.client.components.schemas.AdditionalItemsAreAllowedByDefault.java
class AdditionalItemsAreAllowedByDefault<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)<br> sealed interface for validated payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid)<br> boxed class to store validated null payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber)<br> boxed class to store validated Number payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring)<br> boxed class to store validated String payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist)<br> boxed class to store validated List payloads |
| record | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefault1](#additionalitemsareallowedbydefault1)<br> schema class |
| sealed interface | [AdditionalItemsAreAllowedByDefault.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [AdditionalItemsAreAllowedByDefault.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [AdditionalItemsAreAllowedByDefault.Schema0](#schema0)<br> schema class |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultListBuilder](#additionalitemsareallowedbydefaultlistbuilder)<br> builder for List payloads |
| static class | [AdditionalItemsAreAllowedByDefault.AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist)<br> output class for List payloads |

## AdditionalItemsAreAllowedByDefault1Boxed
sealed interface AdditionalItemsAreAllowedByDefault1Boxed<br>
permits<br>
[AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid),
[AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean),
[AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber),
[AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring),
[AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist),
[AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap)

sealed interface that stores validated payloads using boxed classes

## AdditionalItemsAreAllowedByDefault1BoxedVoid
data class AdditionalItemsAreAllowedByDefault1BoxedVoid<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedBoolean
data class AdditionalItemsAreAllowedByDefault1BoxedBoolean<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedNumber
data class AdditionalItemsAreAllowedByDefault1BoxedNumber<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedString
data class AdditionalItemsAreAllowedByDefault1BoxedString<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedList
data class AdditionalItemsAreAllowedByDefault1BoxedList<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedList([AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1BoxedMap
data class AdditionalItemsAreAllowedByDefault1BoxedMap<br>
implements [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefault1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## AdditionalItemsAreAllowedByDefault1
class AdditionalItemsAreAllowedByDefault1<br>
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
| [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | validate(arg: [List<*>](#additionalitemsareallowedbydefaultlistbuilder), configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedString](#additionalitemsareallowedbydefault1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedVoid](#additionalitemsareallowedbydefault1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedNumber](#additionalitemsareallowedbydefault1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedBoolean](#additionalitemsareallowedbydefault1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedMap](#additionalitemsareallowedbydefault1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1BoxedList](#additionalitemsareallowedbydefault1boxedlist) | validateAndBox([List<*>](#additionalitemsareallowedbydefaultlistbuilder), configuration: SchemaConfiguration) |
| [AdditionalItemsAreAllowedByDefault1Boxed](#additionalitemsareallowedbydefault1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedNumber](#schema0boxednumber)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedNumber
data class Schema0BoxedNumber<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## AdditionalItemsAreAllowedByDefaultListBuilder
class AdditionalItemsAreAllowedByDefaultListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| AdditionalItemsAreAllowedByDefaultListBuilder()<br>Creates an empty list |
| AdditionalItemsAreAllowedByDefaultListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Nothing?) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Boolean) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: String) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Int) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Float) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Long) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Double) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: List<Any?>) |
| AdditionalItemsAreAllowedByDefaultListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## AdditionalItemsAreAllowedByDefaultList
class AdditionalItemsAreAllowedByDefaultList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [AdditionalItemsAreAllowedByDefaultList](#additionalitemsareallowedbydefaultlist) | of([List<Any?>](#additionalitemsareallowedbydefaultlistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
