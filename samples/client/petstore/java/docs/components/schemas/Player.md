# Player1
org.openapijsonschematools.components.schemas.Player.java
```
type: JsonSchema
```

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | PlayerMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | String |  | [optional]
**enemyPlayer** | Map |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## PlayerMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | PlayerMap | a constructor
**name** | | String | [optional]
**enemyPlayer** | | PlayerMap | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
