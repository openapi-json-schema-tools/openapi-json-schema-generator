petstore_api.components.schema.string_boolean_map
# Schema StringBooleanMap

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[StringBooleanMapDictInput](#stringbooleanmapdictinput), [StringBooleanMapDict](#stringbooleanmapdict) | [StringBooleanMapDict](#stringbooleanmapdict) |

## StringBooleanMapDictInput

type: typing.Mapping[
    str,
    bool,
]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**any_string_name** | bool | any string name can be used but the value must be the correct type | [optional]

## StringBooleanMapDict
base class: schemas.immutabledict[str, bool]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | bool | bool, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [StringBooleanMapDictInput](#stringbooleanmapdictinput), [StringBooleanMapDict](#stringbooleanmapdict) | [StringBooleanMapDict](#stringbooleanmapdict) | a constructor
get_additional_property_ | str | bool, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
