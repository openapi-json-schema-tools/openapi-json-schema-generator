# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from petstore_api.components.schema import fruit
from petstore_api.components.schema import nullable_shape
from petstore_api.components.schema import shape
from petstore_api.components.schema import shape_or_null


class ShapesTuple(
    typing.Tuple[
        schemas.OUTPUT_BASE_TYPES,
        ...
    ]
):

    def __new__(cls, arg: typing.Union[ShapesTupleInput, ShapesTuple], configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Shapes.validate(arg, configuration=configuration)
ShapesTupleInput = typing.Union[
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


@dataclasses.dataclass(frozen=True)
class Shapes(
    schemas.Schema[schemas.immutabledict, ShapesTuple]
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
Properties = typing.TypedDict(
    'Properties',
    {
        "mainShape": typing.Type[shape.Shape],
        "shapeOrNull": typing.Type[shape_or_null.ShapeOrNull],
        "nullableShape": typing.Type[nullable_shape.NullableShape],
        "shapes": typing.Type[Shapes],
    }
)


class DrawingDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):

    __required_keys__: typing.FrozenSet[str] = frozenset({
    })
    __optional_keys__: typing.FrozenSet[str] = frozenset({
        "mainShape",
        "shapeOrNull",
        "nullableShape",
        "shapes",
    })
    
    def __new__(
        cls,
        *,
        mainShape: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        shapeOrNull: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        nullableShape: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES,
            schemas.Unset
        ] = schemas.unset,
        shapes: typing.Union[
            ShapesTupleInput,
            ShapesTuple,
            schemas.Unset
        ] = schemas.unset,
        configuration_: typing.Optional[schema_configuration.SchemaConfiguration] = None,
        **kwargs: typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ):
        arg_: typing.Dict[str, typing.Any] = {}
        for key_, val in (
            ("mainShape", mainShape),
            ("shapeOrNull", shapeOrNull),
            ("nullableShape", nullableShape),
            ("shapes", shapes),
        ):
            if isinstance(val, schemas.Unset):
                continue
            arg_[key_] = val
        arg_.update(kwargs)
        used_arg_ = typing.cast(DrawingDictInput, arg_)
        return Drawing.validate(used_arg_, configuration=configuration_)
    
    @staticmethod
    def from_dict_(
        arg: typing.Union[
            DrawingDictInput,
            DrawingDict
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> DrawingDict:
        return Drawing.validate(arg, configuration=configuration)
    
    @property
    def mainShape(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("mainShape", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    @property
    def shapeOrNull(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("shapeOrNull", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    @property
    def nullableShape(self) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        val = self.get("nullableShape", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
    
    @property
    def shapes(self) -> typing.Union[ShapesTuple, schemas.Unset]:
        val = self.get("shapes", schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            ShapesTuple,
            val
        )
    
    def get_additional_property_(self, name: str) -> typing.Union[schemas.OUTPUT_BASE_TYPES, schemas.Unset]:
        schemas.raise_if_key_known(name, self.__required_keys__, self.__optional_keys__)
        val = self.get(name, schemas.unset)
        if isinstance(val, schemas.Unset):
            return val
        return typing.cast(
            schemas.OUTPUT_BASE_TYPES,
            val
        )
DrawingDictInput = typing.Mapping[
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

