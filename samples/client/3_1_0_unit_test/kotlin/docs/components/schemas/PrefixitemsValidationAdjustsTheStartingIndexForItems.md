# PrefixitemsValidationAdjustsTheStartingIndexForItems
org.openapijsonschematools.client.components.schemas.PrefixitemsValidationAdjustsTheStartingIndexForItems.java
class PrefixitemsValidationAdjustsTheStartingIndexForItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed](#prefixitemsvalidationadjuststhestartingindexforitems1boxed)<br> sealed interface for validated payloads |
| data class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist)<br> boxed class to store validated List payloads |
| class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1](#prefixitemsvalidationadjuststhestartingindexforitems1)<br> schema class |
| sealed interface | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0Boxed](#schema0boxed)<br> sealed interface for validated payloads |
| data class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0](#schema0)<br> schema class |
| class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder)<br> builder for List payloads |
| class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist)<br> output class for List payloads |
| sealed interface | [PrefixitemsValidationAdjustsTheStartingIndexForItems.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| data class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Items](#items)<br> schema class |

## PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed
sealed interface PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed<br>
permits<br>
[PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist)

sealed interface that stores validated payloads using boxed classes

## PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList
data class PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList<br>
implements [PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed](#prefixitemsvalidationadjuststhestartingindexforitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList([PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## PrefixitemsValidationAdjustsTheStartingIndexForItems1
class PrefixitemsValidationAdjustsTheStartingIndexForItems1<br>
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
import org.openapijsonschematools.client.components.schemas.PrefixitemsValidationAdjustsTheStartingIndexForItems

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// List validation
val validatedPayload: PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsList =
    PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1.validate(
    PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()
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
| List<Class<? extends JsonSchema>> | prefixItems = listOf(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0::class.java](#schema0)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | validate(arg: [List<*>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder), configuration: SchemaConfiguration) |
| [PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist) | validateAndBox([List<*>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder), configuration: SchemaConfiguration) |
| [PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed](#prefixitemsvalidationadjuststhestartingindexforitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## Schema0Boxed
sealed interface Schema0Boxed<br>
permits<br>
[Schema0BoxedString](#schema0boxedstring)

sealed interface that stores validated payloads using boxed classes

## Schema0BoxedString
data class Schema0BoxedString<br>
implements [Schema0Boxed](#schema0boxed)

data class that stores validated String payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| String | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Schema0
class Schema0<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder
class PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder<br>
builder for `List<Any>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()<br>Creates an empty list |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder(List<Any> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(item: Int) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(item: Float) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(item: Long) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(item: Double) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(item: String) |
| List<Any> | build()<br>Returns list input that should be used with Schema.validate |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsList
class PrefixitemsValidationAdjustsTheStartingIndexForItemsList<br>
extends `FrozenList<Any>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | of([List<Any>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |

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
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
