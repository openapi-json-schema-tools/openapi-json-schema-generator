# MapTest1
org.openapijsonschematools.components.schemas.MapTest.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**map_map_of_string** | Map<String, Map<String, String>> |  | [optional]
**map_of_enum_string** | Map<String, String> |  | [optional]
**direct_map** | Map<String, boolean> |  | [optional]
**indirect_map** | Map<String, boolean> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## MapTestMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static MapTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| MapMapOfStringMap | map_map_of_string()<br>[optional] |
| MapOfEnumStringMap | map_of_enum_string()<br>[optional] |
| DirectMapMap | direct_map()<br>[optional] |
| StringBooleanMap.StringBooleanMapMap | indirect_map()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
