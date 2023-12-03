# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: " \  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from petstore_api.components.schema import complex_quadrilateral
from petstore_api.components.schema import simple_quadrilateral
OneOf = typing.Tuple[
    typing.Type[simple_quadrilateral.SimpleQuadrilateral],
    typing.Type[complex_quadrilateral.ComplexQuadrilateral],
]


@dataclasses.dataclass(frozen=True)
class Quadrilateral(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    discriminator: typing.Mapping[str, typing.Mapping[str, typing.Type[schemas.Schema]]] = dataclasses.field(
        default_factory=lambda: {
            'quadrilateralType': {
                'ComplexQuadrilateral': complex_quadrilateral.ComplexQuadrilateral,
                'SimpleQuadrilateral': simple_quadrilateral.SimpleQuadrilateral,
            }
        }
    )
    one_of: OneOf = dataclasses.field(default_factory=lambda: schemas.tuple_to_instance(OneOf)) # type: ignore

