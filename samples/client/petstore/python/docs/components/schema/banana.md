petstore_api.components.schema.banana
# Schema Banana

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[BananaDictInput](#bananadictinput), [BananaDict](#bananadict) | [BananaDict](#bananadict) |

## BananaDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**lengthCm** | float, int |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## BananaDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[BananaDictInput](#bananadictinput), [BananaDict](#bananadict) | [BananaDict](#bananadict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**lengthCm** | float, int | float, int |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
