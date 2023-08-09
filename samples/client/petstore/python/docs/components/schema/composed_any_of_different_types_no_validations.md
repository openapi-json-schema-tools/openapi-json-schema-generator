# ComposedAnyOfDifferentTypesNoValidations
petstore_api.components.schema.composed_any_of_different_types_no_validations

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[_0](#) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_1](#) | str, datetime.date | str |  | value must conform to RFC-3339 full-date YYYY-MM-DD
[_2](#) | str, datetime.datetime | str |  | value must conform to RFC-3339 date-time
[_3](#) | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |  |
[_4](#) | str | str |  |
[_5](#) | str | str |  |
[_6](#) | dict, schemas.immutabledict | schemas.immutabledict |  |
[_7](#) | bool | bool |  |
[_8](#) | None | None |  |
[_9](#) | list, tuple | tuple |  |
[_10](#) | float, int | float, int |  |
[_11](#) | float, int | float, int |  | value must be a 32 bit float
[_12](#) | float, int | float, int |  | value must be a 64 bit float
[_13](#) | int | int |  |
[_14](#) | int | int |  | value must be a 32 bit integer
[_15](#) | int | int |  | value must be a 64 bit integer

# _0
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._0

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# _1
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.date | str | value must conform to RFC-3339 full-date YYYY-MM-DD

# _2
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

# _3
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._3

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |

# _4
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# _5
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._5

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# _6
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._6

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# _7
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._7

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bool | bool |

# _8
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._8

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

# _9
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._9

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_9TupleInput](#_9tupleinput), [_9Tuple](#_9tuple) | [_9Tuple](#_9tuple) |

## _9TupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ],
    typing.Tuple[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

## _9Tuple
```
base class: typing.Tuple[
    schemas.OUTPUT_BASE_TYPES,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [_9TupleInput](#_9tupleinput), [_9Tuple](#_9tuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called

# _10
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._10

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int |

# _11
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._11

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 32 bit float

# _12
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._12

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 64 bit float

# _13
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._13

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int |

# _14
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._14

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 32 bit integer

# _15
petstore_api.components.schema.ComposedAnyOfDifferentTypesNoValidations.anyOf._15

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
