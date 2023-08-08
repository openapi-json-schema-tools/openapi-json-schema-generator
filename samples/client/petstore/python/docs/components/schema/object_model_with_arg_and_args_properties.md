petstore_api.components.schema.object_model_with_arg_and_args_properties
# Schema ObjectModelWithArgAndArgsProperties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectModelWithArgAndArgsPropertiesDictInput](#objectmodelwithargandargspropertiesdictinput) | [ObjectModelWithArgAndArgsPropertiesDict](#objectmodelwithargandargspropertiesdict) |

## ObjectModelWithArgAndArgsPropertiesDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**arg** | str |  |
**args** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithArgAndArgsPropertiesDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**arg** | str | str |  |
**args** | str | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
