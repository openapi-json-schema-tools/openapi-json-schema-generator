# coding: utf-8

"""
    OpenAPI Petstore
    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501
    The version of the OpenAPI document: 1.0.0
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from petstore_api.shared_imports.schema_imports import *

Items: typing_extensions.TypeAlias = schemas.AnyTypeSchema


class ArrayHoldingAnyTypeTuple(
    typing.Tuple[
        schemas.OUTPUT_BASE_TYPES,
        ...
    ]
):
    def __getitem__(self, name: int) -> schemas.OUTPUT_BASE_TYPES:
        return super().__getitem__(name)

    def __new__(cls, arg: ArrayHoldingAnyTypeTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ArrayHoldingAnyType.validate(arg, configuration=configuration)
ArrayHoldingAnyTypeTupleInput = typing.Union[
    typing.List[
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
    ],
    typing.Tuple[
        typing.Union[
            dict,
            schemas.immutabledict,
            str,
            datetime.date,
            datetime.datetime,
            uuid.UUID,
            int,
            float,
            bool,
            None,
            list,
            tuple,
            bytes,
            io.FileIO,
            io.BufferedReader
        ],
        ...
    ]
]


@dataclasses.dataclass(frozen=True)
class ArrayHoldingAnyType(
    schemas.ListSchema[ArrayHoldingAnyTypeTuple]
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
            tuple: ArrayHoldingAnyTypeTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ArrayHoldingAnyTypeTupleInput,
            ArrayHoldingAnyTypeTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ArrayHoldingAnyTypeTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
