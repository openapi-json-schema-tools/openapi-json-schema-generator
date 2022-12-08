<a name="top"></a>
## petstore_api.components.schema.composed_one_of_different_types
# ComposedOneOfDifferentTypes

this is a model that allows payloads of type object or number

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | this is a model that allows payloads of type object or number | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**number_with_validations.NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**number_with_validations.NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**number_with_validations.NumberWithValidations**](number_with_validations.NumberWithValidations.md) |  | 
[**animal.Animal**](animal.Animal.md) | [**animal.Animal**](animal.Animal.md) | [**animal.Animal**](animal.Animal.md) |  | 
[](#) | None,  | NoneClass,  |  | 
[](#) | str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[](#) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
[](#) | list, tuple,  | tuple,  |  | 
[](#) | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

# 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  | 

# 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)