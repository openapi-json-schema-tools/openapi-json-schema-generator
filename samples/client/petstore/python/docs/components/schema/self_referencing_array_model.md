# SelfReferencingArrayModel
petstore_api.components.schema.self_referencing_array_model
```
type: schemas.Schema
```

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
≥ 0 | [self_referencing_array_model.SelfReferencingArrayModelTupleInput](../../components/schema/self_referencing_array_model.md#selfreferencingarraymodeltupleinput), [self_referencing_array_model.SelfReferencingArrayModelTuple](../../components/schema/self_referencing_array_model.md#selfreferencingarraymodeltuple) |  |

## SelfReferencingArrayModelTuple
```
base class: typing.Tuple[
    'SelfReferencingArrayModelTuple',
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SelfReferencingArrayModelTupleInput](#selfreferencingarraymodeltupleinput), [SelfReferencingArrayModelTuple](#selfreferencingarraymodeltuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [self_referencing_array_model.SelfReferencingArrayModelTuple](../../components/schema/self_referencing_array_model.md#selfreferencingarraymodeltuple) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
