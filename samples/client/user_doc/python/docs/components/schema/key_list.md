# KeyList
some_api.components.schema.key_list
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[KeyListTupleInput](#keylisttupleinput), [KeyListTuple](#keylisttuple) | [KeyListTuple](#keylisttuple) |

## KeyListTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            key_item.KeyItemDictInput,
            key_item.KeyItemDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            key_item.KeyItemDictInput,
            key_item.KeyItemDict,
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[key_item.KeyItemDictInput](../../components/schema/key_item.md#keyitemdictinput), [key_item.KeyItemDict](../../components/schema/key_item.md#keyitemdict) |  |

## KeyListTuple
```
base class: typing.Tuple[
    key_item.KeyItemDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [KeyListTupleInput](#keylisttupleinput), [KeyListTuple](#keylisttuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [key_item.KeyItemDict](../../components/schema/key_item.md#keyitemdict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
