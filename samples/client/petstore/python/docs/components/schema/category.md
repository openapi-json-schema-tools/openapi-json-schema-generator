petstore_api.components.schema.category
# Schema Category

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[CategoryDictInput](#categorydictinput) | [CategoryDict](#categorydict) |  |

## CategoryDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  | if omitted the server will use the default value of default-name
**id** | int |  | [optional] value must be a 64 bit integer
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## CategoryDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str | str |  | if omitted the server will use the default value of default-name
**id** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
