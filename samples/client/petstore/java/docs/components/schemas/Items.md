# Items
org.openapijsonschematools.client.components.schemas.Items.java
public class Items

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Items.Items1](#items1)<br> schema class |
| static class | [Items.ItemsListBuilder](#itemslistbuilder)<br> builder for List payloads |
| static class | [Items.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [Items.Items2](#items2)<br> schema class |

## Items1
public static class Items1<br>
extends JsonSchema

A schema class that validates payloads

## Description
component&#x27;s name collides with the inner schema name

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
Items.ItemsList validatedPayload =
    Items.Items1.validate(
    new Items.ItemsListBuilder()
    .build(),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items2.class](#items2) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | validate([List<?>](#itemslistbuilder) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ItemsListBuilder
public class ItemsListBuilder<br>
builder for `List<Map<String, @Nullable Object>>`

A class that builds the List input type

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ItemsListBuilder()<br>Creates an empty list |
| ItemsListBuilder(List<Map<String, @Nullable Object>> items)<br>Stores the items in a list |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| ItemsListBuilder | add(Map<String, @Nullable Object> item) |
| List<Map<String, @Nullable Object>> | build()<br>Returns list input that should be used with Schema.validate |

## ItemsList
public class ItemsList<br>
extends `FrozenList<FrozenMap<?>>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Map<String, ? extends @Nullable Object>>](#itemslistbuilder) arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
