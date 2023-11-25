# MixedPropertiesAndAdditionalPropertiesClass1
org.openapijsonschematools.components.schemas.MixedPropertiesAndAdditionalPropertiesClass.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | MixedPropertiesAndAdditionalPropertiesClassMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | String |  | [optional] value must be a uuid
**dateTime** | String |  | [optional] value must conform to RFC-3339 date-time
**map** | Map<String, Map<String, Object>> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## MixedPropertiesAndAdditionalPropertiesClassMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | MixedPropertiesAndAdditionalPropertiesClassMap | a constructor
**dateTime** | | String | [optional] value must conform to RFC-3339 date-time
get | String | Object | This model has invalid python names so this method is used under the hood when you access instance["uuid"], instance["map"], 
getAdditionalProperty | String | Object | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
