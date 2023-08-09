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
petstore_api.components.request_bodies.request_body_pet.content.application_json.schema

### Ref Schema Info
Ref Schema | Input Type | Output Type | Description
---------- | ---------- | ----------- | ------------
[Pet](../../components/schema/pet.md) | [PetDictInput](#content-applicationjson-schema-petdictinput), [PetDict](#content-applicationjson-schema-petdict) | [PetDict](#content-applicationjson-schema-petdict) |
## content ApplicationXml Schema
petstore_api.components.request_bodies.request_body_pet.content.application_xml.schema

### Ref Schema Info
Ref Schema | Input Type | Output Type | Description
---------- | ---------- | ----------- | ------------
[RefPet](../../components/schema/ref_pet.md) | [PetDictInput](#content-applicationxml-schema-petdictinput), [PetDict](#content-applicationxml-schema-petdict) | [PetDict](#content-applicationxml-schema-petdict) |

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
