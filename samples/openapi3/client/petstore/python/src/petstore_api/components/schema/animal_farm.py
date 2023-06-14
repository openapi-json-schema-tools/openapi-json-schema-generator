# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *


from petstore_api.components.schema import animal


class AnimalFarmTuple(typing.Tuple[schemas.OUTPUT_BASE_TYPES]):
    def __getitem__(self, name: int) -> animal.AnimalDict:
        return super().__getitem__(name)
AnimalFarmTupleInput = typing.Sequence[
    typing.Union[
        animal.AnimalDict,
        dict,
        immutabledict.immutabledict
    ],
]


@dataclasses.dataclass(frozen=True)
class AnimalFarm(
    schemas.ListSchema[AnimalFarmTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[animal.Animal] = dataclasses.field(default_factory=lambda: animal.Animal) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: AnimalFarmTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: AnimalFarmTupleInput,
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> AnimalFarmTuple:
        return super().validate(
            arg,
            configuration=configuration,
        )
