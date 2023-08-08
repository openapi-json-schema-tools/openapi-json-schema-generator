petstore_api.components.schema.danish_pig
# Schema DanishPig

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[DanishPigDictInput](#danishpigdictinput), [DanishPigDict](#danishpigdict) | [DanishPigDict](#danishpigdict) |

## DanishPigDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  | must be one of ["DanishPig"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## DanishPigDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**className** | str | str |  | must be one of ["DanishPig"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
