# EnumTest1
org.openapijsonschematools.components.schemas.EnumTest.java
```
type: JsonSchema
```

## Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumTestMap | validate(Map<String, Object> arg, SchemaConfiguration configuration) |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_string_required** | String |  | must be one of ["UPPER", "lower", ""]
**enum_string** | String |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | double |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | String |  | [optional]
**IntegerEnum** | long |  | [optional]
**StringEnumWithDefaultValue** | String |  | [optional]
**IntegerEnumWithDefaultValue** | long |  | [optional]
**IntegerEnumOneValue** | long |  | [optional]
**anyStringName** | Object | any string name can be used but the value must be the correct type | [optional]

## EnumTestMap
```
base class: FrozenMap<String, Object>
```

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| static EnumTestMap | of(Map<String, Object> arg, SchemaConfiguration configuration) |
| String | enum_string_required()<br> must be one of ["UPPER", "lower", ""] |
| String | enum_string()<br>[optional] must be one of ["UPPER", "lower", ""] |
| int | enum_integer()<br>[optional] must be one of [1, -1] value must be a 32 bit integer |
| double | enum_number()<br>[optional] must be one of [1.1, -1.2] value must be a 64 bit float |
| String | stringEnum()<br>[optional] |
| long | IntegerEnum()<br>[optional] |
| String | StringEnumWithDefaultValue()<br>[optional] |
| long | IntegerEnumWithDefaultValue()<br>[optional] |
| long | IntegerEnumOneValue()<br>[optional] |
| Object | getAdditionalProperty(String name)<br>provides type safety for additional properties |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
