petstore_api.components.schema.object_model_with_ref_props
# Schema ObjectModelWithRefProps

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ObjectModelWithRefPropsDictInput](#objectmodelwithrefpropsdictinput), [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) | [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) |

## ObjectModelWithRefPropsDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**myNumber** | [**NumberWithValidations**](number_with_validations.md), float, int |  | [optional]
**myString** | [**String**](string.md), str |  | [optional]
**myBoolean** | [**Boolean**](boolean.md), bool |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ObjectModelWithRefPropsDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[ObjectModelWithRefPropsDictInput](#objectmodelwithrefpropsdictinput), [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict) | [ObjectModelWithRefPropsDict](#objectmodelwithrefpropsdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**myNumber** | [**NumberWithValidations**](number_with_validations.md), float, int, schemas.Unset | [**NumberWithValidations**](number_with_validations.md) |  | [optional]
**myString** | [**String**](string.md), str, schemas.Unset | [**String**](string.md) |  | [optional]
**myBoolean** | [**Boolean**](boolean.md), bool, schemas.Unset | [**Boolean**](boolean.md) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
