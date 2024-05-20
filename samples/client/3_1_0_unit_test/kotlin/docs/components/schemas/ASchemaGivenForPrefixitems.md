# ASchemaGivenForPrefixitems
org.openapijsonschematools.client.components.schemas.ASchemaGivenForPrefixitems.java
class ASchemaGivenForPrefixitems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid)<br> boxed class to store validated null payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean)<br> boxed class to store validated boolean payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber)<br> boxed class to store validated Number payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring)<br> boxed class to store validated String payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist)<br> boxed class to store validated List payloads |
| record | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)<br> boxed class to store validated Map payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitems1](#aschemagivenforprefixitems1)<br> schema class |
| sealed interface | [ASchemaGivenForPrefixitems.Schema1Boxed](#schema1boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.Schema1BoxedString](#schema1boxedstring)<br> boxed class to store validated String payloads |
| static class | [ASchemaGivenForPrefixitems.Schema1](#schema1)<br> schema class |
| sealed interface | [ASchemaGivenForPrefixitems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| record | [ASchemaGivenForPrefixitems.Schema0BoxedNumber](#schema0boxednumber)<br> boxed class to store validated Number payloads |
| static class | [ASchemaGivenForPrefixitems.Schema0](#schema0)<br> schema class |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsListBuilder](#aschemagivenforprefixitemslistbuilder)<br> builder for List payloads |
| static class | [ASchemaGivenForPrefixitems.ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist)<br> output class for List payloads |

## ASchemaGivenForPrefixitems1Boxed
sealed interface ASchemaGivenForPrefixitems1Boxed<br>
permits<br>
[ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid),
[ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean),
[ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber),
[ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring),
[ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist),
[ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap)

sealed interface that stores validated payloads using boxed classes

## ASchemaGivenForPrefixitems1BoxedVoid
data class ASchemaGivenForPrefixitems1BoxedVoid<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedBoolean
data class ASchemaGivenForPrefixitems1BoxedBoolean<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

record that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedNumber
data class ASchemaGivenForPrefixitems1BoxedNumber<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedString
data class ASchemaGivenForPrefixitems1BoxedString<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedList
data class ASchemaGivenForPrefixitems1BoxedList<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedList([ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1BoxedMap
data class ASchemaGivenForPrefixitems1BoxedMap<br>
implements [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitems1BoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ASchemaGivenForPrefixitems1
class ASchemaGivenForPrefixitems1<br>
extends JsonSchema

A schema class that validates payloads

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
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
| [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | validate(arg: [List<*>](#aschemagivenforprefixitemslistbuilder), configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedString](#aschemagivenforprefixitems1boxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedVoid](#aschemagivenforprefixitems1boxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedNumber](#aschemagivenforprefixitems1boxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedBoolean](#aschemagivenforprefixitems1boxedboolean) | validateAndBox(boolean, configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedMap](#aschemagivenforprefixitems1boxedmap) | validateAndBox(Map&lt;?, ?&gt;, configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1BoxedList](#aschemagivenforprefixitems1boxedlist) | validateAndBox([List<*>](#aschemagivenforprefixitemslistbuilder), configuration: SchemaConfiguration) |
| [ASchemaGivenForPrefixitems1Boxed](#aschemagivenforprefixitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema1Boxed
sealed interface Schema1Boxed<br>
permits<br>
[Schema1BoxedString](#schema1boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema1BoxedString
data class Schema1BoxedString<br>
implements [Schema1Boxed](#schema1boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema1BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema1
class Schema1<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

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

## ASchemaGivenForPrefixitemsListBuilder
class ASchemaGivenForPrefixitemsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ASchemaGivenForPrefixitemsListBuilder()<br>Creates an empty list |
| ASchemaGivenForPrefixitemsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Nothing?) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Boolean) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: String) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Int) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Float) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Long) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Double) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: List<Any?>) |
| ASchemaGivenForPrefixitemsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## ASchemaGivenForPrefixitemsList
class ASchemaGivenForPrefixitemsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ASchemaGivenForPrefixitemsList](#aschemagivenforprefixitemslist) | of([List<Any?>](#aschemagivenforprefixitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
