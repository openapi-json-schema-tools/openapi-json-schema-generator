# UnevaluateditemsWithItems
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithItems.java
public class UnevaluateditemsWithItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1Boxed](#unevaluateditemswithitems1boxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1](#unevaluateditemswithitems1)<br> schema class |
| static class | [UnevaluateditemsWithItems.UnevaluatedItemsBoxed](#unevaluateditemsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsWithItems.UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)<br> boxed class to store validated String payloads |
| static class | [UnevaluateditemsWithItems.UnevaluatedItems](#unevaluateditems)<br> schema class |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder](#unevaluateditemswithitemslistbuilder)<br> builder for List payloads |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist)<br> output class for List payloads |
| static class | [UnevaluateditemsWithItems.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [UnevaluateditemsWithItems.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [UnevaluateditemsWithItems.Items](#items)<br> schema class |

## UnevaluateditemsWithItems1Boxed
public static abstract sealed class UnevaluateditemsWithItems1Boxed<br>
permits<br>
[UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluateditemsWithItems1BoxedList
public static final class UnevaluateditemsWithItems1BoxedList<br>
extends [UnevaluateditemsWithItems1Boxed](#unevaluateditemswithitems1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluateditemsWithItems1BoxedList([UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | data<br>validated payload |

## UnevaluateditemsWithItems1
public static class UnevaluateditemsWithItems1<br>
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

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
UnevaluateditemsWithItems.UnevaluateditemsWithItemsList validatedPayload =
    UnevaluateditemsWithItems.UnevaluateditemsWithItems1.validate(
    new UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder()
        .add(1)

    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items.class](#items) |
| Class<? extends JsonSchema> | unevaluatedItems = [UnevaluatedItems.class](#unevaluateditems) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | validate([List<?>](#unevaluateditemswithitemslistbuilder) arg, SchemaConfiguration configuration) |
| [UnevaluateditemsWithItems1BoxedList](#unevaluateditemswithitems1boxedlist) | validateAndBox([List<?>](#unevaluateditemswithitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedItemsBoxed
public static abstract sealed class UnevaluatedItemsBoxed<br>
permits<br>
[UnevaluatedItemsBoxedString](#unevaluateditemsboxedstring)

abstract sealed class that stores validated payloads using boxed classes

## UnevaluatedItemsBoxedString
public static final class UnevaluatedItemsBoxedString<br>
extends [UnevaluatedItemsBoxed](#unevaluateditemsboxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| UnevaluatedItemsBoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## UnevaluatedItems
public static class UnevaluatedItems<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## UnevaluateditemsWithItemsListBuilder
public class UnevaluateditemsWithItemsListBuilder<br>
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
| UnevaluateditemsWithItemsListBuilder | add(int item) |
| UnevaluateditemsWithItemsListBuilder | add(float item) |
| UnevaluateditemsWithItemsListBuilder | add(long item) |
| UnevaluateditemsWithItemsListBuilder | add(double item) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## UnevaluateditemsWithItemsList
public class UnevaluateditemsWithItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | of([List<Number>](#unevaluateditemswithitemslistbuilder) arg, SchemaConfiguration configuration) |

## ItemsBoxed
public static abstract sealed class ItemsBoxed<br>
permits<br>
[ItemsBoxedNumber](#itemsboxednumber)

abstract sealed class that stores validated payloads using boxed classes

## ItemsBoxedNumber
public static final class ItemsBoxedNumber<br>
extends [ItemsBoxed](#itemsboxed)

a boxed class to store validated Number payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsBoxedNumber(Number data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Number | data<br>validated payload |

## Items
public static class Items<br>
extends NumberJsonSchema.NumberJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema.NumberJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
