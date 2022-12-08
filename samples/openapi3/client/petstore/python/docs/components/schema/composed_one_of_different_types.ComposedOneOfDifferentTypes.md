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
[_2](#_2) | None,  | NoneClass,  |  | 
[_3](#_3) | str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
[_5](#_5) | list, tuple,  | tuple,  |  | 
[_6](#_6) | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

# _2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  | 

# _3

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# _4

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# _5

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# _6

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)