petstore_api.components.schema.api_response
# Schema ApiResponse

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ApiResponseDictInput](#apiresponsedictinput) | [ApiResponseDict](#apiresponsedict) |  |

## ApiResponseDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**code** | int |  | [optional] value must be a 32 bit integer
**type** | str |  | [optional]
**message** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## ApiResponseDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | int | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**type** | str | str, schemas.Unset |  | [optional]
**message** | str | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
