# UnevaluatedpropertiesWithAdjacentAdditionalproperties
unit_test_api.components.schema.unevaluatedproperties_with_adjacent_additionalproperties
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDictInput](#unevaluatedpropertieswithadjacentadditionalpropertiesdictinput), [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDict](#unevaluatedpropertieswithadjacentadditionalpropertiesdict) | [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDict](#unevaluatedpropertieswithadjacentadditionalpropertiesdict) |

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**foo** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**foo** | str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**foo** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDictInput](#unevaluatedpropertieswithadjacentadditionalpropertiesdictinput), [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDict](#unevaluatedpropertieswithadjacentadditionalpropertiesdict) | [UnevaluatedpropertiesWithAdjacentAdditionalpropertiesDict](#unevaluatedpropertieswithadjacentadditionalpropertiesdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
