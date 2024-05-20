# ItemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ItemsWithNullInstanceElements.java
class ItemsWithNullInstanceElements<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed)<br> sealed interface for validated payloads |
| data class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist)<br> boxed class to store validated List payloads |
| class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1](#itemswithnullinstanceelements1)<br> schema class |
| class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder](#itemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist)<br> output class for List payloads |
| sealed interface | [ItemsWithNullInstanceElements.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| data class | [ItemsWithNullInstanceElements.ItemsBoxedVoid](#itemsboxedvoid)<br> boxed class to store validated null payloads |
| class | [ItemsWithNullInstanceElements.Items](#items)<br> schema class |

## ItemsWithNullInstanceElements1Boxed
sealed interface ItemsWithNullInstanceElements1Boxed<br>
permits<br>
[ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsWithNullInstanceElements1BoxedList
data class ItemsWithNullInstanceElements1BoxedList<br>
implements [ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsWithNullInstanceElements1BoxedList([ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## ItemsWithNullInstanceElements1
class ItemsWithNullInstanceElements1<br>
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
import org.openapijsonschematools.client.components.schemas.ItemsWithNullInstanceElements

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// List validation
val validatedPayload: ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList =
    ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1.validate(
    ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder()
        .add(null)

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
| [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | validate(arg: [List<*>](#itemswithnullinstanceelementslistbuilder), configuration: SchemaConfiguration) |
| [ItemsWithNullInstanceElements1BoxedList](#itemswithnullinstanceelements1boxedlist) | validateAndBox([List<*>](#itemswithnullinstanceelementslistbuilder), configuration: SchemaConfiguration) |
| [ItemsWithNullInstanceElements1Boxed](#itemswithnullinstanceelements1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsWithNullInstanceElementsListBuilder
class ItemsWithNullInstanceElementsListBuilder<br>
builder for `List<Nothing?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsWithNullInstanceElementsListBuilder()<br>Creates an empty list |
| ItemsWithNullInstanceElementsListBuilder(List<Nothing?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsWithNullInstanceElementsListBuilder | add(item: Nothing?) |
| List<Nothing?> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsWithNullInstanceElementsList
class ItemsWithNullInstanceElementsList<br>
extends `FrozenList<Nothing?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | of([List<Nothing?>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedVoid](#itemsboxedvoid)

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

## Items
class Items<br>
extends NullJsonSchema.NullJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NullJsonSchema.NullJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
