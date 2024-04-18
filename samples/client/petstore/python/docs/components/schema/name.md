# Name
openapi_client.components.schema.name
```
type: schemas.Schema
```

## Description
Model for testing model name same as property name

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[NameDictInput](#namedictinput), [NameDict](#namedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [NameDict](#namedict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## NameDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**name** | int |  | value must be a 32 bit integer
**snake_case** | int |  | [optional] value must be a 32 bit integer
**property** | str | this is a reserved python keyword | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## NameDict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**name** | int |  | value must be a 32 bit integer
**snake_case** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**property** | str, schemas.Unset | this is a reserved python keyword | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type Model for testing model name same as property name | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**name** | int |  | value must be a 32 bit integer
**snake_case** | int, schemas.Unset |  | [optional] value must be a 32 bit integer
**property** | str, schemas.Unset | this is a reserved python keyword | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [NameDictInput](#namedictinput), [NameDict](#namedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [NameDict](#namedict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
