# EnumTest
petstore_api.components.schema.enum_test
```
type: schemas.Schema
```

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
**enum_string_required** | typing_extensions.Literal["UPPER", "lower", ""] |  | must be one of ["UPPER", "lower", ""]
**enum_string** | typing_extensions.Literal["UPPER", "lower", ""] |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | typing_extensions.Literal[1, -1] |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | None, typing_extensions.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"] |  | [optional]
**IntegerEnum** | typing_extensions.Literal[0, 1, 2] |  | [optional]
**StringEnumWithDefaultValue** | typing_extensions.Literal["placed", "approved", "delivered"] |  | [optional]
**IntegerEnumWithDefaultValue** | typing_extensions.Literal[0, 1, 2] |  | [optional]
**IntegerEnumOneValue** | typing_extensions.Literal[0] |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## EnumTestDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**enum_string_required** | typing_extensions.Literal["UPPER", "lower", ""] |  | must be one of ["UPPER", "lower", ""]
**enum_string** | typing_extensions.Literal["UPPER", "lower", ""], schemas.Unset |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | typing_extensions.Literal[1, -1], schemas.Unset |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int, schemas.Unset |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | None, typing_extensions.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"], schemas.Unset |  | [optional]
**IntegerEnum** | typing_extensions.Literal[0, 1, 2], schemas.Unset |  | [optional]
**StringEnumWithDefaultValue** | typing_extensions.Literal["placed", "approved", "delivered"], schemas.Unset |  | [optional]
**IntegerEnumWithDefaultValue** | typing_extensions.Literal[0, 1, 2], schemas.Unset |  | [optional]
**IntegerEnumOneValue** | typing_extensions.Literal[0], schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**enum_string_required** | typing_extensions.Literal["UPPER", "lower", ""] |  | must be one of ["UPPER", "lower", ""]
**enum_string** | typing_extensions.Literal["UPPER", "lower", ""], schemas.Unset |  | [optional] must be one of ["UPPER", "lower", ""]
**enum_integer** | typing_extensions.Literal[1, -1], schemas.Unset |  | [optional] must be one of [1, -1] value must be a 32 bit integer
**enum_number** | float, int, schemas.Unset |  | [optional] must be one of [1.1, -1.2] value must be a 64 bit float
**stringEnum** | None, typing_extensions.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"], schemas.Unset |  | [optional]
**IntegerEnum** | typing_extensions.Literal[0, 1, 2], schemas.Unset |  | [optional]
**StringEnumWithDefaultValue** | typing_extensions.Literal["placed", "approved", "delivered"], schemas.Unset |  | [optional]
**IntegerEnumWithDefaultValue** | typing_extensions.Literal[0, 1, 2], schemas.Unset |  | [optional]
**IntegerEnumOneValue** | typing_extensions.Literal[0], schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EnumTestDictInput](#enumtestdictinput), [EnumTestDict](#enumtestdict) | [EnumTestDict](#enumtestdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
