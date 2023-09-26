# coding: utf-8

"""
    Example
    No description provided (generated by Openapi JSON Schema Generator https://github.com/openapi-json-schema-tools/openapi-json-schema-generator)  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from json_schema_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]

_0: typing_extensions.TypeAlias = schemas.NumberSchema
_1: typing_extensions.TypeAlias = schemas.StrSchema


@dataclasses.dataclass(frozen=True)
class ArrayPrefixItems(
    schemas.Schema[schemas.immutabledict, typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    prefix_items: typing.Tuple[
        typing.Type[_0],
        typing.Type[_1],
    ] = (
        _0,
        _1,
    )

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