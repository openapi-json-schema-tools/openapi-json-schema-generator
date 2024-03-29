# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class EnumWith0DoesNotMatchFalseEnums:

    @schemas.classproperty
    def POSITIVE_0(cls) -> typing.Literal[0]:
        return EnumWith0DoesNotMatchFalse.validate(0)


@dataclasses.dataclass(frozen=True)
class EnumWith0DoesNotMatchFalse(
    schemas.Schema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            0: "POSITIVE_0",
        }
    )
    enums = EnumWith0DoesNotMatchFalseEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal[0],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[0]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: int,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[0,]: ...
    @classmethod
    def validate(
        cls,
        arg: typing.Union[int, float],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Union[int, float]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return validated_arg
