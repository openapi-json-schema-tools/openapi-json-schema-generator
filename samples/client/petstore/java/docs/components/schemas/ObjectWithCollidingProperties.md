# ObjectWithCollidingProperties1
org.openapijsonschematools.components.schemas.ObjectWithCollidingProperties.java
```
type: JsonSchema
```

## Description
component with properties that have name collisions

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectWithCollidingPropertiesMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**someProp** | Map<String, Object> |  | [optional]
**someprop** | Map<String, Object> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithCollidingPropertiesMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**someProp** |  |  | [optional]
**someprop** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ObjectWithCollidingPropertiesMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties



[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
