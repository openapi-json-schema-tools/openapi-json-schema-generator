# petstore_api.components.schema.enum_test_oapg.EnumTest

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
**stringEnum** | [**string_enum_oapg.StringEnum**](string_enum_oapg.StringEnum.md) | [**string_enum_oapg.StringEnum**](string_enum_oapg.StringEnum.md) |  | [optional] 
**IntegerEnum** | [**integer_enum_oapg.IntegerEnum**](integer_enum_oapg.IntegerEnum.md) | [**integer_enum_oapg.IntegerEnum**](integer_enum_oapg.IntegerEnum.md) |  | [optional] 
**StringEnumWithDefaultValue** | [**string_enum_with_default_value_oapg.StringEnumWithDefaultValue**](string_enum_with_default_value_oapg.StringEnumWithDefaultValue.md) | [**string_enum_with_default_value_oapg.StringEnumWithDefaultValue**](string_enum_with_default_value_oapg.StringEnumWithDefaultValue.md) |  | [optional] 
**IntegerEnumWithDefaultValue** | [**integer_enum_with_default_value_oapg.IntegerEnumWithDefaultValue**](integer_enum_with_default_value_oapg.IntegerEnumWithDefaultValue.md) | [**integer_enum_with_default_value_oapg.IntegerEnumWithDefaultValue**](integer_enum_with_default_value_oapg.IntegerEnumWithDefaultValue.md) |  | [optional] 
**IntegerEnumOneValue** | [**integer_enum_one_value_oapg.IntegerEnumOneValue**](integer_enum_one_value_oapg.IntegerEnumOneValue.md) | [**integer_enum_one_value_oapg.IntegerEnumOneValue**](integer_enum_one_value_oapg.IntegerEnumOneValue.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../../README.md#documentation-for-models) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to README]](../../../README.md)

