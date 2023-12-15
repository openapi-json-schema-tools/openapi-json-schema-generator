# ArrayOfNumberOnly
org.openapijsonschematools.client.components.schemas.ArrayOfNumberOnly.java
public class ArrayOfNumberOnly

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [ArrayOfNumberOnly.ArrayOfNumberOnly1](#arrayofnumberonly1)<br> schema class |
| static class | [ArrayOfNumberOnly.ArrayOfNumberOnlyMapInput](#arrayofnumberonlymapinput)<br> builder for Map payloads |
| static class | [ArrayOfNumberOnly.ArrayOfNumberOnlyMap](#arrayofnumberonlymap)<br> output class for Map payloads |
| static class | [ArrayOfNumberOnly.ArrayNumber](#arraynumber)<br> schema class |
| static class | [ArrayOfNumberOnly.ArrayNumberListInput](#arraynumberlistinput)<br> builder for List payloads |
| static class | [ArrayOfNumberOnly.ArrayNumberList](#arraynumberlist)<br> output class for List payloads |
| static class | [ArrayOfNumberOnly.Items](#items)<br> schema class |

## ArrayOfNumberOnly1
public static class ArrayOfNumberOnly1<br>
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
ArrayOfNumberOnly.ArrayOfNumberOnlyMap validatedPayload =
    ArrayOfNumberOnly.ArrayOfNumberOnly1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<>(
            "ArrayNumber",
            Arrays.asList(
                1
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenMap.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("ArrayNumber", [ArrayNumber.class](#arraynumber)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfNumberOnlyMap](#arrayofnumberonlymap) | validate([Map<String, Object>](#arrayofnumberonlymapinput) arg, SchemaConfiguration configuration) |

## ArrayOfNumberOnlyMapInput
public class ArrayOfNumberOnlyMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **ArrayNumber** | List<Number> |  | [optional] |
| **anyStringName** | Object | any string name can be used but the value must be the correct type | [optional] |

## ArrayOfNumberOnlyMap
public static class ArrayOfNumberOnlyMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayOfNumberOnlyMap](#arrayofnumberonlymap) | of([Map<String, Object>](#arrayofnumberonlymapinput) arg, SchemaConfiguration configuration) |
| [ArrayNumberList](#arraynumberlist) | ArrayNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

## ArrayNumber
public static class ArrayNumber<br>
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
ArrayOfNumberOnly.ArrayNumberList validatedPayload =
    ArrayOfNumberOnly.ArrayNumber.validate(
    Arrays.asList(
        1
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(FrozenList.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [Items.class](#items)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNumberList](#arraynumberlist) | validate([List<Number>](#arraynumberlistinput) arg, SchemaConfiguration configuration) |

## ArrayNumberListInput
public class ArrayNumberListInput<br>
builder for `List<Number>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Number |  |

## ArrayNumberList
public class ArrayNumberList<br>
extends `FrozenList<Number>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ArrayNumberList](#arraynumberlist) | of([List<Number>](#arraynumberlistinput) arg, SchemaConfiguration configuration) |

## Items
public static class Items<br>
extends NumberJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NumberJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
