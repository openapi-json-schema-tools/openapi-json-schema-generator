# FromSchema1
org.openapijsonschematools.components.schemas.FromSchema.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | FromSchemaMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**data** | String |  | [optional]
**id** | long |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## FromSchemaMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | FromSchemaMap | a constructor
**data** | | String | [optional]
**id** | | long | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
