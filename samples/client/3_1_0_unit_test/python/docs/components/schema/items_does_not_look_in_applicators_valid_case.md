# ItemsDoesNotLookInApplicatorsValidCase
openapi_client.components.schema.items_does_not_look_in_applicators_valid_case
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsDoesNotLookInApplicatorsValidCaseTupleInput](#itemsdoesnotlookinapplicatorsvalidcasetupleinput), [ItemsDoesNotLookInApplicatorsValidCaseTuple](#itemsdoesnotlookinapplicatorsvalidcasetuple) | [ItemsDoesNotLookInApplicatorsValidCaseTuple](#itemsdoesnotlookinapplicatorsvalidcasetuple) |

## ItemsDoesNotLookInApplicatorsValidCaseTupleInput
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  |

## ItemsDoesNotLookInApplicatorsValidCaseTuple
```
base class: typing.Tuple[
    schemas.OUTPUT_BASE_TYPES,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsDoesNotLookInApplicatorsValidCaseTupleInput](#itemsdoesnotlookinapplicatorsvalidcasetupleinput), [ItemsDoesNotLookInApplicatorsValidCaseTuple](#itemsdoesnotlookinapplicatorsvalidcasetuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
