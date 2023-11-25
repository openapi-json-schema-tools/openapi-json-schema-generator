# Capitalization1
org.openapijsonschematools.components.schemas.Capitalization.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | CapitalizationMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**smallCamel** | String |  | [optional]
**CapitalCamel** | String |  | [optional]
**small_Snake** | String |  | [optional]
**Capital_Snake** | String |  | [optional]
**SCA_ETH_Flow_Points** | String |  | [optional]
**ATT_NAME** | String | Name of the pet  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## CapitalizationMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**smallCamel** |  |  | [optional]
**CapitalCamel** |  |  | [optional]
**small_Snake** |  |  | [optional]
**Capital_Snake** |  |  | [optional]
**SCA_ETH_Flow_Points** |  |  | [optional]
**ATT_NAME** |  | Name of the pet  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | CapitalizationMap | a constructor
getAdditionalProperty | String | Object | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
