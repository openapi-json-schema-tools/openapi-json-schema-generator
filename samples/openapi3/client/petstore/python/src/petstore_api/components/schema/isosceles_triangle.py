# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class TriangleTypeEnums:

    @schemas.classproperty
    def ISOSCELES_TRIANGLE(cls) -> str:
        return TriangleType.validate("IsoscelesTriangle")


@dataclasses.dataclass(frozen=True)
class TriangleType(
    schemas.StrSchema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "IsoscelesTriangle": "ISOSCELES_TRIANGLE",
        }
    )
    enums = TriangleTypeEnums
Properties = typing_extensions.TypedDict(
    'Properties',
    {
        "triangleType": typing.Type[TriangleType],
    }
)


class _1Dict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["triangleType"]) -> str:
        ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.OUTPUT_BASE_TYPES: ...
    
    def __getitem__(
        self,
        name: typing.Union[
            typing_extensions.Literal["triangleType"],
            str
        ]
    ):
        # dict_instance[name] accessor
        return super().__getitem__(name)
_1DictInput = typing.Mapping[str, schemas.INPUT_TYPES_ALL_INCL_SCHEMA]


@dataclasses.dataclass(frozen=True)
class _1(
    schemas.DictSchema[_1Dict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    properties: Properties = dataclasses.field(default_factory=lambda: schemas.typed_dict_to_instance(Properties)) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: _1Dict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: _1DictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> _1Dict:
        return super().validate(
            arg,
            configuration=configuration,
        )



@dataclasses.dataclass(frozen=True)
class IsoscelesTriangle(
    schemas.AnyTypeSchema[immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    all_of: AllOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(AllOf)) # type: ignore


from petstore_api.components.schema import triangle_interface
AllOf = typing.Tuple[
    typing.Type[triangle_interface.TriangleInterface],
    typing.Type[_1],
]
