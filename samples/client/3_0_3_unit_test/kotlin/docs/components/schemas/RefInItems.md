# RefInItems
org.openapijsonschematools.client.components.schemas.RefInItems.java
class RefInItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [RefInItems.RefInItems1Boxed](#refinitems1boxed)<br> sealed interface for validated payloads |
| data class | [RefInItems.RefInItems1BoxedList](#refinitems1boxedlist)<br> boxed class to store validated List payloads |
| class | [RefInItems.RefInItems1](#refinitems1)<br> schema class |
| class | [RefInItems.RefInItemsListBuilder](#refinitemslistbuilder)<br> builder for List payloads |
| class | [RefInItems.RefInItemsList](#refinitemslist)<br> output class for List payloads |

## RefInItems1Boxed
sealed interface RefInItems1Boxed<br>
permits<br>
[RefInItems1BoxedList](#refinitems1boxedlist)

sealed interface that stores validated payloads using boxed classes

## RefInItems1BoxedList
data class RefInItems1BoxedList<br>
implements [RefInItems1Boxed](#refinitems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInItems1BoxedList([RefInItemsList](#refinitemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInItemsList](#refinitemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## RefInItems1
class RefInItems1<br>
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
import org.openapijsonschematools.client.components.schemas.RefInItems

val configuration = SchemaConfiguration(JsonSchemaKeywordFlags.Builder().build())

// List validation
val validatedPayload: RefInItems.RefInItemsList =
    RefInItems.RefInItems1.validate(
    RefInItems.RefInItemsListBuilder()
    .build(),
    configuration
)
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [PropertyNamedRefThatIsNotAReference.PropertyNamedRefThatIsNotAReference1::class.java](../../components/schemas/PropertyNamedRefThatIsNotAReference.md#propertynamedrefthatisnotareference1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [RefInItemsList](#refinitemslist) | validate(arg: [List<*>](#refinitemslistbuilder), configuration: SchemaConfiguration) |
| [RefInItems1BoxedList](#refinitems1boxedlist) | validateAndBox([List<*>](#refinitemslistbuilder), configuration: SchemaConfiguration) |
| [RefInItems1Boxed](#refinitems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## RefInItemsListBuilder
class RefInItemsListBuilder<br>
builder for `List<Any?>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RefInItemsListBuilder()<br>Creates an empty list |
| RefInItemsListBuilder(List<Any?> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| RefInItemsListBuilder | add(item: Nothing?) |
| RefInItemsListBuilder | add(item: Boolean) |
| RefInItemsListBuilder | add(item: String) |
| RefInItemsListBuilder | add(item: Int) |
| RefInItemsListBuilder | add(item: Float) |
| RefInItemsListBuilder | add(item: Long) |
| RefInItemsListBuilder | add(item: Double) |
| RefInItemsListBuilder | add(item: List<Any?>) |
| RefInItemsListBuilder | add(item: Map<String, Any?>) |
| List<Any?> | build()<br>Returns list input that should be used with Schema.validate |

## RefInItemsList
class RefInItemsList<br>
extends `FrozenList<Any?>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [RefInItemsList](#refinitemslist) | of([List<Any?>](#refinitemslistbuilder) arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
