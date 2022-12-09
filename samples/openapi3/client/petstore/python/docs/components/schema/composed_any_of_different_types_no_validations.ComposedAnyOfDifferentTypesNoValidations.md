<a name="top"></a>
## petstore_api.components.schema.composed_any_of_different_types_no_validations
# ComposedAnyOfDifferentTypesNoValidations

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_1](#_1) | str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#_2) | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time
[_3](#_3) | bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  |  |
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

# _0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# _1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# _2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime,  | str,  |  | value must conform to RFC-3339 date-time

# _3

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, FileIO,  |  |

# _4

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# _5

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# _6

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# _7

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  |

# _8

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# _9

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  |

# _10

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  |

# _11

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float

# _12

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float

# _13

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

# _14

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# _15

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)