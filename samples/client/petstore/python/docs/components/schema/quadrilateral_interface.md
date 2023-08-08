petstore_api.components.schema.quadrilateral_interface
# Schema QuadrilateralInterface

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |  |

## QuadrilateralInterfaceDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**quadrilateralType** | str |  |
**shapeType** | str |  | must be one of ["Quadrilateral"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## QuadrilateralInterfaceDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**quadrilateralType** | str | str |  |
**shapeType** | str | str |  | must be one of ["Quadrilateral"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
