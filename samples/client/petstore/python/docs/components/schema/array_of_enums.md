# ArrayOfEnums
openapi_client.components.schema.array_of_enums
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ArrayOfEnumsTupleInput](#arrayofenumstupleinput), [ArrayOfEnumsTuple](#arrayofenumstuple) | [ArrayOfEnumsTuple](#arrayofenumstuple) |

## ArrayOfEnumsTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            None,
            typing.Literal[
                "placed",
                "approved",
                "delivered",
                "single quoted",
                "multiple\nlines",
                "double quote \n with newline"
            ],
        ],
    ],
    typing.Tuple[
        typing.Union[
            None,
            typing.Literal[
                "placed",
                "approved",
                "delivered",
                "single quoted",
                "multiple\nlines",
                "double quote \n with newline"
            ],
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
None, typing.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"] |  |

## ArrayOfEnumsTuple
```
base class: typing.Tuple[
    typing.Union[
        None,
        typing.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"],
    ],
    ...
]
```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [ArrayOfEnumsTupleInput](#arrayofenumstupleinput), [ArrayOfEnumsTuple](#arrayofenumstuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | None, typing.Literal["placed", "approved", "delivered", "single quoted", "multiple\nlines", "double quote \n with newline"] | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
