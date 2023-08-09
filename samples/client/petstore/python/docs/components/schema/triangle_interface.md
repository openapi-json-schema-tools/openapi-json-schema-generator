# TriangleInterface
petstore_api.components.schema.triangle_interface

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[TriangleInterfaceDictInput](#triangleinterfacedictinput), [TriangleInterfaceDict](#triangleinterfacedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [TriangleInterfaceDict](#triangleinterfacedict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## TriangleInterfaceDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**shapeType** | str |  | must be one of ["Triangle"]
**triangleType** | str |  |
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## TriangleInterfaceDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**shapeType** | str |  | must be one of ["Triangle"]
**triangleType** | str |  |
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**shapeType** | str |  | must be one of ["Triangle"]
**triangleType** | str |  |

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [TriangleInterfaceDictInput](#triangleinterfacedictinput), [TriangleInterfaceDict](#triangleinterfacedict) | [TriangleInterfaceDict](#triangleinterfacedict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
