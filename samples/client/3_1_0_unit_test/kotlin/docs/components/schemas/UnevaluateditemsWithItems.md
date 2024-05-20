# UnevaluateditemsWithItems
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithItems.java
class UnevaluateditemsWithItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1Boxed](#unevaluateditemswithitems1boxed)<br> sealed interface for validated payloads |
| data class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist)<br> boxed class to store validated List payloads |
| class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1](#unevaluateditemswithitems1)<br> schema class |
| sealed interface | [UnevaluateditemsWithItems.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> sealed interface for validated payloads |
| data class | [UnevaluateditemsWithItems.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| class | [UnevaluateditemsWithItems.UnevaluatedItems](#unevaluateditems)<br> schema class |
| class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder](#unevaluateditemswithitemslistbuilder)<br> builder for List payloads |
| class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist)<br> output class for List payloads |
| sealed interface | [UnevaluateditemsWithItems.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| data class | [UnevaluateditemsWithItems.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| class | [UnevaluateditemsWithItems.Items](#items)<br> schema class |

## UnevaluateditemsWithItems1Boxed
sealed interface UnevaluateditemsWithItems1Boxed<br>
permits<br>
[UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist)

sealed interface that stores validated payloads using boxed classes

## UnevaluateditemsWithItems1BoxedList
data class UnevaluateditemsWithItems1BoxedList<br>
implements [UnevaluateditemsWithItems1Boxed](#unevaluateditemswithitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithItems1BoxedList([UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluateditemsWithItems1
class UnevaluateditemsWithItems1<br>
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
import org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithItems

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// List validation
val validatedPayload: UnevaluateditemsWithItems.UnevaluateditemsWithItemsList =
    UnevaluateditemsWithItems.UnevaluateditemsWithItems1.validate(
    UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder()
        .add(1)

    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items::class.java](#items) |
| Class<? extends JsonSchema> | unevaluatedItems = [UnevaluatedItems::class.java](#unevaluateditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | validate(arg: [List<*>](#unevaluateditemswithitemslistbuilder), configuration: SchemaConfiguration) |
| [UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist) | validateAndBox([List<*>](#unevaluateditemswithitemslistbuilder), configuration: SchemaConfiguration) |
| [UnevaluateditemsWithItems1Boxed](#unevaluateditemswithitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## UnevaluatedItemsBoxed
sealed interface UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)

sealed interface that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedString
data class UnevaluatedItemsBoxedString<br>
implements [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## UnevaluatedItems
class UnevaluatedItems<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UnevaluateditemsWithItemsListBuilder
class UnevaluateditemsWithItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithItemsListBuilder()<br>Creates an empty list |
| UnevaluateditemsWithItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| UnevaluateditemsWithItemsListBuilder | add(item: Int) |
| UnevaluateditemsWithItemsListBuilder | add(item: Float) |
| UnevaluateditemsWithItemsListBuilder | add(item: Long) |
| UnevaluateditemsWithItemsListBuilder | add(item: Double) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## UnevaluateditemsWithItemsList
class UnevaluateditemsWithItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | of([List<Number>](#unevaluateditemswithitemslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedNumber](#itemsboxednumber)

sealed interface that stores validated payloads using boxed classes

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

## Items
class Items<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
