# PaginatedResultMyObjectDto
org.openapijsonschematools.client.components.schemas.PaginatedResultMyObjectDto.java
public class PaginatedResultMyObjectDto

A class that contains necessary nested
- schema classes (which validate payloads), extends JsonSchema
- classes to store validated list payloads, extends FrozenList
- classes to store validated map payloads, extends FrozenMap
- classes to build inputs for list payloads
- classes to build inputs for map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1](#paginatedresultmyobjectdto1)<br> schema class |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMapInput](#paginatedresultmyobjectdtomapinput)<br> builder for Map payloads |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap)<br> output class for Map payloads |
| static class | [PaginatedResultMyObjectDto.Results](#results)<br> schema class |
| static class | [PaginatedResultMyObjectDto.ResultsListInput](#resultslistinput)<br> builder for List payloads |
| static class | [PaginatedResultMyObjectDto.ResultsList](#resultslist)<br> output class for List payloads |
| static class | [PaginatedResultMyObjectDto.Count](#count)<br> schema class |
| static class | [PaginatedResultMyObjectDto.AdditionalProperties](#additionalproperties)<br> schema class |

## PaginatedResultMyObjectDto1
public static class PaginatedResultMyObjectDto1<br>
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
PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap validatedPayload =
    PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1.validate(
    MapMaker.makeMap(
        new AbstractMap.SimpleEntry<String, Object>(
            "count",
            1L
        ),
        new AbstractMap.SimpleEntry<String, Object>(
            "results",
            Arrays.asList(
            )
        )
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(Map.class)<br/> |
| Map<String, Class<? extends JsonSchema>> | &nbsp;&nbsp;&nbsp;&nbsp;properties = Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("count", [Count.class](#count))),<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("results", [Results.class](#results)))<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Set<String> | &nbsp;&nbsp;&nbsp;&nbsp;required = Set.of(<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"count",<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"results"<br>&nbsp;&nbsp;&nbsp;&nbsp;)<br> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;additionalProperties = [AdditionalProperties.class](#additionalproperties)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | validate([Map<String, Object>](#paginatedresultmyobjectdtomapinput) arg, SchemaConfiguration configuration) |

## PaginatedResultMyObjectDtoMapInput
public class PaginatedResultMyObjectDtoMapInput<br>
builder for `Map<String, Object>`

A class that builds the Map input type

## Input Map Keys
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **count** | long |  | |
| **results** | List<Map<String, String>> |  | |

## PaginatedResultMyObjectDtoMap
public static class PaginatedResultMyObjectDtoMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | of([Map<String, Object>](#paginatedresultmyobjectdtomapinput) arg, SchemaConfiguration configuration) |
| long | count()<br> |
| [ResultsList](#resultslist) | results()<br> |

## Results
public static class Results<br>
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
PaginatedResultMyObjectDto.ResultsList validatedPayload =
    PaginatedResultMyObjectDto.Results.validate(
    Arrays.asList(
    ),
    configuration
);
```

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| Set<Class<?>> | &nbsp;&nbsp;&nbsp;&nbsp;type = Set.of(List.class)<br/> |
| Class<? extends JsonSchema> | &nbsp;&nbsp;&nbsp;&nbsp;items = [MyObjectDto.MyObjectDto1.class](../../components/schemas/MyObjectDto.md#myobjectdto1)<br> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ResultsList](#resultslist) | validate([List<Map<String, String>>](#resultslistinput) arg, SchemaConfiguration configuration) |

## ResultsListInput
public class ResultsListInput<br>
builder for `List<Map<String, String>>`

A class that builds the List input type

## Input List Items
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, String> |  |

## ResultsList
public class ResultsList<br>
extends `FrozenList<MyObjectDto.MyObjectDtoMap>`

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ResultsList](#resultslist) | of([List<Map<String, String>>](#resultslistinput) arg, SchemaConfiguration configuration) |

## Count
public static class Count<br>
extends IntJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.IntJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema

A schema class that validates payloads

| Methods Inherited from class org.openapijsonschematools.client.schemas.NotAnyTypeJsonSchema |
| ------------------------------------------------------------------ |
| validate                                                           |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
