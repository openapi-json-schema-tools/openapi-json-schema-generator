petstore_api.components.schema.capitalization
# Schema Capitalization

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
**ATT_NAME** | str | Name of the pet  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## CapitalizationDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**smallCamel** | str, schemas.Unset |  | [optional]
**CapitalCamel** | str, schemas.Unset |  | [optional]
**small_Snake** | str, schemas.Unset |  | [optional]
**Capital_Snake** | str, schemas.Unset |  | [optional]
**SCA_ETH_Flow_Points** | str, schemas.Unset |  | [optional]
**ATT_NAME** | str, schemas.Unset | Name of the pet  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**smallCamel** | str, schemas.Unset |  | [optional]
**CapitalCamel** | str, schemas.Unset |  | [optional]
**small_Snake** | str, schemas.Unset |  | [optional]
**Capital_Snake** | str, schemas.Unset |  | [optional]
**SCA_ETH_Flow_Points** | str, schemas.Unset |  | [optional]
**ATT_NAME** | str, schemas.Unset | Name of the pet  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [CapitalizationDictInput](#capitalizationdictinput), [CapitalizationDict](#capitalizationdict) | [CapitalizationDict](#capitalizationdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
