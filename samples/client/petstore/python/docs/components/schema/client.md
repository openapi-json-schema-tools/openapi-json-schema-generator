petstore_api.components.schema.client
# Schema Client

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ClientDictInput](#clientdictinput), [ClientDict](#clientdict) | [ClientDict](#clientdict) |

## ClientDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**client** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ClientDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ClientDictInput](#clientdictinput), [ClientDict](#clientdict) | [ClientDict](#clientdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**client** | str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**client** | str, schemas.Unset |  | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
