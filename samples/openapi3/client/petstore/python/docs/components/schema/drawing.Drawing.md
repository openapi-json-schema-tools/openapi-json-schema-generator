petstore_api.components.schema.drawing
# Drawing

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**mainShape** | [**Shape**](shape.Shape.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**Shape**](shape.Shape.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.ShapeOrNull.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**ShapeOrNull**](shape_or_null.ShapeOrNull.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.NullableShape.md)dict, frozendict.frozendict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | [**NullableShape**](nullable_shape.NullableShape.md)frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, io.FileIO  | [optional]
[**shapes**](#properties-shapes) | list, tuple,  | tuple,   | [optional]
**any_string_name** | [**Fruit**](fruit.Fruit.md) | [**Fruit**](fruit.Fruit.md) | any string name can be used but the value must be the correct type | [optional]

# properties Shapes

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Shape**](shape.Shape.md) | [**Shape**](shape.Shape.md) | [**Shape**](shape.Shape.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
