# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



@dataclasses.dataclass(frozen=True)
class Items(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]],
):
    # any type
    inclusive_minimum: typing.Union[int, float] = 5



class ItemsDoesNotLookInApplicatorsValidCaseTuple(
    typing.Tuple[
        schemas.OUTPUT_BASE_TYPES,
        ...
    ]
):

    def __new__(cls, arg: typing.Union[ItemsDoesNotLookInApplicatorsValidCaseTupleInput, ItemsDoesNotLookInApplicatorsValidCaseTuple], configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ItemsDoesNotLookInApplicatorsValidCase.validate(arg, configuration=configuration)
ItemsDoesNotLookInApplicatorsValidCaseTupleInput = typing.Union[
    typing.List[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ],
    typing.Tuple[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ItemsDoesNotLookInApplicatorsValidCase(
    schemas.Schema[schemas.immutabledict, ItemsDoesNotLookInApplicatorsValidCaseTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[Items] = dataclasses.field(default_factory=lambda: Items) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: ItemsDoesNotLookInApplicatorsValidCaseTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ItemsDoesNotLookInApplicatorsValidCaseTupleInput,
            ItemsDoesNotLookInApplicatorsValidCaseTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ItemsDoesNotLookInApplicatorsValidCaseTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
