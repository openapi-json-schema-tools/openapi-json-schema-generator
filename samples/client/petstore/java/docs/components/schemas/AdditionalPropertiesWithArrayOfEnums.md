# AdditionalPropertiesWithArrayOfEnums1
org.openapijsonschematools.components.schemas.AdditionalPropertiesWithArrayOfEnums.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, List<String>> | AdditionalPropertiesWithArrayOfEnumsMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | List<String> | any string name can be used but the value must be the correct type | [optional]

## AdditionalPropertiesWithArrayOfEnumsMap
```
base class: FrozenMap<String, AdditionalPropertiesList>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, List<String>> | AdditionalPropertiesWithArrayOfEnumsMap | a constructor
getAdditionalProperty | String | AdditionalPropertiesList | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
