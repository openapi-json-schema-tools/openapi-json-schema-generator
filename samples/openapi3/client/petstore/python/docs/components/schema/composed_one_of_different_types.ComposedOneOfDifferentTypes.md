<a name="top"></a>
## petstore_api.components.schema.composed_one_of_different_types
# ComposedOneOfDifferentTypes

this is a model that allows payloads of type object or number

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | this is a model that allows payloads of type object or number |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) |  |
[**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) |  |
[oneOf_2](#oneOf_2) | None,  | NoneClass,  |  |
[oneOf_3](#oneOf_3) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[oneOf_4](#oneOf_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[oneOf_5](#oneOf_5) | list, tuple,  | tuple,  |  |
[oneOf_6](#oneOf_6) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

# oneOf_2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# oneOf_3

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# oneOf_4

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# oneOf_5

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

# oneOf_6

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)