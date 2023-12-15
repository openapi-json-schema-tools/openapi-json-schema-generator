# Items
org.openapijsonschematools.client.components.schemas.Items.java
public class Items

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [Items.Items1](#items1)<br> schema class |
| static class | [Items.ItemsListInput](#itemslistinput)<br> builder for List payloads |
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
import org.openapijsonschematools.client.schemas.MapMaker;
import org.openapijsonschematools.client.schemas.validation.FrozenList;
import org.openapijsonschematools.client.schemas.validation.FrozenMap;

import java.util.Arrays;
import java.util.List;
import java.util.AbstractMap;

static final SchemaConfiguration configuration = new SchemaConfiguration(JsonSchemaKeywordFlags.ofNone());

// List validation
Items.ItemsList validatedPayload =
    Items.Items1.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenList.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items2.class](#items2)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | validate([List<Map<String, Object>>](#itemslistinput) arg, SchemaConfiguration configuration) |

## ItemsListInput
public class ItemsListInput<br>
builder for `List<Map<String, Object>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, Object> |  |

## ItemsList
public class ItemsList<br>
extends `FrozenList<FrozenMap<Object>>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Map<String, Object>>](#itemslistinput) arg, SchemaConfiguration configuration) |

## Items2
public static class Items2<br>
extends MapJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.MapJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
