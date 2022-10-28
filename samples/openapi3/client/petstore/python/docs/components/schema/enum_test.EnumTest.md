<a id="EnumTest"></a>
# petstore_api.components.schema.enum_test.EnumTest

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
**stringEnum** | [**StringEnum**](string_enum.StringEnum.md) | [**StringEnum**](string_enum.StringEnum.md) |  | [optional] 
**IntegerEnum** | [**IntegerEnum**](integer_enum.IntegerEnum.md) | [**IntegerEnum**](integer_enum.IntegerEnum.md) |  | [optional] 
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.StringEnumWithDefaultValue.md) | [**StringEnumWithDefaultValue**](string_enum_with_default_value.StringEnumWithDefaultValue.md) |  | [optional] 
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.IntegerEnumWithDefaultValue.md) | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.IntegerEnumWithDefaultValue.md) |  | [optional] 
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.IntegerEnumOneValue.md) | [**IntegerEnumOneValue**](integer_enum_one_value.IntegerEnumOneValue.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../../README.md#documentation-for-models) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to README]](../../../README.md)

