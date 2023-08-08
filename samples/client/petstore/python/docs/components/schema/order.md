petstore_api.components.schema.order
# Schema Order

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[OrderDictInput](#orderdictinput) | [OrderDict](#orderdict) |  |

## OrderDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | int |  | [optional] value must be a 64 bit integer
**petId** | int |  | [optional] value must be a 64 bit integer
**quantity** | int |  | [optional] value must be a 32 bit integer
**shipDate** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**status** | str | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool |  | [optional] if omitted the server will use the default value of false
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## OrderDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**petId** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**quantity** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**shipDate** | str, datetime.datetime, schemas.Unset | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**status** | str, schemas.Unset | str, schemas.Unset | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool, schemas.Unset | bool, schemas.Unset |  | [optional] if omitted the server will use the default value of false
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
