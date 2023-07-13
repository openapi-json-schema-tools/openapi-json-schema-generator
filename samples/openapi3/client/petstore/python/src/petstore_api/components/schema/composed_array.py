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


class ComposedArrayTuple(
    typing.Tuple[
        schemas.OUTPUT_BASE_TYPES,
        ...
    ]
):

    def __new__(cls, arg: ComposedArrayTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return ComposedArray.validate(arg, configuration=configuration)
ComposedArrayTupleInput = typing.Union[
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
class ComposedArray(
    schemas.Schema[schemas.immutabledict, ComposedArrayTuple]
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
            tuple: ComposedArrayTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            ComposedArrayTupleInput,
            ComposedArrayTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> ComposedArrayTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )
