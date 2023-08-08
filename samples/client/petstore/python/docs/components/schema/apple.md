petstore_api.components.schema.apple
# Schema Apple

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None, [AppleDictInput](#appledictinput), [AppleDict](#appledict) | None, [AppleDict](#appledict) |

## AppleDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**cultivar** | str |  |
**origin** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## AppleDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**cultivar** | str | str |  |
**origin** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
