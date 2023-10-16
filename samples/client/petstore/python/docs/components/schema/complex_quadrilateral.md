# ComplexQuadrilateral
petstore_api.components.schema.complex_quadrilateral
```
type: schemas.Schema
```

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | schemas.immutabledict, str, float, int, bool, None, tuple, bytes, io.FileIO |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Schema Class | Input Type | Return Type
------------ | ---------- | -----------
[**quadrilateral_interface.QuadrilateralInterface**](../../components/schema/quadrilateral_interface.md) | [quadrilateral_interface.QuadrilateralInterfaceDictInput](../../components/schema/quadrilateral_interface.md#quadrilateralinterfacedictinput), [quadrilateral_interface.QuadrilateralInterfaceDict](../../components/schema/quadrilateral_interface.md#quadrilateralinterfacedict), str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [quadrilateral_interface.QuadrilateralInterfaceDict](../../components/schema/quadrilateral_interface.md#quadrilateralinterfacedict), str, float, int, bool, None, tuple, bytes, io.FileIO
[_1](#_1) | [_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict)

# _1
```
type: schemas.Schema
```

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
**quadrilateralType** | typing.Literal["ComplexQuadrilateral"] |  | [optional] must be one of ["ComplexQuadrilateral"]
**any_string_name** | dict, schemas.immutabledict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.FileIO | any string name can be used but the value must be the correct type | [optional]

## _1Dict
```
base class: schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]

```
### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**quadrilateralType** | typing.Literal["ComplexQuadrilateral"], schemas.Unset |  | [optional] must be one of ["ComplexQuadrilateral"]
**kwargs** | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**quadrilateralType** | typing.Literal["ComplexQuadrilateral"], schemas.Unset |  | [optional] must be one of ["ComplexQuadrilateral"]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [_1DictInput](#_1dictinput), [_1Dict](#_1dict) | [_1Dict](#_1dict) | a constructor
get_additional_property_ | str | schemas.immutabledict, tuple, float, int, str, bool, None, bytes, schemas.FileIO, schemas.Unset | provides type safety for additional properties

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
