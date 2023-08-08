petstore_api.components.schema.has_only_read_only
# Schema HasOnlyReadOnly

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[HasOnlyReadOnlyDictInput](#hasonlyreadonlydictinput) | [HasOnlyReadOnlyDict](#hasonlyreadonlydict) |  |

## HasOnlyReadOnlyDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | str |  | [optional]
**foo** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## HasOnlyReadOnlyDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**bar** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**foo** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
