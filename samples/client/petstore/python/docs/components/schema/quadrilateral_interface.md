# QuadrilateralInterface
petstore_api.components.schema.quadrilateral_interface
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[QuadrilateralInterfaceDictInput](#quadrilateralinterfacedictinput), [QuadrilateralInterfaceDict](#quadrilateralinterfacedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [QuadrilateralInterfaceDict](#quadrilateralinterfacedict), str, float, int, bool, None, tuple, bytes, io.FileIO |

## QuadrilateralInterfaceDictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**quadrilateralType** | str |  |
**shapeType** | str |  | must be one of ["Quadrilateral"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## QuadrilateralInterfaceDict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**quadrilateralType** | str |  |
**shapeType** | str |  | must be one of ["Quadrilateral"]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**quadrilateralType** | str |  |
**shapeType** | str |  | must be one of ["Quadrilateral"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [QuadrilateralInterfaceDictInput](#quadrilateralinterfacedictinput), [QuadrilateralInterfaceDict](#quadrilateralinterfacedict) | [QuadrilateralInterfaceDict](#quadrilateralinterfacedict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
