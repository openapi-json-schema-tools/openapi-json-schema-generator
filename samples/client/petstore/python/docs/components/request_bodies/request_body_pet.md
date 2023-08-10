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
```
type: schemas.Schema
```

### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**pet.Pet**](../../components/schema/pet.md) | [pet.PetDictInput](../../components/schema/pet.md#petdictinput), [pet.PetDict](../../components/schema/pet.md#petdict) | [pet.PetDict](../../components/schema/pet.md#petdict)
## content ApplicationXml Schema
petstore_api.components.request_bodies.request_body_pet.content.application_xml.schema
```
type: schemas.Schema
```

### Ref Schema Info
Ref Schema | Input Type | Output Type
---------- | ---------- | -----------
[**ref_pet.RefPet**](../../components/schema/ref_pet.md) | [pet.PetDictInput](../../components/schema/pet.md#petdictinput), [pet.PetDict](../../components/schema/pet.md#petdict) | [pet.PetDict](../../components/schema/pet.md#petdict)

[[Back to top]](#top) [[Back to Component RequestBodies]](../../../README.md#Component-RequestBodies) [[Back to README]](../../../README.md)
