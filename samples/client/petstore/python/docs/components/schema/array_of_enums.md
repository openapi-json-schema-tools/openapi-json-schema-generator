petstore_api.components.schema.array_of_enums
# Schema ArrayOfEnums

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
            typing_extensions.Literal[
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
            typing_extensions.Literal[
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
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**StringEnum**](string_enum.md) |  |

## ArrayOfEnumsTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**StringEnum**](string_enum.md) | [**StringEnum**](string_enum.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
