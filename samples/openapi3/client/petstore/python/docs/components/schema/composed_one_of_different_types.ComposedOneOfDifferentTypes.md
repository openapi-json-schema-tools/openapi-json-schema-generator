petstore_api.components.schema.composed_one_of_different_types
# ComposedOneOfDifferentTypes

## Description
this is a model that allows payloads of type object or number

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO | this is a model that allows payloads of type object or number |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) |  |
[**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) |  |
[_2](#oneOf_2) | None,  | NoneClass,  |  |
[_3](#oneOf_3) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#oneOf_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_5](#oneOf_5) | list, tuple,  | tuple,  |  |
[_6](#oneOf_6) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

# <a id="oneOf_2">_2</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# <a id="oneOf_3">_3</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# <a id="oneOf_4">_4</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# <a id="oneOf_5">_5</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

# <a id="oneOf_6">_6</a>

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
