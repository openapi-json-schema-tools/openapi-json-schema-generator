petstore_api.components.schema.object_with_optional_test_prop
# Schema ObjectWithOptionalTestProp

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectWithOptionalTestPropDictInput](#objectwithoptionaltestpropdictinput), [ObjectWithOptionalTestPropDict](#objectwithoptionaltestpropdict) | [ObjectWithOptionalTestPropDict](#objectwithoptionaltestpropdict) |

## ObjectWithOptionalTestPropDictInput
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**test** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectWithOptionalTestPropDict
base class: schemas.immutabledict[str, str]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**test** | str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**test** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectWithOptionalTestPropDictInput](#objectwithoptionaltestpropdictinput), [ObjectWithOptionalTestPropDict](#objectwithoptionaltestpropdict) | [ObjectWithOptionalTestPropDict](#objectwithoptionaltestpropdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
