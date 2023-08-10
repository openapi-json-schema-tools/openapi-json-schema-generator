# Order
petstore_api.components.schema.order
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[OrderDictInput](#orderdictinput), [OrderDict](#orderdict) | [OrderDict](#orderdict) |

## OrderDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**id** | int |  | [optional] value must be a 64 bit integer
**petId** | int |  | [optional] value must be a 64 bit integer
**quantity** | int |  | [optional] value must be a 32 bit integer
**shipDate** | str, datetime.datetime |  | [optional] value must conform to RFC-3339 date-time
**status** | typing_extensions.Literal["placed", "approved", "delivered"] | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool |  | [optional] if omitted the server will use the default value of false
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## OrderDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**petId** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**quantity** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**shipDate** | str, datetime.datetime, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**status** | typing_extensions.Literal["placed", "approved", "delivered"], schemas.Unset | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool, schemas.Unset |  | [optional] if omitted the server will use the default value of false
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**petId** | int, schemas.Unset |  | [optional] value must be a 64 bit integer
**quantity** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**shipDate** | str, schemas.Unset |  | [optional] value must conform to RFC-3339 date-time
**status** | typing_extensions.Literal["placed", "approved", "delivered"], schemas.Unset | Order Status | [optional] must be one of ["placed", "approved", "delivered"]
**complete** | bool, schemas.Unset |  | [optional] if omitted the server will use the default value of false

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [OrderDictInput](#orderdictinput), [OrderDict](#orderdict) | [OrderDict](#orderdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
