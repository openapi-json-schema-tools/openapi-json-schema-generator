petstore_api.components.schema.complex_quadrilateral
identifierPieces=[]

# ComplexQuadrilateral

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO |  |

## Composed Schemas (allOf/anyOf/oneOf/not)
## allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**QuadrilateralInterface**](quadrilateral_interface.QuadrilateralInterface.md) | [**QuadrilateralInterface**](quadrilateral_interface.QuadrilateralInterface.md) | [**QuadrilateralInterface**](quadrilateral_interface.QuadrilateralInterface.md) |  |
[_1](#allOf_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

identifierPieces=[]
<a id="allOf_1"></a>
# _1

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**quadrilateralType** | str,  | str,  |  | [optional] must be one of ["ComplexQuadrilateral", ]
**any_string_name** | dict, frozendict.frozendict, list, tuple, decimal.Decimal, float, int, str, datetime.date, datetime.datetime, uuid.UUID, bool, None, bytes, io.FileIO, io.BufferedReader, schemas.Schema | frozendict.frozendict, tuple, decimal.Decimal, str, bytes, BoolClass, NoneClass, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
