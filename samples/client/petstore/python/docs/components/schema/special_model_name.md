petstore_api.components.schema.special_model_name
# Schema SpecialModelName

## Description
model with an invalid class name for python

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SpecialModelNameDictInput](#specialmodelnamedictinput) | [SpecialModelNameDict](#specialmodelnamedict) |

## SpecialModelNameDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## SpecialModelNameDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**a** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
