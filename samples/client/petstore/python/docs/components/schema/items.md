# Items
petstore_api.components.schema.items

## Description
component&#x27;s name collides with the inner schema name

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsTupleInput](#itemstupleinput), [ItemsTuple](#itemstuple) | [ItemsTuple](#itemstuple) |

## ItemsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
    ],
    typing.Tuple[
        typing.Union[
            typing.Mapping[str, schemas.INPUT_TYPES_ALL],
            schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | dict, schemas.immutabledict |  |

## ItemsTuple
```
base class: typing.Tuple[
    schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES],
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES] | This method is used under the hood when instance[0] is called

# Items2

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
