petstore_api.components.schema.basque_pig
# Schema BasquePig

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[BasquePigDictInput](#basquepigdictinput) | [BasquePigDict](#basquepigdict) |

## BasquePigDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  | must be one of ["BasquePig"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## BasquePigDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**className** | str | str |  | must be one of ["BasquePig"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
