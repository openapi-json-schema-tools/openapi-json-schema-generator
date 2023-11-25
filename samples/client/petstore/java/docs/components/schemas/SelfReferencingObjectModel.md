# SelfReferencingObjectModel1
org.openapijsonschematools.components.schemas.SelfReferencingObjectModel.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | SelfReferencingObjectModelMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**selfRef** | Map |  | [optional]
**any_string_name** | Map | any string name can be used but the value must be the correct type | [optional]

## SelfReferencingObjectModelMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**selfRef** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | SelfReferencingObjectModelMap | a constructor
getAdditionalProperty | String | SelfReferencingObjectModelMap | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
