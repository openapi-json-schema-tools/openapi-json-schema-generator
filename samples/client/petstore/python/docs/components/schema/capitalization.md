# Capitalization
petstore_api.components.schema.capitalization
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[CapitalizationDictInput](#capitalizationdictinput), [CapitalizationDict](#capitalizationdict) | [CapitalizationDict](#capitalizationdict) |

## CapitalizationDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**smallCamel** | str |  | [optional]
**CapitalCamel** | str |  | [optional]
**small_Snake** | str |  | [optional]
**Capital_Snake** | str |  | [optional]
**SCA_ETH_Flow_Points** | str |  | [optional]
**ATT_NAME** | str | Name of the pet<br> | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## CapitalizationDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**smallCamel** | str, schemas.Unset |  | [optional]
**CapitalCamel** | str, schemas.Unset |  | [optional]
**small_Snake** | str, schemas.Unset |  | [optional]
**Capital_Snake** | str, schemas.Unset |  | [optional]
**SCA_ETH_Flow_Points** | str, schemas.Unset |  | [optional]
**ATT_NAME** | str, schemas.Unset | Name of the pet<br> | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**smallCamel** | str, schemas.Unset |  | [optional]
**CapitalCamel** | str, schemas.Unset |  | [optional]
**small_Snake** | str, schemas.Unset |  | [optional]
**Capital_Snake** | str, schemas.Unset |  | [optional]
**SCA_ETH_Flow_Points** | str, schemas.Unset |  | [optional]
**ATT_NAME** | str, schemas.Unset | Name of the pet<br> | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [CapitalizationDictInput](#capitalizationdictinput), [CapitalizationDict](#capitalizationdict) | [CapitalizationDict](#capitalizationdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
