# ObjectModelWithRefProps
petstore_api.components.schema.object_model_with_ref_props
```
type: schemas.Schema
```

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectModelWithRefPropsDictInput](#objectmodelwithrefpropsdictinput), [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) | [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) |

## ObjectModelWithRefPropsDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**myNumber** | float, int |  | [optional]
**myString** | str |  | [optional]
**myBoolean** | bool |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithRefPropsDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**myNumber** | float, int, schemas.Unset |  | [optional]
**myString** | str, schemas.Unset |  | [optional]
**myBoolean** | bool, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**myNumber** | float, int, schemas.Unset |  | [optional]
**myString** | str, schemas.Unset |  | [optional]
**myBoolean** | bool, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ObjectModelWithRefPropsDictInput](#objectmodelwithrefpropsdictinput), [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) | [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
