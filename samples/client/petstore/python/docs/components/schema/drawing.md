petstore_api.components.schema.drawing
# Schema Drawing

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
[DrawingDictInput](#drawingdictinput) | [DrawingDict](#drawingdict) |  |

## DrawingDictInput
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mainShape** | [**Shape**](shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**shapes** | list, tuple |  | [optional]
**any_string_name** | [**Fruit**](fruit.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## DrawingDict
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**mainShape** | [**Shape**](shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | [**Shape**](shape.md) |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | [**ShapeOrNull**](shape_or_null.md) |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset | [**NullableShape**](nullable_shape.md) |  | [optional]
**shapes** | list, tuple, schemas.Unset | [properties.Shapes](#properties-shapes) |  | [optional]
**any_string_name** | [**Fruit**](fruit.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [**Fruit**](fruit.md) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

# properties Shapes

## Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple | tuple |  |

## properties Shapes ShapesTupleInput
Class Name | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
[**Shape**](shape.md) | [**Shape**](shape.md) |  |

## properties Shapes ShapesTuple
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Shape**](shape.md) | [**Shape**](shape.md) | [**Shape**](shape.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
