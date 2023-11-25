# ReadOnlyFirst1
org.openapijsonschematools.components.schemas.ReadOnlyFirst.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ReadOnlyFirstMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | String |  | [optional]
**baz** | String |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ReadOnlyFirstMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**bar** |  |  | [optional]
**baz** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ReadOnlyFirstMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
