# EnumArrays1
org.openapijsonschematools.components.schemas.EnumArrays.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumArraysMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | String |  | [optional] must be one of [">=", "$"]
**array_enum** | List<String> |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## EnumArraysMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumArraysMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | just_symbol()<br>[optional] must be one of [">=", "$"] |
| ArrayEnumList | array_enum()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |


[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
