# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *



class EnumWithEscapedCharactersEnums:

    @schemas.classproperty
    def FOO_LINE_FEED_LF_BAR(cls) -> str:
        return EnumWithEscapedCharacters.validate("foo\nbar")

    @schemas.classproperty
    def FOO_CARRIAGE_RETURN_CR_BAR(cls) -> str:
        return EnumWithEscapedCharacters.validate("foo\rbar")


@dataclasses.dataclass(frozen=True)
class EnumWithEscapedCharacters(
    schemas.StrSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            "foo\nbar": "FOO_LINE_FEED_LF_BAR",
            "foo\rbar": "FOO_CARRIAGE_RETURN_CR_BAR",
        }
    )
    enums = EnumWithEscapedCharactersEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["foo\nbar"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["foo\nbar"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal["foo\rbar"],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["foo\rbar"]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: str,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal["foo\nbar","foo\rbar",]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        "foo\nbar",
        "foo\rbar",
    ]:
        validated_arg = super().validate(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                "foo\nbar",
                "foo\rbar",
            ],
            validated_arg
        )
