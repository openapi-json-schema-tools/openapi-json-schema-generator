# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class EnumWithTrueDoesNotMatch1Enums:

    @schemas.classproperty
    def TRUE(cls) -> typing.Literal[True]:
        return EnumWithTrueDoesNotMatch1.validate(True)


@dataclasses.dataclass(frozen=True)
class EnumWithTrueDoesNotMatch1(
    schemas.Schema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        schemas.Bool,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            schemas.Bool.TRUE: "TRUE",
        }
    )
    enums = EnumWithTrueDoesNotMatch1Enums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal[True],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[True]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: bool,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[True,]: ...
    @classmethod
    def validate(
        cls,
        arg: bool,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[
        True,
    ]:
        validated_arg = super().validate_base(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing.Literal[
                True,
            ],
            validated_arg
        )
