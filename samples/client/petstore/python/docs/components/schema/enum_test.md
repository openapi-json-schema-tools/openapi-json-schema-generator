petstore_api.components.schema.enum_test
# Schema EnumTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[EnumTestDictInput](#enumtestdictinput) | [EnumTestDict](#enumtestdict) |  |

## EnumTestDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**enum_string_required** | str |  | must be one of ["UPPER", "lower", ""]
**enum_string** | str |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.md), None, str |  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.md), int |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md), str |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md), int |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.md), int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## EnumTestDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_string_required** | str | str |  | must be one of ["UPPER", "lower", ""]
**enum_string** | str, schemas.Unset | str, schemas.Unset |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int, schemas.Unset | int, schemas.Unset |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int, schemas.Unset | float, int, schemas.Unset |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.md), None, str, schemas.Unset | [**StringEnum**](string_enum.md) |  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.md), int, schemas.Unset | [**IntegerEnum**](integer_enum.md) |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md), str, schemas.Unset | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md) |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md), int, schemas.Unset | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md) |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.md), int, schemas.Unset | [**IntegerEnumOneValue**](integer_enum_one_value.md) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
