# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class CurrencyEnums:

    @schemas.classproperty
    def EUR(cls) -> str:
        return Currency.validate("eur")

    @schemas.classproperty
    def USD(cls) -> str:
        return Currency.validate("usd")


@dataclasses.dataclass(frozen=True)
class Currency(
    schemas.StrSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, bool, schemas.none_type_], str] = dataclasses.field(
        default_factory=lambda: {
            "eur": "EUR",
            "usd": "USD",
        }
    )
    enums = CurrencyEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["eur"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["eur"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal["usd"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal["usd"]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        "eur",
        "usd",
    ]:
        validated_arg = super().validate(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                "eur",
                "usd",
            ],
            validated_arg
        )
