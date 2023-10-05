# TagList
some_api.components.schema.tag_list
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TagListTupleInput](#taglisttupleinput), [TagListTuple](#taglisttuple) | [TagListTuple](#taglisttuple) |

## TagListTupleInput
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

## TagListTuple
```
base class: typing.Tuple[
    str,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [TagListTupleInput](#taglisttupleinput), [TagListTuple](#taglisttuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | str | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
