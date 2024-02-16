# Schema
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#schematupleinput), [SchemaTuple](#schematuple) | [SchemaTuple](#schematuple) |

## SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            user.UserDictInput,
            user.UserDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            user.UserDictInput,
            user.UserDict,
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[user.UserDictInput](../../../../../components/schema/user.md#userdictinput), [user.UserDict](../../../../../components/schema/user.md#userdict) |  |

## SchemaTuple
```
base class: typing.Tuple[
    user.UserDict,
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#schematupleinput), [SchemaTuple](#schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [user.UserDict](../../../../../components/schema/user.md#userdict) | This method is used under the hood when instance[0] is called
