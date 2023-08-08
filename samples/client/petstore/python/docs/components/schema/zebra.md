petstore_api.components.schema.zebra
# Schema Zebra

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ZebraDictInput](#zebradictinput), [ZebraDict](#zebradict) | [ZebraDict](#zebradict) |

## ZebraDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  | must be one of ["zebra"]
**type** | str |  | [optional] must be one of ["plains", "mountain", "grevys"]
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ZebraDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ZebraDictInput](#zebradictinput), [ZebraDict](#zebradict) | [ZebraDict](#zebradict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**className** | str | str |  | must be one of ["zebra"]
**type** | str, schemas.Unset | str, schemas.Unset |  | [optional] must be one of ["plains", "mountain", "grevys"]
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
