petstore_api.components.schema.composed_any_of_different_types_no_validations
# Schema ComposedAnyOfDifferentTypesNoValidations

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

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

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# anyof _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.date | str | value must conform to RFC-3339 full-date YYYY-MM-DD

# anyof _2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

# anyof _3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |

# anyof _4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# anyof _5

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# anyof _6

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# anyof _7

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bool | bool |

# anyof _8

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

# anyof _9

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_9TupleInput](#anyof-_9-_9tupleinput), [_9Tuple](#anyof-_9-_9tuple) | [_9Tuple](#anyof-_9-_9tuple) |

## anyof _9 _9TupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
items | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

## anyof _9 _9Tuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

# anyof _10

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int |

# anyof _11

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 32 bit float

# anyof _12

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 64 bit float

# anyof _13

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int |

# anyof _14

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 32 bit integer

# anyof _15

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
