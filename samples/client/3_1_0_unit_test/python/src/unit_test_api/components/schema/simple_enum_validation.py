# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class SimpleEnumValidationEnums:

    @schemas.classproperty
    def POSITIVE_1(cls) -> typing.Literal[1]:
        return SimpleEnumValidation.validate(1)

    @schemas.classproperty
    def POSITIVE_2(cls) -> typing.Literal[2]:
        return SimpleEnumValidation.validate(2)

    @schemas.classproperty
    def POSITIVE_3(cls) -> typing.Literal[3]:
        return SimpleEnumValidation.validate(3)


@dataclasses.dataclass(frozen=True)
class SimpleEnumValidation(
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
            1: "POSITIVE_1",
            2: "POSITIVE_2",
            3: "POSITIVE_3",
        }
    )
    enums = SimpleEnumValidationEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal[1],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[1]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal[2],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[2]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing.Literal[3],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[3]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: int,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[1,2,3,]: ...
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
