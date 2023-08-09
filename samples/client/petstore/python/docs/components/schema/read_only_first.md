# ReadOnlyFirst
petstore_api.components.schema.read_only_first

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ReadOnlyFirstDictInput](#readonlyfirstdictinput), [ReadOnlyFirstDict](#readonlyfirstdict) | [ReadOnlyFirstDict](#readonlyfirstdict) |

## ReadOnlyFirstDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | str |  | [optional]
**baz** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ReadOnlyFirstDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**bar** | str, schemas.Unset |  | [optional]
**baz** | str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**bar** | str, schemas.Unset |  | [optional]
**baz** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ReadOnlyFirstDictInput](#readonlyfirstdictinput), [ReadOnlyFirstDict](#readonlyfirstdict) | [ReadOnlyFirstDict](#readonlyfirstdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
