# ClassModel
petstore_api.components.schema.class_model
```
type: schemas.Schema
```

## Description
Model for testing model with \&quot;_class\&quot; property

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ClassModelDictInput](#classmodeldictinput), [ClassModelDict](#classmodeldict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [ClassModelDict](#classmodeldict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## ClassModelDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**_class** | str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## ClassModelDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**_class** | str, schemas.Unset |  | [optional]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type Model for testing model with \&quot;_class\&quot; property | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**_class** | str, schemas.Unset |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [ClassModelDictInput](#classmodeldictinput), [ClassModelDict](#classmodeldict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [ClassModelDict](#classmodeldict), str, float, int, bool, None, tuple, bytes, io.FileIO | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset }} | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
