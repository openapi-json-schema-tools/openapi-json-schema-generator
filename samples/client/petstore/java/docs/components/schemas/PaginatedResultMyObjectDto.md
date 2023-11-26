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


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
