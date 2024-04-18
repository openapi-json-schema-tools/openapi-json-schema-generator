# UnevaluateditemsWithItems
openapi_client.components.schema.unevaluateditems_with_items
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[UnevaluateditemsWithItemsTupleInput](#unevaluateditemswithitemstupleinput), [UnevaluateditemsWithItemsTuple](#unevaluateditemswithitemstuple) | [UnevaluateditemsWithItemsTuple](#unevaluateditemswithitemstuple) |

## UnevaluateditemsWithItemsTupleInput
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

## UnevaluateditemsWithItemsTuple
```
base class: typing.Tuple[
    typing.Union[int, float],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [UnevaluateditemsWithItemsTupleInput](#unevaluateditemswithitemstupleinput), [UnevaluateditemsWithItemsTuple](#unevaluateditemswithitemstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | float, int | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
