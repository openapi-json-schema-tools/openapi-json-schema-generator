# ArrayTest1
org.openapijsonschematools.components.schemas.ArrayTest.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | ArrayTestMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**array_of_string** | List<String> |  | [optional]
**array_array_of_integer** | List<List<long>> |  | [optional]
**array_array_of_model** | List<List<Map<String, Object>>> |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayTestMap
```
base class: FrozenMap<String, Object>
```

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
of | Map<String, Object> | ArrayTestMap | a constructor
**array_of_string** | | ArrayOfStringList | [optional]
**array_array_of_integer** | | ArrayArrayOfIntegerList | [optional]
**array_array_of_model** | | ArrayArrayOfModelList | [optional]
getAdditionalProperty | String | Object | provides type safety for additional properties




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
