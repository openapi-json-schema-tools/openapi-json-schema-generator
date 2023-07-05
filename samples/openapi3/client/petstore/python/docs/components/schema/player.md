petstore_api.components.schema.player
# Schema Player

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict | schemas.immutabledict | a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str | str |  | [optional]
**enemyPlayer** | [**Player**](#top), dict, schemas.immutabledict | [**Player**](#top) |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
