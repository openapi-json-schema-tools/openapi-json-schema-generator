# _200Response
petstore_api.components.schema._200_response
```
type: schemas.Schema
```

## Description
model with an invalid class name for python, starts with a number

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_200ResponseDictInput](#_200responsedictinput), [_200ResponseDict](#_200responsedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [_200ResponseDict](#_200responsedict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## _200ResponseDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | int |  | [optional] value must be a 32 bit integer
**class** | str | this is a reserved python keyword | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## _200ResponseDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type model with an invalid class name for python, starts with a number | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | int, schemas.Unset |  | [optional] value must be a 32 bit integer

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_200ResponseDictInput](#_200responsedictinput), [_200ResponseDict](#_200responsedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [_200ResponseDict](#_200responsedict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
&lowbar;&lowbar;getitem&lowbar;&lowbar; | str | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO | This model has invalid python names so this method is used under the hood when you access instance["class"], 
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
