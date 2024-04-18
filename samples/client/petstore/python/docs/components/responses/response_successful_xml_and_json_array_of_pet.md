openapi_client.components.responses.response_successful_xml_and_json_array_of_pet
# Response SuccessfulXmlAndJsonArrayOfPet

## Description
successful operation, multiple content types

## ApiResponse
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#body) | typing.Union[[SchemaTuple](#content-applicationxml-schema-schematuple), [SchemaTuple](#content-applicationjson-schema-schematuple)] |  |
headers | Unset | headers were not defined |

## Body
Content-Type | Schema
------------ | -------
"application/xml" | [content.application_xml.Schema](#content-applicationxml-schema)
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)

## Body Details
### content ApplicationXml Schema
```
type: schemas.Schema
```

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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[pet.PetDictInput](../../components/schema/pet.md#petdictinput), [pet.PetDict](../../components/schema/pet.md#petdict) |  |

#### content ApplicationXml Schema SchemaTuple
```
base class: typing.Tuple[
    pet.PetDict,
    ...
]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#content-applicationxml-schema-schematupleinput), [SchemaTuple](#content-applicationxml-schema-schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [pet.PetDict](../../components/schema/pet.md#petdict) | This method is used under the hood when instance[0] is called
### content ApplicationJson Schema
```
type: schemas.Schema
```

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
List/Tuple Item Type | Description | Notes
-------------------- | ------------- | -------------
[pet.PetDictInput](../../components/schema/pet.md#petdictinput), [pet.PetDict](../../components/schema/pet.md#petdict) |  |

#### content ApplicationJson Schema SchemaTuple
```
base class: typing.Tuple[
    ref_pet.pet.PetDict,
    ...
]
```
##### &lowbar;&lowbar;new&lowbar;&lowbar; method
Argument | Type
-------- | ------
arg      | [SchemaTupleInput](#content-applicationjson-schema-schematupleinput), [SchemaTuple](#content-applicationjson-schema-schematuple)
configuration | typing.Optional[schema_configuration.SchemaConfiguration] = None

##### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
&lowbar;&lowbar;getitem&lowbar;&lowbar; | int | [pet.PetDict](../../components/schema/pet.md#petdict) | This method is used under the hood when instance[0] is called

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
