# ArrayOfArrayOfNumberOnly
petstore_api.components.schema.array_of_array_of_number_only
```
type: schemas.Schema
```

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
**ArrayArrayNumber** | [ArrayArrayNumberTupleInput](#arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#arrayarraynumbertuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## ArrayOfArrayOfNumberOnlyDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**ArrayArrayNumber** | [ArrayArrayNumberTupleInput](#arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#arrayarraynumbertuple), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**ArrayArrayNumber** | [ArrayArrayNumberTuple](#arrayarraynumbertuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ArrayOfArrayOfNumberOnlyDictInput](#arrayofarrayofnumberonlydictinput), [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | [ArrayOfArrayOfNumberOnlyDict](#arrayofarrayofnumberonlydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

# ArrayArrayNumber
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayNumberTupleInput](#arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#arrayarraynumbertuple) | [ArrayArrayNumberTuple](#arrayarraynumbertuple) |

## ArrayArrayNumberTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple) |  |

## ArrayArrayNumberTuple
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayArrayNumberTupleInput](#arrayarraynumbertupleinput), [ArrayArrayNumberTuple](#arrayarraynumbertuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple](#itemstuple) | This method is used under the hood when instance[0] is called

# Items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple) | [ItemsTuple](#itemstuple) |

## ItemsTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
float, int |  |

## ItemsTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | float, int | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
