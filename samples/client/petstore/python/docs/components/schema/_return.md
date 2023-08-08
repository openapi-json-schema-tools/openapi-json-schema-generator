petstore_api.components.schema._return
# Schema _Return

## Description
Model for testing reserved words

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ReturnDictInput](#returndictinput), [ReturnDict](#returndict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [ReturnDict](#returndict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## ReturnDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**return** | int | this is a reserved python keyword | [optional] value must be a 32 bit integer
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## ReturnDict
```
base class: schemas.immutabledict[str, int]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type Model for testing reserved words | [optional] typed value is accessed with the get_additional_property_ method

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ReturnDictInput](#returndictinput), [ReturnDict](#returndict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [ReturnDict](#returndict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | int | This model has invalid python names so this method is used under the hood when you access instance["return"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
