petstore_api.components.request_bodies.request_body_pet
# RequestBody Pet

## Description
Pet object that needs to be added to the store, multiple content types

## Content Type To Schema
Content-Type | Schema
------------ | -------
"application/json" | [content.application_json.Schema](#content-applicationjson-schema)
"application/xml" | [content.application_xml.Schema](#content-applicationxml-schema)

## content ApplicationJson Schema

### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[Pet](../../components/schema/pet.md#pet) | dict, frozendict.frozendict,  | frozendict.frozendict,  |
## content ApplicationXml Schema

### Type Info
Ref Class | Input Type | Accessed Type | Description
--------- | ---------- | ------------- | ------------
[RefPet](../../components/schema/ref_pet.md#ref_pet) | dict, frozendict.frozendict,  | frozendict.frozendict,  |

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
