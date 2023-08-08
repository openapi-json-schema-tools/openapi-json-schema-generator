petstore_api.components.schema.animal
# Schema Animal

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[AnimalDictInput](#animaldictinput), [AnimalDict](#animaldict) | [AnimalDict](#animaldict) |

## AnimalDictInput
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | str |  |
**color** | str |  | [optional] if omitted the server will use the default value of red
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## AnimalDict
base class: schemas.immutabledict[str, str]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**className** | str |  |
**color** | str, schemas.Unset |  | [optional] if omitted the server will use the default value of red
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** | str |  |
**color** | str, schemas.Unset |  | [optional] if omitted the server will use the default value of red

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [AnimalDictInput](#animaldictinput), [AnimalDict](#animaldict) | [AnimalDict](#animaldict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
