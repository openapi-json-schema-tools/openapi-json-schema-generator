# Whale1
org.openapijsonschematools.components.schemas.Whale.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | WhaleMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["whale"]
**hasBaleen** | boolean |  | [optional]
**hasTeeth** | boolean |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## WhaleMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** |  |  |
**hasBaleen** |  |  | [optional]
**hasTeeth** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | WhaleMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
