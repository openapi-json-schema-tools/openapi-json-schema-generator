petstore_api.components.schema.zebra
# Schema Zebra

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**className** | str | str |  | must be one of ["zebra"]
**type** | str | str |  | [optional] must be one of ["plains", "mountain", "grevys"]
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
