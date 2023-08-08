petstore_api.components.schema.obj_with_required_props
# Schema ObjWithRequiredProps

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[ObjWithRequiredPropsDictInput](#objwithrequiredpropsdictinput) | [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) |  |

## ObjWithRequiredPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjWithRequiredPropsDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**a** | str | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) | [**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) | [**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
