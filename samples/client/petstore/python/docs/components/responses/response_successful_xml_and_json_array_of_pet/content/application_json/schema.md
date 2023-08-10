# Schema
petstore_api.components.responses.response_successful_xml_and_json_array_of_pet.content.application_json.schema
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
            ref_pet.pet.PetDictInput,
            ref_pet.pet.PetDict,
        ],
    ],
    typing.Tuple[
        typing.Union[
            ref_pet.pet.PetDictInput,
            ref_pet.pet.PetDict,
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [pet.PetDictInput](../../../../components/schema/pet.md#petdictinput), [pet.PetDict](../../../../components/schema/pet.md#petdict) |  |

## SchemaTuple
```
base class: typing.Tuple[
    ref_pet.pet.PetDict,
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
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [pet.PetDict](../../../../components/schema/pet.md#petdict) | This method is used under the hood when instance[0] is called
