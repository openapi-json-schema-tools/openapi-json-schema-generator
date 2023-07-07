petstore_api.components.schema.composed_any_of_different_types_no_validations
# Schema ComposedAnyOfDifferentTypesNoValidations

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#anyof-_0) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_1](#anyof-_1) | str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#anyof-_2) | str, datetime.datetime | str |  | value must conform to RFC-3339 date-time
[_3](#anyof-_3) | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |  |
[_4](#anyof-_4) | str | str |  |
[_5](#anyof-_5) | str | str |  |
[_6](#anyof-_6) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_7](#anyof-_7) | bool | bool |  |
[_8](#anyof-_8) | None | None |  |
[_9](#anyof-_9) | list, tuple | tuple |  |
[_10](#anyof-_10) | float, int | float, int |  |
[_11](#anyof-_11) | float, int | float, int |  | value must be a 32 bit float
[_12](#anyof-_12) | float, int | float, int |  | value must be a 64 bit float
[_13](#anyof-_13) | int | int |  |
[_14](#anyof-_14) | int | int |  | value must be a 32 bit integer
[_15](#anyof-_15) | int | int |  | value must be a 64 bit integer

# anyof _0

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

# anyof _1

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# anyof _2

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, datetime.datetime | str |  | value must conform to RFC-3339 date-time

# anyof _3

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |  |

# anyof _4

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str | str |  |

# anyof _5

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str | str |  |

# anyof _6

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |  |

# anyof _7

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool | bool |  |

# anyof _8

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None | None |  |

# anyof _9

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

# anyof _10

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
float, int | float, int |  |

# anyof _11

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
float, int | float, int |  | value must be a 32 bit float

# anyof _12

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
float, int | float, int |  | value must be a 64 bit float

# anyof _13

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
int | int |  |

# anyof _14

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
int | int |  | value must be a 32 bit integer

# anyof _15

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
int | int |  | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
