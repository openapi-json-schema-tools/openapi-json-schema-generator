petstore_api.components.schema.enum_test
# EnumTest

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**enum_string_required** | str,  | str,  |  | must be one of ["UPPER", "lower", "", ]
**enum_string** | str,  | str,   | [optional] must be one of ["UPPER", "lower", "", ]
**enum_integer** | decimal.Decimal, int,  | decimal.Decimal,   | [optional] must be one of [1, -1, ] value must be a 32 bit integer
**enum_number** | decimal.Decimal, int, float,  | decimal.Decimal,   | [optional] must be one of [1.1, -1.2, ] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.StringEnum.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**StringEnum**](string_enum.StringEnum.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.IntegerEnum.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**IntegerEnum**](integer_enum.IntegerEnum.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.StringEnumWithDefaultValue.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**StringEnumWithDefaultValue**](string_enum_with_default_value.StringEnumWithDefaultValue.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.IntegerEnumWithDefaultValue.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.IntegerEnumWithDefaultValue.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.IntegerEnumOneValue.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**IntegerEnumOneValue**](integer_enum_one_value.IntegerEnumOneValue.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
