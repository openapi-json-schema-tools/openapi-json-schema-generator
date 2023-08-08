petstore_api.components.schema.object_with_difficultly_named_props
# Schema ObjectWithDifficultlyNamedProps

## Description
model with properties that have invalid names for python

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithDifficultlyNamedPropsDictInput](#objectwithdifficultlynamedpropsdictinput) | [ObjectWithDifficultlyNamedPropsDict](#objectwithdifficultlynamedpropsdict) |

## ObjectWithDifficultlyNamedPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** | str |  |
**$special[property.name]** | int |  | [optional] value must be a 64 bit integer
**123Number** | int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDifficultlyNamedPropsDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**123-list** | str | str |  | value must be accessed with instance["123-list"] because the key is not a valid identifier 
**$special[property.name]** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be accessed with instance["$special[property.name]"] because the key is not a valid identifier  value must be a 64 bit integer
**123Number** | int, schemas.Unset | int, schemas.Unset |  | [optional] value must be accessed with instance["123Number"] because the key is not a valid identifier 
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
