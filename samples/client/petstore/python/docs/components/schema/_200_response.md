petstore_api.components.schema._200_response
# Schema _200Response

## Description
model with an invalid class name for python, starts with a number

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | model with an invalid class name for python, starts with a number |

## _200ResponseDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | int |  | [optional] value must be a 32 bit integer
**class** | str | this is a reserved python keyword | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## _200ResponseDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**class** | str, schemas.Unset | str, schemas.Unset | this is a reserved python keyword | [optional] value must be accessed with instance["class"] because the key is not a valid identifier 
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
