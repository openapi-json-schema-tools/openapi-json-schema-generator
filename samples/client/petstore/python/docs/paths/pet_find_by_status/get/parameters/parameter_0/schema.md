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
        typing.Literal[
            "available",
            "pending",
            "sold"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            "available",
            "pending",
            "sold"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal["available", "pending", "sold"] |  | must be one of ["available", "pending", "sold"] if omitted the server will use the default value of available

## SchemaTuple
```
base class: typing.Tuple[
    typing.Literal["available", "pending", "sold"],
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal["available", "pending", "sold"] | must be one of ["available", "pending", "sold"] if omitted the server will use the default value of available This method is used under the hood when instance[0] is called
