petstore_api.components.schema.tag
# Schema Tag

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TagDictInput](#tagdictinput), [TagDict](#tagdict) | [TagDict](#tagdict) |

## TagDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | int |  | [optional] value must be a 64 bit integer
**name** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## TagDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**name** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
