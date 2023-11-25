# ReqPropsFromExplicitAddProps1
org.openapijsonschematools.components.schemas.ReqPropsFromExplicitAddProps.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, String> | ReqPropsFromExplicitAddPropsMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | String |  |
**validName** | String |  |
**any_string_name** | String | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromExplicitAddPropsMap
```
base class: FrozenMap<String, String>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**validName** |  |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, String> | ReqPropsFromExplicitAddPropsMap | a constructor
get | String | String | This model has invalid python names so this method is used under the hood when you access instance["invalid-name"], 
getAdditionalProperty | String | String | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
