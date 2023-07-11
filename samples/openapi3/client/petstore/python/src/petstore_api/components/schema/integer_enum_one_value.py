# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *



class IntegerEnumOneValueEnums:

    @schemas.classproperty
    def POSITIVE_0(cls) -> int:
        return IntegerEnumOneValue.validate(0)


@dataclasses.dataclass(frozen=True)
class IntegerEnumOneValue(
    schemas.IntSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        int,
    })
    format: str = 'int'
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            0: "POSITIVE_0",
        }
    )
    enums = IntegerEnumOneValueEnums

    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: typing_extensions.Literal[0],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[0]: ...
    @typing.overload
    @classmethod
    def validate(
        cls,
        arg: int,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[0,]: ...
    @classmethod
    def validate(
        cls,
        arg,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing_extensions.Literal[
        0,
    ]:
        validated_arg = super().validate_base_(
            arg,
            configuration=configuration,
        )
        return typing.cast(typing_extensions.Literal[
                0,
            ],
            validated_arg
        )
