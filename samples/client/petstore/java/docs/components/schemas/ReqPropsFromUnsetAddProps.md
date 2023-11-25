# ReqPropsFromUnsetAddProps1
org.openapijsonschematools.components.schemas.ReqPropsFromUnsetAddProps.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ReqPropsFromUnsetAddPropsMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | Object |  |
**validName** | Object |  |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromUnsetAddPropsMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**validName** |  |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ReqPropsFromUnsetAddPropsMap | a constructor
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["invalid-name"], 
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
