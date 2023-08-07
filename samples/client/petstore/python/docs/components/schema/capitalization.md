petstore_api.components.schema.capitalization
# Schema Capitalization

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[CapitalizationDictInput](#capitalizationdictinput) | [CapitalizationDict](#capitalizationdict) |  |

## CapitalizationDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**smallCamel** | str |  | [optional]
**CapitalCamel** | str |  | [optional]
**small_Snake** | str |  | [optional]
**Capital_Snake** | str |  | [optional]
**SCA_ETH_Flow_Points** | str |  | [optional]
**ATT_NAME** | str | Name of the pet  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | any string name can be used but the value must be the correct type | [optional]

## CapitalizationDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**smallCamel** | str | str, schemas.Unset |  | [optional]
**CapitalCamel** | str | str, schemas.Unset |  | [optional]
**small_Snake** | str | str, schemas.Unset |  | [optional]
**Capital_Snake** | str | str, schemas.Unset |  | [optional]
**SCA_ETH_Flow_Points** | str | str, schemas.Unset |  | [optional]
**ATT_NAME** | str | str, schemas.Unset | Name of the pet  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
