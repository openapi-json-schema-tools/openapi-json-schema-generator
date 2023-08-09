petstore_api.components.schema.enum_test
# EnumTest

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EnumTestDictInput](#enumtestdictinput), [EnumTestDict](#enumtestdict) | [EnumTestDict](#enumtestdict) |

## EnumTestDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
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
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**enum_string_required** | str |  | must be one of ["UPPER", "lower", ""]
**enum_string** | str, schemas.Unset |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int, schemas.Unset |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int, schemas.Unset |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.md), None, str, schemas.Unset |  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.md), int, schemas.Unset |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md), str, schemas.Unset |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md), int, schemas.Unset |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.md), int, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_string_required** | str |  | must be one of ["UPPER", "lower", ""]
**enum_string** | str, schemas.Unset |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | int, schemas.Unset |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int, schemas.Unset |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | [**StringEnum**](string_enum.md) |  | [optional]
**IntegerEnum** | [**IntegerEnum**](integer_enum.md) |  | [optional]
**StringEnumWithDefaultValue** | [**StringEnumWithDefaultValue**](string_enum_with_default_value.md) |  | [optional]
**IntegerEnumWithDefaultValue** | [**IntegerEnumWithDefaultValue**](integer_enum_with_default_value.md) |  | [optional]
**IntegerEnumOneValue** | [**IntegerEnumOneValue**](integer_enum_one_value.md) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EnumTestDictInput](#enumtestdictinput), [EnumTestDict](#enumtestdict) | [EnumTestDict](#enumtestdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
