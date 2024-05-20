# UniqueitemsFalseWithAnArrayOfItems
org.openapijsonschematools.client.components.schemas.UniqueitemsFalseWithAnArrayOfItems.java
class UniqueitemsFalseWithAnArrayOfItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid)<br> boxed class to store validated null payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber)<br> boxed class to store validated Number payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring)<br> boxed class to store validated String payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist)<br> boxed class to store validated List payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItems1](#uniqueitemsfalsewithanarrayofitems1)<br> schema class |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.Schema1BoxedBoolean](#schema1boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema1](#schema1)<br> schema class |
| sealed interface | [UniqueitemsFalseWithAnArrayOfItems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [UniqueitemsFalseWithAnArrayOfItems.Schema0BoxedBoolean](#schema0boxedboolean)<br> boxed class to store validated boolean payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.Schema0](#schema0)<br> schema class |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsListBuilder](#uniqueitemsfalsewithanarrayofitemslistbuilder)<br> builder for List payloads |
| static class | [UniqueitemsFalseWithAnArrayOfItems.UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist)<br> output class for List payloads |

## UniqueitemsFalseWithAnArrayOfItems1Boxed
sealed interface UniqueitemsFalseWithAnArrayOfItems1Boxed<br>
permits<br>
[UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid),
[UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean),
[UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber),
[UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring),
[UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist),
[UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap)

sealed interface that stores validated payloads using boxed classes

## UniqueitemsFalseWithAnArrayOfItems1BoxedVoid
data class UniqueitemsFalseWithAnArrayOfItems1BoxedVoid<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean
data class UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedNumber
data class UniqueitemsFalseWithAnArrayOfItems1BoxedNumber<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedString
data class UniqueitemsFalseWithAnArrayOfItems1BoxedString<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedList
data class UniqueitemsFalseWithAnArrayOfItems1BoxedList<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedList([UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1BoxedMap
data class UniqueitemsFalseWithAnArrayOfItems1BoxedMap<br>
implements [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItems1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UniqueitemsFalseWithAnArrayOfItems1
class UniqueitemsFalseWithAnArrayOfItems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Boolean | uniqueItems = false |
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
| [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | validate(arg: [List<*>](#uniqueitemsfalsewithanarrayofitemslistbuilder), configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedString](#uniqueitemsfalsewithanarrayofitems1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedVoid](#uniqueitemsfalsewithanarrayofitems1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedNumber](#uniqueitemsfalsewithanarrayofitems1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedBoolean](#uniqueitemsfalsewithanarrayofitems1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedMap](#uniqueitemsfalsewithanarrayofitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1BoxedList](#uniqueitemsfalsewithanarrayofitems1boxedlist) | validateAndBox([List<*>](#uniqueitemsfalsewithanarrayofitemslistbuilder), configuration: SchemaConfiguration) |
| [UniqueitemsFalseWithAnArrayOfItems1Boxed](#uniqueitemsfalsewithanarrayofitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
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

## UniqueitemsFalseWithAnArrayOfItemsListBuilder
class UniqueitemsFalseWithAnArrayOfItemsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder()<br>Creates an empty list |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Nothing?) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Boolean) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: String) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Int) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Float) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Long) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Double) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: List<Any?>) |
| UniqueitemsFalseWithAnArrayOfItemsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## UniqueitemsFalseWithAnArrayOfItemsList
class UniqueitemsFalseWithAnArrayOfItemsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UniqueitemsFalseWithAnArrayOfItemsList](#uniqueitemsfalsewithanarrayofitemslist) | of([List<Any?>](#uniqueitemsfalsewithanarrayofitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
