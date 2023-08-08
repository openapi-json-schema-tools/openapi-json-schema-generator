petstore_api.components.responses.response_successful_xml_and_json_array_of_pet
# Response SuccessfulXmlAndJsonArrayOfPet

## Description
successful operation, multiple content types

## response_cls
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[content.application_xml.schema](#content-applicationxml-schema), [content.application_json.schema](#content-applicationjson-schema)] |  |
headers | Unset | headers were not defined |

## Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## Body Details
### content ApplicationXml Schema

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#content-applicationxml-schema-schematupleinput), [SchemaTuple](#content-applicationxml-schema-schematuple) | [SchemaTuple](#content-applicationxml-schema-schematuple) |

#### content ApplicationXml Schema SchemaTupleInput
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
≥ 0 | [**Pet**](../../components/schema/pet.md) |  |

#### content ApplicationXml Schema SchemaTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**Pet**](../../components/schema/pet.md) | [**Pet**](../../components/schema/pet.md) |  |
### content ApplicationJson Schema

#### validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[SchemaTupleInput](#content-applicationjson-schema-schematupleinput), [SchemaTuple](#content-applicationjson-schema-schematuple) | [SchemaTuple](#content-applicationjson-schema-schematuple) |

#### content ApplicationJson Schema SchemaTupleInput
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
≥ 0 | [**RefPet**](../../components/schema/ref_pet.md) |  |

#### content ApplicationJson Schema SchemaTuple
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**RefPet**](../../components/schema/ref_pet.md) | [**RefPet**](../../components/schema/ref_pet.md) |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
