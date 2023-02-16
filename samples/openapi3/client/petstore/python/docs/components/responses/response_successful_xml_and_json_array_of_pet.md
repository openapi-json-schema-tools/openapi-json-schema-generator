<a name="top"></a>
petstore_api.components.responses.response_successful_xml_and_json_array_of_pet
# <a id="response_successful_xml_and_json_array_of_pet" >SuccessfulXmlAndJsonArrayOfPet</a>

## <a id="response_successful_xml_and_json_array_of_petdescription" >SuccessfulXmlAndJsonArrayOfPet.description</a>
successful operation, multiple content types

## <a id="response_successful_xml_and_json_array_of_petresponse_cls" >SuccessfulXmlAndJsonArrayOfPet.response_cls</a>
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
[body](#response_successful_xml_and_json_array_of_petcontent) | typing.Union[[SuccessfulXmlAndJsonArrayOfPet.content.application_xml.schema](#response_successful_xml_and_json_array_of_petcontentapplication_xmlschema), [SuccessfulXmlAndJsonArrayOfPet.content.application_json.schema](#response_successful_xml_and_json_array_of_petcontentapplication_jsonschema), ] |  |
headers | Unset | headers were not defined |

## <a id="response_successful_xml_and_json_array_of_petcontent" >SuccessfulXmlAndJsonArrayOfPet.content</a>

### <a id="response_successful_xml_and_json_array_of_petcontentapplication_xmlschema" >SuccessfulXmlAndJsonArrayOfPet.content.application_xml.schema</a>
### Schema

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

#### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Pet**](../../components/schema/pet.Pet.md) | [**Pet**](../../components/schema/pet.Pet.md) | [**Pet**](../../components/schema/pet.Pet.md) |  |

### <a id="response_successful_xml_and_json_array_of_petcontentapplication_jsonschema" >SuccessfulXmlAndJsonArrayOfPet.content.application_json.schema</a>
### Schema

#### Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

#### List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RefPet**](../../components/schema/ref_pet.RefPet.md) | [**RefPet**](../../components/schema/ref_pet.RefPet.md) | [**RefPet**](../../components/schema/ref_pet.RefPet.md) |  |

[[Back to top]](#top) [[Back to Component Responses]](../../../README.md#Component-Responses) [[Back to README]](../../../README.md)
