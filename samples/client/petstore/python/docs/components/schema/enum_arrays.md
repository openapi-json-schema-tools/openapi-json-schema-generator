petstore_api.components.schema.enum_arrays
# Schema EnumArrays

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[EnumArraysDictInput](#enumarraysdictinput), [EnumArraysDict](#enumarraysdict) | [EnumArraysDict](#enumarraysdict) |

## EnumArraysDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | str |  | [optional] must be one of [">=", "$"]
**array_enum** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## EnumArraysDict
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**just_symbol** | str, schemas.Unset |  | [optional] must be one of [">=", "$"]
**array_enum** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**just_symbol** | str, schemas.Unset |  | [optional] must be one of [">=", "$"]
**array_enum** | [properties.ArrayEnum](#properties-arrayenum) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [EnumArraysDictInput](#enumarraysdictinput), [EnumArraysDict](#enumarraysdict) | [EnumArraysDict](#enumarraysdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# properties ArrayEnum

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayEnumTupleInput](#properties-arrayenum-arrayenumtupleinput), [ArrayEnumTuple](#properties-arrayenum-arrayenumtuple) | [ArrayEnumTuple](#properties-arrayenum-arrayenumtuple) |

## properties ArrayEnum ArrayEnumTupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  | must be one of ["fish", "crab"]

## properties ArrayEnum ArrayEnumTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | str | str |  | must be one of ["fish", "crab"]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
