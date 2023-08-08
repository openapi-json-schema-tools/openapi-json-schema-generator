petstore_api.components.schema.self_referencing_array_model
# Schema SelfReferencingArrayModel

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SelfReferencingArrayModelTupleInput](#selfreferencingarraymodeltupleinput), [SelfReferencingArrayModelTuple](#selfreferencingarraymodeltuple) | [SelfReferencingArrayModelTuple](#selfreferencingarraymodeltuple) |

## SelfReferencingArrayModelTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            'SelfReferencingArrayModelTupleInput',
            SelfReferencingArrayModelTuple
        ],
    ],
    typing.Tuple[
        typing.Union[
            'SelfReferencingArrayModelTupleInput',
            SelfReferencingArrayModelTuple
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**SelfReferencingArrayModel**](#top) |  |

## SelfReferencingArrayModelTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**SelfReferencingArrayModel**](#top) | [**SelfReferencingArrayModel**](#top) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
