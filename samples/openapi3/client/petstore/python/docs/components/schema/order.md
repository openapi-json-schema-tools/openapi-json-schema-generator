petstore_api.components.schema.order
# Schema Order

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, immutabledict.immutabledict | immutabledict.immutabledict |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | int | int |  | [optional] value must be a 64 bit integer
**petId** | int | int |  | [optional] value must be a 64 bit integer
**quantity** | int | int |  | [optional] value must be a 32 bit integer
**shipDate** | str, datetime.datetime | str |  | [optional] value must conform to RFC-3339 date-time
**status** | str | str | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool | bool |  | [optional] if omitted the server will use the default value of false
**any_string_name** | dict, immutabledict.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | immutabledict.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
