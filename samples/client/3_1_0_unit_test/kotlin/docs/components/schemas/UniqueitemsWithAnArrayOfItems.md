# UniqueitemsWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsWithAnArrayOfItems.java
class UniqueitemsWithAnArrayOfItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItems1](#uniqueitemswithanarrayofitems1)<br> schema class |
| sealed interface | [UniqueitemsWithAnArrayOfItems.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsWithAnArrayOfItems.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| sealed interface | [UniqueitemsWithAnArrayOfItems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsWithAnArrayOfItems.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsListBuilder](#uniqueitemswithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsWithAnArrayOfItems.UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist)<br> output class for List payloads |

## UniqueitemsWithAnArrayOfItems1Boxed
sealed interface UniqueitemsWithAnArrayOfItems1Boxed<br>
permits<br>
[UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid),
[UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean),
[UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber),
[UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring),
[UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist),
[UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsWithAnArrayOfItems1BoxedVoid
data class UniqueitemsWithAnArrayOfItems1BoxedVoid<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedBoolean
data class UniqueitemsWithAnArrayOfItems1BoxedBoolean<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedNumber
data class UniqueitemsWithAnArrayOfItems1BoxedNumber<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedString
data class UniqueitemsWithAnArrayOfItems1BoxedString<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedList
data class UniqueitemsWithAnArrayOfItems1BoxedList<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedList([UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1BoxedMap
data class UniqueitemsWithAnArrayOfItems1BoxedMap<br>
implements [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItems1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsWithAnArrayOfItems1
class UniqueitemsWithAnArrayOfItems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = true |
| List<Class<? extends JsonSchema>> | prefixItems = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0),<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema1::class.java](#schema1)<br>)<br> |

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
| [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | validate(arg: [List<*>](#uniqueitemswithanarrayofitemslistbuilder), configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedString](#uniqueitemswithanarrayofitems1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedVoid](#uniqueitemswithanarrayofitems1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedNumber](#uniqueitemswithanarrayofitems1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedBoolean](#uniqueitemswithanarrayofitems1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedMap](#uniqueitemswithanarrayofitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1BoxedList](#uniqueitemswithanarrayofitems1boxedlist) | validateAndBox([List<*>](#uniqueitemswithanarrayofitemslistbuilder), configuration: SchemaConfiguration) |
| [UniqueitemsWithAnArrayOfItems1Boxed](#uniqueitemswithanarrayofitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedBoolean](#schema1boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedBoolean
data class Schema1BoxedBoolean<br>
implements [Schema1Boxed](#schema1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedBoolean](#schema0boxedboolean)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedBoolean
data class Schema0BoxedBoolean<br>
implements [Schema0Boxed](#schema0boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends BooleanJsonSchema.BooleanJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.BooleanJsonSchema.BooleanJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UniqueitemsWithAnArrayOfItemsListBuilder
class UniqueitemsWithAnArrayOfItemsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsWithAnArrayOfItemsListBuilder()<br>Creates an empty list |
| UniqueitemsWithAnArrayOfItemsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Nothing?) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Boolean) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: String) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Int) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Float) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Long) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Double) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: List<Any?>) |
| UniqueitemsWithAnArrayOfItemsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## UniqueitemsWithAnArrayOfItemsList
class UniqueitemsWithAnArrayOfItemsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UniqueitemsWithAnArrayOfItemsList](#uniqueitemswithanarrayofitemslist) | of([List<Any?>](#uniqueitemswithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
