<a name="top"></a>
petstore_api.components.schema.composed_one_of_different_types
# ComposedOneOfDifferentTypes

## description
this is a model that allows payloads of type object or number

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO | this is a model that allows payloads of type object or number |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) | [**NumberWithValidations**](number_with_validations.NumberWithValidations.md) |  |
[**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) | [**Animal**](animal.Animal.md) |  |
[_2](#_2) | None,  | NoneClass,  |  |
[_3](#_3) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_5](#_5) | list, tuple,  | tuple,  |  |
[_6](#_6) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

1. 2 _2
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   None,  | NoneClass,  |  |

1. 2 _3
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

1. 2 _4
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

1. 2 _5
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   list, tuple,  | tuple,  |  |
   
   4 Tuple Items
   Class Name | Input Type | Accessed Type | Description | Notes
   ------------- | ------------- | ------------- | ------------- | -------------
   items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

1. 2 _6
   
   4 Schema Type Info
   Input Type | Accessed Type | Description | Notes
   ------------ | ------------- | ------------- | -------------
   str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
