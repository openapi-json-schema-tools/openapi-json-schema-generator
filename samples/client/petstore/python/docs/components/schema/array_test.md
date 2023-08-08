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
**array_of_string** | list, tuple, schemas.Unset |  | [optional]
**array_array_of_integer** | list, tuple, schemas.Unset |  | [optional]
**array_array_of_model** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**array_of_string** | [properties.ArrayOfString](#properties-arrayofstring) |  | [optional]
**array_array_of_integer** | [properties.ArrayArrayOfInteger](#properties-arrayarrayofinteger) |  | [optional]
**array_array_of_model** | [properties.ArrayArrayOfModel](#properties-arrayarrayofmodel) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ArrayTestDictInput](#arraytestdictinput), [ArrayTestDict](#arraytestdict) | [ArrayTestDict](#arraytestdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# properties ArrayOfString

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfStringTupleInput](#properties-arrayofstring-arrayofstringtupleinput), [ArrayOfStringTuple](#properties-arrayofstring-arrayofstringtuple) | [ArrayOfStringTuple](#properties-arrayofstring-arrayofstringtuple) |

## properties ArrayOfString ArrayOfStringTupleInput
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

## properties ArrayOfString ArrayOfStringTuple
```
base class: typing.Tuple[
    str,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | str | str |  |

# properties ArrayArrayOfInteger

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfIntegerTupleInput](#properties-arrayarrayofinteger-arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#properties-arrayarrayofinteger-arrayarrayofintegertuple) | [ArrayArrayOfIntegerTuple](#properties-arrayarrayofinteger-arrayarrayofintegertuple) |

## properties ArrayArrayOfInteger ArrayArrayOfIntegerTupleInput
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
≥ 0 | list, tuple |  |

## properties ArrayArrayOfInteger ArrayArrayOfIntegerTuple
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | list, tuple | tuple |  |

# properties ArrayArrayOfInteger Items2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#properties-arrayarrayofinteger-items2-itemstupleinput), [ItemsTuple](#properties-arrayarrayofinteger-items2-itemstuple) | [ItemsTuple](#properties-arrayarrayofinteger-items2-itemstuple) |

## properties ArrayArrayOfInteger Items2 ItemsTupleInput
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

## properties ArrayArrayOfInteger Items2 ItemsTuple
```
base class: typing.Tuple[
    int,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | int | int |  | value must be a 64 bit integer

# properties ArrayArrayOfModel

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfModelTupleInput](#properties-arrayarrayofmodel-arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#properties-arrayarrayofmodel-arrayarrayofmodeltuple) | [ArrayArrayOfModelTuple](#properties-arrayarrayofmodel-arrayarrayofmodeltuple) |

## properties ArrayArrayOfModel ArrayArrayOfModelTupleInput
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
≥ 0 | list, tuple |  |

## properties ArrayArrayOfModel ArrayArrayOfModelTuple
```
base class: typing.Tuple[
    ItemsTuple2,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | list, tuple | tuple |  |

# properties ArrayArrayOfModel Items4

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput2](#properties-arrayarrayofmodel-items4-itemstupleinput2), [ItemsTuple2](#properties-arrayarrayofmodel-items4-itemstuple2) | [ItemsTuple2](#properties-arrayarrayofmodel-items4-itemstuple2) |

## properties ArrayArrayOfModel Items4 ItemsTupleInput2
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

## properties ArrayArrayOfModel Items4 ItemsTuple2
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
