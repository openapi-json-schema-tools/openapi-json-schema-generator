petstore_api.components.schema.player
# Schema Player

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[PlayerDictInput](#playerdictinput), [PlayerDict](#playerdict) | [PlayerDict](#playerdict) |

## PlayerDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  | [optional]
**enemyPlayer** | [**Player**](#top), dict, schemas.immutabledict |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## PlayerDict
### from_dict_ method
Input Type | Return Type
---------- | -----------
[PlayerDictInput](#playerdictinput), [PlayerDict](#playerdict) | [PlayerDict](#playerdict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str, schemas.Unset | str, schemas.Unset |  | [optional]
**enemyPlayer** | [**Player**](#top), dict, schemas.immutabledict, schemas.Unset | [**Player**](#top) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
