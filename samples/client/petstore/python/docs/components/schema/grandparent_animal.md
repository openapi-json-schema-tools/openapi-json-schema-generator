petstore_api.components.schema.grandparent_animal
# Schema GrandparentAnimal

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[GrandparentAnimalDictInput](#grandparentanimaldictinput), [GrandparentAnimalDict](#grandparentanimaldict) | [GrandparentAnimalDict](#grandparentanimaldict) |

## GrandparentAnimalDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**pet_type** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## GrandparentAnimalDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[GrandparentAnimalDictInput](#grandparentanimaldictinput), [GrandparentAnimalDict](#grandparentanimaldict) | [GrandparentAnimalDict](#grandparentanimaldict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**pet_type** | str | str |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
