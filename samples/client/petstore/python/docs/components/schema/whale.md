petstore_api.components.schema.whale
# Schema Whale

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[WhaleDictInput](#whaledictinput), [WhaleDict](#whaledict) | [WhaleDict](#whaledict) |

## WhaleDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  | must be one of ["whale"]
**hasBaleen** | bool |  | [optional]
**hasTeeth** | bool |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## WhaleDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[WhaleDictInput](#whaledictinput), [WhaleDict](#whaledict) | [WhaleDict](#whaledict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**className** | str |  | must be one of ["whale"]
**hasBaleen** | bool, schemas.Unset |  | [optional]
**hasTeeth** | bool, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** | str |  | must be one of ["whale"]
**hasBaleen** | bool, schemas.Unset |  | [optional]
**hasTeeth** | bool, schemas.Unset |  | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
