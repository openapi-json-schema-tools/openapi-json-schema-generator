# ItemsWithNullInstanceElements
openapi_client.components.schema.items_with_null_instance_elements
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ItemsWithNullInstanceElementsTupleInput](#itemswithnullinstanceelementstupleinput), [ItemsWithNullInstanceElementsTuple](#itemswithnullinstanceelementstuple) | [ItemsWithNullInstanceElementsTuple](#itemswithnullinstanceelementstuple) |

## ItemsWithNullInstanceElementsTupleInput
```
type: typing.Union[
    typing.List[
        None,
    ],
    typing.Tuple[
        None,
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
None |  |

## ItemsWithNullInstanceElementsTuple
```
base class: typing.Tuple[
    None,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ItemsWithNullInstanceElementsTupleInput](#itemswithnullinstanceelementstupleinput), [ItemsWithNullInstanceElementsTuple](#itemswithnullinstanceelementstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | None | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
