petstore_api.components.schema.simple_quadrilateral
# SimpleQuadrilateral

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**QuadrilateralInterface**](quadrilateral_interface.md) | [**QuadrilateralInterface**](quadrilateral_interface.md) | [**QuadrilateralInterface**](quadrilateral_interface.md) |  |
[_1](#) | dict, schemas.immutabledict | schemas.immutabledict |  |

# _1

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict) |

## _1DictInput
```
type: typing.Mapping[str, schemas.INPUT_TYPES_ALL]
```
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**quadrilateralType** | str |  | [optional] must be one of ["SimpleQuadrilateral"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## _1Dict
```
base class: schemas.immutabledict[str, str]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**quadrilateralType** | str, schemas.Unset |  | [optional] must be one of ["SimpleQuadrilateral"]
**kwargs** | dict, schemas.immutabledict, list, tuple, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**quadrilateralType** | str, schemas.Unset |  | [optional] must be one of ["SimpleQuadrilateral"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bytes, bool, None, FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
