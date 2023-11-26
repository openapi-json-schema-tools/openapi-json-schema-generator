# PaginatedResultMyObjectDto
org.openapijsonschematools.components.schemas.PaginatedResultMyObjectDto.java
public class PaginatedResultMyObjectDto

A class that contains necessary nested schema classes, and classes to store validated list and map payloads

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1<br> schema class |
| static class | PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap<br> output class for Map payloads |
| static class | PaginatedResultMyObjectDto.Results<br> schema class |
| static class | PaginatedResultMyObjectDto.ResultsList<br> output class for List payloads |
| static class | PaginatedResultMyObjectDto.Count<br> schema class |
| static class | PaginatedResultMyObjectDto.AdditionalProperties<br> schema class |

## PaginatedResultMyObjectDto1
public class PaginatedResultMyObjectDto1
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PaginatedResultMyObjectDtoMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**count** | long |  |
**results** | List<Map<String, String>> |  |

## PaginatedResultMyObjectDtoMap
public class PaginatedResultMyObjectDtoMap
extends FrozenMap<String, Object>

A class to store validated Map payloads

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PaginatedResultMyObjectDtoMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | count()<br> |
| ResultsList | results()<br> |

## Results
public class Results
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ResultsList | validate(List<Map<String, String>> arg, SchemaConfiguration configuration) |

## ResultsList
public class ResultsList
extends FrozenList<MyObjectDto.MyObjectDtoMap>

A class to store validated List payloads

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int |  | This method is used under the hood when instance[0] is called

## Input List Items
```
type: List<Map<String, String>>
```
List Item Type | Description | Notes
-------------------- | ------------- | -------------
Map<String, String> |  |

## Count
public class Count
extends JsonSchema

A schema class that validates payloads

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static long | validate(long arg, SchemaConfiguration configuration) |

## AdditionalProperties
public class AdditionalProperties
extends JsonSchema

A schema class that validates payloads

## Method Summary
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
