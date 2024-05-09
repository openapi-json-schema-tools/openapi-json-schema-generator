# NestedItems
org.openapijsonschematools.client.components.schemas.NestedItems.java
class NestedItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- sealed interfaces which store validated payloads, Kotlin version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| sealed interface | [NestedItems.NestedItems1Boxed](#nesteditems1boxed)<br> sealed interface for validated payloads |
| record | [NestedItems.NestedItems1BoxedList](#nesteditems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedItems.NestedItems1](#nesteditems1)<br> schema class |
| static class | [NestedItems.NestedItemsListBuilder](#nesteditemslistbuilder)<br> builder for List payloads |
| static class | [NestedItems.NestedItemsList](#nesteditemslist)<br> output class for List payloads |
| sealed interface | [NestedItems.ItemsBoxed](#itemsboxed)<br> sealed interface for validated payloads |
| record | [NestedItems.ItemsBoxedList](#itemsboxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedItems.Items](#items)<br> schema class |
| static class | [NestedItems.ItemsListBuilder2](#itemslistbuilder2)<br> builder for List payloads |
| static class | [NestedItems.ItemsList2](#itemslist2)<br> output class for List payloads |
| sealed interface | [NestedItems.Items1Boxed](#items1boxed)<br> sealed interface for validated payloads |
| record | [NestedItems.Items1BoxedList](#items1boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedItems.Items1](#items1)<br> schema class |
| static class | [NestedItems.ItemsListBuilder1](#itemslistbuilder1)<br> builder for List payloads |
| static class | [NestedItems.ItemsList1](#itemslist1)<br> output class for List payloads |
| sealed interface | [NestedItems.Items2Boxed](#items2boxed)<br> sealed interface for validated payloads |
| record | [NestedItems.Items2BoxedList](#items2boxedlist)<br> boxed class to store validated List payloads |
| static class | [NestedItems.Items2](#items2)<br> schema class |
| static class | [NestedItems.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [NestedItems.ItemsList](#itemslist)<br> output class for List payloads |
| sealed interface | [NestedItems.Items3Boxed](#items3boxed)<br> sealed interface for validated payloads |
| record | [NestedItems.Items3BoxedNumber](#items3boxednumber)<br> boxed class to store validated Number payloads |
| static class | [NestedItems.Items3](#items3)<br> schema class |

## NestedItems1Boxed
sealed interface NestedItems1Boxed<br>
permits<br>
[NestedItems1BoxedList](#nesteditems1boxedlist)

sealed interface that stores validated payloads using boxed classes

## NestedItems1BoxedList
data class NestedItems1BoxedList<br>
implements [NestedItems1Boxed](#nesteditems1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedItems1BoxedList([NestedItemsList](#nesteditemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NestedItemsList](#nesteditemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## NestedItems1
class NestedItems1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.NestedItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
NestedItems.NestedItemsList validatedPayload =
    NestedItems.NestedItems1.validate(
    new NestedItems.NestedItemsListBuilder()
        .add(
            listOf(
                listOf(
                    listOf(
                        1
                    )
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items::class.java](#items) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [NestedItemsList](#nesteditemslist) | validate(arg: [List<*>](#nesteditemslistbuilder), configuration: SchemaConfiguration) |
| [NestedItems1BoxedList](#nesteditems1boxedlist) | validateAndBox([List<*>](#nesteditemslistbuilder), configuration: SchemaConfiguration) |
| [NestedItems1Boxed](#nesteditems1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## NestedItemsListBuilder
class NestedItemsListBuilder<br>
builder for `List<List<List<List<Number>>>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| NestedItemsListBuilder()<br>Creates an empty list |
| NestedItemsListBuilder(List<List<List<List<Number>>>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| NestedItemsListBuilder | add(item: List<List<List<Number>>>) |
| List<List<List<List<Number>>>> | build()<br>Returns list input that should be used with Schema.validate |

## NestedItemsList
class NestedItemsList<br>
extends `FrozenList<ItemsList2>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [NestedItemsList](#nesteditemslist) | of([List<List<List<List<Number>>>>](#nesteditemslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
sealed interface ItemsBoxed<br>
permits<br>
[ItemsBoxedList](#itemsboxedlist)

sealed interface that stores validated payloads using boxed classes

## ItemsBoxedList
data class ItemsBoxedList<br>
implements [ItemsBoxed](#itemsboxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedList([ItemsList2](#itemslist2) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList2](#itemslist2) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items
class Items<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.NestedItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
NestedItems.ItemsList2 validatedPayload =
    NestedItems.Items.validate(
    new NestedItems.ItemsListBuilder2()
        .add(
            listOf(
                listOf(
                    1
                )
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items1::class.java](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList2](#itemslist2) | validate(arg: [List<*>](#itemslistbuilder2), configuration: SchemaConfiguration) |
| [ItemsBoxedList](#itemsboxedlist) | validateAndBox([List<*>](#itemslistbuilder2), configuration: SchemaConfiguration) |
| [ItemsBoxed](#itemsboxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsListBuilder2
class ItemsListBuilder2<br>
builder for `List<List<List<Number>>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder2()<br>Creates an empty list |
| ItemsListBuilder2(List<List<List<Number>>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder2 | add(item: List<List<Number>>) |
| List<List<List<Number>>> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList2
class ItemsList2<br>
extends `FrozenList<ItemsList1>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList2](#itemslist2) | of([List<List<List<Number>>>](#itemslistbuilder2) arg, SchemaConfiguration configuration) |

## Items1Boxed
sealed interface Items1Boxed<br>
permits<br>
[Items1BoxedList](#items1boxedlist)

sealed interface that stores validated payloads using boxed classes

## Items1BoxedList
data class Items1BoxedList<br>
implements [Items1Boxed](#items1boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items1BoxedList([ItemsList1](#itemslist1) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList1](#itemslist1) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items1
class Items1<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.NestedItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
NestedItems.ItemsList1 validatedPayload =
    NestedItems.Items1.validate(
    new NestedItems.ItemsListBuilder1()
        .add(
            listOf(
                1
            )
        )
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items2::class.java](#items2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList1](#itemslist1) | validate(arg: [List<*>](#itemslistbuilder1), configuration: SchemaConfiguration) |
| [Items1BoxedList](#items1boxedlist) | validateAndBox([List<*>](#itemslistbuilder1), configuration: SchemaConfiguration) |
| [Items1Boxed](#items1boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsListBuilder1
class ItemsListBuilder1<br>
builder for `List<List<Number>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder1()<br>Creates an empty list |
| ItemsListBuilder1(List<List<Number>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder1 | add(item: List<Number>) |
| List<List<Number>> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList1
class ItemsList1<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList1](#itemslist1) | of([List<List<Number>>](#itemslistbuilder1) arg, SchemaConfiguration configuration) |

## Items2Boxed
sealed interface Items2Boxed<br>
permits<br>
[Items2BoxedList](#items2boxedlist)

sealed interface that stores validated payloads using boxed classes

## Items2BoxedList
data class Items2BoxedList<br>
implements [Items2Boxed](#items2boxed)

data class that stores validated List payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items2BoxedList([ItemsList](#itemslist) data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items2
class Items2<br>
extends JsonSchema

A schema class that validates payloads

### Code Sample
```
import org.openapijsonschematools.client.configurations.JsonSchemaKeywordFlags;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.ValidationException;
import org.openapijsonschematools.client.schemas.validation.MapUtils;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;
import org.openapijsonschematools.client.components.schemas.NestedItems;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(new JsonSchemaKeywordFlags.Builder().build());

// List validation
NestedItems.ItemsList validatedPayload =
    NestedItems.Items2.validate(
    new NestedItems.ItemsListBuilder()
        .add(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = setOf(List::class.java) |
| Class<? extends JsonSchema> | items = [Items3::class.java](#items3) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | validate(arg: [List<*>](#itemslistbuilder), configuration: SchemaConfiguration) |
| [Items2BoxedList](#items2boxedlist) | validateAndBox([List<*>](#itemslistbuilder), configuration: SchemaConfiguration) |
| [Items2Boxed](#items2boxed) | validateAndBox(Any?, configuration: SchemaConfiguration) |
| Any? | validate(arg: Any?, configuration: SchemaConfiguration) |

## ItemsListBuilder
class ItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder()<br>Creates an empty list |
| ItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder | add(item: Int) |
| ItemsListBuilder | add(item: Float) |
| ItemsListBuilder | add(item: Long) |
| ItemsListBuilder | add(item: Double) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList
class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Number>](#itemslistbuilder) arg, SchemaConfiguration configuration) |

## Items3Boxed
sealed interface Items3Boxed<br>
permits<br>
[Items3BoxedNumber](#items3boxednumber)

sealed interface that stores validated payloads using boxed classes

## Items3BoxedNumber
data class Items3BoxedNumber<br>
implements [Items3Boxed](#items3boxed)

data class that stores validated Number payloads, sealed permits implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Items3BoxedNumber(Number data)<br>Creates an instance, private visibility |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Number | data()<br>validated payload |
| Any? | getData()<br>validated payload |

## Items3
class Items3<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
