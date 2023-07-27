# coding: utf-8

"""
    openapi 3.0.3 sample spec
    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501
    The version of the OpenAPI document: 0.0.1
    Generated by: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator
"""

from __future__ import annotations
from unit_test_api.shared_imports.schema_imports import *  # pyright: ignore [reportWildcardImportFromLibrary]


from unit_test_api.components.schema import property_named_ref_that_is_not_a_reference


class RefInItemsTuple(
    typing.Tuple[
        schemas.OUTPUT_BASE_TYPES,
        ...
    ]
):

    def __new__(cls, arg: RefInItemsTupleInput, configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None):
        return RefInItems.validate(arg, configuration=configuration)
RefInItemsTupleInput = typing.Union[
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
class RefInItems(
    schemas.Schema[schemas.immutabledict, RefInItemsTuple]
):
    """NOTE: This class is auto generated by OpenAPI JSON Schema Generator.
    Ref: https://github.com/openapi-json-schema-tools/openapi-json-schema-generator

    Do not edit the class manually.
    """
    types: typing.FrozenSet[typing.Type] = frozenset({tuple})
    items: typing.Type[property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference] = dataclasses.field(default_factory=lambda: property_named_ref_that_is_not_a_reference.PropertyNamedRefThatIsNotAReference) # type: ignore
    type_to_output_cls: typing.Mapping[
        typing.Type,
        typing.Type
    ] = dataclasses.field(
        default_factory=lambda: {
            tuple: RefInItemsTuple
        }
    )

    @classmethod
    def validate(
        cls,
        arg: typing.Union[
            RefInItemsTupleInput,
            RefInItemsTuple,
        ],
        configuration: typing.Optional[schema_configuration.SchemaConfiguration] = None
    ) -> RefInItemsTuple:
        return super().validate_base(
            arg,
            configuration=configuration,
        )