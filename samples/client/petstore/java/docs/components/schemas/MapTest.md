# MapTest1
org.openapijsonschematools.components.schemas.MapTest.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | MapTestMap | |

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
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## MapTestMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**map_map_of_string** |  |  | [optional]
**map_of_enum_string** |  |  | [optional]
**direct_map** |  |  | [optional]
**indirect_map** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | MapTestMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
