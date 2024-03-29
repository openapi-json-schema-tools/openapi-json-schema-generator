# coding: utf-8

"""
    openapi 3.1.0 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft2020-12  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]



class PrefixitemsWithNullInstanceElementsTuple(
    typing.Tuple[
        None,
        typing_extensions.Unpack[typing.Tuple[schemas.OUTPUT_BASE_TYPES, ...]]
    ]
):

    def __new__(cls, arg: typing.Union[PrefixitemsWithNullInstanceElementsTupleInput, PrefixitemsWithNullInstanceElementsTuple], configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return PrefixitemsWithNullInstanceElements.validate(arg, configuration=configuration)
PrefixitemsWithNullInstanceElementsTupleInput = typing.Union[
    typing.List[
        typing.Union[
            schemas.INPUT_TYPES_ALL,
            schemas.OUTPUT_BASE_TYPES
        ],
    ],
    typing.Tuple[
        None,
        typing_extensions.Unpack[typing.Tuple[schemas.INPUT_TYPES_ALL, ...]]
    ]
]
_0: typing_extensions.TypeAlias = schemas.NoneSchema


@dataclasses.dataclass(frozen=True)
class PrefixitemsWithNullInstanceElements(
    schemas.AnyTypeSchema[schemas.immutabledict[str, schemas.OUTPUT_BASE_TYPES], PrefixitemsWithNullInstanceElementsTuple],
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    # any type
    prefix_items: typing.Tuple[
        typing.Type[_0],
    ] = (
        _0,
    )
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: PrefixitemsWithNullInstanceElementsTuple,
        }
    )

