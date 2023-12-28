# ArrayOfArrayOfNumberOnly
org.openapijsonschematools.client.components.schemas.ArrayOfArrayOfNumberOnly.java
public class ArrayOfArrayOfNumberOnly

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to build inputs for list payloads
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1](#arrayofarrayofnumberonly1)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMapInput](#arrayofarrayofnumberonlymapinput)<br> builder for Map payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap)<br> output class for Map payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumber](#arrayarraynumber)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberListInput](#arrayarraynumberlistinput)<br> builder for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.ArrayArrayNumberList](#arrayarraynumberlist)<br> output class for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.Items](#items)<br> schema class |
| static class | [ArrayOfArrayOfNumberOnly.ItemsListInput](#itemslistinput)<br> builder for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.ItemsList](#itemslist)<br> output class for List payloads |
| static class | [ArrayOfArrayOfNumberOnly.Items1](#items1)<br> schema class |

## ArrayOfArrayOfNumberOnly1
public static class ArrayOfArrayOfNumberOnly1<br>
extends JsonSchema

A schema class that validates payloads

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

// Map validation
ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnlyMap validatedPayload =
    ArrayOfArrayOfNumberOnly.ArrayOfArrayOfNumberOnly1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "ArrayArrayNumber",
            Arrays.asList(
                Arrays.asList(
                    1
                )
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(Map.class) |
| Map<String, Class<? extends JsonSchema>> | properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ArrayArrayNumber", [ArrayArrayNumber.class](#arrayarraynumber)))<br>)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) | validate([Map<?, ?>](#arrayofarrayofnumberonlymapinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayOfArrayOfNumberOnlyMapInput
public class ArrayOfArrayOfNumberOnlyMapInput<br>
builder for `Map<String, ? extends @Nullable Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **ArrayArrayNumber** | List<List<Number>> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ArrayOfArrayOfNumberOnlyMap
public static class ArrayOfArrayOfNumberOnlyMap<br>
extends FrozenMap<String, @Nullable Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfArrayOfNumberOnlyMap](#arrayofarrayofnumberonlymap) | of([Map<String, ? extends @Nullable Object>](#arrayofarrayofnumberonlymapinput) arg, SchemaConfiguration configuration) |
| [ArrayArrayNumberList](#arrayarraynumberlist) | ArrayArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayArrayNumber
public static class ArrayArrayNumber<br>
extends JsonSchema

A schema class that validates payloads

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
ArrayOfArrayOfNumberOnly.ArrayArrayNumberList validatedPayload =
    ArrayOfArrayOfNumberOnly.ArrayArrayNumber.validate(
    Arrays.asList(
        Arrays.asList(
            1
        )
    ),
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
| [ArrayArrayNumberList](#arrayarraynumberlist) | validate([List<?>](#arrayarraynumberlistinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ArrayArrayNumberListInput
public class ArrayArrayNumberListInput<br>
builder for `List<List<Number>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
List<Number> |  |

## ArrayArrayNumberList
public class ArrayArrayNumberList<br>
extends `FrozenList<ItemsList>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayArrayNumberList](#arrayarraynumberlist) | of([List<List<Number>>](#arrayarraynumberlistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends JsonSchema

A schema class that validates payloads

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
ArrayOfArrayOfNumberOnly.ItemsList validatedPayload =
    ArrayOfArrayOfNumberOnly.Items.validate(
    Arrays.asList(
        1
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | type = Set.of(List.class) |
| Class<? extends JsonSchema> | items = [Items1.class](#items1) |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ItemsList](#itemslist) | validate([List<?>](#itemslistinput) arg, SchemaConfiguration configuration) |
| @Nullable Object | validate(@Nullable Object arg, SchemaConfiguration configuration) |
## ItemsListInput
public class ItemsListInput<br>
builder for `List<Number>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## ItemsList
public class ItemsList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ItemsList](#itemslist) | of([List<Number>](#itemslistinput) arg, SchemaConfiguration configuration) |

## Items1
public static class Items1<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
