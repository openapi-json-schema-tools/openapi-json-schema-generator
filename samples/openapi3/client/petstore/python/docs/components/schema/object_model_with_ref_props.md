petstore_api.components.schema.object_model_with_ref_props
# Schema ObjectModelWithRefProps

## Description
a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict | frozendict.frozendict | a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**myNumber** | [**NumberWithValidations**](number_with_validations.md), decimal.Decimal, int, float | [**NumberWithValidations**](number_with_validations.md) |  | [optional]
**myString** | [**String**](string.md), str | [**String**](string.md) |  | [optional]
**myBoolean** | [**Boolean**](boolean.md), bool | [**Boolean**](boolean.md) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
