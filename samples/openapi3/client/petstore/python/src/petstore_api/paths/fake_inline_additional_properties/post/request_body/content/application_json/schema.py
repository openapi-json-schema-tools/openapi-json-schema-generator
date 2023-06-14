# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

AdditionalProperties: typing_extensions.TypeAlias = schemas.StrSchema


class SchemaDict(immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]):
    
    def __getitem__(self, name: str) -> str:
        # dict_instance[name] accessor
        return super().__getitem__(name)
SchemaDictInput = typing.Mapping[
    str,
    str,
]


@dataclasses.dataclass(frozen=True)
class Schema(
    schemas.DictSchema[SchemaDict]
):
    types: typing.FrozenSet[typing.Type] = frozenset({immutabledict.immutabledict})
    additional_properties: typing.Type[AdditionalProperties] = dataclasses.field(default_factory=lambda: AdditionalProperties) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            immutabledict.immutabledict: SchemaDict
        }
    )

    @classmethod
    def validate(
        cls,
        arg: SchemaDictInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> SchemaDict:
        return super().validate(
            arg,
            configuration=configuration,
        )

