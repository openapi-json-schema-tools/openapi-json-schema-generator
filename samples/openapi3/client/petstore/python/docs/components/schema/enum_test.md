petstore_api.components.schema.enum_test
# Schema EnumTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_string_required** | str | str |  | must be one of ["UPPER", "lower", ""]
**enum_string** | str | str |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int | int |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int | float, int |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.md), None, str | [**StringEnum**](string_enum.md) |  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.md), int | [**IntegerEnum**](integer_enum.md) |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md), str | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md) |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md), int | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md) |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.md), int | [**IntegerEnumOneValue**](integer_enum_one_value.md) |  | [optional]
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
