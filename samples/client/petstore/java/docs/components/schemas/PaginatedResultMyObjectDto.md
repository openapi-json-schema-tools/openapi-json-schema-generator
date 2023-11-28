# PaginatedResultMyObjectDto
org.openapijsonschematools.components.schemas.PaginatedResultMyObjectDto.java
public class PaginatedResultMyObjectDto

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1](#paginatedresultmyobjectdto1)<br> schema class |
| static class | [PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap)<br> output class for Map payloads |
| static class | [PaginatedResultMyObjectDto.Results](#results)<br> schema class |
| static class | [PaginatedResultMyObjectDto.ResultsList](#resultslist)<br> output class for List payloads |
| static class | [PaginatedResultMyObjectDto.Count](#count)<br> schema class |
| static class | [PaginatedResultMyObjectDto.AdditionalProperties](#additionalproperties)<br> schema class |

## PaginatedResultMyObjectDto1
public static class PaginatedResultMyObjectDto1<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenMap.class))),<br>new KeywordEntry("properties", new PropertiesValidator(Map.ofEntries(<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("count", Count.class),<br>&nbsp;&nbsp;&nbsp;&nbsp;new PropertyEntry("results", Results.class)<br>))),<br>new KeywordEntry("required", new RequiredValidator(Set.of(
    "count",
    "results"
))),
new KeywordEntry("additionalProperties", new AdditionalPropertiesValidator(AdditionalProperties.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## PaginatedResultMyObjectDtoMap
public static class PaginatedResultMyObjectDtoMap<br>
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [PaginatedResultMyObjectDtoMap](#paginatedresultmyobjectdtomap) | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | count()<br> |
| [ResultsList](#resultslist) | results()<br> |

## Input Map Keys
```
type: Map<String, Object>
```
| Key | Type |  Description | Notes |
| --- | ---- | ------------ | ----- |
| **count** | long |  | |
| **results** | List<Map<String, String>> |  | |

## Results
public static class Results<br>
extends JsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |
| static LinkedHashMap<String, KeywordValidator> | keywordToValidator<br/><code>new LinkedHashMap<>(Map.ofEntries(<br/>new KeywordEntry("type", new TypeValidator(Set.of(FrozenList.class))),<br>new KeywordEntry("items", new ItemsValidator(MyObjectDto.MyObjectDto1.class))
));</code> |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ResultsList](#resultslist) | validate(List<Map<String, String>> arg, SchemaConfiguration configuration) |

## ResultsList
public class ResultsList<br>
extends FrozenList<MyObjectDto.MyObjectDtoMap>

A class to store validated List payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static [ResultsList](#resultslist) | of(List<Map<String, String>> arg, SchemaConfiguration configuration) |

## Input List Items
```
type: List<Map<String, String>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, String> |  |

## Count
public static class Count<br>
extends IntJsonSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## AdditionalProperties
public static class AdditionalProperties<br>
extends NotAnyTypeJsonSchema
    // NotAnyTypeSchema

A schema class that validates payloads
### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | ---------------------- |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static String | validate(String arg, SchemaConfiguration configuration) |
| static Void | validate(Void arg, SchemaConfiguration configuration) |
| static int | validate(int arg, SchemaConfiguration configuration) |
| static long | validate(long arg, SchemaConfiguration configuration) |
| static float | validate(float arg, SchemaConfiguration configuration) |
| static double | validate(double arg, SchemaConfiguration configuration) |
| static boolean | validate(boolean arg, SchemaConfiguration configuration) |
| static FrozenMap<String, Object> | Map<String, Object> arg, SchemaConfiguration configuration) |
| FrozenList<Object> | validate(List<Object> arg, SchemaConfiguration configuration) |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
