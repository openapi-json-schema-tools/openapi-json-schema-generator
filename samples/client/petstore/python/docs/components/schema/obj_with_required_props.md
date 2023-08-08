petstore_api.components.schema.obj_with_required_props
# Schema ObjWithRequiredProps

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjWithRequiredPropsDictInput](#objwithrequiredpropsdictinput), [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) | [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) |

## ObjWithRequiredPropsDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**a** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjWithRequiredPropsDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**a** | str |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | str |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjWithRequiredPropsDictInput](#objwithrequiredpropsdictinput), [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) | [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) | [**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) | [**ObjWithRequiredPropsBase**](obj_with_required_props_base.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
