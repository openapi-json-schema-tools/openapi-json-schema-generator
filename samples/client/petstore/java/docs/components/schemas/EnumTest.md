# EnumTest1
org.openapijsonschematools.components.schemas.EnumTest.java
```
type: JsonSchema
```

## validate method
| Input Type | Return Type | Notes |
| ---------- | ----------- | ----- |
| Map<String, Object> | EnumTestMap | |

## Input Map Keys
```
type: Map<String, Object>
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_string_required** | String |  |
**enum_string** | String |  | [optional]
**enum_integer** | int |  | [optional]
**enum_number** | double |  | [optional]
**stringEnum** | String |  | [optional]
**IntegerEnum** | long |  | [optional]
**StringEnumWithDefaultValue** | String |  | [optional]
**IntegerEnumWithDefaultValue** | long |  | [optional]
**IntegerEnumOneValue** | long |  | [optional]
**any_string_name** | Object | any string name can be used but the value must be the correct type | [optional]

## EnumTestMap
```
base class: FrozenMap<String, Object>
```

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_string_required** |  |  |
**enum_string** |  |  | [optional]
**enum_integer** |  |  | [optional]
**enum_number** |  |  | [optional]
**stringEnum** |  |  | [optional]
**IntegerEnum** |  |  | [optional]
**StringEnumWithDefaultValue** |  |  | [optional]
**IntegerEnumWithDefaultValue** |  |  | [optional]
**IntegerEnumOneValue** |  |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ |  |  | a constructor
get_additional_property_ | String | FrozenMap, FrozenList, float, int, String, boolean, null, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
