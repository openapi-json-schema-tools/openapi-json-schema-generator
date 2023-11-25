# NumberOnly
org.openapijsonschematools.components.schemas.NumberOnly.java

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | ---------------------- |
| static class | NumberOnly.JustNumber<br> schema class |
| static class | NumberOnly.NumberOnlyMap<br> output class for Map payloads |
| static class | NumberOnly.NumberOnly1<br> schema class |

## NumberOnly1
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NumberOnlyMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**JustNumber** | Number |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## NumberOnlyMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static NumberOnlyMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| Number | JustNumber()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
