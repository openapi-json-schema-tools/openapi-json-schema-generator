petstore_api.components.schema.api_response
# Schema ApiResponse

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ApiResponseDictInput](#apiresponsedictinput), [ApiResponseDict](#apiresponsedict) | [ApiResponseDict](#apiresponsedict) |

## ApiResponseDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**code** | int |  | [optional] value must be a 32 bit integer
**type** | str |  | [optional]
**message** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ApiResponseDict
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**code** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**type** | str, schemas.Unset |  | [optional]
**message** | str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**code** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**type** | str, schemas.Unset |  | [optional]
**message** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ApiResponseDictInput](#apiresponsedictinput), [ApiResponseDict](#apiresponsedict) | [ApiResponseDict](#apiresponsedict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
