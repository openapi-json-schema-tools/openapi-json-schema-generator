# Category1
org.openapijsonschematools.components.schemas.Category.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | CategoryMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  | if omitted the server will use the default value of default-name
**id** | long |  | [optional] value must be a 64 bit integer
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## CategoryMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | CategoryMap | a constructor
**name** | | String | if omitted the server will use the default value of default-name
**id** | | long | [optional] value must be a 64 bit integer
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
