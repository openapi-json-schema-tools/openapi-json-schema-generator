petstore_api.components.schema.array_holding_any_type
# ArrayHoldingAnyType

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayHoldingAnyTypeTupleInput](#arrayholdinganytypetupleinput), [ArrayHoldingAnyTypeTuple](#arrayholdinganytypetuple) | [ArrayHoldingAnyTypeTuple](#arrayholdinganytypetuple) |

## ArrayHoldingAnyTypeTupleInput
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
≥ 0 | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any type can be stored here |

## ArrayHoldingAnyTypeTuple
```
base class: typing.Tuple[
    schemas.OUTPUT_BASE_TYPES,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayHoldingAnyTypeTupleInput](#arrayholdinganytypetupleinput), [ArrayHoldingAnyTypeTuple](#arrayholdinganytypetuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
