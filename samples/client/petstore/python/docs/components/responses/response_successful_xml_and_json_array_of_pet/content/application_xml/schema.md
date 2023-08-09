# Schema
petstore_api.components.responses.response_successful_xml_and_json_array_of_pet.content.application_xml.schema

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#schematupleinput), [SchemaTuple](#schematuple) | [SchemaTuple](#schematuple) |

## SchemaTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            pet.PetDictInput,
            pet.PetDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            pet.PetDictInput,
            pet.PetDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**Pet**](pet.md) |  |

## SchemaTuple
```
base class: typing.Tuple[
    pet.PetDict,
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | schemas.OUTPUT_BASE_TYPES | This method is used under the hood when instance[0] is called
