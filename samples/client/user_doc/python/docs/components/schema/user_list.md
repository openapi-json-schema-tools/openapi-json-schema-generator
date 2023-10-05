# UserList
some_api.components.schema.user_list
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[UserListTupleInput](#userlisttupleinput), [UserListTuple](#userlisttuple) | [UserListTuple](#userlisttuple) |

## UserListTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            user_item.UserItemDictInput,
            user_item.UserItemDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            user_item.UserItemDictInput,
            user_item.UserItemDict,
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[user_item.UserItemDictInput](../../components/schema/user_item.md#useritemdictinput), [user_item.UserItemDict](../../components/schema/user_item.md#useritemdict) |  |

## UserListTuple
```
base class: typing.Tuple[
    user_item.UserItemDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [UserListTupleInput](#userlisttupleinput), [UserListTuple](#userlisttuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [user_item.UserItemDict](../../components/schema/user_item.md#useritemdict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
