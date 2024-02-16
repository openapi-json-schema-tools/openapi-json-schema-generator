# PrefixitemsValidationAdjustsTheStartingIndexForItems
org.openapijsonschematools.client.components.schemas.PrefixitemsValidationAdjustsTheStartingIndexForItems.java
public class PrefixitemsValidationAdjustsTheStartingIndexForItems<br>

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- abstract sealed classes which store validated payloads, java version of a sum type
- boxed classes which store validated payloads, sealed permits class implementations
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed](#prefixitemsvalidationadjuststhestartingindexforitems1boxed)<br> abstract sealed validated payload class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist)<br> boxed class to store validated List payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1](#prefixitemsvalidationadjuststhestartingindexforitems1)<br> schema class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0Boxed](#schema0boxed)<br> abstract sealed validated payload class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0BoxedString](#schema0boxedstring)<br> boxed class to store validated String payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0](#schema0)<br> schema class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder)<br> builder for List payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist)<br> output class for List payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.ItemsBoxed](#itemsboxed)<br> abstract sealed validated payload class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.ItemsBoxedNumber](#itemsboxednumber)<br> boxed class to store validated Number payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Items](#items)<br> schema class |

## PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed
public static abstract sealed class PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed<br>
permits<br>
[PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist)

abstract sealed class that stores validated payloads using boxed classes

## PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList
public static final class PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList<br>
extends [PrefixitemsValidationAdjustsTheStartingIndexForItems1Boxed](#prefixitemsvalidationadjuststhestartingindexforitems1boxed)

a boxed class to store validated List payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList([PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | data<br>validated payload |

## PrefixitemsValidationAdjustsTheStartingIndexForItems1
public static class PrefixitemsValidationAdjustsTheStartingIndexForItems1<br>
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
PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsList validatedPayload =
    PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1.validate(
    new PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()
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
| List<Class<? extends JsonSchema>> | prefixItems = List.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;[Schema0.class](#schema0)<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | validate([List<?>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |
| [PrefixitemsValidationAdjustsTheStartingIndexForItems1BoxedList](#prefixitemsvalidationadjuststhestartingindexforitems1boxedlist) | validateAndBox([List<?>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0Boxed
public static abstract sealed class Schema0Boxed<br>
permits<br>
[Schema0BoxedString](#schema0boxedstring)

abstract sealed class that stores validated payloads using boxed classes

## Schema0BoxedString
public static final class Schema0BoxedString<br>
extends [Schema0Boxed](#schema0boxed)

a boxed class to store validated String payloads, sealed permits class implementation

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| Schema0BoxedString(String data)<br>Creates an instance, private visibility |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| String | data<br>validated payload |

## Schema0
public static class Schema0<br>
extends StringJsonSchema.StringJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema.StringJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder
public class PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder<br>
builder for `List<Object>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()<br>Creates an empty list |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder(List<Object> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(int item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(float item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(long item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(double item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(String item) |
| List<Object> | build()<br>Returns list input that should be used with Schema.validate |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsList
public class PrefixitemsValidationAdjustsTheStartingIndexForItemsList<br>
extends `FrozenList<Object>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | of([List<Object>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |

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
extends IntJsonSchema.IntJsonSchema1

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema.IntJsonSchema1 |
| ------------------------------------------------------------------ |
| validate                                                           |
| validateAndBox                                                     |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
