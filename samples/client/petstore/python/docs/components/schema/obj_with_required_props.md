# ObjWithRequiredProps
petstore_api.components.schema.obj_with_required_props
```
type: schemas.Schema
```

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
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## ObjWithRequiredPropsDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**a** | str |  |
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**a** | str |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjWithRequiredPropsDictInput](#objwithrequiredpropsdictinput), [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) | [ObjWithRequiredPropsDict](#objwithrequiredpropsdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[**obj_with_required_props_base.ObjWithRequiredPropsBase**](../../components/schema/obj_with_required_props_base.md) | [obj_with_required_props_base.ObjWithRequiredPropsBaseDictInput](../../components/schema/obj_with_required_props_base.md#objwithrequiredpropsbasedictinput), [obj_with_required_props_base.ObjWithRequiredPropsBaseDict](../../components/schema/obj_with_required_props_base.md#objwithrequiredpropsbasedict) | [obj_with_required_props_base.ObjWithRequiredPropsBaseDict](../../components/schema/obj_with_required_props_base.md#objwithrequiredpropsbasedict)

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
