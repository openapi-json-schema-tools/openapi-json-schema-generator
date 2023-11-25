# EnumArrays1
org.openapijsonschematools.components.schemas.EnumArrays.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | EnumArraysMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | String |  | [optional] must be one of [">=", "$"]
**array_enum** | List<String> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## EnumArraysMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | EnumArraysMap | a constructor
**just_symbol** | | String | [optional] must be one of [">=", "$"]
**array_enum** | | ArrayEnumList | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
