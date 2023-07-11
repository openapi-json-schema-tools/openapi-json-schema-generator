# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class ItemsEnums:

    @schemas.classproperty
    def GREATER_THAN_SIGN(cls) -> str:
        return Items.validate(">")

    @schemas.classproperty
    def DOLLAR_SIGN(cls) -> str:
        return Items.validate("$")


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    default: str = "$"
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            ">": "GREATER_THAN_SIGN",
            "$": "DOLLAR_SIGN",
        }
    )
    enums = ItemsEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal[">"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[">"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["$"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["$"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[">","$",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        ">",
        "$",
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                ">",
                "$",
            ],
            validated_arg
        )


class SchemaTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> typing_extensions.Literal[">", "$"]:
        return super().__getitem__(name)

    def __new__(cls, arg: SchemaTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return Schema.validate(arg, configuration=configuration)
SchemaTupleInput = typing.Sequence[
    str,
]


@dataclasses.dataclass(frozen=True)
class Schema(
    schemas.ListSchema[SchemaTuple]
):
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: SchemaTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            SchemaTupleInput,
            SchemaTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SchemaTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
