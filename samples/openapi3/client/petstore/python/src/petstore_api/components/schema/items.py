# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Items2: typing_extensions.TypeAlias = schemas.DictSchema


class ItemsTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> immutabledict.immutabledict[str, schemas.OUTPUT_BASE_TYPES]:
        return super().__getitem__(name)
ItemsTupleInput = typing.Sequence[
    typing.Union[
        dict,
        immutabledict.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class Items(
    schemas.ListSchema[ItemsTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.

    component's name collides with the inner schema name
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items2] = dataclasses.field(default_factory=lambda: Items2) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: ItemsTupleInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )
