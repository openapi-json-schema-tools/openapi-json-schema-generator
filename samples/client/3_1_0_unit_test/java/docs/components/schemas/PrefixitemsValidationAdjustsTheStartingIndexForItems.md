# PrefixitemsValidationAdjustsTheStartingIndexForItems
org.openapijsonschematools.client.components.schemas.PrefixitemsValidationAdjustsTheStartingIndexForItems.java
public class PrefixitemsValidationAdjustsTheStartingIndexForItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItems1](#prefixitemsvalidationadjuststhestartingindexforitems1)<br> schema class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Schema0](#schema0)<br> schema class |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder)<br> builder for List payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist)<br> output class for List payloads |
| static class | [PrefixitemsValidationAdjustsTheStartingIndexForItems.Items](#items)<br> schema class |

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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | validate([List<?>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## Schema0
public static class Schema0<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder
public class PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder<br>
builder for `List<Number>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder()<br>Creates an empty list |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder(List<Number> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(int item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(float item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(long item) |
| PrefixitemsValidationAdjustsTheStartingIndexForItemsListBuilder | add(double item) |
| List<Number> | build()<br>Returns list input that should be used with Schema.validate |

## PrefixitemsValidationAdjustsTheStartingIndexForItemsList
public class PrefixitemsValidationAdjustsTheStartingIndexForItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PrefixitemsValidationAdjustsTheStartingIndexForItemsList](#prefixitemsvalidationadjuststhestartingindexforitemslist) | of([List<Number>](#prefixitemsvalidationadjuststhestartingindexforitemslistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
