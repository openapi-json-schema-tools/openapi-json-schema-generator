# coding: utf-8

"""
    Example
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from json_schema_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class ContainsEnums:

    @schemas.classproperty
    def POSITIVE_1(cls) -> typing.Literal[1]:
        return Contains.validate(1)


@dataclasses.dataclass(frozen=True)
class Contains(
    schemas.Schema
):
    types: typing.FrozenSet[typing.Type] = frozenset({
        float,
        int,
    })
    enum_value_to_name: typing.Mapping[typing.Union[int, float, str, schemas.Bool, None], str] = dataclasses.field(
        default_factory=lambda: {
            1: "POSITIVE_1",
        }
    )
    enums = ContainsEnums

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
        arg: int,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Literal[1,]: ...
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


@dataclasses.dataclass(frozen=True)
class ArrayContainsValue(
    schemas.Schema[schemas.immutabledict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    contains: typing.Type[Contains] = dataclasses.field(default_factory=lambda: Contains) # type: ignore

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            typing.List[schemas.INPUT_TYPES_ALL],
            typing.Tuple[schemas.INPUT_TYPES_ALL, ...],
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
