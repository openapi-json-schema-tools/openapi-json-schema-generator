# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ShapeTypeEnums:

    @schemas.classproperty
    def TRIANGLE(cls) -> str:
        return ShapeType.validate("Triangle")


@dataclasses.dataclass(frozen=True)
class ShapeType(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "Triangle": "TRIANGLE",
        }
    )
    enums = ShapeTypeEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["Triangle"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["Triangle"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["Triangle",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "Triangle",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "Triangle",
            ],
            validated_arg
        )
TriangleType: typing_extensions.TypeAlias = schemas.StrSchema
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "shapeType": typing.Type[ShapeType],
        "triangleType": typing.Type[TriangleType],
    }
)


class TriangleInterfaceDict(schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @property
    def shapeType(self) -> typing_extensions.Literal["Triangle"]:
        return self.__getitem__("shapeType")
    
    @property
    def triangleType(self) -> str:
        return self.__getitem__("triangleType")
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["shapeType"]) -> typing_extensions.Literal["Triangle"]:
        ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["triangleType"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["shapeType"],
            typing_extensions.Literal["triangleType"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)

    def __new__(cls, arg: TriangleInterfaceDictInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return TriangleInterface.validate(arg, configuration=configuration)
TriangleInterfaceDictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class TriangleInterface(
    schemas.AnyTypeSchema[TriangleInterfaceDict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    required: typing.FrozenSet[str] = frozenset({
        "shapeType",
        "triangleType",
    })
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.immutabledict: TriangleInterfaceDict,
        }
    )

