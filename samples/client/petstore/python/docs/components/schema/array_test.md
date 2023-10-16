# ArrayTest
petstore_api.components.schema.array_test
```
type: schemas.Schema
```

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
**array_of_string** | [ArrayOfStringTupleInput](#arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstringtuple) |  | [optional]
**array_array_of_integer** | [ArrayArrayOfIntegerTupleInput](#arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple) |  | [optional]
**array_array_of_model** | [ArrayArrayOfModelTupleInput](#arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## ArrayTestDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**array_of_string** | [ArrayOfStringTupleInput](#arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstringtuple), schemas.Unset |  | [optional]
**array_array_of_integer** | [ArrayArrayOfIntegerTupleInput](#arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple), schemas.Unset |  | [optional]
**array_array_of_model** | [ArrayArrayOfModelTupleInput](#arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple), schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

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
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

# ArrayOfString
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfStringTupleInput](#arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstringtuple) | [ArrayOfStringTuple](#arrayofstringtuple) |

## ArrayOfStringTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
str |  |

## ArrayOfStringTuple
```
base class: typing.Tuple[
    str,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayOfStringTupleInput](#arrayofstringtupleinput), [ArrayOfStringTuple](#arrayofstringtuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | str | This method is used under the hood when instance[0] is called

# ArrayArrayOfInteger
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfIntegerTupleInput](#arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple) | [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple) |

## ArrayArrayOfIntegerTupleInput
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

## ArrayArrayOfIntegerTuple
```
base class: typing.Tuple[
    ItemsTuple,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayArrayOfIntegerTupleInput](#arrayarrayofintegertupleinput), [ArrayArrayOfIntegerTuple](#arrayarrayofintegertuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple](#itemstuple) | This method is used under the hood when instance[0] is called

# Items2
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
        int,
    ],
    typing.Tuple[
        int,
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
int |  | value must be a 64 bit integer

## ItemsTuple
```
base class: typing.Tuple[
    int,
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | int | value must be a 64 bit integer This method is used under the hood when instance[0] is called

# ArrayArrayOfModel
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayArrayOfModelTupleInput](#arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple) | [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple) |

## ArrayArrayOfModelTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2) |  |

## ArrayArrayOfModelTuple
```
base class: typing.Tuple[
    ItemsTuple2,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayArrayOfModelTupleInput](#arrayarrayofmodeltupleinput), [ArrayArrayOfModelTuple](#arrayarrayofmodeltuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [ItemsTuple2](#itemstuple2) | This method is used under the hood when instance[0] is called

# Items4
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2) | [ItemsTuple2](#itemstuple2) |

## ItemsTupleInput2
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[read_only_first.ReadOnlyFirstDictInput](../../components/schema/read_only_first.md#readonlyfirstdictinput), [read_only_first.ReadOnlyFirstDict](../../components/schema/read_only_first.md#readonlyfirstdict) |  |

## ItemsTuple2
```
base class: typing.Tuple[
    read_only_first.ReadOnlyFirstDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsTupleInput2](#itemstupleinput2), [ItemsTuple2](#itemstuple2)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [read_only_first.ReadOnlyFirstDict](../../components/schema/read_only_first.md#readonlyfirstdict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
