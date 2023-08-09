petstore_api.components.schema.array_test
# Schema ArrayTest

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayTestDictInput](#arraytestdictinput), [ArrayTestDict](#arraytestdict) | [ArrayTestDict](#arraytestdict) |

## ArrayTestDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**array_of_string** | list, tuple |  | [optional]
**array_array_of_integer** | list, tuple |  | [optional]
**array_array_of_model** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayTestDict
```
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**array_of_string** | [ArrayOfStringTupleInput](#arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstringtuple), schemas.Unset |  | [optional]
**array_array_of_integer** | [ArrayArrayOfIntegerTupleInput](#arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple), schemas.Unset |  | [optional]
**array_array_of_model** | [ArrayArrayOfModelTupleInput](#arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple), schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**array_of_string** | [ArrayOfStringTuple](#arrayofstringtuple), schemas.Unset |  | [optional]
**array_array_of_integer** | [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple), schemas.Unset |  | [optional]
**array_array_of_model** | [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ArrayTestDictInput](#arraytestdictinput), [ArrayTestDict](#arraytestdict) | [ArrayTestDict](#arraytestdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# ArrayOfString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfStringTupleInput](#arrayofstring-arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstring-arrayofstringtuple) | [ArrayOfStringTuple](#arrayofstring-arrayofstringtuple) |

## ArrayOfString ArrayOfStringTupleInput
```
type: typing.Union[
    typing.List[
        str,
    ],
    typing.Tuple[
        str,
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  |

## ArrayOfString ArrayOfStringTuple
```
base class: typing.Tuple[
    str,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | str | str |  |

# ArrayArrayOfInteger

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfIntegerTupleInput](#arrayarrayofinteger-arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofinteger-arrayarrayofintegertuple) | [ArrayArrayOfIntegerTuple](#arrayarrayofinteger-arrayarrayofintegertuple) |

## ArrayArrayOfInteger ArrayArrayOfIntegerTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput,
            ItemsTuple
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [ItemsTupleInput](#arrayarrayofinteger-itemstupleinput), [ItemsTuple](#arrayarrayofinteger-itemstuple) |  |

## ArrayArrayOfInteger ArrayArrayOfIntegerTuple
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | list, tuple | tuple |  |

# ArrayArrayOfInteger Items2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#arrayarrayofinteger-items2-itemstupleinput), [ItemsTuple](#arrayarrayofinteger-items2-itemstuple) | [ItemsTuple](#arrayarrayofinteger-items2-itemstuple) |

## ArrayArrayOfInteger Items2 ItemsTupleInput
```
type: typing.Union[
    typing.List[
        int,
    ],
    typing.Tuple[
        int,
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | int |  | value must be a 64 bit integer

## ArrayArrayOfInteger Items2 ItemsTuple
```
base class: typing.Tuple[
    int,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | int | int |  | value must be a 64 bit integer

# ArrayArrayOfModel

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfModelTupleInput](#arrayarrayofmodel-arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodel-arrayarrayofmodeltuple) | [ArrayArrayOfModelTuple](#arrayarrayofmodel-arrayarrayofmodeltuple) |

## ArrayArrayOfModel ArrayArrayOfModelTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
    ],
    typing.Tuple[
        typing.Union[
            ItemsTupleInput2,
            ItemsTuple2
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [ItemsTupleInput2](#arrayarrayofmodel-itemstupleinput2), [ItemsTuple2](#arrayarrayofmodel-itemstuple2) |  |

## ArrayArrayOfModel ArrayArrayOfModelTuple
```
base class: typing.Tuple[
    ItemsTuple2,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | list, tuple | tuple |  |

# ArrayArrayOfModel Items4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput2](#arrayarrayofmodel-items4-itemstupleinput2), [ItemsTuple2](#arrayarrayofmodel-items4-itemstuple2) | [ItemsTuple2](#arrayarrayofmodel-items4-itemstuple2) |

## ArrayArrayOfModel Items4 ItemsTupleInput2
```
type: typing.Union[
    typing.List[
        typing.Union[
            read_only_first.ReadOnlyFirstDictInput,
            read_only_first.ReadOnlyFirstDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            read_only_first.ReadOnlyFirstDictInput,
            read_only_first.ReadOnlyFirstDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**ReadOnlyFirst**](read_only_first.md) |  |

## ArrayArrayOfModel Items4 ItemsTuple2
```
base class: typing.Tuple[
    read_only_first.ReadOnlyFirstDict,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**ReadOnlyFirst**](read_only_first.md) | [**ReadOnlyFirst**](read_only_first.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
