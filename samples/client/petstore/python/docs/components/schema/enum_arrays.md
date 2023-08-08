petstore_api.components.schema.enum_arrays
# Schema EnumArrays

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[EnumArraysDictInput](#enumarraysdictinput) | [EnumArraysDict](#enumarraysdict) |  |

## EnumArraysDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**just_symbol** | str |  | [optional] must be one of [">=", "$"]
**array_enum** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## EnumArraysDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**just_symbol** | str, schemas.Unset | str, schemas.Unset |  | [optional] must be one of [">=", "$"]
**array_enum** | list, tuple, schemas.Unset | [properties.ArrayEnum](#properties-arrayenum) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

# properties ArrayEnum

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str | str |  | must be one of ["fish", "crab"]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
