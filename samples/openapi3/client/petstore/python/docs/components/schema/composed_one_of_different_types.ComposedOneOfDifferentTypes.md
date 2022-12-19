<a name="top"></a>
## composed_one_of_different_types
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
[**NumberWithValidations**](NumberWithValidations.md) | [**NumberWithValidations**](NumberWithValidations.md) | [**NumberWithValidations**](NumberWithValidations.md) |  |
[**Animal**](Animal.md) | [**Animal**](Animal.md) | [**Animal**](Animal.md) |  |
[oneOf_2](#oneOf_2) | None,  | NoneClass,  |  |
[oneOf_3](#oneOf_3) | str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[oneOf_4](#oneOf_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[oneOf_5](#oneOf_5) | list, tuple,  | tuple,  |  |
[oneOf_6](#oneOf_6) | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

# oneOf_2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# oneOf_3

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

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
items | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

# oneOf_6

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)