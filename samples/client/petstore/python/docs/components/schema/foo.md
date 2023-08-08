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
### from_dict_ method
Input Type | Return Type
---------- | -----------
[FooDictInput](#foodictinput), [FooDict](#foodict) | [FooDict](#foodict)

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**bar** | [**Bar**](bar.md), str, schemas.Unset | [**Bar**](bar.md) |  | [optional]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
