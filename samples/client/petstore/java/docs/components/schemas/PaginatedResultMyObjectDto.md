# PaginatedResultMyObjectDto
org.openapijsonschematools.components.schemas.PaginatedResultMyObjectDto.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | PaginatedResultMyObjectDto.AdditionalProperties<br> schema class |
| static class | PaginatedResultMyObjectDto.Count<br> schema class |
| static class | PaginatedResultMyObjectDto.ResultsList<br> output class for List payloads |
| static class | PaginatedResultMyObjectDto.Results<br> schema class |
| static class | PaginatedResultMyObjectDto.PaginatedResultMyObjectDtoMap<br> output class for Map payloads |
| static class | PaginatedResultMyObjectDto.PaginatedResultMyObjectDto1<br> schema class |

## PaginatedResultMyObjectDto1
```
type: JsonSchema
```

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
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static PaginatedResultMyObjectDtoMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| long | count()<br> |
| ResultsList | results()<br> |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
