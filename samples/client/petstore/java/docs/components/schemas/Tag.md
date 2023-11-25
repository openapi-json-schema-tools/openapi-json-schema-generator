# Tag1
org.openapijsonschematools.components.schemas.Tag.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | TagMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | long |  | [optional] value must be a 64 bit integer
**name** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## TagMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | TagMap | a constructor
**id** | | long | [optional] value must be a 64 bit integer
**name** | | String | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
