# ItemsDoesNotLookInApplicatorsValidCase
org.openapijsonschematools.client.components.schemas.ItemsDoesNotLookInApplicatorsValidCase.java
class ItemsDoesNotLookInApplicatorsValidCase<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)<br> sealed interface for validated payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)<br> boxed class to store validated List payloads |
| class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1](#itemsdoesnotlookinapplicatorsvalidcase1)<br> schema class |
| class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder)<br> builder for List payloads |
| class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist)<br> output class for List payloads |
| sealed interface | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| data class | [ItemsDoesNotLookInApplicatorsValidCase.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| class | [ItemsDoesNotLookInApplicatorsValidCase.Items](#items)<br> schema class |

## ItemsDoesNotLookInApplicatorsValidCase1Boxed
sealed interface ItemsDoesNotLookInApplicatorsValidCase1Boxed<br>
permits<br>
[ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsDoesNotLookInApplicatorsValidCase1BoxedList
data class ItemsDoesNotLookInApplicatorsValidCase1BoxedList<br>
implements [ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCase1BoxedList([ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsDoesNotLookInApplicatorsValidCase1
class ItemsDoesNotLookInApplicatorsValidCase1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.ItemsDoesNotLookInApplicatorsValidCase

val configuration = SchemaConfiguration()

// List validation
val validatedPayload: ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseList =
    ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCase1.validate(
    ItemsDoesNotLookInApplicatorsValidCase.ItemsDoesNotLookInApplicatorsValidCaseListBuilder()
    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items::class.java](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | validate(arg: [List<*>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder), configuration: SchemaConfiguration) |
| [ItemsDoesNotLookInApplicatorsValidCase1BoxedList](#itemsdoesnotlookinapplicatorsvalidcase1boxedlist) | validateAndBox([List<*>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder), configuration: SchemaConfiguration) |
| [ItemsDoesNotLookInApplicatorsValidCase1Boxed](#itemsdoesnotlookinapplicatorsvalidcase1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsDoesNotLookInApplicatorsValidCaseListBuilder
class ItemsDoesNotLookInApplicatorsValidCaseListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder()<br>Creates an empty list |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Nothing?) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Boolean) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: String) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Int) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Float) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Long) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Double) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: List<Any?>) |
| ItemsDoesNotLookInApplicatorsValidCaseListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsDoesNotLookInApplicatorsValidCaseList
class ItemsDoesNotLookInApplicatorsValidCaseList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsDoesNotLookInApplicatorsValidCaseList](#itemsdoesnotlookinapplicatorsvalidcaselist) | of([List<Any?>](#itemsdoesnotlookinapplicatorsvalidcaselistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid),
[ItemsBoxedBoolean](#itemsboxedboolean),
[ItemsBoxedNumber](#itemsboxednumber),
[ItemsBoxedString](#itemsboxedstring),
[ItemsBoxedList](#itemsboxedlist),
[ItemsBoxedMap](#itemsboxedmap)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedVoid
data class ItemsBoxedVoid<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated null payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedVoid(Nothing? data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Nothing? | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedBoolean
data class ItemsBoxedBoolean<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated boolean payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedBoolean(boolean data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| boolean | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedNumber
data class ItemsBoxedNumber<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedString
data class ItemsBoxedString<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedList
data class ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList(FrozenList<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenList<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsBoxedMap
data class ItemsBoxedMap<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated Map payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedMap(FrozenMap<Any?> data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| FrozenMap<Any?> | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items
class Items<br>
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
| Int | validate(arg: Int, configuration: SchemaConfiguration) |
| Long | validate(arg: Long, configuration: SchemaConfiguration) |
| Float | validate(arg: Float, configuration: SchemaConfiguration) |
| Double | validate(arg: Double, configuration: SchemaConfiguration) |
| Number | validate(arg: Number, configuration: SchemaConfiguration) |
| Boolean | validate(arg: Boolean, configuration: SchemaConfiguration) |
| FrozenMap<Any?> | validate(arg: Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| FrozenList<Any?> | validate(arg: List<*>, configuration: SchemaConfiguration) |
| [ItemsBoxedString](#itemsboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ItemsBoxedVoid](#itemsboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ItemsBoxedNumber](#itemsboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ItemsBoxedBoolean](#itemsboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ItemsBoxedMap](#itemsboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ItemsBoxedList](#itemsboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ItemsBoxed](#itemsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
