petstore_api.components.schema.file
# Schema File

## Description
Must be named &#x60;File&#x60; for test.

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FileDictInput](#filedictinput), [FileDict](#filedict) | [FileDict](#filedict) |

## FileDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**sourceURI** | str | Test capitalization | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## FileDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[FileDictInput](#filedictinput), [FileDict](#filedict) | [FileDict](#filedict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**sourceURI** | str, schemas.Unset | Test capitalization | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**sourceURI** | str, schemas.Unset | Test capitalization | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
