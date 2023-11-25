# Apple1
org.openapijsonschematools.components.schemas.Apple.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| null | null | |
| Map<String, Object> | AppleMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**cultivar** | String |  |
**origin** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AppleMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | AppleMap | a constructor
**cultivar** | | String |
**origin** | | String | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
