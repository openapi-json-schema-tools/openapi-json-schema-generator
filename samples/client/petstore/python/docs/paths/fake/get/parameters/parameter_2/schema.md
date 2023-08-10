# Schema
petstore_api.paths.fake.get.parameters.parameter_2.schema
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
        typing_extensions.Literal[
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing_extensions.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | str |  | must be one of [">", "$"] if omitted the server will use the default value of $

## SchemaTuple
```
base class: typing.Tuple[
    typing_extensions.Literal[">", "$"],
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | str | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called
