# ArrayTest1
org.openapijsonschematools.components.schemas.ArrayTest.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**array_of_string** | List<String> |  | [optional]
**array_array_of_integer** | List<List<long>> |  | [optional]
**array_array_of_model** | List<List<Map<String, Object>>> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## ArrayTestMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static ArrayTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| ArrayOfStringList | array_of_string()<br>[optional] |
| ArrayArrayOfIntegerList | array_array_of_integer()<br>[optional] |
| ArrayArrayOfModelList | array_array_of_model()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |




[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
