petstore_api.components.schema.object_with_difficultly_named_props
# Schema ObjectWithDifficultlyNamedProps

## Description
model with properties that have invalid names for python

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithDifficultlyNamedPropsDictInput](#objectwithdifficultlynamedpropsdictinput), [ObjectWithDifficultlyNamedPropsDict](#objectwithdifficultlynamedpropsdict) | [ObjectWithDifficultlyNamedPropsDict](#objectwithdifficultlynamedpropsdict) |

## ObjectWithDifficultlyNamedPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**123-list** | str |  |
**$special[property.name]** | int |  | [optional] value must be a 64 bit integer
**123Number** | int |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithDifficultlyNamedPropsDict
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithDifficultlyNamedPropsDictInput](#objectwithdifficultlynamedpropsdictinput), [ObjectWithDifficultlyNamedPropsDict](#objectwithdifficultlynamedpropsdict) | [ObjectWithDifficultlyNamedPropsDict](#objectwithdifficultlynamedpropsdict) | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.OUTPUT_BASE_TYPES | This model has invalid python names so this method is used under the hood when you access instance["123-list"], instance["$special[property.name]"], instance["123Number"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
