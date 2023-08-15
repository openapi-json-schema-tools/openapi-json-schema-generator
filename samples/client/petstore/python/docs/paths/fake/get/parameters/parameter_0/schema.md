# Schema
petstore_api.paths.fake.get.parameters.parameter_0.schema
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
            ">",
            "$"
        ],
    ],
    typing.Tuple[
        typing.Literal[
            ">",
            "$"
        ],
        ...
    ]
]
```
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
typing.Literal[">", "$"] |  | must be one of [">", "$"] if omitted the server will use the default value of $

## SchemaTuple
```
base class: typing.Tuple[
    typing.Literal[">", "$"],
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | typing.Literal[">", "$"] | must be one of [">", "$"] if omitted the server will use the default value of $ This method is used under the hood when instance[0] is called
