petstore_api.components.schema.composed_one_of_different_types
<a id="composedoneofdifferenttypes"></a>
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
[_2](#composedoneofdifferenttypes-oneof-_2) | None,  | NoneClass,  |  |
[_3](#composedoneofdifferenttypes-oneof-_3) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#composedoneofdifferenttypes-oneof-_4) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_5](#composedoneofdifferenttypes-oneof-_5) | list, tuple,  | tuple,  |  |
[_6](#composedoneofdifferenttypes-oneof-_6) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

<a id="composedoneofdifferenttypes-oneof-_2"></a>
# ComposedOneOfDifferentTypes oneof _2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

<a id="composedoneofdifferenttypes-oneof-_2-oneof-_3"></a>
# ComposedOneOfDifferentTypes oneof _2 oneof _3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

<a id="composedoneofdifferenttypes-oneof-_2-oneof-_3-oneof-_4"></a>
# ComposedOneOfDifferentTypes oneof _2 oneof _3 oneof _4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

<a id="composedoneofdifferenttypes-oneof-_2-oneof-_3-oneof-_4-oneof-_5"></a>
# ComposedOneOfDifferentTypes oneof _2 oneof _3 oneof _4 oneof _5

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

<a id="composedoneofdifferenttypes-oneof-_2-oneof-_3-oneof-_4-oneof-_5-oneof-_6"></a>
# ComposedOneOfDifferentTypes oneof _2 oneof _3 oneof _4 oneof _5 oneof _6

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
