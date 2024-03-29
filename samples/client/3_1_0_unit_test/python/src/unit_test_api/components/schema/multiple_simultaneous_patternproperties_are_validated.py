# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

A: typing_extensions.TypeAlias = schemas.IntSchema


@dataclasses.dataclass(frozen=True)
class Aaa(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    inclusive_maximum: typing.Union[int, float] = 20



@dataclasses.dataclass(frozen=True)
class MultipleSimultaneousPatternpropertiesAreValidated(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    pattern_properties: typing.Mapping[
        schemas.PatternInfo,
        typing.Type[schemas.Schema]
    ] = dataclasses.field(
        default_factory=lambda: {
            schemas.PatternInfo(
                pattern=r'a*'  # noqa: E501
            ): A,
            schemas.PatternInfo(
                pattern=r'aaa*'  # noqa: E501
            ): Aaa,
        }
    )

