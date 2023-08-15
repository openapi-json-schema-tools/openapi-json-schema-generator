# DanishPig
petstore_api.components.schema.danish_pig
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[DanishPigDictInput](#danishpigdictinput), [DanishPigDict](#danishpigdict) | [DanishPigDict](#danishpigdict) |

## DanishPigDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**className** | typing.Literal["DanishPig"] |  | must be one of ["DanishPig"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## DanishPigDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**className** | typing.Literal["DanishPig"] |  | must be one of ["DanishPig"]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**className** | typing.Literal["DanishPig"] |  | must be one of ["DanishPig"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [DanishPigDictInput](#danishpigdictinput), [DanishPigDict](#danishpigdict) | [DanishPigDict](#danishpigdict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
