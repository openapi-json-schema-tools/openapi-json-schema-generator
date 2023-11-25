# Zebra1
org.openapijsonschematools.components.schemas.Zebra.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ZebraMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | String |  | must be one of ["zebra"]
**type** | String |  | [optional] must be one of ["plains", "mountain", "grevys"]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ZebraMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** |  |  |
**type** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ZebraMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
