# ArrayOfNumberOnly
petstore_api.components.schema.array_of_number_only
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfNumberOnlyDictInput](#arrayofnumberonlydictinput), [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) | [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) |

## ArrayOfNumberOnlyDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**ArrayNumber** | [ArrayNumberTupleInput](#arraynumbertupleinput), [ArrayNumberTuple](#arraynumbertuple) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ArrayOfNumberOnlyDict
```
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**ArrayNumber** | [ArrayNumberTupleInput](#arraynumbertupleinput), [ArrayNumberTuple](#arraynumbertuple), schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**ArrayNumber** | [ArrayNumberTuple](#arraynumbertuple), schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ArrayOfNumberOnlyDictInput](#arrayofnumberonlydictinput), [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) | [ArrayOfNumberOnlyDict](#arrayofnumberonlydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

# ArrayNumber
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayNumberTupleInput](#arraynumbertupleinput), [ArrayNumberTuple](#arraynumbertuple) | [ArrayNumberTuple](#arraynumbertuple) |

## ArrayNumberTupleInput
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

## ArrayNumberTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayNumberTupleInput](#arraynumbertupleinput), [ArrayNumberTuple](#arraynumbertuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | float, int | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
