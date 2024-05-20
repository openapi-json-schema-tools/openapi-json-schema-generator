# ItemsContains
org.openapijsonschematools.client.components.schemas.ItemsContains.java
class ItemsContains<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsContains.ItemsContains1Boxed](#itemscontains1boxed)<br> sealed interface for validated payloads |
| data class | [ItemsContains.ItemsContains1BoxedList](#itemscontains1boxedlist)<br> boxed class to store validated List payloads |
| class | [ItemsContains.ItemsContains1](#itemscontains1)<br> schema class |
| class | [ItemsContains.ItemsContainsListBuilder](#itemscontainslistbuilder)<br> builder for List payloads |
| class | [ItemsContains.ItemsContainsList](#itemscontainslist)<br> output class for List payloads |
| sealed interface | [ItemsContains.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| data class | [ItemsContains.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ItemsContains.ItemsBoxedBoolean](#itemsboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ItemsContains.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ItemsContains.ItemsBoxedString](#itemsboxedstring)<br> boxed class to store validated String payloads |
| data class | [ItemsContains.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| data class | [ItemsContains.ItemsBoxedMap](#itemsboxedmap)<br> boxed class to store validated Map payloads |
| class | [ItemsContains.Items](#items)<br> schema class |
| sealed interface | [ItemsContains.ContainsBoxed](#containsboxed)<br> sealed interface for validated payloads |
| data class | [ItemsContains.ContainsBoxedVoid](#containsboxedvoid)<br> boxed class to store validated null payloads |
| data class | [ItemsContains.ContainsBoxedBoolean](#containsboxedboolean)<br> boxed class to store validated boolean payloads |
| data class | [ItemsContains.ContainsBoxedNumber](#containsboxednumber)<br> boxed class to store validated Number payloads |
| data class | [ItemsContains.ContainsBoxedString](#containsboxedstring)<br> boxed class to store validated String payloads |
| data class | [ItemsContains.ContainsBoxedList](#containsboxedlist)<br> boxed class to store validated List payloads |
| data class | [ItemsContains.ContainsBoxedMap](#containsboxedmap)<br> boxed class to store validated Map payloads |
| class | [ItemsContains.Contains](#contains)<br> schema class |

## ItemsContains1Boxed
sealed interface ItemsContains1Boxed<br>
permits<br>
[ItemsContains1BoxedList](#itemscontains1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsContains1BoxedList
data class ItemsContains1BoxedList<br>
implements [ItemsContains1Boxed](#itemscontains1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsContains1BoxedList([ItemsContainsList](#itemscontainslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsContainsList](#itemscontainslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsContains1
class ItemsContains1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags
import org.openapijsonschematools.client.configurations.SchemaConfiguration
import org.openapijsonschematools.client.exceptions.ValidationException
import org.openapijsonschematools.client.schemas.validation.MapUtils
import org.openapijsonschematools.client.schemas.validation.FrozenList
import org.openapijsonschematools.client.schemas.validation.FrozenMap
import org.openapijsonschematools.client.components.schemas.ItemsContains

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// List validation
val validatedPayload: ItemsContains.ItemsContainsList =
    ItemsContains.ItemsContains1.validate(
    ItemsContains.ItemsContainsListBuilder()
    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items::class.java](#items) |
| Class<? extends JsonSchema> | contains = [Contains::class.java](#contains) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsContainsList](#itemscontainslist) | validate(arg: [List<*>](#itemscontainslistbuilder), configuration: SchemaConfiguration) |
| [ItemsContains1BoxedList](#itemscontains1boxedlist) | validateAndBox([List<*>](#itemscontainslistbuilder), configuration: SchemaConfiguration) |
| [ItemsContains1Boxed](#itemscontains1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsContainsListBuilder
class ItemsContainsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsContainsListBuilder()<br>Creates an empty list |
| ItemsContainsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsContainsListBuilder | add(item: Nothing?) |
| ItemsContainsListBuilder | add(item: Boolean) |
| ItemsContainsListBuilder | add(item: String) |
| ItemsContainsListBuilder | add(item: Int) |
| ItemsContainsListBuilder | add(item: Float) |
| ItemsContainsListBuilder | add(item: Long) |
| ItemsContainsListBuilder | add(item: Double) |
| ItemsContainsListBuilder | add(item: List<Any?>) |
| ItemsContainsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsContainsList
class ItemsContainsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsContainsList](#itemscontainslist) | of([List<Any?>](#itemscontainslistbuilder) arg, SchemaConfiguration configuration) |

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
| BigDecimal | multipleOf = BigDecimal("2") |

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

data class that stores validated boolean payloads, sealed permits implementation

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
| BigDecimal | multipleOf = BigDecimal("3") |

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
| [ContainsBoxedString](#containsboxedstring) | validateAndBox(String, configuration: SchemaConfiguration) |
| [ContainsBoxedVoid](#containsboxedvoid) | validateAndBox(Nothing?, configuration: SchemaConfiguration) |
| [ContainsBoxedNumber](#containsboxednumber) | validateAndBox(Number, configuration: SchemaConfiguration) |
| [ContainsBoxedBoolean](#containsboxedboolean) | validateAndBox(Boolean, configuration: SchemaConfiguration) |
| [ContainsBoxedMap](#containsboxedmap) | validateAndBox(Map&lt;*, *&gt;, configuration: SchemaConfiguration) |
| [ContainsBoxedList](#containsboxedlist) | validateAndBox(List<*>, configuration: SchemaConfiguration) |
| [ContainsBoxed](#containsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
