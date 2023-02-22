petstore_api.components.schema.player
# Player

## Description
a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | a model that includes a self reference this forces properties and additionalProperties to be lazy loaded in python models because the Player class has not fully loaded when defining properties |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,   | [optional]
**enemyPlayer** | [**Player**](#Player)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**Player**](#Player)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
