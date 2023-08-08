petstore_api.components.schema.req_props_from_unset_add_props
# Schema ReqPropsFromUnsetAddProps

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ReqPropsFromUnsetAddPropsDictInput](#reqpropsfromunsetaddpropsdictinput), [ReqPropsFromUnsetAddPropsDict](#reqpropsfromunsetaddpropsdict) | [ReqPropsFromUnsetAddPropsDict](#reqpropsfromunsetaddpropsdict) |

## ReqPropsFromUnsetAddPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**invalid-name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**validName** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ReqPropsFromUnsetAddPropsDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ReqPropsFromUnsetAddPropsDictInput](#reqpropsfromunsetaddpropsdictinput), [ReqPropsFromUnsetAddPropsDict](#reqpropsfromunsetaddpropsdict) | [ReqPropsFromUnsetAddPropsDict](#reqpropsfromunsetaddpropsdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**invalid-name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  | value must be accessed with instance["invalid-name"] because the key is not a valid identifier 
**validName** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
