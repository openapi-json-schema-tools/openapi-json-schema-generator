petstore_api.components.schema.animal
# Schema Animal

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[AnimalDictInput](#animaldictinput) | [AnimalDict](#animaldict) |  |

## AnimalDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  |
**color** | str |  | [optional] if omitted the server will use the default value of red
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## AnimalDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**className** | str | str |  |
**color** | str | str, schemas.Unset |  | [optional] if omitted the server will use the default value of red
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
