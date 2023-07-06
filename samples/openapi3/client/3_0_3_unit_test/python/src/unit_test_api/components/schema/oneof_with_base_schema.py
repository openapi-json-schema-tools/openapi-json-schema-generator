# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *



@dataclasses.dataclass(frozen=True)
class _0(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    min_length: int = 2



@dataclasses.dataclass(frozen=True)
class _1(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    max_length: int = 4

OneOf = typing.Tuple[
    typing.Type[_0],
    typing.Type[_1],
]


@dataclasses.dataclass(frozen=True)
class OneofWithBaseSchema(
    schemas.StrSchema
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({
        str,
    })
    one_of: OneOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(OneOf)) # type: ignore

    @classmethod
    def validate(
        cls,
        arg: typing.Union[str, datetime.date, datetime.datetime, uuid.UUID],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> str:
        return super().validate(
            arg,
            configuration=configuration,
        )
