petstore_api.components.schema.req_props_from_true_add_props
# Schema ReqPropsFromTrueAddProps

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ReqPropsFromTrueAddPropsDictInput](#reqpropsfromtrueaddpropsdictinput) | [ReqPropsFromTrueAddPropsDict](#reqpropsfromtrueaddpropsdict) |  |

## ReqPropsFromTrueAddPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**validName** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromTrueAddPropsDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**invalid-name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  | value must be accessed with instance["invalid-name"] because the key is not a valid identifier 
**validName** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
