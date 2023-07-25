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

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

#### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Pet**](../../components/schema/pet.md) | [**Pet**](../../components/schema/pet.md) | [**Pet**](../../components/schema/pet.md) |  |
### content ApplicationJson Schema

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

#### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RefPet**](../../components/schema/ref_pet.md) | [**RefPet**](../../components/schema/ref_pet.md) | [**RefPet**](../../components/schema/ref_pet.md) |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
