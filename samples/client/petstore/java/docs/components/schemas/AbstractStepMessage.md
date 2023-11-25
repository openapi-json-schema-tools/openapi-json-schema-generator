# AbstractStepMessage1
org.openapijsonschematools.components.schemas.AbstractStepMessage.java
```
type: JsonSchema
```

## Description
Abstract Step

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | AbstractStepMessageMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**description** | Object |  |
**discriminator** | String |  |
**sequenceNumber** | Object |  |
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## AbstractStepMessageMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | AbstractStepMessageMap | a constructor
**description** | | Object |
**discriminator** | | String |
**sequenceNumber** | | Object |
getAdditionalProperty | String | Object | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
 |  | 

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
