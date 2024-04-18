# SelfReferencingArrayModel
openapi_client.components.schema.self_referencing_array_model
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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[SelfReferencingArrayModelTupleInput](#selfreferencingarraymodeltupleinput), [SelfReferencingArrayModelTuple](#selfreferencingarraymodeltuple) |  |

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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [SelfReferencingArrayModelTuple](#selfreferencingarraymodeltuple) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
