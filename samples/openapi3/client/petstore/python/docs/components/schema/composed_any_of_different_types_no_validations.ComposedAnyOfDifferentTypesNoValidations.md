<a name="top"></a>
## petstore_api.components.schema.composed_any_of_different_types_no_validations
# ComposedAnyOfDifferentTypesNoValidations

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

### Composed Schemas (allOf/anyOf/oneOf/not)
#### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[anyOf_0](#anyOf_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[anyOf_1](#anyOf_1) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[anyOf_2](#anyOf_2) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time
[anyOf_3](#anyOf_3) | bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |
[anyOf_4](#anyOf_4) | str,  | str,  |  |
[anyOf_5](#anyOf_5) | str,  | str,  |  |
[anyOf_6](#anyOf_6) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[anyOf_7](#anyOf_7) | bool,  | BoolClass,  |  |
[anyOf_8](#anyOf_8) | None,  | NoneClass,  |  |
[anyOf_9](#anyOf_9) | list, tuple,  | tuple,  |  |
[anyOf_10](#anyOf_10) | decimal.Decimal, int, float,  | decimal.Decimal,  |  |
[anyOf_11](#anyOf_11) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float
[anyOf_12](#anyOf_12) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float
[anyOf_13](#anyOf_13) | decimal.Decimal, int,  | decimal.Decimal,  |  |
[anyOf_14](#anyOf_14) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
[anyOf_15](#anyOf_15) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

# anyOf_0

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# anyOf_1

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# anyOf_2

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

# anyOf_3

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |

# anyOf_4

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# anyOf_5

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# anyOf_6

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# anyOf_7

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  |

# anyOf_8

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# anyOf_9

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

# anyOf_10

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  |

# anyOf_11

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float

# anyOf_12

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float

# anyOf_13

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

# anyOf_14

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# anyOf_15

## Schema Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
