petstore_api.components.schema.drawing
# Schema Drawing

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[DrawingDictInput](#drawingdictinput), [DrawingDict](#drawingdict) | [DrawingDict](#drawingdict) |

## DrawingDictInput
type: typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        typing.Union[
            ShapesTupleInput,
            ShapesTuple
        ],
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ]
]
Key | Type |  Description | Notes
------------ | ------------- | ------------- | -------------
**mainShape** | [**Shape**](shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader |  | [optional]
**shapes** | list, tuple |  | [optional]
**any_string_name** | [**Fruit**](fruit.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | any string name can be used but the value must be the correct type | [optional]

## DrawingDict
base class: schemas.immutabledict[str, typing.Tuple[schemas.OUTPUT_BASE_TYPES]]

### &lowbar;&lowbar;new&lowbar;&lowbar; method
Keyword Argument | Type | Description | Notes
---------------- | ---- | ----------- | -----
**mainShape** | [**Shape**](shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, schemas.Unset |  | [optional]
**shapes** | list, tuple, schemas.Unset |  | [optional]
**kwargs** | [**Fruit**](fruit.md), dict, schemas.immutabledict, str, datetime.date, datetime.datetime, uuid.UUID, int, float, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader | [**Fruit**](fruit.md) | any string name can be used but the value must be the correct type | [optional] typed value is accessed with the get_additional_property_ method

### properties
Property | Type | Description | Notes
-------- | ---- | ----------- | -----
**mainShape** | [**Shape**](shape.md) |  | [optional]
**shapeOrNull** | [**ShapeOrNull**](shape_or_null.md) |  | [optional]
**nullableShape** | [**NullableShape**](nullable_shape.md) |  | [optional]
**shapes** | [properties.Shapes](#properties-shapes) |  | [optional]

### methods
Method | Input Type | Return Type | Notes
------ | ---------- | ----------- | ------
from_dict_ | [DrawingDictInput](#drawingdictinput), [DrawingDict](#drawingdict) | [DrawingDict](#drawingdict) | a constructor
get_additional_property_ | str | [**Fruit**](fruit.md) | provides type safety for additional properties

# properties Shapes

## validate method
Input Type | Return Type | Notes
------------ | ------------- | -------------
[ShapesTupleInput](#properties-shapes-shapestupleinput), [ShapesTuple](#properties-shapes-shapestuple) | [ShapesTuple](#properties-shapes-shapestuple) |

## properties Shapes ShapesTupleInput
```
type: typing.Union[
    typing.List[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ],
    typing.Tuple[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        ...
    ]
]
```
Index | Input Type | Description | Notes
------------- | ------------- | ------------- | -------------
≥ 0 | [**Shape**](shape.md) |  |

## properties Shapes ShapesTuple
```
base class: typing.Tuple[
    schemas.OUTPUT_BASE_TYPES,
    ...
]
```
Index | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
≥ 0 | [**Shape**](shape.md) | [**Shape**](shape.md) |  |

[[Back to top]](#top) [[Back to Component Schemas]](../../../README.md#Component-Schemas) [[Back to README]](../../../README.md)
