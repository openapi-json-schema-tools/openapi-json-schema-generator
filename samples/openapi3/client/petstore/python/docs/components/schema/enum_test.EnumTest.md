<a name="top"></a>
## enum_test
# EnumTest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_string_required** | str,  | str,  |  | must be one of ["UPPER", "lower", "", ]
**enum_string** | str,  | str,  |  | [optional] must be one of ["UPPER", "lower", "", ]
**enum_integer** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] must be one of [1, -1, ] value must be a 32 bit integer
**enum_number** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] must be one of [1.1, -1.2, ] value must be a 64 bit float
**stringEnum** | [**StringEnum**](#StringEnum) | [**StringEnum**](#StringEnum) |  | [optional]
**IntegerEnum** | [**IntegerEnum**](#IntegerEnum) | [**IntegerEnum**](#IntegerEnum) |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](#StringEnumWithDefaultValue) | [**StringEnumWithDefaultValue**](#StringEnumWithDefaultValue) |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](#IntegerEnumWithDefaultValue) | [**IntegerEnumWithDefaultValue**](#IntegerEnumWithDefaultValue) |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](#IntegerEnumOneValue) | [**IntegerEnumOneValue**](#IntegerEnumOneValue) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)