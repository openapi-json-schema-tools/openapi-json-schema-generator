<a name="top"></a>
petstore_api.components.schema.composed_any_of_different_types_no_validations
# ComposedAnyOfDifferentTypesNoValidations

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_1](#_1) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#_2) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time
[_3](#_3) | bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |
[_4](#_4) | str,  | str,  |  |
[_5](#_5) | str,  | str,  |  |
[_6](#_6) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_7](#_7) | bool,  | BoolClass,  |  |
[_8](#_8) | None,  | NoneClass,  |  |
[_9](#_9) | list, tuple,  | tuple,  |  |
[_10](#_10) | decimal.Decimal, int, float,  | decimal.Decimal,  |  |
[_11](#_11) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float
[_12](#_12) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float
[_13](#_13) | decimal.Decimal, int,  | decimal.Decimal,  |  |
[_14](#_14) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
[_15](#_15) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

1. #### _0
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |dict, frozendict.frozendict,  | frozendict.frozendict,  |  ||

1. #### _1
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD|

1. #### _2
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time|

1. #### _3
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  ||

1. #### _4
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |str,  | str,  |  ||

1. #### _5
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |str,  | str,  |  ||

1. #### _6
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |dict, frozendict.frozendict,  | frozendict.frozendict,  |  ||

1. #### _7
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |bool,  | BoolClass,  |  ||

1. #### _8
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |None,  | NoneClass,  |  ||

1. #### _9
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |list, tuple,  | tuple,  |  ||
   ##### Tuple Items
   Class Name | Input Type | Accessed Type | Description | Notes
   ------------- | ------------- | ------------- | ------------- | -------------
   items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

1. #### _10
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int, float,  | decimal.Decimal,  |  ||

1. #### _11
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float|

1. #### _12
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float|

1. #### _13
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int,  | decimal.Decimal,  |  ||

1. #### _14
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer|

1. #### _15
   #### Schema Type Info
   | Input Type | Accessed Type | Description | Notes |
   | ------------ | ------------- | ------------- | ------------- |
   |decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer|

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
