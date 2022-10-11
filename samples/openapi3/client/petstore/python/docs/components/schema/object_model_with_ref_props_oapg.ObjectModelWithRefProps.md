# petstore_api.components.schema.object_model_with_ref_props_oapg.ObjectModelWithRefProps

a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | a model that includes properties which should stay primitive (String + Boolean) and one which is defined as a class, NumberWithValidations | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**myNumber** | [**number_with_validations_oapg.NumberWithValidations**](number_with_validations_oapg.NumberWithValidations.md) | [**number_with_validations_oapg.NumberWithValidations**](number_with_validations_oapg.NumberWithValidations.md) |  | [optional] 
**myString** | [**string_oapg.String**](string_oapg.String.md) | [**string_oapg.String**](string_oapg.String.md) |  | [optional] 
**myBoolean** | [**boolean_oapg.Boolean**](boolean_oapg.Boolean.md) | [**boolean_oapg.Boolean**](boolean_oapg.Boolean.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../../README.md#documentation-for-models) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to README]](../../../README.md)

