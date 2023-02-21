petstore_api.components.schema.composed_any_of_different_types_no_validations
# ComposedAnyOfDifferentTypesNoValidations

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#anyOf_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_1](#anyOf_1) | str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#anyOf_2) | str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time
[_3](#anyOf_3) | bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |
[_4](#anyOf_4) | str,  | str,  |  |
[_5](#anyOf_5) | str,  | str,  |  |
[_6](#anyOf_6) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |
[_7](#anyOf_7) | bool,  | BoolClass,  |  |
[_8](#anyOf_8) | None,  | NoneClass,  |  |
[_9](#anyOf_9) | list, tuple,  | tuple,  |  |
[_10](#anyOf_10) | decimal.Decimal, int, float,  | decimal.Decimal,  |  |
[_11](#anyOf_11) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float
[_12](#anyOf_12) | decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float
[_13](#anyOf_13) | decimal.Decimal, int,  | decimal.Decimal,  |  |
[_14](#anyOf_14) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer
[_15](#anyOf_15) | decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

# ComposedAnyOfDifferentTypesNoValidations anyOf _0

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime,  | str,  |  | value must conform to RFC-3339 date-time

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader,  | bytes, io.FileIO,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None,  | NoneClass,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10 anyOf _11

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 32 bit float

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10 anyOf _11 anyOf _12

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int, float,  | decimal.Decimal,  |  | value must be a 64 bit float

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10 anyOf _11 anyOf _12 anyOf _13

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  |

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10 anyOf _11 anyOf _12 anyOf _13 anyOf _14

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 32 bit integer

# ComposedAnyOfDifferentTypesNoValidations anyOf _0 anyOf _1 anyOf _2 anyOf _3 anyOf _4 anyOf _5 anyOf _6 anyOf _7 anyOf _8 anyOf _9 anyOf _10 anyOf _11 anyOf _12 anyOf _13 anyOf _14 anyOf _15

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
