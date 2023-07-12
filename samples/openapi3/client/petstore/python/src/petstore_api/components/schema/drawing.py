# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


from petstore_api.components.schema import fruit
from petstore_api.components.schema import nullable_shape
from petstore_api.components.schema import shape
from petstore_api.components.schema import shape_or_null


class ShapesTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> schemas.OUTPUT_BASE_TYPES:
        return super().__getitem__(name)

    def __new__(cls, arg: ShapesTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Shapes.validate(arg, configuration=configuration)
ShapesTupleInput = typing.Union[
    typing.List[
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    ],
    typing.Tuple[
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class Shapes(
    schemas.ListSchema[ShapesTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[shape.Shape] = dataclasses.field(default_factory=lambda: shape.Shape) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ShapesTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ShapesTupleInput,
            ShapesTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ShapesTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "mainShape": typing.Type[shape.Shape],
        "shapeOrNull": typing.Type[shape_or_null.ShapeOrNull],
        "nullableShape": typing.Type[nullable_shape.NullableShape],
        "shapes": typing.Type[Shapes],
    }
)


class DrawingDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["mainShape"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shapeOrNull"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["nullableShape"]) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shapes"]) -> ShapesTuple:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES:
        ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["mainShape"],
            typing_extensions.Literal["shapeOrNull"],
            typing_extensions.Literal["nullableShape"],
            typing_extensions.Literal["shapes"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: DrawingDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Drawing.validate(arg, configuration=configuration)
DrawingDictInput = typing.Mapping[
    str,
    typing.Union[
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        typing.Union[
            ShapesTuple,
            list,
            tuple
        ],
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    ]
]


@dataclasses.dataclass(frozen=True)
class Drawing(
    schemas.Schema[DrawingDict, tuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({schemas.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    additional_properties: typing.Type[fruit.Fruit] = dataclasses.field(default_factory=lambda: fruit.Fruit) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: DrawingDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            DrawingDictInput,
            DrawingDict,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> DrawingDict:
        return super().validate_base(
            arg,
            configuration=configuration,
        )

