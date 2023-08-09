petstore_api.components.schema.category
# Schema Category

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[CategoryDictInput](#categorydictinput), [CategoryDict](#categorydict) | [CategoryDict](#categorydict) |

## CategoryDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | str |  | if omitted the server will use the default value of default-name
**id** | int |  | [optional] value must be a 64 bit integer
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## CategoryDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | str |  | if omitted the server will use the default value of default-name
**id** | int |  | [optional] value must be a 64 bit integer
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | str |  | if omitted the server will use the default value of default-name
**id** | int, schemas.Unset |  | [optional] value must be a 64 bit integer

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [CategoryDictInput](#categorydictinput), [CategoryDict](#categorydict) | [CategoryDict](#categorydict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
