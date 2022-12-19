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
[ComposedOneOfDifferentTypes](#ComposedOneOfDifferentTypes) | None,  | NoneClass,  |  |
[ComposedOneOfDifferentTypes](#ComposedOneOfDifferentTypes) | str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[ComposedOneOfDifferentTypes](#ComposedOneOfDifferentTypes) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[ComposedOneOfDifferentTypes](#ComposedOneOfDifferentTypes) | list, tuple,  | tuple,  |  |
[ComposedOneOfDifferentTypes](#ComposedOneOfDifferentTypes) | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

# ComposedOneOfDifferentTypes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# ComposedOneOfDifferentTypes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# ComposedOneOfDifferentTypes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# ComposedOneOfDifferentTypes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
ComposedOneOfDifferentTypes | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

# ComposedOneOfDifferentTypes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)