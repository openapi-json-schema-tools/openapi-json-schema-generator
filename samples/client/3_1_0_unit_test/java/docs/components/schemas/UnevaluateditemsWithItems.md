# UnevaluateditemsWithItems
org.openapijsonschematools.client.components.schemas.UnevaluateditemsWithItems.java
public class UnevaluateditemsWithItems

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItems1](#unevaluateditemswithitems1)<br> schema class |
| static class | [UnevaluateditemsWithItems.UnevaluatedItems](#unevaluateditems)<br> schema class |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsListBuilder](#unevaluateditemswithitemslistbuilder)<br> builder for List payloads |
| static class | [UnevaluateditemsWithItems.UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist)<br> output class for List payloads |
| static class | [UnevaluateditemsWithItems.Items](#items)<br> schema class |

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

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [UnevaluateditemsWithItemsList](#unevaluateditemswithitemslist) | validate([List<?>](#unevaluateditemswithitemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## UnevaluatedItems
public static class UnevaluatedItems<br>
extends StringJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.StringJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

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

## Items
public static class Items<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
