petstore_api.components.schema.drawing
# Schema Drawing

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict | frozendict.frozendict,  |  |

## Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**mainShape** | [**Shape**](shape.md) | [**Shape**](shape.md) |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md) | [**ShapeOrNull**](shape_or_null.md) |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md) | [**NullableShape**](nullable_shape.md) |  | [optional]
**shapes** | list, tuple | tuple, [properties.Shapes](#properties-shapes) |  | [optional]
**any_string_name** | [**Fruit**](fruit.md) | [**Fruit**](fruit.md) | any string name can be used but the value must be the correct type | [optional]

# properties Shapes

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple,  |  |

## List Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Shape**](shape.md) | [**Shape**](shape.md) | [**Shape**](shape.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
