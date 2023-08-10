# ComposedAnyOfDifferentTypesNoValidations
petstore_api.components.schema.composed_any_of_different_types_no_validations
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## anyOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[_0](#_0) | dict, schemas.immutabledict | schemas.immutabledict
[_1](#_1) | str, datetime.date | str
[_2](#_2) | str, datetime.datetime | str
[_3](#_3) | bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO
[_4](#_4) | str | str
[_5](#_5) | str | str
[_6](#_6) | dict, schemas.immutabledict | schemas.immutabledict
[_7](#_7) | bool | bool
[_8](#_8) | None | None
[_9](#_9) | [_9TupleInput](#_9tupleinput), [_9Tuple](#_9tuple) | [_9Tuple](#_9tuple)
[_10](#_10) | float, int | float, int
[_11](#_11) | float, int | float, int
[_12](#_12) | float, int | float, int
[_13](#_13) | int | int
[_14](#_14) | int | int
[_15](#_15) | int | int

# _0
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# _1
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.date | str | value must conform to RFC-3339 full-date YYYY-MM-DD

# _2
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str, datetime.datetime | str | value must conform to RFC-3339 date-time

# _3
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bytes, io.FileIO, io.BufferedReader | bytes, io.FileIO |

# _4
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# _5
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
str | str |

# _6
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

# _7
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
bool | bool |

# _8
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
None | None |

# _9
```
type: schemas.Schema
```

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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This method is used under the hood when instance[0] is called

# _10
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int |

# _11
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 32 bit float

# _12
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
float, int | float, int | value must be a 64 bit float

# _13
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int |

# _14
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 32 bit integer

# _15
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
int | int | value must be a 64 bit integer

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
