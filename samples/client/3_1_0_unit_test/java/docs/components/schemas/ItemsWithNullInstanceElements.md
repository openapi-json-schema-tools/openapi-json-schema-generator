# ItemsWithNullInstanceElements
org.openapijsonschematools.client.components.schemas.ItemsWithNullInstanceElements.java
public class ItemsWithNullInstanceElements

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1](#itemswithnullinstanceelements1)<br> schema class |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder](#itemswithnullinstanceelementslistbuilder)<br> builder for List payloads |
| static class | [ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist)<br> output class for List payloads |
| static class | [ItemsWithNullInstanceElements.Items](#items)<br> schema class |

## ItemsWithNullInstanceElements1
public static class ItemsWithNullInstanceElements1<br>
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
ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsList validatedPayload =
    ItemsWithNullInstanceElements.ItemsWithNullInstanceElements1.validate(
    new ItemsWithNullInstanceElements.ItemsWithNullInstanceElementsListBuilder()
        .add(null)

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
| [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | validate([List<?>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ItemsWithNullInstanceElementsListBuilder
public class ItemsWithNullInstanceElementsListBuilder<br>
builder for `List<Void>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsWithNullInstanceElementsListBuilder()<br>Creates an empty list |
| ItemsWithNullInstanceElementsListBuilder(List<Void> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsWithNullInstanceElementsListBuilder | add(Void item) |
| List<Void> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsWithNullInstanceElementsList
public class ItemsWithNullInstanceElementsList<br>
extends `FrozenList<Void>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsWithNullInstanceElementsList](#itemswithnullinstanceelementslist) | of([List<Void>](#itemswithnullinstanceelementslistbuilder) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends NullJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
