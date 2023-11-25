# ObjectWithDecimalProperties1
org.openapijsonschematools.components.schemas.ObjectWithDecimalProperties.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ObjectWithDecimalPropertiesMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**length** | String |  | [optional]
**width** | String |  | [optional] value must be int or float numeric
**cost** | Map<String, Object> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDecimalPropertiesMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ObjectWithDecimalPropertiesMap | a constructor
**length** | | String | [optional]
**width** | | String | [optional] value must be int or float numeric
**cost** | | Money.MoneyMap | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
