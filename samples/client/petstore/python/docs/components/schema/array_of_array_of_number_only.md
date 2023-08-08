petstore_api.components.schema.array_of_array_of_number_only
# Schema ArrayOfArrayOfNumberOnly

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfArrayOfNumberOnlyDictInput](#arrayofarrayofnumberonlydictinput), [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) |

## ArrayOfArrayOfNumberOnlyDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayArrayNumber** | list, tuple |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayOfArrayOfNumberOnlyDict
```
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**ArrayArrayNumber** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**ArrayArrayNumber** | [properties.ArrayArrayNumber](#properties-arrayarraynumber) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ArrayOfArrayOfNumberOnlyDictInput](#arrayofarrayofnumberonlydictinput), [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# properties ArrayArrayNumber

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayNumberTupleInput](#properties-arrayarraynumber-arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#properties-arrayarraynumber-arrayarraynumbertuple) | [ArrayArrayNumberTuple](#properties-arrayarraynumber-arrayarraynumbertuple) |

## properties ArrayArrayNumber ArrayArrayNumberTupleInput
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
≥ 0 | [ItemsTupleInput](#properties-arrayarraynumber-itemstupleinput), [ItemsTuple](#properties-arrayarraynumber-itemstuple) |  |

## properties ArrayArrayNumber ArrayArrayNumberTuple
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | list, tuple | tuple |  |

# properties ArrayArrayNumber Items

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#properties-arrayarraynumber-items-itemstupleinput), [ItemsTuple](#properties-arrayarraynumber-items-itemstuple) | [ItemsTuple](#properties-arrayarraynumber-items-itemstuple) |

## properties ArrayArrayNumber Items ItemsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            int,
            float
        ],
    ],
    typing.Tuple[
        typing.Union[
            int,
            float
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | float, int |  |

## properties ArrayArrayNumber Items ItemsTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | float, int | float, int |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
