petstore_api.components.schema.foo
# Schema Foo

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[FooDictInput](#foodictinput), [FooDict](#foodict) | [FooDict](#foodict) |

## FooDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**bar** | [**Bar**](bar.md), str |  | [optional]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## FooDict
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**bar** | [**Bar**](bar.md), str, schemas.Unset |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**bar** | [**Bar**](bar.md) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [FooDictInput](#foodictinput), [FooDict](#foodict) | [FooDict](#foodict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
