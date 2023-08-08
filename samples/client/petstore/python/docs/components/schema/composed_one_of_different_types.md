petstore_api.components.schema.composed_one_of_different_types
# Schema ComposedOneOfDifferentTypes

## Description
this is a model that allows payloads of type object or number

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**NumberWithValidations**](number_with_validations.md) | [**NumberWithValidations**](number_with_validations.md) | [**NumberWithValidations**](number_with_validations.md) |  |
[**Animal**](animal.md) | [**Animal**](animal.md) | [**Animal**](animal.md) |  |
[_2](#oneof-_2) | None | None |  |
[_3](#oneof-_3) | str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_4](#oneof-_4) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_5](#oneof-_5) | list, tuple | tuple |  |
[_6](#oneof-_6) | str, datetime.datetime | str |  | value must conform to RFC-3339 date-time

# oneof _2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

# oneof _3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.date | str | value must conform to RFC-3339 full-date YYYY-MM-DD

# oneof _4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# oneof _5

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_5TupleInput](#oneof-_5-_5tupleinput), [_5Tuple](#oneof-_5-_5tuple) | [_5Tuple](#oneof-_5-_5tuple) |

## oneof _5 _5TupleInput
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

## oneof _5 _5Tuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

# oneof _6

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
